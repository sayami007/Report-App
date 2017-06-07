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
import io.realm.RealmConfiguration;
import io.realm.RealmResults;
import mic.unlimited.com.reportingapp.Activity.LoginActivity_;
import mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db;
import mic.unlimited.com.reportingapp.Database.Mother;
import mic.unlimited.com.reportingapp.Database.Supervisor;
import mic.unlimited.com.reportingapp.Database.Vdc;
import mic.unlimited.com.reportingapp.Phases.Answer.Phase1UserList;
import mic.unlimited.com.reportingapp.Phases.Answer.Phase1UserList_;
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


    @Click(R.id.saveLocalPhase1)
    void save() {
        int motherId = generateMotherId();
        String motherName = motherNamePhase1.getText().toString();
        int motherAge = Integer.parseInt(motherAgePhase1.getText().toString());
        long motherContact = Long.parseLong(motherContactPhase1.getText().toString());
        Supervisor supervisor = getSupervisor();
        int vdcId = getVdcId();
        boolean checkMother = checkMother(motherId, motherName, motherAge, motherContact, supervisor);
        if (checkMother) {
            if (getValue()) {
                saveMother(motherId, motherName, motherAge, motherContact, supervisor);
                saveValues(motherId);
                Toast.makeText(this, "Save Successfull", Toast.LENGTH_SHORT).show();
                Phase1UserList_.intent(this).start();
                this.finish();
            }
        } else {
            Toast.makeText(this, "Entry Not saved", Toast.LENGTH_SHORT).show();
        }
    }

    //Generate Vdc Id
    private int getVdcId() {
        String value = healthPostPhase1.getSelectedItem().toString();
        int v = Integer.parseInt(value.replaceAll("[^0-9]", ""));
        return v;
    }

    private boolean checkMother(int a, String b, int c, long d, Supervisor e) {
        try {
            if (b.equals(null) && c == 0 && d == 0 && e.equals(null)) {
                return false;
            } else {
                return true;
            }
        } catch (Exception err) {
            Toast.makeText(this, "" + err.getMessage(), Toast.LENGTH_SHORT).show();
        }
        return false;
    }

    private void saveMother(int a, String b, int c, long d, Supervisor e) {
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(config);
        mReal.beginTransaction();
        Mother result = mReal.createObject(Mother.class, a);
        result.setMotherName(b);
        result.setMotherAge(c);
        result.setMotherContact(d);
        result.setSupervisorId(e);
        mReal.commitTransaction();
        mReal.close();
    }

    //Generate random motherId
    private int generateMotherId() {
        int motherId = 1;
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(config);
        RealmResults<Mother> mother = mReal.where(Mother.class).findAll();
        if (mother.size() == 0) {
            mReal.close();
            return motherId;
        } else {
            mReal.close();
            return mother.size() + 1;
        }
    }

    private Supervisor getSupervisor() {
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(config);
        RealmResults<Supervisor> supervisor = mReal.where(Supervisor.class).findAll();
        mReal.close();
        return supervisor.get(0);
    }


    @AfterViews
    public void begin() {
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(config);
        RealmResults<Vdc> vdcs = mReal.where(Vdc.class).findAll();
        vdcList = new ArrayList<>();
        for (int i = 0; i < vdcs.size(); i++) {
            Vdc vdc = vdcs.get(i);
            vdcList.add(i, vdc.getVdcHealthPost());
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, android.R.id.text1, vdcList);
        healthPostPhase1.setAdapter(adapter);
        mReal.close();
    }

    public void saveValues(int motherId) {

        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(config);
        RealmResults<Mother> mothers = mReal.where(Mother.class).equalTo("motherId", motherId).findAll();

        mReal.beginTransaction();
        ActivityPhase1Db db = mReal.createObject(ActivityPhase1Db.class);

        db.setMother(mothers.get(0));
        db.setPhaseAnswer1(Phase1Answer1.getSelectedItem().toString());
        db.setPhaseAnswer2(Phase1Answer2.getSelectedItem().toString());
        db.setPhaseAnswer3(Phase1Answer3.getSelectedItem().toString());
        db.setPhaseAnswer4(Phase1Answer4.getSelectedItem().toString());
        db.setPhaseAnswer5(Phase1Answer5.getSelectedItem().toString());
        db.setPhaseAnswer6(Phase1Answer6.toString());
        db.setPhaseAnswer7(Phase1Answer7.getSelectedItem().toString());
        db.setPhaseAnswer8(Phase1Answer8.toString());
        db.setPhaseAnswer9(Phase1Answer9.getSelectedItem().toString());
        db.setPhaseAnswer10(Phase1Answer10.toString());
        db.setPhaseAnswer11(Phase1Answer11.toString());
        db.setPhaseAnswer12(Phase1Answer12.toString());
        db.setPhaseAnswer13(Phase1Answer13.toString());
        db.setPhaseAnswer14(Phase1Answer14.getSelectedItem().toString());
        db.setPhaseAnswer15(Phase1Answer15.getSelectedItem().toString());
        db.setPhaseAnswer16(Phase1Answer16.toString());
        db.setPhaseAnswer17(Phase1Answer17.getSelectedItem().toString());
        db.setPhaseAnswer18(Phase1Answer18.getSelectedItem().toString());
        db.setPhaseAnswer19(Phase1Answer19.getSelectedItem().toString());

        mReal.commitTransaction();


        Log.v("Values", "" + (Phase1Answer1.getSelectedItem().toString()));
        Log.v("Values", "" + (Phase1Answer2.getSelectedItem().toString()));
        Log.v("Values", "" + (Phase1Answer3.getSelectedItem().toString()));
        Log.v("Values", "" + (Phase1Answer4.getSelectedItem().toString()));
        Log.v("Values", "" + (Phase1Answer5.getSelectedItem().toString()));

        Log.v("Values", "" + (Phase1Answer6.toString()));
        Log.v("Values", "" + (Phase1Answer7.getSelectedItem().toString()));
        Log.v("Values", "" + (Phase1Answer8.toString()));
        Log.v("Values", "" + (Phase1Answer9.getSelectedItem().toString()));
        Log.v("Values", "" + (Phase1Answer10.toString()));
        Log.v("Values", "" + (Phase1Answer11.toString()));
        Log.v("Values", "" + (Phase1Answer12.toString()));
        Log.v("Values", "" + (Phase1Answer13.toString()));
        Log.v("Values", "" + (Phase1Answer14.getSelectedItem().toString()));
        Log.v("Values", "" + (Phase1Answer15.getSelectedItem().toString()));
        Log.v("Values", "" + (Phase1Answer16.toString()));
        Log.v("Values", "" + (Phase1Answer17.getSelectedItem().toString()));
        Log.v("Values", "" + (Phase1Answer18.getSelectedItem().toString()));
        Log.v("Values", "" + (Phase1Answer19.getSelectedItem().toString()));

        mReal.close();
    }


    private boolean getValue() {
        if (Phase1Answer1.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Kripaya Aru Uttar channuhos", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase1Answer2.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Kripaya Aru Uttar channuhos", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase1Answer3.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Kripaya Aru Uttar channuhos", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase1Answer4.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Kripaya Aru Uttar channuhos", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase1Answer5.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Kripaya Aru Uttar channuhos", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase1Answer7.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Kripaya Aru Uttar channuhos", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase1Answer9.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Kripaya Aru Uttar channuhos", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase1Answer14.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Kripaya Aru Uttar channuhos", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase1Answer15.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Kripaya Aru Uttar channuhos", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase1Answer17.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Kripaya Aru Uttar channuhos", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase1Answer18.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Kripaya Aru Uttar channuhos", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase1Answer19.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Kripaya Aru Uttar channuhos", Toast.LENGTH_SHORT).show();
            return false;
        }

        Phase1Answer6 = new StringBuffer();
        Phase1Answer8 = new StringBuffer();
        Phase1Answer10 = new StringBuffer();
        Phase1Answer11 = new StringBuffer();
        Phase1Answer12 = new StringBuffer();
        Phase1Answer13 = new StringBuffer();
        Phase1Answer16 = new StringBuffer();


        if (Phase1Answer6a.isChecked()) {
            Phase1Answer6.append(Phase1Answer6a.getText().toString() + ", ");
        }
        if (Phase1Answer6b.isChecked()) {
            Phase1Answer6.append(Phase1Answer6b.getText().toString() + " ,");
        }
        if (Phase1Answer6c.isChecked()) {
            Phase1Answer6.append(Phase1Answer6c.getText().toString() + ", ");
        }
        if (Phase1Answer6d.isChecked()) {
            Phase1Answer6.append(Phase1Answer6d.getText().toString() + ", ");
        }
        if (Phase1Answer6e.isChecked()) {
            Phase1Answer6.append(Phase1Answer6e.getText().toString() + ", ");
        }
        if (Phase1Answer6f.isChecked()) {
            Phase1Answer6.append(Phase1Answer6f.getText().toString() + " ,");
        }
        if (Phase1Answer6g.isChecked()) {
            Phase1Answer6.append(Phase1Answer6g.getText().toString() + " ,");
        }
        if (Phase1Answer6h.isChecked()) {
            Phase1Answer6.append(Phase1Answer6h.getText().toString() + ", ");
        }
        if (Phase1Answer6i.isChecked()) {
            Phase1Answer6.append(Phase1Answer6i.getText().toString() + " ,");
        }
        if (Phase1Answer6j.isChecked()) {
            Phase1Answer6.append(Phase1Answer6j.getText().toString() + " ");
        }


        if (Phase1Answer8a.isChecked()) {
            Phase1Answer8.append(Phase1Answer8a.getText().toString() + " ,");
        }
        if (Phase1Answer8b.isChecked()) {
            Phase1Answer8.append(Phase1Answer8b.getText().toString() + " ,");
        }
        if (Phase1Answer8c.isChecked()) {
            Phase1Answer8.append(Phase1Answer8c.getText().toString() + " ,");
        }
        if (Phase1Answer8d.isChecked()) {
            Phase1Answer8.append(Phase1Answer8d.getText().toString() + ", ");
        }
        if (Phase1Answer8e.isChecked()) {
            Phase1Answer8.append(Phase1Answer8e.getText().toString() + ", ");
        }
        if (Phase1Answer8f.isChecked()) {
            Phase1Answer8.append(Phase1Answer8f.getText().toString() + " ,");
        }
        if (Phase1Answer8g.isChecked()) {
            Phase1Answer8.append(Phase1Answer8g.getText().toString() + " ");
        }


        if (Phase1Answer10a.isChecked()) {
            Phase1Answer10.append(Phase1Answer10a.getText().toString() + ", ");
        }
        if (Phase1Answer10b.isChecked()) {
            Phase1Answer10.append(Phase1Answer10b.getText().toString() + ", ");
        }
        if (Phase1Answer10c.isChecked()) {
            Phase1Answer10.append(Phase1Answer10c.getText().toString() + " ,");
        }
        if (Phase1Answer10d.isChecked()) {
            Phase1Answer10.append(Phase1Answer10d.getText().toString() + " ,");
        }
        if (Phase1Answer10e.isChecked()) {
            Phase1Answer10.append(Phase1Answer10e.getText().toString() + " ,");
        }
        if (Phase1Answer10f.isChecked()) {
            Phase1Answer10.append(Phase1Answer10f.getText().toString() + " ,");
        }
        if (Phase1Answer10g.isChecked()) {
            Phase1Answer10.append(Phase1Answer10g.getText().toString() + ", ");
        }
        if (Phase1Answer10h.isChecked()) {
            Phase1Answer10.append(Phase1Answer10h.getText().toString() + " ,");
        }
        if (Phase1Answer10i.isChecked()) {
            Phase1Answer10.append(Phase1Answer10i.getText().toString() + ", ");
        }
        if (Phase1Answer10j.isChecked()) {
            Phase1Answer10.append(Phase1Answer10j.getText().toString() + " ");
        }


        if (Phase1Answer11a.isChecked()) {
            Phase1Answer11.append(Phase1Answer11a.getText().toString() + " ,");
        }
        if (Phase1Answer11b.isChecked()) {
            Phase1Answer11.append(Phase1Answer11b.getText().toString() + ", ");
        }
        if (Phase1Answer11c.isChecked()) {
            Phase1Answer11.append(Phase1Answer11c.getText().toString() + " ,");
        }
        if (Phase1Answer11d.isChecked()) {
            Phase1Answer11.append(Phase1Answer11d.getText().toString() + ", ");
        }
        if (Phase1Answer11e.isChecked()) {
            Phase1Answer11.append(Phase1Answer11e.getText().toString() + ", ");
        }
        if (Phase1Answer11f.isChecked()) {
            Phase1Answer11.append(Phase1Answer11f.getText().toString() + ", ");
        }
        if (Phase1Answer11g.isChecked()) {
            Phase1Answer11.append(Phase1Answer11g.getText().toString() + " ");
        }


        if (Phase1Answer12a.isChecked()) {
            Phase1Answer12.append(Phase1Answer12a.getText().toString() + ", ");
        }
        if (Phase1Answer12b.isChecked()) {
            Phase1Answer12.append(Phase1Answer12b.getText().toString() + " ,");
        }
        if (Phase1Answer12c.isChecked()) {
            Phase1Answer12.append(Phase1Answer12c.getText().toString() + " ,");
        }
        if (Phase1Answer12d.isChecked()) {
            Phase1Answer12.append(Phase1Answer12d.getText().toString() + " ,");
        }
        if (Phase1Answer12e.isChecked()) {
            Phase1Answer12.append(Phase1Answer12e.getText().toString() + ", ");
        }
        if (Phase1Answer12f.isChecked()) {
            Phase1Answer12.append(Phase1Answer12f.getText().toString() + " ,");
        }
        if (Phase1Answer12g.isChecked()) {
            Phase1Answer12.append(Phase1Answer12g.getText().toString() + ", ");
        }
        if (Phase1Answer12h.isChecked()) {
            Phase1Answer12.append(Phase1Answer12h.getText().toString() + " ");
        }


        if (Phase1Answer13a.isChecked()) {
            Phase1Answer13.append(Phase1Answer13a.getText().toString() + " ,");
        }
        if (Phase1Answer13b.isChecked()) {
            Phase1Answer13.append(Phase1Answer13b.getText().toString() + ", ");
        }
        if (Phase1Answer13c.isChecked()) {
            Phase1Answer13.append(Phase1Answer13c.getText().toString() + ", ");
        }
        if (Phase1Answer13d.isChecked()) {
            Phase1Answer13.append(Phase1Answer13d.getText().toString() + ", ");
        }
        if (Phase1Answer13e.isChecked()) {
            Phase1Answer13.append(Phase1Answer13e.getText().toString() + ", ");
        }
        if (Phase1Answer13f.isChecked()) {
            Phase1Answer13.append(Phase1Answer13f.getText().toString() + ", ");
        }
        if (Phase1Answer13g.isChecked()) {
            Phase1Answer13.append(Phase1Answer13g.getText().toString() + ", ");
        }
        if (Phase1Answer13h.isChecked()) {
            Phase1Answer13.append(Phase1Answer13h.getText().toString() + " ");
        }


        if (Phase1Answer16a.isChecked()) {
            Phase1Answer16.append(Phase1Answer16a.getText().toString() + " ,");
        }
        if (Phase1Answer16b.isChecked()) {
            Phase1Answer16.append(Phase1Answer16b.getText().toString() + " ,");
        }
        if (Phase1Answer16c.isChecked()) {
            Phase1Answer16.append(Phase1Answer16c.getText().toString() + " ,");
        }
        if (Phase1Answer16d.isChecked()) {
            Phase1Answer16.append(Phase1Answer16d.getText().toString() + ", ");
        }
        if (Phase1Answer16e.isChecked()) {
            Phase1Answer16.append(Phase1Answer16e.getText().toString() + " ");
        }

        if (Phase1Answer6.length() == 0) {
            Toast.makeText(this, "Please make a selection ", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase1Answer8.length() == 0) {
            Toast.makeText(this, "Please make a selection ", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase1Answer10.length() == 0) {
            Toast.makeText(this, "Please make a selection ", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase1Answer11.length() == 0) {
            Toast.makeText(this, "Please make a selection ", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase1Answer12.length() == 0) {
            Toast.makeText(this, "Please make a selection ", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase1Answer13.length() == 0) {
            Toast.makeText(this, "Please make a selection ", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase1Answer16.length() == 0) {
            Toast.makeText(this, "Please make a selection ", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}

