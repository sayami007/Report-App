package mic.unlimited.com.reportingapp.Events.Question;

import android.app.Dialog;
import android.os.Build;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;
import mic.unlimited.com.reportingapp.Database.Event.Event1DB;
import mic.unlimited.com.reportingapp.Database.Event.Event2Db;
import mic.unlimited.com.reportingapp.Database.Event.Event2DbParticipants;
import mic.unlimited.com.reportingapp.Database.EventName;
import mic.unlimited.com.reportingapp.Database.Supervisor;
import mic.unlimited.com.reportingapp.R;

/**
 * Created by Bibesh on 4/21/17.
 */

@EActivity(R.layout.activity_q_event2)
public class Event2Q extends AppCompatActivity {
    @ViewById
    EditText supervisorPositionEvent2;

    @ViewById
    EditText maleEvent2;

    @ViewById
    EditText femaleEvent2;


    @ViewById
    TextView event2date;

    @ViewById
    TextView startDate;

    @ViewById
    TextView endDate;

    String mainDate = null;
    String sDate = null;
    String eDate = null;

    ArrayList<String> nameValue;
    ArrayList<String> addressValue;

    public int count = 0;
    EditText name, address;

    LinearLayout la;

    @Click(R.id.inc)
    void makeMember() {
        if (check()) {
            name = new EditText(this);
            address = new EditText(this);
            name.setHint(R.string.name);
            address.setHint(R.string.address);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                name.setId(name.generateViewId());
                address.setId(address.generateViewId());
                count++;
            }

            la.addView(name);
            la.addView(address);
        }

    }

    //
    private boolean check() {
        if ((count - nameValue.size()) == 1) {
            Toast.makeText(this, "Please press save button", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    @Click(R.id.pickDateEvent2)
    void pickDate() {
        final Dialog dateTimePicker = new Dialog(this);
        dateTimePicker.setContentView(R.layout.datetime_pick);
        final DatePicker date = (DatePicker) dateTimePicker.findViewById(R.id.calendar);
        Button b1 = (Button) dateTimePicker.findViewById(R.id.pickDate2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainDate = date.getYear() + "/" + date.getMonth() + "/" + date.getDayOfMonth();
                event2date.setText(mainDate);
                dateTimePicker.dismiss();
            }
        });
        dateTimePicker.show();
    }

    @Click(R.id.pickStartDateEvent2)
    void startDate() {
        final Dialog dateTimePicker = new Dialog(this);
        dateTimePicker.setContentView(R.layout.datetime_pick);
        final DatePicker date = (DatePicker) dateTimePicker.findViewById(R.id.calendar);
        Button b1 = (Button) dateTimePicker.findViewById(R.id.pickDate2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sDate = date.getYear() + "/" + date.getMonth() + "/" + date.getDayOfMonth();
                startDate.setText(sDate);
                dateTimePicker.dismiss();
            }
        });
        dateTimePicker.show();
    }

    @Click(R.id.pickEndDateEvent2)
    void endDate() {
        final Dialog dateTimePicker = new Dialog(this);
        dateTimePicker.setContentView(R.layout.datetime_pick);
        final DatePicker date = (DatePicker) dateTimePicker.findViewById(R.id.calendar);
        Button b1 = (Button) dateTimePicker.findViewById(R.id.pickDate2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eDate = date.getYear() + "/" + date.getMonth() + "/" + date.getDayOfMonth();
                endDate.setText(eDate);
                dateTimePicker.dismiss();
            }
        });
        dateTimePicker.show();
    }

    @Click(R.id.saveEvent2)
    void collect() {
        int id = getId();
        EventName event = getEventName();
        Supervisor supervisor = getSupervisor();
        String supervisorPos = supervisorPositionEvent2.getText().toString();
        String date = event2date.getText().toString();
        String startDate_ = startDate.getText().toString();
        String endDate_ = endDate.getText().toString();
        int maleNumber = Integer.parseInt(maleEvent2.getText().toString());
        int femaleNumber = Integer.parseInt(femaleEvent2.getText().toString());


        Log.v("values", "" + getId());
        Log.v("values", "" + getEventName());
        Log.v("values", "" + getSupervisor());
        Log.v("values", "" + supervisorPositionEvent2.getText().toString());
        Log.v("values", "" + event2date.getText().toString());
        Log.v("values", "" + startDate.getText().toString());
        Log.v("values", "" + endDate.getText().toString());
        Log.v("values", "" + Integer.parseInt(maleEvent2.getText().toString()));
        Log.v("values", "" + Integer.parseInt(femaleEvent2.getText().toString()));

        Log.v("SIZE", nameValue.size() + "");
        Log.v("SIZE", addressValue.size() + "");
        for (int i = 0; i < nameValue.size(); i++) {
            Log.v("NameValue", nameValue.get(i).toString() + "");
            Log.v("Address values", addressValue.get(i).toString() + "");
        }

        try {
            Realm.init(this);
            RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
            Realm mReal = Realm.getInstance(config);
            mReal.beginTransaction();

            Event2Db db = mReal.createObject(Event2Db.class, id);
            db.setEvent(event);
            db.setSupervisor(supervisor);
            db.setSupervisorPos(supervisorPos);
            db.setDate(date);
            db.setStartDate(startDate_);
            db.setEndDate(endDate_);
            db.setMaleNumber(maleNumber);
            db.setFemaleNumber(femaleNumber);
            mReal.commitTransaction();
            mReal.close();

            Realm mReal2 = Realm.getInstance(config);
            mReal2.beginTransaction();
            RealmResults<Event2Db> event2 = mReal2.where(Event2Db.class).equalTo("id", id).findAll();
            for (int i = 0; i < nameValue.size(); i++) {
                Event2DbParticipants db2 = mReal.createObject(Event2DbParticipants.class, getPId());
                db2.setEvent(event2.first());
                db2.setName(nameValue.get(i).toString());
                db2.setAddress(addressValue.get(i).toString());
            }
            mReal2.commitTransaction();
            mReal2.close();
            Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show();
            this.finish();
        } catch (Exception err) {
            Log.v("ERROR", err.getMessage());
        } finally {
            showEvent();
        }
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

    //Get Event ID
    private EventName getEventName() {
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(config);
        RealmResults<EventName> event1 = mReal.where(EventName.class).equalTo("eventId", 2).findAll();
        return event1.first();
    }


    //Generate Id
    public int getId() {
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(config);
        RealmResults<Event2Db> event2 = mReal.where(Event2Db.class).findAll();
        if (event2.size() == 0) {
            mReal.close();
            return 1;
        } else {
            mReal.close();
            return event2.size() + 1;
        }
    }

    //Participants Id
    public int getPId() {
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(config);
        RealmResults<Event2DbParticipants> event2 = mReal.where(Event2DbParticipants.class).findAll();
        if (event2.size() == 0) {
            mReal.close();
            return 1;
        } else {
            mReal.close();
            return event2.size() + 1;
        }
    }

    @AfterViews
    void init() {
        la = (LinearLayout) findViewById(R.id.la);
        nameValue = new ArrayList<>();
        addressValue = new ArrayList<>();
    }

    @Click(R.id.saveMember)
    void saveMember() {
        try {
            if (name.getText().toString().trim().equals("")) {
                Toast.makeText(this, "Please add values to save.", Toast.LENGTH_SHORT).show();
            } else {
                if ((count - nameValue.size()) == 1) {
                    nameValue.add(name.getText().toString());
                    addressValue.add(address.getText().toString());
                } else {
                    Toast.makeText(this, "Please add new member to save.", Toast.LENGTH_SHORT).show();
                }
            }
        } catch (Exception err) {
            Toast.makeText(this, "Please add new member to save.", Toast.LENGTH_SHORT).show();
        }
    }

    private void showEvent() {
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(config);
        RealmResults<Event2Db> db = mReal.where(Event2Db.class).findAll();
        for (int i = 0; i < db.size(); i++)
            Log.v("VALUES", db.get(i) + "");

        RealmResults<Event2DbParticipants> db2 = mReal.where(Event2DbParticipants.class).findAll();
        for (int i = 0; i < db2.size(); i++) {
            Event2DbParticipants a = db2.get(i);
            Event2Db name = a.getEvent();
            EventName name2 = name.getEvent();
            Log.v("Event id", "" + name2.getEventId());
            Log.v("VALUES", db2.get(i) + "");

        }
    }
}
