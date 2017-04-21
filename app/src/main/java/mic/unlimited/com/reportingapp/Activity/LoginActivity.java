package mic.unlimited.com.reportingapp.Activity;

import mic.unlimited.com.reportingapp.CustomClass.UserInformation;
import mic.unlimited.com.reportingapp.CustomClass.Vdc;
import mic.unlimited.com.reportingapp.R;


import android.content.Context;
import android.content.DialogInterface;
import android.content.res.AssetManager;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.DefaultString;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.androidannotations.annotations.sharedpreferences.SharedPref;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * This is the Login Screen
 */

@EActivity(R.layout.activity_login)
public class LoginActivity extends AppCompatActivity {

    //Logger information saved
    ArrayList<UserInformation> userInfo;

    //Logging Information saved in the preference titled sharedPreference
    @SharedPref(value = SharedPref.Scope.UNIQUE)
    public interface preference {
        @DefaultString("NA")
        String fullInformation();
    }

    //Shared and preference
    @Pref
    LoginActivity_.preference_ user;

    //username input field
    @ViewById
    EditText username;

    //password input field
    @ViewById
    EditText password;

    @ViewById
    Button signInButton;
    //progress bar
    @ViewById
    ProgressBar progressBar;


    //Session Checked here
    @AfterViews
    void checkPreference() {
        if (user.fullInformation().exists()) {
            MainPage_.intent(LoginActivity.this).start();
            this.finish();
        }
    }

    //Login and goes to MainPage
    @Click(R.id.signInButton)
    void Login() {
        if (username.getText().toString().equals("") || password.getText().toString().equals("")) {
            Toast.makeText(this, R.string.blank, Toast.LENGTH_SHORT).show();
        } else {
            progressBar.setVisibility(View.VISIBLE);
            signInButton.setEnabled(false);
            CountDownTimer pause = new CountDownTimer(2000, 1000) {
                @Override
                public void onTick(long millisUntilFinished) {

                }

                @Override
                public void onFinish() {
                    progressBar.setVisibility(View.INVISIBLE);
                    signInButton.setEnabled(true);
                    if (validateUsers(username.getText().toString(), password.getText().toString())) {
                        MainPage_.intent(LoginActivity.this).start();

                        //Gson converts list into string in JSON format
                        Gson gson = new GsonBuilder().create();
                        JsonArray myCustomArray = gson.toJsonTree(userInfo).getAsJsonArray();
                        String logger = myCustomArray.toString();

                        //Saved into shared and preference
                        user.fullInformation().put(logger);

                        LoginActivity.this.finish();
                    } else {
                        //Incorrect information pops up error message
                        showErrorMessage();
                    }
                }
            };
            pause.start();
        }
    }

    //Validating Username and password
    private boolean validateUsers(String username, String password) {
        try {
            String arrayFile = AssetJSONFile("Information.json", getApplicationContext());
            Log.v("ar", arrayFile);
            JSONArray mainArray = new JSONArray(arrayFile);
            for (int i = 0; i < mainArray.length(); i++) {
                Log.v("asf", "" + mainArray.length());
                JSONObject districtObject = mainArray.getJSONObject(i);
                JSONArray districtArray = districtObject.getJSONArray("district");
                for (int j = 0; j < districtArray.length(); j++) {
                    JSONObject disId = districtArray.getJSONObject(j);
                    JSONArray supervisionArray = new JSONArray(disId.getString("supervision"));
                    for (int k = 0; k < supervisionArray.length(); k++) {
                        JSONObject supervisionObject = supervisionArray.getJSONObject(k);
                        if (supervisionObject.getString("supervisor_uid").equals(username) && supervisionObject.getString("supervisor_pwd").equals(password)) {
                            userInfo = new ArrayList<>();
                            JSONArray vdcArray = supervisionObject.getJSONArray("vdc");
                            UserInformation information = new UserInformation();
                            information.districtName = disId.getString("district_name");
                            information.supervisorName = supervisionObject.getString("supervisor_name");
                            information.numberOfVdc = vdcArray.length();
                            ArrayList<Vdc> vdcArrayList = new ArrayList<>();
                            for (int l = 0; l < vdcArray.length(); l++) {
                                JSONObject vdcObj = vdcArray.getJSONObject(l);
                                Vdc vd = new Vdc();
                                vd.vdcName = vdcObj.getString("vdc_name");
                                vd.vdcHealthPost = vdcObj.getString("vdc_post");
                                vdcArrayList.add(vd);
                            }
                            information.vdc = vdcArrayList;
                            userInfo.add(information);
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Exception message) {
            return false;
        }
    }

    //Accessing JSON from the local assets folder
    private static String AssetJSONFile(String filename, Context context) throws IOException {
        AssetManager manager = context.getAssets();
        InputStream file = manager.open(filename);
        byte[] formArray = new byte[file.available()];
        file.read(formArray);
        file.close();
        return new String(formArray);
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
            }
        });
        errorDialog.show();
    }
}