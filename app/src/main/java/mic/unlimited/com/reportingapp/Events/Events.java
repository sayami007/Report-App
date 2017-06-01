package mic.unlimited.com.reportingapp.Events;

import android.support.v7.app.AppCompatActivity;

import org.androidannotations.annotations.App;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

import mic.unlimited.com.reportingapp.Events.Question.*;
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


    @Click(R.id.event2)
    void event2() {
        Event2Q_.intent(this).start();
    }


    @Click(R.id.event3)
    void event3() {
        Event3Q_.intent(this).start();
    }


    @Click(R.id.event4)
    void event4() {
        Event4Q_.intent(this).start();
    }


    @Click(R.id.event5)
    void event5() {
        Event5Q_.intent(this).start();
    }


    @Click(R.id.event6)
    void event6() {
        Event6Q_.intent(this).start();
    }


    @Click(R.id.event7)
    void event7() {
        Event7Q_.intent(this).start();
    }


    @Click(R.id.event8)
    void event8() {
        Event8Q_.intent(this).start();
    }

    @Click(R.id.event9)
    void event9() {
        Event9Q_.intent(this).start();
    }


    @Click(R.id.event10)
    void event10() {
        Event10Q_.intent(this).start();
    }

    @Click(R.id.event11)
    void event11() {
        Event11Q_.intent(this).start();
    }

    @Click(R.id.event12)
    void event12() {
        Event12Q_.intent(this).start();
    }


}
