package mic.unlimited.com.reportingapp.Phases.Answer;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;
import org.w3c.dom.Text;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;
import mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db;
import mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db;
import mic.unlimited.com.reportingapp.Database.Mother;
import mic.unlimited.com.reportingapp.R;

/**
 * Created by Bibesh on 4/20/17.
 */


@EActivity(R.layout.activity_phase4_answer)
public class Phase4A extends AppCompatActivity {
    
    @ViewById TextView Phase4Question1Answer;
    @ViewById TextView Phase4Question2Answer;
    @ViewById TextView Phase4Question3Answer;
    @ViewById TextView Phase4Question4Answer;
    @ViewById TextView Phase4Question5Answer;
    @ViewById TextView Phase4Question6Answer;
    @ViewById TextView Phase4Question7Answer;
    @ViewById TextView Phase4Question8Answer;
    @ViewById TextView Phase4Question9Answer;
    @ViewById TextView Phase4Question10Answer;
    @ViewById TextView Phase4Question11Answer;
    @ViewById TextView Phase4Question12Answer;
    @ViewById TextView Phase4Question13Answer;
    @ViewById TextView Phase4Question14Answer;
    @ViewById TextView Phase4Question15Answer;
    @ViewById TextView Phase4Question16Answer;
    @ViewById TextView Phase4Question17Answer;
    @ViewById TextView Phase4Question18Answer;
    @ViewById TextView Phase4Question19Answer;
    @ViewById TextView Phase4Question20Answer;
    @ViewById TextView Phase4Question21Answer;
    @ViewById TextView Phase4Question22Answer;
//    @ViewById TextView phase3MotherNameAnswer;
//    @ViewById TextView phase3MotherAgeAnswer;
//    @ViewById TextView phase3MotherNumberAnswer;
//    @ViewById TextView phase3MotherContactAnswer;

    
    @Extra
    String motherId;

    @AfterViews
    void init() {
        Realm.init(this);
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(config);
        RealmResults<Mother> mother = mReal.where(Mother.class).equalTo("motherId", getMotherId(motherId)).findAll();

        RealmResults<ActivityPhase4Db> phase2 = mReal.where(ActivityPhase4Db.class).findAll();
        for (int i = 0; i < phase2.size(); i++) {
            ActivityPhase4Db result = phase2.get(i);
            Mother m1 = result.getMotherId();
            if (m1.getMotherId() == mother.first().getMotherId()) {
//                phase3MotherNameAnswer.setText(mother.first().getMotherName());
//                phase3MotherNameAnswer.setText(mother.first().getMotherAge());
//                phase3MotherNameAnswer.setText(mother.first().getMotherContact());
//                phase3MotherNameAnswer.setText(mother.first().get());
//                phase3MotherNameAnswer.setText();
//                phase3MotherNameAnswer.setText();
//                phase3MotherNameAnswer.setText();

                Phase4Question1Answer.setText(result.getPhaseAnswer1());
                Phase4Question2Answer.setText(result.getPhaseAnswer2());
                Phase4Question3Answer.setText(result.getPhaseAnswer3());
                Phase4Question4Answer.setText(result.getPhaseAnswer4());
                Phase4Question5Answer.setText(result.getPhaseAnswer5());
                Phase4Question6Answer.setText(result.getPhaseAnswer6());
                Phase4Question7Answer.setText(result.getPhaseAnswer7());
                Phase4Question8Answer.setText(result.getPhaseAnswer8());
                Phase4Question9Answer.setText(result.getPhaseAnswer9());
                Phase4Question10Answer.setText(result.getPhaseAnswer10());
                Phase4Question11Answer.setText(result.getPhaseAnswer11());
                Phase4Question12Answer.setText(result.getPhaseAnswer12());
                Phase4Question13Answer.setText(result.getPhaseAnswer13());
                Phase4Question14Answer.setText(result.getPhaseAnswer14());
                Phase4Question15Answer.setText(result.getPhaseAnswer15());
                Phase4Question16Answer.setText(result.getPhaseAnswer16());
                Phase4Question17Answer.setText(result.getPhaseAnswer17());
                Phase4Question18Answer.setText(result.getPhaseAnswer18());
                Phase4Question19Answer.setText(result.getPhaseAnswer19());
                Phase4Question20Answer.setText(result.getPhaseAnswer20());
                Phase4Question21Answer.setText(result.getPhaseAnswer21());
                Phase4Question22Answer.setText(result.getPhaseAnswer22());
                
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
            }

        }
        mReal.close();
    }


    int getMotherId(String motherId) {
        int v = Integer.parseInt(motherId.replaceAll("[^0-9]", ""));
        return v;
    }

}
