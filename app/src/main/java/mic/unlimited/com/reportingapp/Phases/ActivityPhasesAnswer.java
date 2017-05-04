package mic.unlimited.com.reportingapp.Phases;

import android.support.v7.app.AppCompatActivity;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

import mic.unlimited.com.reportingapp.Phases.Answer.*;
import mic.unlimited.com.reportingapp.R;

/**
 * Created by Bibesh on 4/20/17.
 */

@EActivity(R.layout.activity_phases)
public class ActivityPhasesAnswer extends AppCompatActivity {
    @Click(R.id.phase1Question)
    void phase1() {
        Phase1UserList_.intent(this).start();
    }

    @Click(R.id.phase2Question)
    void phase2() {
        Phase2UserList_.intent(this).start();

    }


    @Click(R.id.phase3Question)
    void phase3() {
        Phase3UserList_.intent(this).start();

    }


    @Click(R.id.phase4Question)
    void phase4() {
        Phase4UserList_.intent(this).start();

    }


}
