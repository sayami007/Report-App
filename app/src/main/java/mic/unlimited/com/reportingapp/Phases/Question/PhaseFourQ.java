package mic.unlimited.com.reportingapp.Phases.Question;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.App;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import mic.unlimited.com.reportingapp.Activity.LoginActivity_;
import mic.unlimited.com.reportingapp.R;

/**
 * Created by Bibesh on 4/20/17.
 */

@EActivity(R.layout.activity_phase4)
public class PhaseFourQ extends AppCompatActivity {

    @ViewById
    Spinner Phase4Answer1;
    @ViewById
    Spinner Phase4Answer2;
    @ViewById
    Spinner Phase4Answer3;

    StringBuffer Phase4Answer4;
    @ViewById
    CheckBox Phase4Answer4a;
    @ViewById
    CheckBox Phase4Answer4b;
    @ViewById
    CheckBox Phase4Answer4c;
    @ViewById
    CheckBox Phase4Answer4d;
    @ViewById
    CheckBox Phase4Answer4e;
    @ViewById
    CheckBox Phase4Answer4f;
    @ViewById
    CheckBox Phase4Answer4g;
    @ViewById
    CheckBox Phase4Answer4h;

    StringBuffer Phase4Answer5;
    @ViewById
    CheckBox Phase4Answer5a;
    @ViewById
    CheckBox Phase4Answer5b;
    @ViewById
    CheckBox Phase4Answer5c;
    @ViewById
    CheckBox Phase4Answer5d;

    @ViewById
    Spinner Phase4Answer6;
    @ViewById
    Spinner Phase4Answer7;
    @ViewById
    Spinner Phase4Answer8;
    @ViewById
    Spinner Phase4Answer9;
    @ViewById
    Spinner Phase4Answer10;
    @ViewById
    Spinner Phase4Answer11;

    @ViewById
    EditText Phase4Answer12;

    @ViewById
    Spinner Phase4Answer13;

    StringBuffer Phase4Answer14;
    @ViewById
    CheckBox Phase4Answer14a;
    @ViewById
    CheckBox Phase4Answer14b;
    @ViewById
    CheckBox Phase4Answer14c;
    @ViewById
    CheckBox Phase4Answer14d;
    @ViewById
    CheckBox Phase4Answer14e;
    @ViewById
    CheckBox Phase4Answer14f;
    @ViewById
    CheckBox Phase4Answer14g;
    @ViewById
    CheckBox Phase4Answer14h;
    @ViewById
    CheckBox Phase4Answer14i;
    @ViewById
    CheckBox Phase4Answer14j;
    @ViewById
    CheckBox Phase4Answer14k;

    StringBuffer Phase4Answer15;
    @ViewById
    CheckBox Phase4Answer15a;
    @ViewById
    CheckBox Phase4Answer15b;
    @ViewById
    CheckBox Phase4Answer15c;
    @ViewById
    CheckBox Phase4Answer15d;
    @ViewById
    CheckBox Phase4Answer15e;
    @ViewById
    CheckBox Phase4Answer15f;
    @ViewById
    CheckBox Phase4Answer15g;


    StringBuffer Phase4Answer16;
    @ViewById
    CheckBox Phase4Answer16a;
    @ViewById
    CheckBox Phase4Answer16b;
    @ViewById
    CheckBox Phase4Answer16c;
    @ViewById
    CheckBox Phase4Answer16d;
    @ViewById
    CheckBox Phase4Answer16e;

    @ViewById
    Spinner Phase4Answer17;

    StringBuffer Phase4Answer18;
    @ViewById
    CheckBox Phase4Answer18a;
    @ViewById
    CheckBox Phase4Answer18b;
    @ViewById
    CheckBox Phase4Answer18c;
    @ViewById
    CheckBox Phase4Answer18d;
    @ViewById
    CheckBox Phase4Answer18e;

    StringBuffer Phase4Answer19;
    @ViewById
    CheckBox Phase4Answer19a;
    @ViewById
    CheckBox Phase4Answer19b;
    @ViewById
    CheckBox Phase4Answer19c;
    @ViewById
    CheckBox Phase4Answer19d;
    @ViewById
    CheckBox Phase4Answer19e;

    @ViewById
    Spinner Phase4Answer20;
    @ViewById
    Spinner Phase4Answer21;
    @ViewById
    Spinner Phase4Answer22;

    @Click(R.id.saveLocalPhase4)
    public void saveInformation() {
        boolean response = getValues();
        Log.v("RES", "RES" + response);
    }

