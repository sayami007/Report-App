package mic.unlimited.com.reportingapp.Events.Question;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import mic.unlimited.com.reportingapp.R;

/**
 * Created by Bibesh on 4/21/17.
 */

@EActivity(R.layout.activity_q_event3)
public class Event3Q extends AppCompatActivity {
    public int count = 0;

    String mainDate  = null;
    @ViewById
    TextView selectedDateEvent3;

    @Click(R.id.pickDate)
    void openDateTimePicker() {
        final Dialog dateTimePicker = new Dialog(this);
        dateTimePicker.setContentView(R.layout.datetime_pick);
        final DatePicker date = (DatePicker) dateTimePicker.findViewById(R.id.calendar);
        Button b1 = (Button) dateTimePicker.findViewById(R.id.pickDate2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainDate = date.getYear() + "/" + date.getMonth() + "/" + date.getDayOfMonth();
                selectedDateEvent3.setText(mainDate);
                dateTimePicker.dismiss();
            }
        });
        dateTimePicker.show();
    }




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
