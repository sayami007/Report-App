package mic.unlimited.com.reportingapp.Events.Question;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ItemClick;
import org.androidannotations.annotations.ItemSelect;
import org.androidannotations.annotations.ViewById;

import mic.unlimited.com.reportingapp.R;

/**
 * Created by Bibesh on 6/1/17.
 */
@EActivity(R.layout.activity_q_event7)
public class Event7Q extends AppCompatActivity {
    @ViewById
    Spinner spinnerEvent7;

    @ViewById
    LinearLayout replace;

    @ItemSelect(R.id.spinnerEvent7)
    void run(boolean t, int pos) {
        View v;
        switch (pos) {
            case 0:
                replace.removeAllViews();
                v = LayoutInflater.from(this).inflate(R.layout.activity_q_event7a,null);
                replace.addView(v);
                new Event7Qa();
                break;

            case 1:
                replace.removeAllViews();
                v = LayoutInflater.from(this).inflate(R.layout.activity_q_event7b,null);
                replace.addView(v);
                break;

            case 2:
                replace.removeAllViews();
                v = LayoutInflater.from(this).inflate(R.layout.activity_q_event7c,null);
                replace.addView(v);
                break;

            case 3:
                replace.removeAllViews();
                v = LayoutInflater.from(this).inflate(R.layout.activity_q_event7d,null);
                replace.addView(v);
                break;
            case 4:
                replace.removeAllViews();
                v = LayoutInflater.from(this).inflate(R.layout.activity_q_event7e,null);
                replace.addView(v);
                break;
            case 5:
                replace.removeAllViews();
                v = LayoutInflater.from(this).inflate(R.layout.activity_q_event7f,null);
                replace.addView(v);
                break;
            case 6:
                replace.removeAllViews();
                v = LayoutInflater.from(this).inflate(R.layout.activity_q_event7g,null);
                replace.addView(v);
                break;
            case 7:
                replace.removeAllViews();
                v = LayoutInflater.from(this).inflate(R.layout.activity_q_event7h,null);
                replace.addView(v);
                break;
        }
    }

}
