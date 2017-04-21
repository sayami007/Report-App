package mic.unlimited.com.reportingapp.Events;

import android.support.v7.app.AppCompatActivity;

import org.androidannotations.annotations.App;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

import mic.unlimited.com.reportingapp.Events.Question.Event1Q_;
import mic.unlimited.com.reportingapp.R;

/**
 * Created by Bibesh on 4/21/17.
 */

@EActivity(R.layout.activity_events)
public class Events extends AppCompatActivity {
    @Click(R.id.event1)
    void event1() {
        Event1Q_.intent(this).start();
    }
}
