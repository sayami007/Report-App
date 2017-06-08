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

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;
import mic.unlimited.com.reportingapp.Activity.LoginActivity_;
import mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db;
import mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db;
import mic.unlimited.com.reportingapp.Database.Mother;
import mic.unlimited.com.reportingapp.Database.Supervisor;
import mic.unlimited.com.reportingapp.Database.Vdc;
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

    @ViewById
    EditText motherNamePhase4;
    @ViewById
    EditText motherAgePhase4;
    @ViewById
    EditText motherContactPhase4;
    @ViewById
    EditText motherAddressPhase4;
    @ViewById
    Spinner healthPostPhase4;

    @Click(R.id.saveLocalPhase4)
    public void saveInformation() {
        try {
            Phase4Answer4 = new StringBuffer();
            Phase4Answer5 = new StringBuffer();
            Phase4Answer14 = new StringBuffer();
            Phase4Answer15 = new StringBuffer();
            Phase4Answer16 = new StringBuffer();
            Phase4Answer18 = new StringBuffer();
            Phase4Answer19 = new StringBuffer();

            int motherId = generateMotherId();
            String motherName = motherNamePhase4.getText().toString();
            int motherAge = Integer.parseInt(motherAgePhase4.getText().toString());
            int motherNumber = Integer.parseInt(motherContactPhase4.getText().toString());
            String motherAddress = motherAddressPhase4.getText().toString();
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

            boolean response = getValues();
            Log.v("RES", "RES" + response);
        } catch (Exception err) {
            Log.v("SDSDF", err.getLocalizedMessage());
        }
    }

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


    private void saveToDb(int motherId) {
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(config);
        RealmResults<Mother> mothers = mReal.where(Mother.class).equalTo("motherId", motherId).findAll();

        mReal.beginTransaction();
        ActivityPhase4Db db = mReal.createObject(ActivityPhase4Db.class);
        db.setMotherId(mothers.get(0));
        db.setPhaseAnswer1(Phase4Answer1.getSelectedItem().toString());
        db.setPhaseAnswer2(Phase4Answer2.getSelectedItem().toString());
        db.setPhaseAnswer3(Phase4Answer3.getSelectedItem().toString());
        db.setPhaseAnswer4(Phase4Answer4.toString());
        db.setPhaseAnswer5(Phase4Answer5.toString());
        db.setPhaseAnswer6(Phase4Answer6.getSelectedItem().toString());
        db.setPhaseAnswer7(Phase4Answer7.getSelectedItem().toString());
        db.setPhaseAnswer8(Phase4Answer8.getSelectedItem().toString());
        db.setPhaseAnswer9(Phase4Answer9.getSelectedItem().toString());
        db.setPhaseAnswer10(Phase4Answer10.getSelectedItem().toString());
        db.setPhaseAnswer11(Phase4Answer11.getSelectedItem().toString());
        db.setPhaseAnswer12(Phase4Answer12.getText().toString());
        db.setPhaseAnswer13(Phase4Answer13.getSelectedItem().toString());
        db.setPhaseAnswer14(Phase4Answer14.toString());
        db.setPhaseAnswer15(Phase4Answer15.toString());
        db.setPhaseAnswer16(Phase4Answer16.toString());
        db.setPhaseAnswer17(Phase4Answer17.getSelectedItem().toString());
        db.setPhaseAnswer18(Phase4Answer18.toString());
        db.setPhaseAnswer19(Phase4Answer19.toString());
        db.setPhaseAnswer20(Phase4Answer20.getSelectedItem().toString());
        db.setPhaseAnswer21(Phase4Answer21.getSelectedItem().toString());
        db.setPhaseAnswer22(Phase4Answer22.getSelectedItem().toString());
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


    //Generate Vdc Id
    private int getVdcId() {
        String value = healthPostPhase4.getSelectedItem().toString();
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

    //All the values with validation
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

    ArrayList<String> vdcList;

    @AfterViews
    public void init() {

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
        healthPostPhase4.setAdapter(adapter);
        mReal.close();


    }
}
