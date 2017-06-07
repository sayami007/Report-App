package mic.unlimited.com.reportingapp.Activity;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.exceptions.RealmPrimaryKeyConstraintException;
import mic.unlimited.com.reportingapp.Database.EventName;
import mic.unlimited.com.reportingapp.Database.Supervisor;
import mic.unlimited.com.reportingapp.Database.Vdc;
import mic.unlimited.com.reportingapp.R;


import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.androidannotations.annotations.sharedpreferences.SharedPref;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * This is the Login Screen
 */

@EActivity(R.layout.activity_login)
public class LoginActivity extends AppCompatActivity {

    //Initialization
    private RequestQueue queue;
    private Realm mReal;

    //These are the URLs
//    private String LOGIN_URL = "http://192.168.10.5/reporting/api";
//    private String GET_SUPERVISORS = "http://192.168.10.5/reporting/api/detailsup";
//    private String GET_VDC = "http://192.168.10.5/reporting/api/getvdc?dis=";

    private String LOGIN_URL = "http://10.6.1.48/reporting/api";
    private String GET_SUPERVISORS = "http://10.6.1.48/reporting/api/detailsup";
    private String GET_VDC = "http://10.6.1.48/reporting/api/getvdc?dis=";


    //Shared and Preferences
    @SharedPref(value = SharedPref.Scope.UNIQUE)
    public interface Preferences {
        int supervisorId();
    }

    @Pref
    LoginActivity_.Preferences_ mypref;

    //username input field
    @ViewById
    EditText username;

    //password input field
    @ViewById
    EditText password;

    //SignInButton
    @ViewById
    Button signInButton;

    //progress bar
    @ViewById
    ProgressBar progressBar;

