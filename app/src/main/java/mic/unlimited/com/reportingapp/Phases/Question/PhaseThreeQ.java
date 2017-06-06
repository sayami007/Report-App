package mic.unlimited.com.reportingapp.Phases.Question;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
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

@EActivity(R.layout.activity_phase3)
public class PhaseThreeQ extends AppCompatActivity {
    @ViewById
    Spinner Phase3Answer1;
    @ViewById
    Spinner Phase3Answer2;
    @ViewById
    Spinner Phase3Answer3;

    StringBuffer Phase3Answer4;
    @ViewById
    CheckBox Phase3Answer4a;
    @ViewById
    CheckBox Phase3Answer4b;
    @ViewById
    CheckBox Phase3Answer4c;
    @ViewById
    CheckBox Phase3Answer4d;
    @ViewById
    CheckBox Phase3Answer4e;
    @ViewById
    CheckBox Phase3Answer4f;
    @ViewById
    CheckBox Phase3Answer4g;
    @ViewById
    CheckBox Phase3Answer4h;

    StringBuffer Phase3Answer5;
    @ViewById
    CheckBox Phase3Answer5a;
    @ViewById
    CheckBox Phase3Answer5b;
    @ViewById
    CheckBox Phase3Answer5c;
    @ViewById
    CheckBox Phase3Answer5d;

    @ViewById
    Spinner Phase3Answer6;
    @ViewById
    Spinner Phase3Answer7;
    @ViewById
    Spinner Phase3Answer8;
    @ViewById
    Spinner Phase3Answer9;
    @ViewById
    Spinner Phase3Answer10;
    @ViewById
    Spinner Phase3Answer11;

    @ViewById
    EditText Phase3Answer12;

    @ViewById
    Spinner Phase3Answer13;

    StringBuffer Phase3Answer14;
    @ViewById
    CheckBox Phase3Answer14a;
    @ViewById
    CheckBox Phase3Answer14b;
    @ViewById
    CheckBox Phase3Answer14c;
    @ViewById
    CheckBox Phase3Answer14d;
    @ViewById
    CheckBox Phase3Answer14e;
    @ViewById
    CheckBox Phase3Answer14f;
    @ViewById
    CheckBox Phase3Answer14g;
    @ViewById
    CheckBox Phase3Answer14h;
    @ViewById
    CheckBox Phase3Answer14i;
    @ViewById
    CheckBox Phase3Answer14j;
    @ViewById
    CheckBox Phase3Answer14k;

    StringBuffer Phase3Answer15;
    @ViewById
    CheckBox Phase3Answer15a;
    @ViewById
    CheckBox Phase3Answer15b;
    @ViewById
    CheckBox Phase3Answer15c;
    @ViewById
    CheckBox Phase3Answer15d;
    @ViewById
    CheckBox Phase3Answer15e;
    @ViewById
    CheckBox Phase3Answer15f;
    @ViewById
    CheckBox Phase3Answer15g;


    StringBuffer Phase3Answer16;
    @ViewById
    CheckBox Phase3Answer16a;
    @ViewById
    CheckBox Phase3Answer16b;
    @ViewById
    CheckBox Phase3Answer16c;
    @ViewById
    CheckBox Phase3Answer16d;
    @ViewById
    CheckBox Phase3Answer16e;

    @ViewById
    Spinner Phase3Answer17;

    StringBuffer Phase3Answer18;
    @ViewById
    CheckBox Phase3Answer18a;
    @ViewById
    CheckBox Phase3Answer18b;
    @ViewById
    CheckBox Phase3Answer18c;
    @ViewById
    CheckBox Phase3Answer18d;
    @ViewById
    CheckBox Phase3Answer18e;

    StringBuffer Phase3Answer19;
    @ViewById
    CheckBox Phase3Answer19a;
    @ViewById
    CheckBox Phase3Answer19b;
    @ViewById
    CheckBox Phase3Answer19c;
    @ViewById
    CheckBox Phase3Answer19d;
    @ViewById
    CheckBox Phase3Answer19e;

    @ViewById
    Spinner Phase3Answer20;
    @ViewById
    Spinner Phase3Answer21;
    @ViewById
    Spinner Phase3Answer22;

    @Click(R.id.saveLocalPhase3)
    public void saveInformation() {
        boolean response = getValues();
        Log.v("RES", "RES" + response);
    }

