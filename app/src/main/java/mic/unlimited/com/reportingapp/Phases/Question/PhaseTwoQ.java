package mic.unlimited.com.reportingapp.Phases.Question;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
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

import java.security.spec.ECField;
import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;
import mic.unlimited.com.reportingapp.Activity.LoginActivity_;
import mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db;
import mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db;
import mic.unlimited.com.reportingapp.Database.Mother;
import mic.unlimited.com.reportingapp.Database.Supervisor;
import mic.unlimited.com.reportingapp.Database.Vdc;
import mic.unlimited.com.reportingapp.Phases.Answer.Phase1UserList_;
import mic.unlimited.com.reportingapp.R;

/**
 * Created by Bibesh on 4/20/17.
 */

@EActivity(R.layout.activity_phase2)
public class PhaseTwoQ extends AppCompatActivity {

    @ViewById
    EditText motherNamePhase2;

    @ViewById
    EditText motherAgePhase2;

    @ViewById
    EditText motherContactPhase2;

    @ViewById
    EditText motherAddressPhase2;


    @ViewById
    Spinner Phase2Answer1;
    @ViewById
    Spinner Phase2Answer2;
    @ViewById
    Spinner Phase2Answer3;
    @ViewById
    Spinner Phase2Answer4;
    @ViewById
    Spinner Phase2Answer5;

    @ViewById
    CheckBox Phase2Answer6a;
    @ViewById
    CheckBox Phase2Answer6b;
    @ViewById
    CheckBox Phase2Answer6c;
    @ViewById
    CheckBox Phase2Answer6d;


    @ViewById
    CheckBox Phase2Answer7a;
    @ViewById
    CheckBox Phase2Answer7b;
    @ViewById
    CheckBox Phase2Answer7c;
    @ViewById
    CheckBox Phase2Answer7d;
    @ViewById
    CheckBox Phase2Answer7e;
    @ViewById
    CheckBox Phase2Answer7f;
    @ViewById
    CheckBox Phase2Answer7g;
    @ViewById
    CheckBox Phase2Answer7h;
    @ViewById
    CheckBox Phase2Answer7i;
    @ViewById
    CheckBox Phase2Answer7j;

    @ViewById
    Spinner Phase2Answer9;

    @ViewById
    CheckBox Phase2Answer10a;
    @ViewById
    CheckBox Phase2Answer10b;
    @ViewById
    CheckBox Phase2Answer10c;
    @ViewById
    CheckBox Phase2Answer10d;
    @ViewById
    CheckBox Phase2Answer10e;
    @ViewById
    CheckBox Phase2Answer10f;
    @ViewById
    CheckBox Phase2Answer10g;

    @ViewById
    Spinner Phase2Answer11;
    @ViewById
    Spinner Phase2Answer12;
    @ViewById
    Spinner Phase2Answer13;
    @ViewById
    Spinner Phase2Answer14;
    @ViewById
    Spinner Phase2Answer15;
    @ViewById
    Spinner Phase2Answer16;
    @ViewById
    Spinner Phase2Answer17;
    @ViewById
    Spinner Phase2Answer18;
    @ViewById
    Spinner Phase2Answer19;
    @ViewById
    Spinner Phase2Answer20;


    @ViewById
    EditText Phase2Answer21;
    @ViewById
    Spinner Phase2Answer22;


    @ViewById
    CheckBox Phase2Answer23a;
    @ViewById
    CheckBox Phase2Answer23b;
    @ViewById
    CheckBox Phase2Answer23c;
    @ViewById
    CheckBox Phase2Answer23d;
    @ViewById
    CheckBox Phase2Answer23e;
    @ViewById
    CheckBox Phase2Answer23f;
    @ViewById
    CheckBox Phase2Answer23g;
    @ViewById
    CheckBox Phase2Answer23h;
    @ViewById
    CheckBox Phase2Answer23i;
    @ViewById
    CheckBox Phase2Answer23j;
    @ViewById
    CheckBox Phase2Answer23k;


