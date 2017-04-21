package mic.unlimited.com.reportingapp.Phases;

import android.support.v7.app.AppCompatActivity;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

import mic.unlimited.com.reportingapp.Phases.Question.PhaseFourQ_;
import mic.unlimited.com.reportingapp.Phases.Question.PhaseThreeQ_;
import mic.unlimited.com.reportingapp.Phases.Question.PhaseOneQ_;
import mic.unlimited.com.reportingapp.Phases.Question.PhaseTwoQ_;
import mic.unlimited.com.reportingapp.R;

/**
 * Created by Bibesh on 4/19/17.
 */
@EActivity(R.layout.activity_phases)
public class ActivityPhases extends AppCompatActivity {
    @Click(R.id.phase1Question)
    void Phase1() {
        PhaseOneQ_.intent(this).start();
    }

    @Click(R.id.phase2Question)
    void Phase2() {
        PhaseTwoQ_.intent(this).start();
    }

    @Click(R.id.phase3Question)
    void Phase3() {
        PhaseThreeQ_.intent(this).start();
    }

    @Click(R.id.phase4Question)
    void Phase4() {
        PhaseFourQ_.intent(this).start();
    }
}
