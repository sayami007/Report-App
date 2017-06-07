package mic.unlimited.com.reportingapp.Events.Question;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

import mic.unlimited.com.reportingapp.R;

/**
 * Created by Bibesh on 4/21/17.
 */

@EActivity(R.layout.activity_q_event5)
public class Event5Q extends AppCompatActivity {

    public int count = 0;
    EditText text;
    @Click(R.id.inc)
    void makeIncrease(){
        LinearLayout la =(LinearLayout)findViewById(R.id.la);
        text = new EditText(this);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            text.setId(text.generateViewId());
            count ++;
        }
        la.addView(text);
    }

//    @Click(R.id.saveing)
//    void sav(){
//        for(int i = 1; i<=count ; i++) {
//            EditText te = (EditText) findViewById(i);
//            Toast.makeText(this, "" + te.getText().toString(), Toast.LENGTH_SHORT).show();
//        }
//    }
}