    public boolean getValues() {

        if (Phase3Answer1.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase3Answer2.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase3Answer3.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (Phase3Answer6.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase3Answer7.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase3Answer8.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase3Answer9.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase3Answer10.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase3Answer11.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (Phase3Answer13.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (Phase3Answer17.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (Phase3Answer20.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase3Answer21.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase3Answer22.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }


        Phase3Answer4 = new StringBuffer();
        Phase3Answer5 = new StringBuffer();
        Phase3Answer14 = new StringBuffer();
        Phase3Answer15 = new StringBuffer();
        Phase3Answer16 = new StringBuffer();
        Phase3Answer18 = new StringBuffer();
        Phase3Answer19 = new StringBuffer();

        if (Phase3Answer4a.isChecked()) {
            Phase3Answer4.append(Phase3Answer4a.getText().toString() + ", ");
        }
        if (Phase3Answer4b.isChecked()) {
            Phase3Answer4.append(Phase3Answer4b.getText().toString() + ", ");
        }
        if (Phase3Answer4c.isChecked()) {
            Phase3Answer4.append(Phase3Answer4c.getText().toString() + ", ");
        }
        if (Phase3Answer4d.isChecked()) {
            Phase3Answer4.append(Phase3Answer4d.getText().toString() + ", ");
        }
        if (Phase3Answer4e.isChecked()) {
            Phase3Answer4.append(Phase3Answer4e.getText().toString() + ", ");
        }
        if (Phase3Answer4f.isChecked()) {
            Phase3Answer4.append(Phase3Answer4f.getText().toString() + ", ");
        }
        if (Phase3Answer4g.isChecked()) {
            Phase3Answer4.append(Phase3Answer4g.getText().toString() + ", ");
        }
        if (Phase3Answer4h.isChecked()) {
            Phase3Answer4.append(Phase3Answer4h.getText().toString() + ", ");
        }


        if (Phase3Answer5a.isChecked()) {
            Phase3Answer5.append(Phase3Answer5a.getText().toString() + ", ");
        }
        if (Phase3Answer5b.isChecked()) {
            Phase3Answer5.append(Phase3Answer5b.getText().toString() + ", ");
        }
        if (Phase3Answer5c.isChecked()) {
            Phase3Answer5.append(Phase3Answer5c.getText().toString() + ", ");
        }
        if (Phase3Answer5d.isChecked()) {
            Phase3Answer5.append(Phase3Answer5d.getText().toString() + ", ");
        }

        if (Phase3Answer14a.isChecked()) {
            Phase3Answer14.append(Phase3Answer14a.getText().toString() + ", ");
        }
        if (Phase3Answer14b.isChecked()) {
            Phase3Answer14.append(Phase3Answer14b.getText().toString() + ", ");
        }
        if (Phase3Answer14c.isChecked()) {
            Phase3Answer14.append(Phase3Answer14c.getText().toString() + ", ");
        }
        if (Phase3Answer14d.isChecked()) {
            Phase3Answer14.append(Phase3Answer14d.getText().toString() + ", ");
        }
        if (Phase3Answer14e.isChecked()) {
            Phase3Answer14.append(Phase3Answer14e.getText().toString() + ", ");
        }
        if (Phase3Answer14f.isChecked()) {
            Phase3Answer14.append(Phase3Answer14f.getText().toString() + ", ");
        }
        if (Phase3Answer14g.isChecked()) {
            Phase3Answer14.append(Phase3Answer14g.getText().toString() + ", ");
        }
        if (Phase3Answer14h.isChecked()) {
            Phase3Answer14.append(Phase3Answer14h.getText().toString() + ", ");
        }
        if (Phase3Answer14i.isChecked()) {
            Phase3Answer14.append(Phase3Answer14i.getText().toString() + ", ");
        }
        if (Phase3Answer14j.isChecked()) {
            Phase3Answer14.append(Phase3Answer14j.getText().toString() + ", ");
        }
        if (Phase3Answer14k.isChecked()) {
            Phase3Answer14.append(Phase3Answer14k.getText().toString() + ", ");
        }


        if (Phase3Answer15a.isChecked()) {
            Phase3Answer15.append(Phase3Answer15a.getText().toString() + ", ");
        }
        if (Phase3Answer15b.isChecked()) {
            Phase3Answer15.append(Phase3Answer15b.getText().toString() + ", ");
        }
        if (Phase3Answer15c.isChecked()) {
            Phase3Answer15.append(Phase3Answer15c.getText().toString() + ", ");
        }
        if (Phase3Answer15d.isChecked()) {
            Phase3Answer15.append(Phase3Answer15d.getText().toString() + ", ");
        }
        if (Phase3Answer15e.isChecked()) {
            Phase3Answer15.append(Phase3Answer15e.getText().toString() + ", ");
        }
        if (Phase3Answer15f.isChecked()) {
            Phase3Answer15.append(Phase3Answer15f.getText().toString() + ", ");
        }
        if (Phase3Answer15g.isChecked()) {
            Phase3Answer15.append(Phase3Answer15g.getText().toString() + ", ");
        }


        if (Phase3Answer16a.isChecked()) {
            Phase3Answer16.append(Phase3Answer16a.getText().toString() + ", ");
        }
        if (Phase3Answer16b.isChecked()) {
            Phase3Answer16.append(Phase3Answer16b.getText().toString() + ", ");
        }
        if (Phase3Answer16c.isChecked()) {
            Phase3Answer16.append(Phase3Answer16c.getText().toString() + ", ");
        }
        if (Phase3Answer16d.isChecked()) {
            Phase3Answer16.append(Phase3Answer16d.getText().toString() + ", ");
        }
        if (Phase3Answer16e.isChecked()) {
            Phase3Answer16.append(Phase3Answer16e.getText().toString() + ", ");
        }

        if (Phase3Answer18a.isChecked()) {
            Phase3Answer18.append(Phase3Answer18a.getText().toString() + ", ");
        }
        if (Phase3Answer18b.isChecked()) {
            Phase3Answer18.append(Phase3Answer18b.getText().toString() + ", ");
        }
        if (Phase3Answer18c.isChecked()) {
            Phase3Answer18.append(Phase3Answer18c.getText().toString() + ", ");
        }
        if (Phase3Answer18d.isChecked()) {
            Phase3Answer18.append(Phase3Answer18d.getText().toString() + ", ");
        }
        if (Phase3Answer18e.isChecked()) {
            Phase3Answer18.append(Phase3Answer18e.getText().toString() + ", ");
        }


        if (Phase3Answer19a.isChecked()) {
            Phase3Answer19.append(Phase3Answer19a.getText().toString() + ", ");
        }
        if (Phase3Answer19b.isChecked()) {
            Phase3Answer19.append(Phase3Answer19b.getText().toString() + ", ");
        }
        if (Phase3Answer19c.isChecked()) {
            Phase3Answer19.append(Phase3Answer19c.getText().toString() + ", ");
        }
        if (Phase3Answer19d.isChecked()) {
            Phase3Answer19.append(Phase3Answer19d.getText().toString() + ", ");
        }
        if (Phase3Answer19e.isChecked()) {
            Phase3Answer19.append(Phase3Answer19e.getText().toString() + ", ");
        }




        if (Phase3Answer4.length() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase3Answer5.length() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase3Answer12.getText().toString() == null) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase3Answer14.length() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase3Answer15.length() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase3Answer16.length() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase3Answer18.length() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase3Answer19.length() == 0) {
            Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();
            return false;
        }


        Log.v("VALE", "" + Phase3Answer1.getSelectedItem().toString());
        Log.v("VALE", "" + Phase3Answer2.getSelectedItem().toString());
        Log.v("VALE", "" + Phase3Answer3.getSelectedItem().toString());
        Log.v("VALE", "" + Phase3Answer4.toString());
        Log.v("VALE", "" + Phase3Answer5.toString());
        Log.v("VALE", "" + Phase3Answer6.getSelectedItem().toString());
        Log.v("VALE", "" + Phase3Answer7.getSelectedItem().toString());
        Log.v("VALE", "" + Phase3Answer8.getSelectedItem().toString());
        Log.v("VALE", "" + Phase3Answer9.getSelectedItem().toString());
        Log.v("VALE", "" + Phase3Answer10.getSelectedItem().toString());
        Log.v("VALE", "" + Phase3Answer11.getSelectedItem().toString());
        Log.v("VALE", "" + Phase3Answer12.getText().toString());
        Log.v("VALE", "" + Phase3Answer13.getSelectedItem().toString());
        Log.v("VALE", "" + Phase3Answer14.toString());
        Log.v("VALE", "" + Phase3Answer15.toString());
        Log.v("VALE", "" + Phase3Answer16.toString());
        Log.v("VALE", "" + Phase3Answer17.getSelectedItem().toString());
        Log.v("VALE", "" + Phase3Answer18.toString());
        Log.v("VALE", "" + Phase3Answer19.toString());
        Log.v("VALE", "" + Phase3Answer20.getSelectedItem().toString());
        Log.v("VALE", "" + Phase3Answer21.getSelectedItem().toString());
        Log.v("VALE", "" + Phase3Answer22.getSelectedItem().toString());

        return true;
    }


}
