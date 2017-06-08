package mic.unlimited.com.reportingapp.Events.Question;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringArrayRes;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;
import mic.unlimited.com.reportingapp.Database.Event.Event2Db;
import mic.unlimited.com.reportingapp.Database.Event.Event4Db;
import mic.unlimited.com.reportingapp.Database.EventName;
import mic.unlimited.com.reportingapp.Database.Supervisor;
import mic.unlimited.com.reportingapp.R;

/**
 * Created by Bibesh on 4/21/17.
 */

@EActivity(R.layout.activity_q_event4)
public class Event4Q extends AppCompatActivity {
    String mainDate = null;

    @ViewById
    TextView selectedDateEvent4;

    @Click(R.id.pickDateEvent4)
    void getDate() {
        final Dialog dateTimePicker = new Dialog(this);
        dateTimePicker.setContentView(R.layout.datetime_pick);
        final DatePicker date = (DatePicker) dateTimePicker.findViewById(R.id.calendar);
        Button b1 = (Button) dateTimePicker.findViewById(R.id.pickDate2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainDate = date.getYear() + "/" + date.getMonth() + "/" + date.getDayOfMonth();
                selectedDateEvent4.setText(mainDate);
                dateTimePicker.dismiss();
            }
        });
        dateTimePicker.show();


    }

    @ViewById
    EditText supervisorPosEvent4;
    @ViewById
    EditText maleEvent4;
    @ViewById
    EditText femaleEvent4;
    @ViewById
    EditText event4Chairperson;

    StringBuffer office;

    @ViewById
    CheckBox event4check1;
    @ViewById
    CheckBox event4check2;
    @ViewById
    CheckBox event4check3;
    @ViewById
    CheckBox event4check4;
    @ViewById
    CheckBox event4check5;

    @ViewById
    EditText event4Agenda;
    @ViewById
    EditText event4Decision;

    @Click(R.id.saveEvent4)
    public void values() {
        try {
            int id = getId();
            EventName event = getEventName();
            Supervisor supervisor = getSupervisor();
            String supervisorPos = supervisorPosEvent4.getText().toString();
            String date = selectedDateEvent4.getText().toString();
            String chairPerson = event4Chairperson.getText().toString();
            int maleNumber = Integer.parseInt(maleEvent4.getText().toString());
            int femaleNumber = Integer.parseInt(femaleEvent4.getText().toString());
            setOffice();
            String offices = office.toString();
            String agenda = event4Agenda.getText().toString();
            String decision = event4Decision.getText().toString();

            Log.v("Values", "" + getId());
            Log.v("Values", "" + getEventName());
            Log.v("Values", "" + getSupervisor());
            Log.v("Values", "" + supervisorPosEvent4.getText().toString());
            Log.v("Values", "" + selectedDateEvent4.getText().toString());
            Log.v("Values", "" + event4Chairperson.getText().toString());
            Log.v("Values", "" + Integer.parseInt(maleEvent4.getText().toString()));
            Log.v("Values", "" + Integer.parseInt(femaleEvent4.getText().toString()));
            Log.v("Values", "" + office.toString());
            Log.v("Values", "" + event4Agenda.getText().toString());
            Log.v("Values", "" + event4Decision.getText().toString());

            Realm.init(getApplicationContext());
            RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
            Realm mReal = Realm.getInstance(config);
            mReal.beginTransaction();

            Event4Db db = mReal.createObject(Event4Db.class, getId());
            db.setEvent(getEventName());
            db.setSupervisor(getSupervisor());
            db.setSupervisorPos(supervisorPosEvent4.getText().toString());
            db.setDate(selectedDateEvent4.getText().toString());
            db.setChairPerson(event4Chairperson.getText().toString());
            db.setMaleNumber(Integer.parseInt(maleEvent4.getText().toString()));
            db.setFemaleNumber(Integer.parseInt(femaleEvent4.getText().toString()));
            db.setOffice(office.toString());
            db.setAgenda(event4Agenda.getText().toString());
            db.setDecision(event4Decision.getText().toString());

            mReal.commitTransaction();
            mReal.close();
            Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show();
            this.finish();

        } catch (Exception err) {
            Toast.makeText(this, "Please check the values or relogin" + err.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void setOffice() {
        if (event4check1.isChecked()) {
            office.append(event4check1.getText().toString() + ", ");
        }
        if (event4check2.isChecked()) {
            office.append(event4check2.getText().toString() + ", ");
        }
        if (event4check3.isChecked()) {
            office.append(event4check3.getText().toString() + ", ");
        }
        if (event4check4.isChecked()) {
            office.append(event4check4.getText().toString() + ", ");
        }
        if (event4check5.isChecked()) {
            office.append(event4check5.getText().toString() + ", ");
        }
    }

    @AfterViews
    void init() {
        office = new StringBuffer();
    }

    //Get Id
    public int getId() {
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(config);
        RealmResults<Event4Db> event4 = mReal.where(Event4Db.class).findAll();
        if (event4.size() == 0) {
            mReal.close();
            return 1;
        } else {
            mReal.close();
            return event4.size() + 1;
        }
    }

    //Get Event ID
    private EventName getEventName() {
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(config);
        RealmResults<EventName> event1 = mReal.where(EventName.class).equalTo("eventId", 4).findAll();
        mReal.close();
        return event1.first();
    }

    //Get Supervisor
    private Supervisor getSupervisor() {
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(config);
        RealmResults<Supervisor> sup = mReal.where(Supervisor.class).findAll();
        mReal.close();
        return sup.first();
    }


}
