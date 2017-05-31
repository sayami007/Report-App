package mic.unlimited.com.reportingapp.Behavior;

import android.support.v7.app.AppCompatActivity;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

import mic.unlimited.com.reportingapp.R;

/**
 * Created by Bibesh on 5/3/17.
 */
@EActivity(R.layout.activity_phases)
public class AddBehavior extends AppCompatActivity {

    @Click(R.id.phase1Question)
    void showPhase1() {
        BehaviorPhase1_.intent(this).start();
    }

    @Click(R.id.phase2Question)
    void showPhase2() {

    }

    @Click(R.id.phase3Question)
    void showPhase3() {

    }

    @Click(R.id.phase4Question)
    void showPhase4() {

    }
}
