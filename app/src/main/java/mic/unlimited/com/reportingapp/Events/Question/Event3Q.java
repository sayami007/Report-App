package mic.unlimited.com.reportingapp.Events.Question;

import android.annotation.TargetApi;
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

import org.androidannotations.annotations.AfterExtras;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.EditorAction;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.IntegerRes;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;
import mic.unlimited.com.reportingapp.Database.Event.Event2Db;
import mic.unlimited.com.reportingapp.Database.Event.Event2DbParticipants;
import mic.unlimited.com.reportingapp.Database.Event.Event3Db;
import mic.unlimited.com.reportingapp.Database.Event.Event3DbTopic;
import mic.unlimited.com.reportingapp.Database.EventName;
import mic.unlimited.com.reportingapp.Database.Supervisor;
import mic.unlimited.com.reportingapp.R;

/**
 * Created by Bibesh on 4/21/17.
 */

@EActivity(R.layout.activity_q_event3)
public class Event3Q extends AppCompatActivity {

    public int count = 0;
    String mainDate = null;
    ArrayList<String> allTopics;
    LinearLayout layout;
    EditText topics;

    @ViewById
    TextView selectedDateEvent3;
    @ViewById
    EditText event4male;
    @ViewById
    EditText event4female;
    @ViewById
    EditText event2Chairperson;
    @ViewById
    EditText event4media;
    @ViewById
    EditText supervisorPosEvent3;


    @Click(R.id.pickDateEvent2)
    void openDateTimePicker() {
        final Dialog dateTimePicker = new Dialog(this);
        dateTimePicker.setContentView(R.layout.datetime_pick);
        final DatePicker date = (DatePicker) dateTimePicker.findViewById(R.id.calendar);
        Button b1 = (Button) dateTimePicker.findViewById(R.id.pickDate2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainDate = date.getYear() + "/" + date.getMonth() + "/" + date.getDayOfMonth();
                selectedDateEvent3.setText(mainDate);
                dateTimePicker.dismiss();
            }
        });
        dateTimePicker.show();
    }

    @Click(R.id.addTopic)
    void addTopic() {
        if (check()) {
            topics = new EditText(this);
            topics.setHint("Add Topics");
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                topics.setId(topics.generateViewId());
                count++;
            }
            layout.addView(topics);
        }
    }

    @Click(R.id.saveTopic)
    void saveTopic() {
        try {
            if (topics.getText().toString().trim().equals("")) {
                Toast.makeText(this, "Please add values to save.", Toast.LENGTH_SHORT).show();
            } else {
                if ((count - allTopics.size()) == 1) {
                    allTopics.add(topics.getText().toString());
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
        layout = (LinearLayout) findViewById(R.id.topicPlace);
        allTopics = new ArrayList<>();
        showEvent();
    }

    @Click(R.id.saveEvent3)
    void save() {
        try {
            int id = getId();
            EventName event = getEventName();
            Supervisor supervisor = getSupervisor();
            String supervisorPos = supervisorPosEvent3.getText().toString();
            String date = selectedDateEvent3.getText().toString();
            String chairperson = event2Chairperson.getText().toString();
            int maleNumber = Integer.parseInt(event4male.getText().toString());
            int femaleNumber = Integer.parseInt(event4female.getText().toString());
            int totalMedia = Integer.parseInt(event4media.getText().toString());

            Log.v("VALUES", "" + id);
            Log.v("VALUES", "" + event);
            Log.v("VALUES", "" + supervisor);
            Log.v("VALUES", "" + supervisorPos);
            Log.v("VALUES", "" + date);
            Log.v("VALUES", "" + chairperson);
            Log.v("VALUES", "" + maleNumber);
            Log.v("VALUES", "" + femaleNumber);
            Log.v("VALUES", "" + totalMedia);

            Log.v("ARRAY", "" + allTopics);

            Realm.init(getApplicationContext());
            RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
            Realm mReal = Realm.getInstance(config);
            mReal.beginTransaction();
            Event3Db db = mReal.createObject(Event3Db.class, id);

            db.setEvent(event);
            db.setSupervisor(supervisor);
            db.setSupervisorPos(supervisorPos);
            db.setDate(date);
            db.setChairperson(chairperson);
            db.setMaleNumber(maleNumber);
            db.setFemaleNumber(femaleNumber);
            db.setTotalMedia(totalMedia);

            mReal.commitTransaction();
            mReal.close();

            Realm mRealTopic = Realm.getInstance(config);
            mRealTopic.beginTransaction();

            for (int i = 0; i < allTopics.size(); i++) {
                Event3DbTopic tp = mReal.createObject(Event3DbTopic.class, getTId());
                tp.setEvent3DbId(id);
                tp.setTopic(allTopics.get(i).toString());
            }

            mRealTopic.commitTransaction();
            mRealTopic.close();
            Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show();
            this.finish();
        } catch (Exception err) {
            Toast.makeText(this, "" + err.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    //Getting Topic Id
    int getTId() {
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(config);
        RealmResults<Event3DbTopic> event2 = mReal.where(Event3DbTopic.class).findAll();
        if (event2.size() == 0) {
            mReal.close();
            return 1;
        } else {
            mReal.close();
            return event2.size() + 1;
        }
    }

    //Getting Id
    public int getId() {
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(config);
        RealmResults<Event3Db> event2 = mReal.where(Event3Db.class).findAll();
        if (event2.size() == 0) {
            mReal.close();
            return 1;
        } else {
            mReal.close();
            return event2.size() + 1;
        }
    }

    //Events Name
    private EventName getEventName() {
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(config);
        RealmResults<EventName> event1 = mReal.where(EventName.class).equalTo("eventId", 3).findAll();
        return event1.first();
    }

    //Supervisor
    private Supervisor getSupervisor() {
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(config);
        RealmResults<Supervisor> sup = mReal.where(Supervisor.class).findAll();
        mReal.close();
        return sup.first();
    }

    //Check
    private boolean check() {
        if ((count - allTopics.size()) == 1) {
            Toast.makeText(this, "Please press save button", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }


    //Show Saved
    private void showEvent() {
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(config);
        RealmResults<Event3Db> db = mReal.where(Event3Db.class).findAll();
        for (int i = 0; i < db.size(); i++)
            Log.v("VALUES", db.get(i) + "");

        RealmResults<Event3DbTopic> db2 = mReal.where(Event3DbTopic.class).findAll();
        for (int i = 0; i < db2.size(); i++) {
            Log.v("VAS", db2.get(i) + "");

        }
    }
}
