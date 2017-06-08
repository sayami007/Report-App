package mic.unlimited.com.reportingapp.Events.Question;

import android.app.Dialog;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
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
import mic.unlimited.com.reportingapp.Database.Event.Event6Db;
import mic.unlimited.com.reportingapp.Database.Event.Event6DbParticipant;
import mic.unlimited.com.reportingapp.Database.EventName;
import mic.unlimited.com.reportingapp.Database.Supervisor;
import mic.unlimited.com.reportingapp.R;

/**
 * Created by Bibesh on 4/21/17.
 */


@EActivity(R.layout.activity_q_event6)
public class Event6Q extends AppCompatActivity {
    @ViewById
    TextView event6Date;
    @ViewById
    TextView event6startDate;
    @ViewById
    TextView event6endDate;
    @ViewById
    EditText event6SupervisorPos;
    @ViewById
    EditText event6maleMember;
    @ViewById
    EditText event6femaleMember;
    @ViewById
    LinearLayout memberEvent6;

    ArrayList<String> name;
    ArrayList<String> address;
    EditText nameText;
    EditText addressText;
    int count = 0;
    String dates = null;
    String sDate = null;
    String eDate = null;

    @Click(R.id.pickDateEvent6)
    void pickDate() {
        final Dialog dateTimePicker = new Dialog(this);
        dateTimePicker.setContentView(R.layout.datetime_pick);
        final DatePicker date = (DatePicker) dateTimePicker.findViewById(R.id.calendar);
        Button b1 = (Button) dateTimePicker.findViewById(R.id.pickDate2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dates = date.getYear() + "/" + date.getMonth() + "/" + date.getDayOfMonth();
                event6Date.setText(dates);
                dateTimePicker.dismiss();
            }
        });
        dateTimePicker.show();
    }

    @Click(R.id.pickDateEvent6Start)
    void pickDateStart() {
        final Dialog dateTimePicker = new Dialog(this);
        dateTimePicker.setContentView(R.layout.datetime_pick);
        final DatePicker date = (DatePicker) dateTimePicker.findViewById(R.id.calendar);
        Button b1 = (Button) dateTimePicker.findViewById(R.id.pickDate2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sDate = date.getYear() + "/" + date.getMonth() + "/" + date.getDayOfMonth();
                event6startDate.setText(sDate);
                dateTimePicker.dismiss();
            }
        });
        dateTimePicker.show();
    }

    @Click(R.id.pickDateEvent6end)
    void pickDateEnd() {
        final Dialog dateTimePicker = new Dialog(this);
        dateTimePicker.setContentView(R.layout.datetime_pick);
        final DatePicker date = (DatePicker) dateTimePicker.findViewById(R.id.calendar);
        Button b1 = (Button) dateTimePicker.findViewById(R.id.pickDate2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eDate = date.getYear() + "/" + date.getMonth() + "/" + date.getDayOfMonth();
                event6endDate.setText(eDate);
                dateTimePicker.dismiss();
            }
        });
        dateTimePicker.show();
    }


    @Click(R.id.saveEvent6)
    void save() {
        try {
            int id = getId();
            EventName event = getEventName();
            Supervisor supervisor = getSupervisor();
            String supervisorPos = event6SupervisorPos.getText().toString();
            String date = event6Date.getText().toString();
            String startDate = event6startDate.getText().toString();
            String endDate = event6endDate.getText().toString();
            int maleNumber = Integer.parseInt(event6maleMember.getText().toString());
            int femaleNumber = Integer.parseInt(event6femaleMember.getText().toString());

            Realm.init(getApplicationContext());
            RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
            Realm mReal = Realm.getInstance(config);

            mReal.beginTransaction();
            Event6Db db = mReal.createObject(Event6Db.class,id);

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
                Event6DbParticipant dbs = mReal2.createObject(Event6DbParticipant.class, getPId());
                dbs.setEvent(id);
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


    @Click(R.id.addMemberevent6)
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
            memberEvent6.addView(nameText);
            memberEvent6.addView(addressText);
        }
    }

    @Click(R.id.saveMemberevent6)
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
        RealmResults<Event6DbParticipant> event2 = mReal.where(Event6DbParticipant.class).findAll();
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
        RealmResults<EventName> event1 = mReal.where(EventName.class).equalTo("eventId", 6).findAll();
        return event1.first();
    }


    //Generate Id
    public int getId() {
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(config);
        RealmResults<Event6Db> event2 = mReal.where(Event6Db.class).findAll();
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
