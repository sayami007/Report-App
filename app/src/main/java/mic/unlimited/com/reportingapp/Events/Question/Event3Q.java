package mic.unlimited.com.reportingapp.Events.Question;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

import mic.unlimited.com.reportingapp.R;

/**
 * Created by Bibesh on 4/21/17.
 */

@EActivity(R.layout.activity_q_event3)
public class Event3Q extends AppCompatActivity {
    public int count = 0;


    @Click(R.id.addTopic)
    void addTopic(){
        LinearLayout layout = (LinearLayout)findViewById(R.id.topicPlace);
        EditText topics = new EditText(this);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            topics.setId(topics.generateViewId());
        }
        layout.addView(topics);
        count +=1;
    }

    public void getTopic(){
        for(int id = 1;id<=count ; id++){
            EditText text = (EditText)findViewById(id);
            Log.v("Values", text.getText().toString());

        }
    }

    @Click(R.id.saveEvent3)
    void save(){
        this.getTopic();
    }
}