    @ViewById
    CheckBox Phase2Answer24a;
    @ViewById
    CheckBox Phase2Answer24b;
    @ViewById
    CheckBox Phase2Answer24c;
    @ViewById
    CheckBox Phase2Answer24d;
    @ViewById
    CheckBox Phase2Answer24e;
    @ViewById
    CheckBox Phase2Answer24f;
    @ViewById
    CheckBox Phase2Answer24g;


    @ViewById
    CheckBox Phase2Answer25a;
    @ViewById
    CheckBox Phase2Answer25b;
    @ViewById
    CheckBox Phase2Answer25c;
    @ViewById
    CheckBox Phase2Answer25d;
    @ViewById
    CheckBox Phase2Answer25e;

    @ViewById
    Spinner Phase2Answer26;


    @ViewById
    CheckBox Phase2Answer27a;
    @ViewById
    CheckBox Phase2Answer27b;
    @ViewById
    CheckBox Phase2Answer27c;
    @ViewById
    CheckBox Phase2Answer27d;
    @ViewById
    CheckBox Phase2Answer27e;


    @ViewById
    CheckBox Phase2Answer28a;
    @ViewById
    CheckBox Phase2Answer28b;
    @ViewById
    CheckBox Phase2Answer28c;
    @ViewById
    CheckBox Phase2Answer28d;
    @ViewById
    CheckBox Phase2Answer28e;

    @ViewById
    Spinner Phase2Answer29;
    @ViewById
    Spinner Phase2Answer30;
    @ViewById
    Spinner Phase2Answer31;


    ArrayList<String> vdcList;

    @ViewById
    Spinner healthPostPhase2;


    StringBuffer Phase2Answer25;
    StringBuffer Phase2Answer24;
    StringBuffer Phase2Answer27;
    StringBuffer Phase2Answer28;
    StringBuffer Phase2Answer23;
    StringBuffer Phase2Answer10;
    StringBuffer Phase2Answer7;
    StringBuffer Phase2Answer6;

    @AfterViews
    public void begin() {
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(config);
        RealmResults<Vdc> vdcs = mReal.where(Vdc.class).findAll();
        vdcList = new ArrayList<>();
        for (int i = 0; i < vdcs.size(); i++) {
            Vdc vdc = vdcs.get(i);
            vdcList.add(i, vdc.getVdcId() + ") " + vdc.getVdcHealthPost());
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, android.R.id.text1, vdcList);
        healthPostPhase2.setAdapter(adapter);
        mReal.close();
    }

