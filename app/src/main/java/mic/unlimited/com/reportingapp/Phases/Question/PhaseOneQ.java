package mic.unlimited.com.reportingapp.Phases.Question;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.gson.JsonIOException;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.OptionsItem;
import org.androidannotations.annotations.OptionsMenu;
import org.androidannotations.annotations.OptionsMenuItem;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import io.realm.Realm;
import mic.unlimited.com.reportingapp.Activity.LoginActivity_;
import mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db;
import mic.unlimited.com.reportingapp.R;

/**
 * Created by Bibesh on 4/20/17.
 */
@EActivity(R.layout.activity_phase1)
public class PhaseOneQ extends AppCompatActivity {

    //Initializing all the Spinner and Checkboxes
    @ViewById
    EditText motherNamePhase1;
    @ViewById
    EditText motherAgePhase1;
    @ViewById
    EditText motherContactPhase1;
    @ViewById
    EditText motherAddressPhase1;
    @ViewById
    Spinner healthPostPhase1;

    @ViewById
    Spinner Phase1Answer1;
    @ViewById
    Spinner Phase1Answer2;
    @ViewById
    Spinner Phase1Answer3;
    @ViewById
    Spinner Phase1Answer4;
    @ViewById
    Spinner Phase1Answer5;

    @ViewById
    CheckBox Phase1Answer6a;
    @ViewById
    CheckBox Phase1Answer6b;
    @ViewById
    CheckBox Phase1Answer6c;
    @ViewById
    CheckBox Phase1Answer6d;
    @ViewById
    CheckBox Phase1Answer6e;
    @ViewById
    CheckBox Phase1Answer6f;
    @ViewById
    CheckBox Phase1Answer6g;
    @ViewById
    CheckBox Phase1Answer6h;
    @ViewById
    CheckBox Phase1Answer6i;
    @ViewById
    CheckBox Phase1Answer6j;


    @ViewById
    Spinner Phase1Answer7;


    @ViewById
    CheckBox Phase1Answer8a;
    @ViewById
    CheckBox Phase1Answer8b;
    @ViewById
    CheckBox Phase1Answer8c;
    @ViewById
    CheckBox Phase1Answer8d;
    @ViewById
    CheckBox Phase1Answer8e;
    @ViewById
    CheckBox Phase1Answer8f;
    @ViewById
    CheckBox Phase1Answer8g;

    @ViewById
    Spinner Phase1Answer9;

    @ViewById
    CheckBox Phase1Answer10a;
    @ViewById
    CheckBox Phase1Answer10b;
    @ViewById
    CheckBox Phase1Answer10c;
    @ViewById
    CheckBox Phase1Answer10d;
    @ViewById
    CheckBox Phase1Answer10e;
    @ViewById
    CheckBox Phase1Answer10f;
    @ViewById
    CheckBox Phase1Answer10g;
    @ViewById
    CheckBox Phase1Answer10h;
    @ViewById
    CheckBox Phase1Answer10i;
    @ViewById
    CheckBox Phase1Answer10j;

    @ViewById
    CheckBox Phase1Answer11a;
    @ViewById
    CheckBox Phase1Answer11b;
    @ViewById
    CheckBox Phase1Answer11c;
    @ViewById
    CheckBox Phase1Answer11d;
    @ViewById
    CheckBox Phase1Answer11e;
    @ViewById
    CheckBox Phase1Answer11f;
    @ViewById
    CheckBox Phase1Answer11g;


    @ViewById
    CheckBox Phase1Answer12a;
    @ViewById
    CheckBox Phase1Answer12b;
    @ViewById
    CheckBox Phase1Answer12c;
    @ViewById
    CheckBox Phase1Answer12d;
    @ViewById
    CheckBox Phase1Answer12e;
    @ViewById
    CheckBox Phase1Answer12f;
    @ViewById
    CheckBox Phase1Answer12g;
    @ViewById
    CheckBox Phase1Answer12h;


    @ViewById
    CheckBox Phase1Answer13a;
    @ViewById
    CheckBox Phase1Answer13b;
    @ViewById
    CheckBox Phase1Answer13c;
    @ViewById
    CheckBox Phase1Answer13d;
    @ViewById
    CheckBox Phase1Answer13e;
    @ViewById
    CheckBox Phase1Answer13f;
    @ViewById
    CheckBox Phase1Answer13g;
    @ViewById
    CheckBox Phase1Answer13h;

