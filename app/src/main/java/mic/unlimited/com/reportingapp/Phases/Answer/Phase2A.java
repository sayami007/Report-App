package mic.unlimited.com.reportingapp.Phases.Answer;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;
import mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db;
import mic.unlimited.com.reportingapp.Database.Mother;
import mic.unlimited.com.reportingapp.R;

/**
 * Created by Bibesh on 4/20/17.
 */


@EActivity(R.layout.activity_phase2_answer)
public class Phase2A extends AppCompatActivity {
    @Extra
    String motherId;

    @AfterViews
    void init() {

        Realm.init(this);
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(config);

        RealmResults<Mother> mother = mReal.where(Mother.class).equalTo("motherId", getMotherId(motherId)).findAll();
        Log.v("HELO", "" + mother);

        RealmResults<ActivityPhase2Db> phase2 = mReal.where(ActivityPhase2Db.class).findAll();
        for (int i = 0; i < phase2.size(); i++) {
            ActivityPhase2Db result = phase2.get(i);
            Mother m1 = result.getMother();
            Log.v("MOTHER old",""+mother);
            Log.v("MOTHER new",""+m1);

            if (m1.getMotherId() == mother.first().getMotherId()) {

                Log.v("Values", result.getPhaseAnswer1());
                Log.v("Values", result.getPhaseAnswer2());
                Log.v("Values", result.getPhaseAnswer3());
                Log.v("Values", result.getPhaseAnswer4());
                Log.v("Values", result.getPhaseAnswer5());
                Log.v("Values", result.getPhaseAnswer6());
                Log.v("Values", result.getPhaseAnswer7());
                Log.v("Values", result.getPhaseAnswer8());
                Log.v("Values", result.getPhaseAnswer9());
                Log.v("Values", result.getPhaseAnswer10());
                Log.v("Values", result.getPhaseAnswer11());
                Log.v("Values", result.getPhaseAnswer12());
                Log.v("Values", result.getPhaseAnswer13());
                Log.v("Values", result.getPhaseAnswer14());
                Log.v("Values", result.getPhaseAnswer15());
                Log.v("Values", result.getPhaseAnswer16());
                Log.v("Values", result.getPhaseAnswer17());
                Log.v("Values", result.getPhaseAnswer18());
                Log.v("Values", result.getPhaseAnswer19());
                Log.v("Values", result.getPhaseAnswer20());
                Log.v("Values", result.getPhaseAnswer21());
                Log.v("Values", result.getPhaseAnswer22());
                Log.v("Values", result.getPhaseAnswer23());
                Log.v("Values", result.getPhaseAnswer24());
                Log.v("Values", result.getPhaseAnswer25());
                Log.v("Values", result.getPhaseAnswer26());
                Log.v("Values", result.getPhaseAnswer27());
                Log.v("Values", result.getPhaseAnswer28());
                Log.v("Values", result.getPhaseAnswer29());
                Log.v("Values", result.getPhaseAnswer30());
            }

        }
        mReal.close();
    }

    int getMotherId(String motherId) {
        int v = Integer.parseInt(motherId.replaceAll("[^0-9]", ""));
        return v;
    }
}