    @Click(R.id.saveLocalPhase2)
    void saveInformation() {
        try {

            Phase2Answer6 = new StringBuffer();
            Phase2Answer7 = new StringBuffer();
            Phase2Answer10 = new StringBuffer();
            Phase2Answer23 = new StringBuffer();
            Phase2Answer24 = new StringBuffer();
            Phase2Answer25 = new StringBuffer();
            Phase2Answer27 = new StringBuffer();
            Phase2Answer28 = new StringBuffer();

            int motherId = generateMotherId();
            String motherName = motherNamePhase2.getText().toString();
            int motherAge = Integer.parseInt(motherAgePhase2.getText().toString());
            int motherNumber = Integer.parseInt(motherContactPhase2.getText().toString());
            String motherAddress = motherAddressPhase2.getText().toString();
            int vdcId = getVdcId();
            Supervisor sup = getSupervisor();
            if (motherInformation(motherName, motherAge, motherNumber, motherAddress)) {
                if (getValues()) {
                    saveMother(motherId, motherName, motherAge, motherNumber, sup, vdcId);
                    saveToDb(motherId);
                    Toast.makeText(this, "Succesful Entry", Toast.LENGTH_SHORT).show();
                    this.finish();
                }
            }
        } catch (Exception err) {
            Log.v("SDf", "err: " + err.getMessage());
            Toast.makeText(this, "err: " + err.getMessage(), Toast.LENGTH_SHORT).show();
        }
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

    //Generate Vdc Id
    private int getVdcId() {
        String value = healthPostPhase2.getSelectedItem().toString();
        int v = Integer.parseInt(value.replaceAll("[^0-9]", ""));
        return v;
    }

    //Generate Supervisor
    private Supervisor getSupervisor() {
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(config);
        RealmResults<Supervisor> supervisor = mReal.where(Supervisor.class).findAll();
        mReal.close();
        return supervisor.get(0);
    }

    //Validate Mother Information
    private boolean motherInformation(String a, int b, int c, String d) {
        if (a.equals(null)) {
            return false;
        }

        if (b == 0) {
            return false;
        }

        if (c == 0) {
            return false;
        }

        if (d.equals(null)) {
            return false;
        }
        return true;
    }

    //Get All Values with Validation
    private boolean getValues() {
        if (Phase2Answer1.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Kripaya Aru Uttar channuhos", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase2Answer2.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Kripaya Aru Uttar channuhos", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase2Answer3.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Kripaya Aru Uttar channuhos", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase2Answer4.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Kripaya Aru Uttar channuhos", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase2Answer5.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Kripaya Aru Uttar channuhos", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase2Answer9.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Kripaya Aru Uttar channuhos", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase2Answer11.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Kripaya Aru Uttar channuhos", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase2Answer12.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Kripaya Aru Uttar channuhos", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase2Answer13.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Kripaya Aru Uttar channuhos", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase2Answer14.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Kripaya Aru Uttar channuhos", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase2Answer15.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Kripaya Aru Uttar channuhos", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase2Answer16.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Kripaya Aru Uttar channuhos", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase2Answer17.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Kripaya Aru Uttar channuhos", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase2Answer18.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Kripaya Aru Uttar channuhos", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase2Answer19.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Kripaya Aru Uttar channuhos", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase2Answer20.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Kripaya Aru Uttar channuhos", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase2Answer22.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Kripaya Aru Uttar channuhos", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase2Answer26.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Kripaya Aru Uttar channuhos", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase2Answer29.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Kripaya Aru Uttar channuhos", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase2Answer30.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Kripaya Aru Uttar channuhos", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase2Answer31.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Kripaya Aru Uttar channuhos", Toast.LENGTH_SHORT).show();
            return false;
        }


        if (Phase2Answer6a.isChecked()) {
            Phase2Answer6.append(Phase2Answer6a.getText().toString() + ", ");
        }
        if (Phase2Answer6b.isChecked()) {
            Phase2Answer6.append(Phase2Answer6b.getText().toString() + ", ");
        }
        if (Phase2Answer6c.isChecked()) {
            Phase2Answer6.append(Phase2Answer6c.getText().toString() + ", ");
        }
        if (Phase2Answer6d.isChecked()) {
            Phase2Answer6.append(Phase2Answer6d.getText().toString() + ", ");
        }

        if (Phase2Answer7a.isChecked()) {
            Phase2Answer7.append(Phase2Answer7a.getText().toString() + ", ");
        }
        if (Phase2Answer7b.isChecked()) {
            Phase2Answer7.append(Phase2Answer7b.getText().toString() + ", ");
        }
        if (Phase2Answer7c.isChecked()) {
            Phase2Answer7.append(Phase2Answer7c.getText().toString() + ", ");
        }
        if (Phase2Answer7d.isChecked()) {
            Phase2Answer7.append(Phase2Answer7d.getText().toString() + ", ");
        }
        if (Phase2Answer7e.isChecked()) {
            Phase2Answer7.append(Phase2Answer7e.getText().toString() + ", ");
        }
        if (Phase2Answer7f.isChecked()) {
            Phase2Answer7.append(Phase2Answer7f.getText().toString() + ", ");
        }
        if (Phase2Answer7g.isChecked()) {
            Phase2Answer7.append(Phase2Answer7g.getText().toString() + ", ");
        }
        if (Phase2Answer7h.isChecked()) {
            Phase2Answer7.append(Phase2Answer7h.getText().toString() + ", ");
        }
        if (Phase2Answer7i.isChecked()) {
            Phase2Answer7.append(Phase2Answer7i.getText().toString() + ", ");
        }
        if (Phase2Answer7j.isChecked()) {
            Phase2Answer7.append(Phase2Answer7j.getText().toString() + ", ");
        }

        if (Phase2Answer10a.isChecked()) {
            Phase2Answer10.append(Phase2Answer10a.getText().toString() + ", ");
        }
        if (Phase2Answer10b.isChecked()) {
            Phase2Answer10.append(Phase2Answer10b.getText().toString() + ", ");
        }
        if (Phase2Answer10c.isChecked()) {
            Phase2Answer10.append(Phase2Answer10c.getText().toString() + ", ");
        }
        if (Phase2Answer10d.isChecked()) {
            Phase2Answer10.append(Phase2Answer10d.getText().toString() + ", ");
        }
        if (Phase2Answer10e.isChecked()) {
            Phase2Answer10.append(Phase2Answer10e.getText().toString() + ", ");
        }
        if (Phase2Answer10f.isChecked()) {
            Phase2Answer10.append(Phase2Answer10f.getText().toString() + ", ");
        }
        if (Phase2Answer10g.isChecked()) {
            Phase2Answer10.append(Phase2Answer10g.getText().toString() + ", ");
        }


        if (Phase2Answer23a.isChecked()) {
            Phase2Answer23.append(Phase2Answer23a.getText().toString() + ", ");
        }
        if (Phase2Answer23b.isChecked()) {
            Phase2Answer23.append(Phase2Answer23b.getText().toString() + ", ");
        }
        if (Phase2Answer23c.isChecked()) {
            Phase2Answer23.append(Phase2Answer23c.getText().toString() + ", ");
        }
        if (Phase2Answer23d.isChecked()) {
            Phase2Answer23.append(Phase2Answer23d.getText().toString() + ", ");
        }
        if (Phase2Answer23e.isChecked()) {
            Phase2Answer23.append(Phase2Answer23e.getText().toString() + ", ");
        }
        if (Phase2Answer23f.isChecked()) {
            Phase2Answer23.append(Phase2Answer23f.getText().toString() + ", ");
        }
        if (Phase2Answer23g.isChecked()) {
            Phase2Answer23.append(Phase2Answer23g.getText().toString() + ", ");
        }
        if (Phase2Answer23h.isChecked()) {
            Phase2Answer23.append(Phase2Answer23h.getText().toString() + ", ");
        }
        if (Phase2Answer23i.isChecked()) {
            Phase2Answer23.append(Phase2Answer23i.getText().toString() + ", ");
        }
        if (Phase2Answer23j.isChecked()) {
            Phase2Answer23.append(Phase2Answer23j.getText().toString() + ", ");
        }
        if (Phase2Answer23k.isChecked()) {
            Phase2Answer23.append(Phase2Answer23k.getText().toString() + ", ");
        }


        if (Phase2Answer24a.isChecked()) {
            Phase2Answer24.append(Phase2Answer24a.getText().toString() + ", ");
        }
        if (Phase2Answer24b.isChecked()) {
            Phase2Answer24.append(Phase2Answer24b.getText().toString() + ", ");
        }
        if (Phase2Answer24c.isChecked()) {
            Phase2Answer24.append(Phase2Answer24c.getText().toString() + ", ");
        }
        if (Phase2Answer24d.isChecked()) {
            Phase2Answer24.append(Phase2Answer24d.getText().toString() + ", ");
        }
        if (Phase2Answer24e.isChecked()) {
            Phase2Answer24.append(Phase2Answer24e.getText().toString() + ", ");
        }
        if (Phase2Answer24f.isChecked()) {
            Phase2Answer24.append(Phase2Answer24f.getText().toString() + ", ");
        }
        if (Phase2Answer24g.isChecked()) {
            Phase2Answer24.append(Phase2Answer24g.getText().toString() + ", ");
        }


        if (Phase2Answer25a.isChecked()) {
            Phase2Answer25.append(Phase2Answer25a.getText().toString() + ", ");
        }
        if (Phase2Answer25b.isChecked()) {
            Phase2Answer25.append(Phase2Answer25b.getText().toString() + ", ");
        }
        if (Phase2Answer25c.isChecked()) {
            Phase2Answer25.append(Phase2Answer25c.getText().toString() + ", ");
        }
        if (Phase2Answer25d.isChecked()) {
            Phase2Answer25.append(Phase2Answer25d.getText().toString() + ", ");
        }
        if (Phase2Answer25e.isChecked()) {
            Phase2Answer25.append(Phase2Answer25e.getText().toString() + ", ");
        }


        if (Phase2Answer27a.isChecked()) {
            Phase2Answer27.append(Phase2Answer27a.getText().toString() + ", ");
        }
        if (Phase2Answer27b.isChecked()) {
            Phase2Answer27.append(Phase2Answer27b.getText().toString() + ", ");
        }
        if (Phase2Answer27c.isChecked()) {
            Phase2Answer27.append(Phase2Answer27c.getText().toString() + ", ");
        }
        if (Phase2Answer27d.isChecked()) {
            Phase2Answer27.append(Phase2Answer27d.getText().toString() + ", ");
        }
        if (Phase2Answer27e.isChecked()) {
            Phase2Answer27.append(Phase2Answer27e.getText().toString() + ", ");
        }


        if (Phase2Answer28a.isChecked()) {
            Phase2Answer28.append(Phase2Answer28a.getText().toString() + ", ");
        }
        if (Phase2Answer28b.isChecked()) {
            Phase2Answer28.append(Phase2Answer28b.getText().toString() + ", ");
        }
        if (Phase2Answer28c.isChecked()) {
            Phase2Answer28.append(Phase2Answer28c.getText().toString() + ", ");
        }
        if (Phase2Answer28d.isChecked()) {
            Phase2Answer28.append(Phase2Answer28d.getText().toString() + ", ");
        }
        if (Phase2Answer28e.isChecked()) {
            Phase2Answer28.append(Phase2Answer28e.getText().toString() + ", ");
        }


        if (Phase2Answer6.length() == 0) {
            Toast.makeText(this, "Please make a selection ", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase2Answer7.length() == 0) {
            Toast.makeText(this, "Please make a selection ", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase2Answer10.length() == 0) {
            Toast.makeText(this, "Please make a selection ", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase2Answer21.length() == 0) {
            Toast.makeText(this, "Please make a selection ", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase2Answer23.length() == 0) {
            Toast.makeText(this, "Please make a selection ", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase2Answer24.length() == 0) {
            Toast.makeText(this, "Please make a selection ", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase2Answer25.length() == 0) {
            Toast.makeText(this, "Please make a selection ", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase2Answer27.length() == 0) {
            Toast.makeText(this, "Please make a selection ", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Phase2Answer28.length() == 0) {
            Toast.makeText(this, "Please make a selection ", Toast.LENGTH_SHORT).show();
            return false;
        }

        Log.v("VALUES", "" + Phase2Answer1.getSelectedItem().toString());
        Log.v("VALUES", "" + Phase2Answer2.getSelectedItem().toString());
        Log.v("VALUES", "" + Phase2Answer3.getSelectedItem().toString());
        Log.v("VALUES", "" + Phase2Answer4.getSelectedItem().toString());
        Log.v("VALUES", "" + Phase2Answer5.getSelectedItem().toString());
        Log.v("VALUES", "" + Phase2Answer6.toString());
        Log.v("VALUES", "" + Phase2Answer7.toString());

        Log.v("VALUES", "" + Phase2Answer9.getSelectedItem().toString());
        Log.v("VALUES", "" + Phase2Answer10.toString());
        Log.v("VALUES", "" + Phase2Answer11.getSelectedItem().toString());
        Log.v("VALUES", "" + Phase2Answer12.getSelectedItem().toString());
        Log.v("VALUES", "" + Phase2Answer13.getSelectedItem().toString());
        Log.v("VALUES", "" + Phase2Answer14.getSelectedItem().toString());
        Log.v("VALUES", "" + Phase2Answer15.getSelectedItem().toString());
        Log.v("VALUES", "" + Phase2Answer16.getSelectedItem().toString());
        Log.v("VALUES", "" + Phase2Answer17.getSelectedItem().toString());
        Log.v("VALUES", "" + Phase2Answer18.getSelectedItem().toString());
        Log.v("VALUES", "" + Phase2Answer19.getSelectedItem().toString());
        Log.v("VALUES", "" + Phase2Answer20.getSelectedItem().toString());
        Log.v("VALUES", "" + Phase2Answer21.getText().toString());
        Log.v("VALUES", "" + Phase2Answer22.getSelectedItem().toString());
        Log.v("VALUES", "" + Phase2Answer23.toString());
        Log.v("VALUES", "" + Phase2Answer24.toString());
        Log.v("VALUES", "" + Phase2Answer25.toString());


        Log.v("VALUES", "" + Phase2Answer26.getSelectedItem().toString());
        Log.v("VALUES", "" + Phase2Answer27.toString());
        Log.v("VALUES", "" + Phase2Answer28.toString());

        Log.v("VALUES", "" + Phase2Answer29.getSelectedItem().toString());
        Log.v("VALUES", "" + Phase2Answer30.getSelectedItem().toString());
        Log.v("VALUES", "" + Phase2Answer31.getSelectedItem().toString());
        return true;
    }

    //Save Mother records
    private void saveMother(int a, String b, int c, long d, Supervisor e, int vdcId) {
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(config);
        mReal.beginTransaction();
        Mother result = mReal.createObject(Mother.class, a);
        result.setMotherName(b);
        result.setMotherAge(c);
        result.setMotherContact(d);
        result.setSupervisorId(e);
        result.setVdcId(vdcId);
        mReal.commitTransaction();
        mReal.close();
    }

    //Save Answers
    private void saveToDb(int motherId) {
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(config);
        RealmResults<Mother> mothers = mReal.where(Mother.class).equalTo("motherId", motherId).findAll();

        mReal.beginTransaction();
        ActivityPhase2Db db = mReal.createObject(ActivityPhase2Db.class);
        db.setMother(mothers.get(0));

        db.setPhaseAnswer1(Phase2Answer1.getSelectedItem().toString());
        db.setPhaseAnswer2(Phase2Answer2.getSelectedItem().toString());
        db.setPhaseAnswer3(Phase2Answer3.getSelectedItem().toString());
        db.setPhaseAnswer4(Phase2Answer4.getSelectedItem().toString());
        db.setPhaseAnswer5(Phase2Answer5.getSelectedItem().toString());
        db.setPhaseAnswer6(Phase2Answer6.toString());
        db.setPhaseAnswer7(Phase2Answer7.toString());
        db.setPhaseAnswer8(Phase2Answer9.getSelectedItem().toString());
        db.setPhaseAnswer9(Phase2Answer10.toString());
        db.setPhaseAnswer10(Phase2Answer11.getSelectedItem().toString());
        db.setPhaseAnswer11(Phase2Answer12.getSelectedItem().toString());
        db.setPhaseAnswer12(Phase2Answer13.getSelectedItem().toString());
        db.setPhaseAnswer13(Phase2Answer14.getSelectedItem().toString());
        db.setPhaseAnswer14(Phase2Answer15.getSelectedItem().toString());
        db.setPhaseAnswer15(Phase2Answer16.getSelectedItem().toString());
        db.setPhaseAnswer16(Phase2Answer17.getSelectedItem().toString());
        db.setPhaseAnswer17(Phase2Answer18.getSelectedItem().toString());
        db.setPhaseAnswer18(Phase2Answer19.getSelectedItem().toString());
        db.setPhaseAnswer19(Phase2Answer20.getSelectedItem().toString());
        db.setPhaseAnswer20(Phase2Answer21.getText().toString());
        db.setPhaseAnswer21(Phase2Answer22.getSelectedItem().toString());
        db.setPhaseAnswer22(Phase2Answer23.toString());
        db.setPhaseAnswer23(Phase2Answer24.toString());
        db.setPhaseAnswer24(Phase2Answer25.toString());
        db.setPhaseAnswer25(Phase2Answer26.getSelectedItem().toString());
        db.setPhaseAnswer26(Phase2Answer27.toString());
        db.setPhaseAnswer27(Phase2Answer28.toString());
        db.setPhaseAnswer28(Phase2Answer29.getSelectedItem().toString());
        db.setPhaseAnswer29(Phase2Answer30.getSelectedItem().toString());
        db.setPhaseAnswer30(Phase2Answer31.getSelectedItem().toString());
        mReal.commitTransaction();

        mReal.close();

    }


}