    @ViewById
    Spinner Phase1Answer14;
    @ViewById
    Spinner Phase1Answer15;
    @ViewById
    CheckBox Phase1Answer16a;
    @ViewById
    CheckBox Phase1Answer16b;
    @ViewById
    CheckBox Phase1Answer16c;
    @ViewById
    CheckBox Phase1Answer16d;
    @ViewById
    CheckBox Phase1Answer16e;

    @ViewById
    Spinner Phase1Answer17;
    @ViewById
    Spinner Phase1Answer18;
    @ViewById
    Spinner Phase1Answer19;

    StringBuffer Phase1Answer6, Phase1Answer8, Phase1Answer10, Phase1Answer11, Phase1Answer12, Phase1Answer13, Phase1Answer16;

    //Vdc list for showing the user VDCs in the spinner(Dropdown)
    ArrayList<String> vdcList;

    //Shared and preference
    @Pref
    LoginActivity_.preference_ user;

    //Load the page for the first time
    @AfterViews
    void loadFirst() {
        vdcList = new ArrayList<>();
        try {
            //get the user information from the saved shared preference
            String information = user.fullInformation().get();

            //Convert the information into array
            JSONArray infoArray = new JSONArray(information);
            for (int i = 0; i < infoArray.length(); i++) {
                JSONObject object = infoArray.getJSONObject(i);
                JSONArray vdcArray = new JSONArray(object.getString("vdc"));
                for (int j = 0; j < vdcArray.length(); j++) {
                    //Get the String value of the JSON Object from the information array
                    JSONObject posts = vdcArray.getJSONObject(j);
                    vdcList.add(posts.getString("vdcHealthPost"));
                }
            }
        } catch (JSONException err) {
            Toast.makeText(this, "" + err.getMessage(), Toast.LENGTH_SHORT).show();
        } finally {
            //Create Adapter for the Spinner that show the list of the VDC health post
            ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, android.R.id.text1, vdcList);
            healthPostPhase1.setAdapter(adapter);
        }
    }

