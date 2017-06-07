package mic.unlimited.com.reportingapp.Events.Question;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;
import mic.unlimited.com.reportingapp.Database.Event.Event11Db;
import mic.unlimited.com.reportingapp.Database.Event.Event2Db;
import mic.unlimited.com.reportingapp.Database.EventName;
import mic.unlimited.com.reportingapp.Database.Supervisor;
import mic.unlimited.com.reportingapp.R;

@EActivity(R.layout.activity_q_event11)
public class Event11Q extends AppCompatActivity {
    String mainDate = null;

    @ViewById
    TextView event11Date;

    @ViewById
    EditText supervisorPosEvent11;

    @ViewById
    EditText place11;

    @ViewById
    EditText topic11;

    @Click(R.id.pickDate11)
    void pickDate() {
        final Dialog dateTimePicker = new Dialog(this);
        dateTimePicker.setContentView(R.layout.datetime_pick);
        final DatePicker date = (DatePicker) dateTimePicker.findViewById(R.id.calendar);
        Button b1 = (Button) dateTimePicker.findViewById(R.id.pickDate2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainDate = date.getYear() + "/" + date.getMonth() + "/" + date.getDayOfMonth();
                event11Date.setText(mainDate);
                dateTimePicker.dismiss();
            }
        });
        dateTimePicker.show();
    }


    @Click(R.id.saveEvent11)
    void run() {
        try {
            int id = getId();
            EventName event = getEventName();
            Supervisor supervisor = getSupervisor();
            String supervisorPos = supervisorPosEvent11.getText().toString();
            String date = event11Date.getText().toString();
            String place = place11.getText().toString();
            String topic = topic11.getText().toString();

            Log.v("VALUES", "" + id);
            Log.v("VALUES", "" + event);
            Log.v("VALUES", "" + supervisor);
            Log.v("VALUES", "" + supervisorPos);
            Log.v("VALUES", "" + date);
            Log.v("VALUES", "" + place);
            Log.v("VALUES", "" + topic);

            Realm.init(getApplicationContext());
            RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
            Realm mReal = Realm.getInstance(config);
            mReal.beginTransaction();
            Event11Db db = mReal.createObject(Event11Db.class,id);

            db.setEvent(event);
            db.setSupervisor(supervisor);
            db.setSupervisorPos(supervisorPos);
            db.setDate(date);
            db.setPlace(place);
            db.setTopic(topic);

            mReal.commitTransaction();
            mReal.close();
            Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show();
            this.finish();


        } catch (Exception err) {
            Toast.makeText(this, "" + err.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    //Get id
    public int getId() {
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(config);
        RealmResults<Event11Db> event11 = mReal.where(Event11Db.class).findAll();
        if (event11.size() == 0) {
            mReal.close();
            return 1;
        } else {
            mReal.close();
            return event11.size() + 1;
        }
    }

    //Get Event ID
    private EventName getEventName() {
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(config);
        RealmResults<EventName> event1 = mReal.where(EventName.class).equalTo("eventId", 11).findAll();
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