    //Login and goes to MainPage
    @Click(R.id.signInButton)
    void Login() {
        progressBar.setVisibility(View.VISIBLE);
        if (username.getText().toString().equals("") || password.getText().toString().equals("")) {
            Toast.makeText(this, R.string.blank, Toast.LENGTH_SHORT).show();
            progressBar.setVisibility(View.INVISIBLE);
        } else {
            queue = Volley.newRequestQueue(getApplicationContext());
            StringRequest query = new StringRequest(Request.Method.POST, LOGIN_URL, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    try {
                        JSONObject object = new JSONObject(response);
                        mypref.supervisorId().put(Integer.parseInt(object.getString("supervisorId")));
                        saveSupervisor(Integer.parseInt(object.getString("supervisorId")));
                        saveEvent();
                        MainPage_.intent(LoginActivity.this).start();
                        LoginActivity.this.finish();
                    } catch (JSONException e) {
                        showErrorMessage();
                    }
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    showErrorMessage();
                }
            }) {
                @Override
                protected Map<String, String> getParams() {
                    Map<String, String> value = new HashMap<>();
                    value.put("usr", username.getText().toString());
                    value.put("pwd", password.getText().toString());
                    return value;
                }
            };
            queue.add(query);
        }
    }

    //Error Message Dialog
    private void showErrorMessage() {
        AlertDialog.Builder errorDialog = new AlertDialog.Builder(LoginActivity.this);
        errorDialog.setTitle(R.string.error);
        errorDialog.setMessage(R.string.errorMessage);
        errorDialog.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                progressBar.setVisibility(View.INVISIBLE);
            }
        });
        errorDialog.show();

    }


    // Save the supervisor records
    public void saveSupervisor(final int id) {
        StringRequest request = new StringRequest(Request.Method.POST, GET_SUPERVISORS, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONArray array = new JSONArray(response);
                    JSONObject object = array.getJSONObject(0);
                    Realm.init(getApplicationContext());
                    RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
                    mReal = Realm.getInstance(config);
                    mReal.beginTransaction();
                    try {
                        Supervisor supervisor = mReal.createObject(Supervisor.class, id);
                        supervisor.setSupervisorName(object.getString("supervisorName"));
                        long num = Long.parseLong(object.getString("supervisorPhone"));
                        supervisor.setSupervisorPhone(num);
                        supervisor.setUsernameText(object.getString("usernameText"));
                        supervisor.setPasswordText(object.getString("passwordText"));
                        supervisor.setDistrictId(Integer.parseInt(object.getString("districtId")));
                        saveVdc(object.getString("districtId"));
                    } catch (RealmPrimaryKeyConstraintException ex) {
                        Log.v("Primary key", ex.getMessage());
                    }
                    mReal.commitTransaction();
                    mReal.close();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.v("ERROR", error.getMessage());
            }
        }) {
            protected Map<String, String> getParams() {
                Map<String, String> value = new HashMap<>();
                value.put("id", "" + mypref.supervisorId().get());
                return value;
            }
        };
        queue.add(request);
    }


    //Get the VDC records
    private void saveVdc(final String districtId) {
        final StringRequest res = new StringRequest(Request.Method.GET, GET_VDC + districtId, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONArray array = new JSONArray(response);
                    for (int i = 0; i < array.length(); i++) {
                        JSONObject object = array.getJSONObject(i);
                        Realm.init(getApplicationContext());
                        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
                        mReal = Realm.getInstance(config);
                        mReal.beginTransaction();
                        try {
                            Vdc vdc = mReal.createObject(Vdc.class);
                            vdc.setVdcId(object.getInt("vdcId"));
                            vdc.setVdcName(object.getString("vdcName"));
                            vdc.setVdcHealthPost(object.getString("vdcHealthPost"));
                            vdc.setDistrict(Integer.parseInt(districtId));
                        } catch (RealmPrimaryKeyConstraintException ex) {
                            Log.v("Primary key", ex.getMessage());
                        }
                        mReal.commitTransaction();
                        mReal.close();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.v("ERROR", error.getMessage());
            }
        });
        queue.add(res);
    }

    //Check the preferences else clear all preferences and databases
    @AfterViews
    public void cleanAll() {
        if (mypref.supervisorId().getOr(0) != 0) {
            MainPage_.intent(this).start();
            this.finish();
        } else {
            Realm.init(getApplicationContext());
            RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
            Realm realm = Realm.getInstance(config);
            realm.beginTransaction();
            realm.deleteAll();
            realm.commitTransaction();
            realm.close();
            mypref.clear();
            Toast.makeText(this, "WELCOME", Toast.LENGTH_LONG).show();
        }
    }

    void saveEvent() {
        try {
            Realm.init(getApplicationContext());

            RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
            Realm realm = Realm.getInstance(config);
            realm.beginTransaction();
            EventName event = realm.createObject(EventName.class);
            EventName event1 = realm.createObject(EventName.class);
            EventName event2 = realm.createObject(EventName.class);
            EventName event3 = realm.createObject(EventName.class);
            EventName event4 = realm.createObject(EventName.class);
            EventName event5 = realm.createObject(EventName.class);
            EventName event6 = realm.createObject(EventName.class);
            EventName event71 = realm.createObject(EventName.class);
            EventName event72 = realm.createObject(EventName.class);
            EventName event73 = realm.createObject(EventName.class);
            EventName event74 = realm.createObject(EventName.class);
            EventName event75 = realm.createObject(EventName.class);
            EventName event76 = realm.createObject(EventName.class);
            EventName event77 = realm.createObject(EventName.class);
            EventName event78 = realm.createObject(EventName.class);
            EventName event8 = realm.createObject(EventName.class);
            EventName event9 = realm.createObject(EventName.class);
            EventName event10 = realm.createObject(EventName.class);
            EventName event11 = realm.createObject(EventName.class);
            EventName event12 = realm.createObject(EventName.class);

            event.setEventId(1);
            event.setEventName(String.valueOf(R.string.event1));

            event1.setEventId(2);
            event1.setEventName(String.valueOf(R.string.event2));
            
            event2.setEventId(3);
            event2.setEventName(String.valueOf(R.string.event3));
            
            event3.setEventId(4);
            event3.setEventName(String.valueOf(R.string.event4));
           
            event4.setEventId(5);
            event4.setEventName(String.valueOf(R.string.event5));
           
            event5.setEventId(6);
            event5.setEventName(String.valueOf(R.string.event6));

            event71.setEventId(71);
            event71.setEventName(String.valueOf(R.string.event7));
            event72.setEventId(72);
            event72.setEventName(String.valueOf(R.string.event7));
            event73.setEventId(73);
            event73.setEventName(String.valueOf(R.string.event7));
            event74.setEventId(74);
            event74.setEventName(String.valueOf(R.string.event7));
            event75.setEventId(75);
            event75.setEventName(String.valueOf(R.string.event7));
            event76.setEventId(76);
            event76.setEventName(String.valueOf(R.string.event7));
            event77.setEventId(77);
            event77.setEventName(String.valueOf(R.string.event7));
            event78.setEventId(78);
            event78.setEventName(String.valueOf(R.string.event7));

            event8.setEventId(8);
            event8.setEventName(String.valueOf(R.string.event8));
            event9.setEventId(9);
            event9.setEventName(String.valueOf(R.string.event9));
            event10.setEventId(10);
            event10.setEventName(String.valueOf(R.string.event10));
            event11.setEventId(11);
            event11.setEventName(String.valueOf(R.string.event10));
            event12.setEventId(12);
            event12.setEventName(String.valueOf(R.string.event10));

            Log.v("saved", "SDf");
            realm.commitTransaction();
            realm.close();
        } catch (Exception err) {
            Log.v("ER", err.getMessage());
        }

    }
}