//
//    @Click(R.id.saveLocalPhase1)
//    private void saveIntoLocalDb() {
//        final Realm mReal;
//        Realm.init(this);
//        mReal = Realm.getDefaultInstance();
//        mReal.executeTransaction(new Realm.Transaction() {
//            @Override
//            public void execute(Realm realm) {
//                Phase1Answer6.toString()
//                ActivityPhase1Db db = mReal.createObject(ActivityPhase1Db.class);
//                db.setPhase1Answer1Db(Phase1Answer1.getSelectedItem().toString());
//                db.setPhase1Answer1Db(Phase1Answer1.getSelectedItem().toString());
//                db.setPhase1Answer1Db(Phase1Answer1.getSelectedItem().toString());
//                db.setPhase1Answer1Db(Phase1Answer1.getSelectedItem().toString());
//                db.setPhase1Answer1Db(Phase1Answer1.getSelectedItem().toString());
//                db.setPhase1Answer1Db(Phase1Answer1.getSelectedItem().toString());
//                db.setPhase1Answer1Db(Phase1Answer1.getSelectedItem().toString());
//                db.setPhase1Answer1Db(Phase1Answer1.getSelectedItem().toString());
//                db.setPhase1Answer1Db(Phase1Answer1.getSelectedItem().toString());
//                db.setPhase1Answer1Db(Phase1Answer1.getSelectedItem().toString());
//                db.setPhase1Answer1Db(Phase1Answer1.getSelectedItem().toString());
//                db.setPhase1Answer1Db(Phase1Answer1.getSelectedItem().toString());
//                db.setPhase1Answer1Db(Phase1Answer1.getSelectedItem().toString());
//                db.setPhase1Answer1Db(Phase1Answer1.getSelectedItem().toString());
//                db.setPhase1Answer1Db(Phase1Answer1.getSelectedItem().toString());
//                db.setPhase1Answer1Db(Phase1Answer1.getSelectedItem().toString());
//                db.setPhase1Answer1Db(Phase1Answer1.getSelectedItem().toString());
//                db.setPhase1Answer1Db(Phase1Answer1.getSelectedItem().toString());
//                db.setPhase1Answer1Db(Phase1Answer1.getSelectedItem().toString());
//            }
//        });
//    }
//
//
//    void aperndin(){
//        if (Phase1Answer6a.isChecked()) {
//            Phase1Answer6.append(Phase1Answer6a.getText().toString() + ", ");
//        }
//        if (Phase1Answer6b.isChecked()) {
//            Phase1Answer6.append(Phase1Answer6b.getText().toString() + " ,");
//        }
//        if (Phase1Answer6c.isChecked()) {
//            Phase1Answer6.append(Phase1Answer6c.getText().toString() + ", ");
//        }
//        if (Phase1Answer6d.isChecked()) {
//            Phase1Answer6.append(Phase1Answer6d.getText().toString() + ", ");
//        }
//        if (Phase1Answer6e.isChecked()) {
//            Phase1Answer6.append(Phase1Answer6e.getText().toString() + ", ");
//        }
//        if (Phase1Answer6f.isChecked()) {
//            Phase1Answer6.append(Phase1Answer6f.getText().toString() + " ,");
//        }
//        if (Phase1Answer6g.isChecked()) {
//            Phase1Answer6.append(Phase1Answer6g.getText().toString() + " ,");
//        }
//        if (Phase1Answer6h.isChecked()) {
//            Phase1Answer6.append(Phase1Answer6h.getText().toString() + ", ");
//        }
//        if (Phase1Answer6i.isChecked()) {
//            Phase1Answer6.append(Phase1Answer6i.getText().toString() + " ,");
//        }
//        if (Phase1Answer6j.isChecked()) {
//            Phase1Answer6.append(Phase1Answer6j.getText().toString() + " ");
//        }
//
//
//        if (Phase1Answer8a.isChecked()) {
//            Phase1Answer8.append(Phase1Answer8a.getText().toString() + " ,");
//        }
//        if (Phase1Answer8b.isChecked()) {
//            Phase1Answer8.append(Phase1Answer8b.getText().toString() + " ,");
//        }
//        if (Phase1Answer8c.isChecked()) {
//            Phase1Answer8.append(Phase1Answer8c.getText().toString() + " ,");
//        }
//        if (Phase1Answer8d.isChecked()) {
//            Phase1Answer8.append(Phase1Answer8d.getText().toString() + ", ");
//        }
//        if (Phase1Answer8e.isChecked()) {
//            Phase1Answer8.append(Phase1Answer8e.getText().toString() + ", ");
//        }
//        if (Phase1Answer8f.isChecked()) {
//            Phase1Answer8.append(Phase1Answer8f.getText().toString() + " ,");
//        }
//        if (Phase1Answer8g.isChecked()) {
//            Phase1Answer8.append(Phase1Answer8g.getText().toString() + " ");
//        }
//
//
//        if (Phase1Answer10a.isChecked()) {
//            Phase1Answer10.append(Phase1Answer10a.getText().toString() + ", ");
//        }
//        if (Phase1Answer10b.isChecked()) {
//            Phase1Answer10.append(Phase1Answer10b.getText().toString() + ", ");
//        }
//        if (Phase1Answer10c.isChecked()) {
//            Phase1Answer10.append(Phase1Answer10c.getText().toString() + " ,");
//        }
//        if (Phase1Answer10d.isChecked()) {
//            Phase1Answer10.append(Phase1Answer10d.getText().toString() + " ,");
//        }
//        if (Phase1Answer10e.isChecked()) {
//            Phase1Answer10.append(Phase1Answer10e.getText().toString() + " ,");
//        }
//        if (Phase1Answer10f.isChecked()) {
//            Phase1Answer10.append(Phase1Answer10f.getText().toString() + " ,");
//        }
//        if (Phase1Answer10g.isChecked()) {
//            Phase1Answer10.append(Phase1Answer10g.getText().toString() + ", ");
//        }
//        if (Phase1Answer10h.isChecked()) {
//            Phase1Answer10.append(Phase1Answer10h.getText().toString() + " ,");
//        }
//        if (Phase1Answer10i.isChecked()) {
//            Phase1Answer10.append(Phase1Answer10i.getText().toString() + ", ");
//        }
//        if (Phase1Answer10j.isChecked()) {
//            Phase1Answer10.append(Phase1Answer10j.getText().toString() + " ");
//        }
//
//
//        if (Phase1Answer11a.isChecked()) {
//            Phase1Answer11.append(Phase1Answer11a.getText().toString() + " ,");
//        }
//        if (Phase1Answer11b.isChecked()) {
//            Phase1Answer11.append(Phase1Answer11b.getText().toString() + ", ");
//        }
//        if (Phase1Answer11c.isChecked()) {
//            Phase1Answer11.append(Phase1Answer11c.getText().toString() + " ,");
//        }
//        if (Phase1Answer11d.isChecked()) {
//            Phase1Answer11.append(Phase1Answer11d.getText().toString() + ", ");
//        }
//        if (Phase1Answer11e.isChecked()) {
//            Phase1Answer11.append(Phase1Answer11e.getText().toString() + ", ");
//        }
//        if (Phase1Answer11f.isChecked()) {
//            Phase1Answer11.append(Phase1Answer11f.getText().toString() + ", ");
//        }
//        if (Phase1Answer11g.isChecked()) {
//            Phase1Answer11.append(Phase1Answer11g.getText().toString() + " ");
//        }
//
//
//        if (Phase1Answer12a.isChecked()) {
//            Phase1Answer12.append(Phase1Answer12a.getText().toString() + ", ");
//        }
//        if (Phase1Answer12b.isChecked()) {
//            Phase1Answer12.append(Phase1Answer12b.getText().toString() + " ,");
//        }
//        if (Phase1Answer12c.isChecked()) {
//            Phase1Answer12.append(Phase1Answer12c.getText().toString() + " ,");
//        }
//        if (Phase1Answer12d.isChecked()) {
//            Phase1Answer12.append(Phase1Answer12d.getText().toString() + " ,");
//        }
//        if (Phase1Answer12e.isChecked()) {
//            Phase1Answer12.append(Phase1Answer12e.getText().toString() + ", ");
//        }
//        if (Phase1Answer12f.isChecked()) {
//            Phase1Answer12.append(Phase1Answer12f.getText().toString() + " ,");
//        }
//        if (Phase1Answer12g.isChecked()) {
//            Phase1Answer12.append(Phase1Answer12g.getText().toString() + ", ");
//        }
//        if (Phase1Answer12h.isChecked()) {
//            Phase1Answer12.append(Phase1Answer12h.getText().toString() + " ");
//        }
//
//
//        if (Phase1Answer13a.isChecked()) {
//            Phase1Answer13.append(Phase1Answer13a.getText().toString() + " ,");
//        }
//        if (Phase1Answer13b.isChecked()) {
//            Phase1Answer13.append(Phase1Answer13b.getText().toString() + ", ");
//        }
//        if (Phase1Answer13c.isChecked()) {
//            Phase1Answer13.append(Phase1Answer13c.getText().toString() + ", ");
//        }
//        if (Phase1Answer13d.isChecked()) {
//            Phase1Answer13.append(Phase1Answer13d.getText().toString() + ", ");
//        }
//        if (Phase1Answer13e.isChecked()) {
//            Phase1Answer13.append(Phase1Answer13e.getText().toString() + ", ");
//        }
//        if (Phase1Answer13f.isChecked()) {
//            Phase1Answer13.append(Phase1Answer13f.getText().toString() + ", ");
//        }
//        if (Phase1Answer13g.isChecked()) {
//            Phase1Answer13.append(Phase1Answer13g.getText().toString() + ", ");
//        }
//        if (Phase1Answer13h.isChecked()) {
//            Phase1Answer13.append(Phase1Answer13h.getText().toString() + " ");
//        }
//
//
//        if (Phase1Answer16a.isChecked()) {
//            Phase1Answer16.append(Phase1Answer16a.getText().toString() + " ,");
//        }
//        if (Phase1Answer16b.isChecked()) {
//            Phase1Answer16.append(Phase1Answer16b.getText().toString() + " ,");
//        }
//        if (Phase1Answer16c.isChecked()) {
//            Phase1Answer16.append(Phase1Answer16c.getText().toString() + " ,");
//        }
//        if (Phase1Answer16d.isChecked()) {
//            Phase1Answer16.append(Phase1Answer16d.getText().toString() + ", ");
//        }
//        if (Phase1Answer16e.isChecked()) {
//            Phase1Answer16.append(Phase1Answer16e.getText().toString() + " ");
//        }
//    }
}

