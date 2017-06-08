package mic.unlimited.com.reportingapp.Events.Question;

import android.app.Dialog;
import android.os.Build;
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
import mic.unlimited.com.reportingapp.Database.Event.Event2Db;
import mic.unlimited.com.reportingapp.Database.Event.Event2DbParticipants;
import mic.unlimited.com.reportingapp.Database.Event.Event5Db;
import mic.unlimited.com.reportingapp.Database.Event.Event5DbParticipant;
import mic.unlimited.com.reportingapp.Database.EventName;
import mic.unlimited.com.reportingapp.Database.Supervisor;
import mic.unlimited.com.reportingapp.R;

/**
 * Created by Bibesh on 4/21/17.
 */

@EActivity(R.layout.activity_q_event5)
public class Event5Q extends AppCompatActivity {
    @ViewById
    TextView event5Date;
    @ViewById
    TextView event5startDate;
    @ViewById
    TextView event5endDate;
    @ViewById
    EditText event5SupervisorPos;
    @ViewById
    EditText maleMember;
    @ViewById
    EditText femaleMember;
    @ViewById
    LinearLayout member;

    ArrayList<String> name;
    ArrayList<String> address;
    EditText nameText;
    EditText addressText;
    int count = 0;
    String dates = null;
    String sDate = null;
    String eDate = null;

    @Click(R.id.pickDateEvent5)
    void pickDate() {
        final Dialog dateTimePicker = new Dialog(this);
        dateTimePicker.setContentView(R.layout.datetime_pick);
        final DatePicker date = (DatePicker) dateTimePicker.findViewById(R.id.calendar);
        Button b1 = (Button) dateTimePicker.findViewById(R.id.pickDate2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dates = date.getYear() + "/" + date.getMonth() + "/" + date.getDayOfMonth();
                event5Date.setText(dates);
                dateTimePicker.dismiss();
            }
        });
        dateTimePicker.show();
    }

    @Click(R.id.pickDateEvent5Start)
    void pickDateStart() {
        final Dialog dateTimePicker = new Dialog(this);
        dateTimePicker.setContentView(R.layout.datetime_pick);
        final DatePicker date = (DatePicker) dateTimePicker.findViewById(R.id.calendar);
        Button b1 = (Button) dateTimePicker.findViewById(R.id.pickDate2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sDate = date.getYear() + "/" + date.getMonth() + "/" + date.getDayOfMonth();
                event5startDate.setText(sDate);
                dateTimePicker.dismiss();
            }
        });
        dateTimePicker.show();
    }

    @Click(R.id.pickDateEvent5end)
    void pickDateEnd() {
        final Dialog dateTimePicker = new Dialog(this);
        dateTimePicker.setContentView(R.layout.datetime_pick);
        final DatePicker date = (DatePicker) dateTimePicker.findViewById(R.id.calendar);
        Button b1 = (Button) dateTimePicker.findViewById(R.id.pickDate2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eDate = date.getYear() + "/" + date.getMonth() + "/" + date.getDayOfMonth();
                event5endDate.setText(eDate);
                dateTimePicker.dismiss();
            }
        });
        dateTimePicker.show();
    }


    @Click(R.id.saveEvent5)
    void save() {
        try {
            int id = getId();
            EventName event = getEventName();
            Supervisor supervisor = getSupervisor();
            String supervisorPos = event5SupervisorPos.getText().toString();
            String date = event5Date.getText().toString();
            String startDate = event5startDate.getText().toString();
            String endDate = event5endDate.getText().toString();
            int maleNumber = Integer.parseInt(maleMember.getText().toString());
            int femaleNumber = Integer.parseInt(femaleMember.getText().toString());

            Realm.init(getApplicationContext());
            RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
            Realm mReal = Realm.getInstance(config);

            mReal.beginTransaction();
            Event5Db db = mReal.createObject(Event5Db.class,id);

            db.setEvent(event);
            db.setSupervisor(supervisor);
            db.setSupervisorPos(supervisorPos);
            db.setDate(date);
            db.setStartDate(startDate);
            db.setEndDate(endDate);
            db.setMaleNumber(maleNumber);
            db.setFemaleNumber(femaleNumber);
            mReal.commitTransaction();
            mReal.close();

            Realm mReal2 = Realm.getInstance(config);
            mReal2.beginTransaction();
            for (int i = 0; i < name.size(); i++) {
                Event5DbParticipant dbs = mReal2.createObject(Event5DbParticipant.class, getPId());
                dbs.setEvent5id(id);
                dbs.setName(name.get(i).toString());
                dbs.setAddress(address.get(i).toString());
            }
            mReal2.commitTransaction();
            mReal2.close();

            Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show();
            this.finish();
        } catch (Exception err) {
            Toast.makeText(this, "" + err.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }


    @Click(R.id.addMember)
    void addMember() {
        if (check()) {
            nameText = new EditText(this);
            addressText = new EditText(this);
            nameText.setHint("Add Member Name");
            addressText.setHint("Add Address Name");
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                nameText.setId(nameText.generateViewId());
                addressText.setId(addressText.generateViewId());
                count++;
            }
            member.addView(nameText);
            member.addView(addressText);
        }
    }

    @Click(R.id.saveMember)
    void saveMember() {
        try {
            if (nameText.getText().toString().trim().equals("")) {
                Toast.makeText(this, "Please name values to save.", Toast.LENGTH_SHORT).show();
            } else if (addressText.getText().toString().trim().equals("")) {
                Toast.makeText(this, "Please address values to save.", Toast.LENGTH_SHORT).show();
            } else {
                if ((count - name.size()) == 1) {
                    name.add(nameText.getText().toString());
                    address.add(addressText.getText().toString());
                } else {
                    Toast.makeText(this, "Please add new member to save.", Toast.LENGTH_SHORT).show();
                }
            }
        } catch (Exception err) {
            Toast.makeText(this, "Please add new member to save.", Toast.LENGTH_SHORT).show();
        }

    }



    @AfterViews
    void init() {
        name = new ArrayList<>();
        address = new ArrayList<>();

    }


    //Participants Id
    public int getPId() {
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(config);
        RealmResults<Event5DbParticipant> event2 = mReal.where(Event5DbParticipant.class).findAll();
        if (event2.size() == 0) {
            mReal.close();
            return 1;
        } else {
            mReal.close();
            return event2.size() + 1;
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
        RealmResults<EventName> event1 = mReal.where(EventName.class).equalTo("eventId", 5).findAll();
        return event1.first();
    }


    //Generate Id
    public int getId() {
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(config);
        RealmResults<Event5Db> event2 = mReal.where(Event5Db.class).findAll();
        if (event2.size() == 0) {
            mReal.close();
            return 1;
        } else {
            mReal.close();
            return event2.size() + 1;
        }
    }

    //Check Users to be added
    boolean check() {
        if ((count - name.size()) == 1) {
            Toast.makeText(this, "Please press save button", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}
