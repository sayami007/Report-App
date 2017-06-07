package mic.unlimited.com.reportingapp.Phases.Answer;

import android.support.v7.app.AppCompatActivity;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;
import mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db;
import mic.unlimited.com.reportingapp.Database.Mother;
import mic.unlimited.com.reportingapp.R;

/**
 * Created by Bibesh on 4/20/17.
 */

@EActivity(R.layout.activity_phase1_answer)
public class Phase1A extends AppCompatActivity {


    @AfterViews
    public void init(){
        Realm.init(this);
        RealmConfiguration configuration = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(configuration);

//        RealmResults<ActivityPhase1Db> results = mReal.where(ActivityPhase1Db.class).equalTo("mother",returnMother()).findAll();
//        for(int i = 0 ; i < results.size();i++){
//            ActivityPhase1Db phase = results.get(i);
//
//
//        }
    }


    public Mother returnMother(int motherId){
        Realm.init(this);
        RealmConfiguration configuration = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(configuration);
        RealmResults<Mother> result = mReal.where(Mother.class).equalTo("motherId",motherId).findAll();
        mReal.close();
        return result.first();
    }
}
