package mic.unlimited.com.reportingapp.Events.Question;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;
import mic.unlimited.com.reportingapp.Database.Event.Event11Db;
import mic.unlimited.com.reportingapp.Database.Event.Event12Db;
import mic.unlimited.com.reportingapp.Database.EventName;
import mic.unlimited.com.reportingapp.Database.Supervisor;
import mic.unlimited.com.reportingapp.R;

@EActivity(R.layout.activity_q_event12)
public class Event12Q extends AppCompatActivity {

    @ViewById
    EditText supervisorPosEvent11;
    @ViewById
    EditText flyer1;
    @ViewById
    EditText flyer2;
    @ViewById
    EditText flyer3;
    @ViewById
    EditText flyer4;
    @ViewById
    EditText flyer5;
    @ViewById
    EditText babybibs;
    @ViewById
    EditText towel;
    @ViewById
    EditText d3;


    @Click(R.id.saveEvent12)
    void save() {
        try {
            int id = getId();
            EventName event = getEventName();
            Supervisor supervisor = getSupervisor();
            String supervisorPos = supervisorPosEvent11.getText().toString();
            int flyer1a = Integer.parseInt(flyer1.getText().toString());
            int flyer2a = Integer.parseInt(flyer2.getText().toString());
            int flyer3a = Integer.parseInt(flyer3.getText().toString());
            int flyer4a = Integer.parseInt(flyer4.getText().toString());
            int flyer5a = Integer.parseInt(flyer5.getText().toString());
            int babyBibsa = Integer.parseInt(babybibs.getText().toString());
            int towela = Integer.parseInt(towel.getText().toString());
            int poster3Da = Integer.parseInt(d3.getText().toString());

            Log.v("VALUES", "" + id);
            Log.v("VALUES", "" + event);
            Log.v("VALUES", "" + supervisor);
            Log.v("VALUES", "" + supervisorPos);
            Log.v("VALUES", "" + flyer1a);
            Log.v("VALUES", "" + flyer2a);
            Log.v("VALUES", "" + flyer3a);
            Log.v("VALUES", "" + flyer4a);
            Log.v("VALUES", "" + flyer5a);
            Log.v("VALUES", "" + babyBibsa);
            Log.v("VALUES", "" + towela);
            Log.v("VALUES", "" + poster3Da);


            Realm.init(getApplicationContext());
            RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
            Realm mReal = Realm.getInstance(config);
            mReal.beginTransaction();
            Event12Db db = mReal.createObject(Event12Db.class, id);
            db.setEvent(event);
            db.setSupervisor(supervisor);
            db.setSupervisorPos(supervisorPos);
            db.setFlyer1(flyer1a);
            db.setFlyer2(flyer2a);
            db.setFlyer3(flyer3a);
            db.setFlyer4(flyer4a);
            db.setFlyer5(flyer5a);
            db.setBabyBibs(babyBibsa);
            db.setTowel(towela);
            db.setPoster3D(poster3Da);
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
        RealmResults<Event12Db> event11 = mReal.where(Event12Db.class).findAll();
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
        RealmResults<EventName> event1 = mReal.where(EventName.class).equalTo("eventId", 12).findAll();
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