    public boolean getValues() {

        if (Phase4Answer1.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase4Answer2.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase4Answer3.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (Phase4Answer6.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase4Answer7.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase4Answer8.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase4Answer9.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase4Answer10.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase4Answer11.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (Phase4Answer13.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (Phase4Answer17.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (Phase4Answer20.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase4Answer21.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase4Answer22.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }


        Phase4Answer4 = new StringBuffer();
        Phase4Answer5 = new StringBuffer();
        Phase4Answer14 = new StringBuffer();
        Phase4Answer15 = new StringBuffer();
        Phase4Answer16 = new StringBuffer();
        Phase4Answer18 = new StringBuffer();
        Phase4Answer19 = new StringBuffer();

        if (Phase4Answer4a.isChecked()) {
            Phase4Answer4.append(Phase4Answer4a.getText().toString() + ", ");
        }
        if (Phase4Answer4b.isChecked()) {
            Phase4Answer4.append(Phase4Answer4b.getText().toString() + ", ");
        }
        if (Phase4Answer4c.isChecked()) {
            Phase4Answer4.append(Phase4Answer4c.getText().toString() + ", ");
        }
        if (Phase4Answer4d.isChecked()) {
            Phase4Answer4.append(Phase4Answer4d.getText().toString() + ", ");
        }
        if (Phase4Answer4e.isChecked()) {
            Phase4Answer4.append(Phase4Answer4e.getText().toString() + ", ");
        }
        if (Phase4Answer4f.isChecked()) {
            Phase4Answer4.append(Phase4Answer4f.getText().toString() + ", ");
        }
        if (Phase4Answer4g.isChecked()) {
            Phase4Answer4.append(Phase4Answer4g.getText().toString() + ", ");
        }
        if (Phase4Answer4h.isChecked()) {
            Phase4Answer4.append(Phase4Answer4h.getText().toString() + ", ");
        }


        if (Phase4Answer5a.isChecked()) {
            Phase4Answer5.append(Phase4Answer5a.getText().toString() + ", ");
        }
        if (Phase4Answer5b.isChecked()) {
            Phase4Answer5.append(Phase4Answer5b.getText().toString() + ", ");
        }
        if (Phase4Answer5c.isChecked()) {
            Phase4Answer5.append(Phase4Answer5c.getText().toString() + ", ");
        }
        if (Phase4Answer5d.isChecked()) {
            Phase4Answer5.append(Phase4Answer5d.getText().toString() + ", ");
        }

        if (Phase4Answer14a.isChecked()) {
            Phase4Answer14.append(Phase4Answer14a.getText().toString() + ", ");
        }
        if (Phase4Answer14b.isChecked()) {
            Phase4Answer14.append(Phase4Answer14b.getText().toString() + ", ");
        }
        if (Phase4Answer14c.isChecked()) {
            Phase4Answer14.append(Phase4Answer14c.getText().toString() + ", ");
        }
        if (Phase4Answer14d.isChecked()) {
            Phase4Answer14.append(Phase4Answer14d.getText().toString() + ", ");
        }
        if (Phase4Answer14e.isChecked()) {
            Phase4Answer14.append(Phase4Answer14e.getText().toString() + ", ");
        }
        if (Phase4Answer14f.isChecked()) {
            Phase4Answer14.append(Phase4Answer14f.getText().toString() + ", ");
        }
        if (Phase4Answer14g.isChecked()) {
            Phase4Answer14.append(Phase4Answer14g.getText().toString() + ", ");
        }
        if (Phase4Answer14h.isChecked()) {
            Phase4Answer14.append(Phase4Answer14h.getText().toString() + ", ");
        }
        if (Phase4Answer14i.isChecked()) {
            Phase4Answer14.append(Phase4Answer14i.getText().toString() + ", ");
        }
        if (Phase4Answer14j.isChecked()) {
            Phase4Answer14.append(Phase4Answer14j.getText().toString() + ", ");
        }
        if (Phase4Answer14k.isChecked()) {
            Phase4Answer14.append(Phase4Answer14k.getText().toString() + ", ");
        }


        if (Phase4Answer15a.isChecked()) {
            Phase4Answer15.append(Phase4Answer15a.getText().toString() + ", ");
        }
        if (Phase4Answer15b.isChecked()) {
            Phase4Answer15.append(Phase4Answer15b.getText().toString() + ", ");
        }
        if (Phase4Answer15c.isChecked()) {
            Phase4Answer15.append(Phase4Answer15c.getText().toString() + ", ");
        }
        if (Phase4Answer15d.isChecked()) {
            Phase4Answer15.append(Phase4Answer15d.getText().toString() + ", ");
        }
        if (Phase4Answer15e.isChecked()) {
            Phase4Answer15.append(Phase4Answer15e.getText().toString() + ", ");
        }
        if (Phase4Answer15f.isChecked()) {
            Phase4Answer15.append(Phase4Answer15f.getText().toString() + ", ");
        }
        if (Phase4Answer15g.isChecked()) {
            Phase4Answer15.append(Phase4Answer15g.getText().toString() + ", ");
        }


        if (Phase4Answer16a.isChecked()) {
            Phase4Answer16.append(Phase4Answer16a.getText().toString() + ", ");
        }
        if (Phase4Answer16b.isChecked()) {
            Phase4Answer16.append(Phase4Answer16b.getText().toString() + ", ");
        }
        if (Phase4Answer16c.isChecked()) {
            Phase4Answer16.append(Phase4Answer16c.getText().toString() + ", ");
        }
        if (Phase4Answer16d.isChecked()) {
            Phase4Answer16.append(Phase4Answer16d.getText().toString() + ", ");
        }
        if (Phase4Answer16e.isChecked()) {
            Phase4Answer16.append(Phase4Answer16e.getText().toString() + ", ");
        }

        if (Phase4Answer18a.isChecked()) {
            Phase4Answer18.append(Phase4Answer18a.getText().toString() + ", ");
        }
        if (Phase4Answer18b.isChecked()) {
            Phase4Answer18.append(Phase4Answer18b.getText().toString() + ", ");
        }
        if (Phase4Answer18c.isChecked()) {
            Phase4Answer18.append(Phase4Answer18c.getText().toString() + ", ");
        }
        if (Phase4Answer18d.isChecked()) {
            Phase4Answer18.append(Phase4Answer18d.getText().toString() + ", ");
        }
        if (Phase4Answer18e.isChecked()) {
            Phase4Answer18.append(Phase4Answer18e.getText().toString() + ", ");
        }


        if (Phase4Answer19a.isChecked()) {
            Phase4Answer19.append(Phase4Answer19a.getText().toString() + ", ");
        }
        if (Phase4Answer19b.isChecked()) {
            Phase4Answer19.append(Phase4Answer19b.getText().toString() + ", ");
        }
        if (Phase4Answer19c.isChecked()) {
            Phase4Answer19.append(Phase4Answer19c.getText().toString() + ", ");
        }
        if (Phase4Answer19d.isChecked()) {
            Phase4Answer19.append(Phase4Answer19d.getText().toString() + ", ");
        }
        if (Phase4Answer19e.isChecked()) {
            Phase4Answer19.append(Phase4Answer19e.getText().toString() + ", ");
        }




        if (Phase4Answer4.length() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase4Answer5.length() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase4Answer12.getText().toString() == null) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase4Answer14.length() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase4Answer15.length() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase4Answer16.length() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase4Answer18.length() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase4Answer19.length() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }


        Log.v("VALE", "" + Phase4Answer1.getSelectedItem().toString());
        Log.v("VALE", "" + Phase4Answer2.getSelectedItem().toString());
        Log.v("VALE", "" + Phase4Answer3.getSelectedItem().toString());
        Log.v("VALE", "" + Phase4Answer4.toString());
        Log.v("VALE", "" + Phase4Answer5.toString());
        Log.v("VALE", "" + Phase4Answer6.getSelectedItem().toString());
        Log.v("VALE", "" + Phase4Answer7.getSelectedItem().toString());
        Log.v("VALE", "" + Phase4Answer8.getSelectedItem().toString());
        Log.v("VALE", "" + Phase4Answer9.getSelectedItem().toString());
        Log.v("VALE", "" + Phase4Answer10.getSelectedItem().toString());
        Log.v("VALE", "" + Phase4Answer11.getSelectedItem().toString());
        Log.v("VALE", "" + Phase4Answer12.getText().toString());
        Log.v("VALE", "" + Phase4Answer13.getSelectedItem().toString());
        Log.v("VALE", "" + Phase4Answer14.toString());
        Log.v("VALE", "" + Phase4Answer15.toString());
        Log.v("VALE", "" + Phase4Answer16.toString());
        Log.v("VALE", "" + Phase4Answer17.getSelectedItem().toString());
        Log.v("VALE", "" + Phase4Answer18.toString());
        Log.v("VALE", "" + Phase4Answer19.toString());
        Log.v("VALE", "" + Phase4Answer20.getSelectedItem().toString());
        Log.v("VALE", "" + Phase4Answer21.getSelectedItem().toString());
        Log.v("VALE", "" + Phase4Answer22.getSelectedItem().toString());

        return true;
    }
























//    ArrayList<String> vdcList;
//
//    //Shared and preference
//    @Pref
//    LoginActivity_.preference_ user;
//
//    //Taking the reference of layout
//    @ViewById
//    Spinner healthPostPhase4;
//
//    //Load the page for the first time
//    @AfterViews
//    void loadFirst() {
//        vdcList = new ArrayList<>();
//        try {
//            //get the user information from the saved shared preference
//            String information = user.fullInformation().get();
//
//            //Convert the information into array
//            JSONArray infoArray = new JSONArray(information);
//            for (int i = 0; i < infoArray.length(); i++) {
//                JSONObject object = infoArray.getJSONObject(i);
//                JSONArray vdcArray = new JSONArray(object.getString("vdc"));
//                for (int j = 0; j < vdcArray.length(); j++) {
//                    //Get the String value of the JSON Object from the information array
//                    JSONObject posts = vdcArray.getJSONObject(j);
//                    vdcList.add(posts.getString("vdcHealthPost"));
//                }
//            }
//        } catch (JSONException err) {
//            Toast.makeText(this, "" + err.getMessage(), Toast.LENGTH_SHORT).show();
//        } finally {
//            //Create Adapter for the Spinner that show the list of the VDC health post
//            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, android.R.id.text1, vdcList);
//            healthPostPhase4.setAdapter(adapter);
//        }
//    }

}
