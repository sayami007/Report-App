package mic.unlimited.com.reportingapp.Events.Question;

import android.app.Dialog;
import android.app.usage.UsageEvents;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;
import mic.unlimited.com.reportingapp.Database.Event.Event1DB;
import mic.unlimited.com.reportingapp.Database.EventName;
import mic.unlimited.com.reportingapp.Database.Supervisor;
import mic.unlimited.com.reportingapp.R;

/**
 * Created by Bibesh on 4/21/17.
 */

@EActivity(R.layout.activity_q_event1)
public class Event1Q extends AppCompatActivity {

    String mainDate = null;

    @ViewById
    TextView selectedDate;

    @ViewById
    EditText supervisorPosEvent1;


    @Click(R.id.pickDate)
    void openDateTimePicker() {
        final Dialog dateTimePicker = new Dialog(this);
        dateTimePicker.setContentView(R.layout.datetime_pick);
        final DatePicker date = (DatePicker) dateTimePicker.findViewById(R.id.calendar);
        Button b1 = (Button) dateTimePicker.findViewById(R.id.pickDate2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainDate = date.getYear() + "/" + date.getMonth() + "/" + date.getDayOfMonth();
                selectedDate.setText(mainDate);
                dateTimePicker.dismiss();
            }
        });
        dateTimePicker.show();
    }


    @ViewById
    EditText event1Chairperson;
    @ViewById
    EditText maleEvent1;
    @ViewById
    EditText femaleEvent1;
    @ViewById
    EditText event1Agenda;
    @ViewById
    EditText event1Decision;

    @ViewById
    CheckBox event1check1;
    @ViewById
    CheckBox event1check2;
    @ViewById
    CheckBox event1check3;
    @ViewById
    CheckBox event1check4;
    @ViewById
    CheckBox event1check5;
    @ViewById
    CheckBox event1check6;
    @ViewById
    CheckBox event1check7;
    @ViewById
    CheckBox event1check8;
    @ViewById
    CheckBox event1check9;
    @ViewById
    CheckBox event1check10;


    StringBuffer officeRepresented;

    @Click(R.id.saveEvent1)
    void init() {
        record();
    }

    void record() {
        try {
            officeRepresented = new StringBuffer();

            int id = getId();
            Supervisor supervisor = getSupervisor();
            String supervisorPos = supervisorPosEvent1.getText().toString();
            String[] forDate = selectedDate.getText().toString().split("/");
            Calendar c1 = Calendar.getInstance();
            c1.set(Calendar.YEAR, Integer.parseInt(forDate[0]));
            c1.set(Calendar.MONTH, Integer.parseInt(forDate[1]));
            c1.set(Calendar.DATE, Integer.parseInt(forDate[2]));
            SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
            String date = format1.format(c1.getTime());
            String chairPerson = event1Chairperson.getText().toString();
            int maleNumber = Integer.parseInt(maleEvent1.getText().toString());
            int femaleNumber = Integer.parseInt(femaleEvent1.getText().toString());
            getRepresentative();
            String offRep = officeRepresented.toString();
            String agenda = event1Agenda.getText().toString();
            String decision = event1Decision.getText().toString();
            EventName event = getEvent();

            Log.v("Values", "" + id);
            Log.v("Values", "" + supervisor);
            Log.v("Values", "" + supervisorPos);
            Log.v("Values", "" + date);
            Log.v("Values", "" + chairPerson);
            Log.v("Values", "" + maleNumber);
            Log.v("Values", "" + femaleNumber);
            Log.v("Values", "" + offRep);
            Log.v("Values", "" + agenda);
            Log.v("Values", "" + decision);
            Log.v("Values", "" + event);

            Realm.init(getApplicationContext());
            RealmConfiguration configuration = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
            Realm mReal = Realm.getInstance(configuration);
            mReal.beginTransaction();
            Event1DB db = mReal.createObject(Event1DB.class, id);

            db.setSupervisorId(supervisor);
            db.setSupervisorPos(supervisorPos);
            db.setDate(date);
            db.setChairperson(chairPerson);
            db.setMaleNumber(maleNumber);
            db.setFemaleNumber(femaleNumber);
            db.setOfficeRepresented(officeRepresented.toString());
            db.setAgenda(agenda);
            db.setDecision(decision);
            db.setEventId(event);


            mReal.commitTransaction();
            mReal.close();

            Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show();
            this.finish();


        } catch (Exception err) {
            Log.v("EEO", "" + err.getMessage());
        }
    }

    //GET EVENT
    private EventName getEvent() {
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(config);
        RealmResults<EventName> event1 = mReal.where(EventName.class).equalTo("eventId", 1).findAll();
        mReal.close();
        Log.v("VALUES", "" + event1.first());
        return event1.first();
    }


    //Generate Id
    public int getId() {
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(config);
        RealmResults<Event1DB> event1 = mReal.where(Event1DB.class).findAll();
        if (event1.size() == 0) {
            mReal.close();
            return 1;
        } else {
            mReal.close();
            return event1.size() + 1;
        }
    }

    //GET SUPERVISOR
    public Supervisor getSupervisor() {
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(config);
        RealmResults<Supervisor> sup = mReal.where(Supervisor.class).findAll();
        Log.v("SDf", "" + sup.first());
        return sup.first();
    }


    void getRepresentative() {
        if (event1check1.isChecked()) {
            officeRepresented.append(event1check1.getText().toString() + " ,");
        }
        if (event1check2.isChecked()) {
            officeRepresented.append(event1check2.getText().toString() + " ,");
        }
        if (event1check3.isChecked()) {
            officeRepresented.append(event1check3.getText().toString() + " ,");
        }
        if (event1check4.isChecked()) {
            officeRepresented.append(event1check4.getText().toString() + " ,");
        }
        if (event1check5.isChecked()) {
            officeRepresented.append(event1check5.getText().toString() + " ,");
        }
        if (event1check6.isChecked()) {
            officeRepresented.append(event1check6.getText().toString() + " ,");
        }
        if (event1check7.isChecked()) {
            officeRepresented.append(event1check7.getText().toString() + " ,");
        }
        if (event1check8.isChecked()) {
            officeRepresented.append(event1check8.getText().toString() + " ,");
        }
        if (event1check9.isChecked()) {
            officeRepresented.append(event1check9.getText().toString() + " ,");
        }
        if (event1check10.isChecked()) {
            officeRepresented.append(event1check10.getText().toString() + " ,");
        }

    }
}
