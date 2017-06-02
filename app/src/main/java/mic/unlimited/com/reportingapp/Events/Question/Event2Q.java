package mic.unlimited.com.reportingapp.Events.Question;

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

@EActivity(R.layout.activity_q_event2)
public class Event2Q extends AppCompatActivity {
    String mainDate = null;
    String sDate = null;
    String eDate = null;

    public int count = 0;
    EditText name,address;

    @Click(R.id.inc)
    void makeMember() {
        LinearLayout la = (LinearLayout) findViewById(R.id.la);
        name = new EditText(this);
        address =new EditText(this);
        name.setHint(R.string.name);
        address.setHint(R.string.address);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            name.setId(name.generateViewId());
            address.setId(address.generateViewId());
            count++;
        }
        la.addView(name);
        la.addView(address);
    }

    @Click(R.id.saveing)
    void sav() {
        for (int i = 1; i <= count; i++) {
            EditText te = (EditText) findViewById(i);
            Toast.makeText(this, "" + te.getText().toString(), Toast.LENGTH_SHORT).show();
        }
    }


    @ViewById
    TextView event2date;

    @ViewById
    TextView startDate;

    @ViewById
    TextView endDate;


    @Click(R.id.pickDateEvent2)
    void pickDate() {
        final Dialog dateTimePicker = new Dialog(this);
        dateTimePicker.setContentView(R.layout.datetime_pick);
        final DatePicker date = (DatePicker) dateTimePicker.findViewById(R.id.calendar);
        Button b1 = (Button) dateTimePicker.findViewById(R.id.pickDate2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainDate = date.getYear() + "/" + date.getMonth() + "/" + date.getDayOfMonth();
                event2date.setText(mainDate);
                dateTimePicker.dismiss();
            }
        });
        dateTimePicker.show();
    }

    @Click(R.id.pickStartDateEvent2)
    void startDate() {
        final Dialog dateTimePicker = new Dialog(this);
        dateTimePicker.setContentView(R.layout.datetime_pick);
        final DatePicker date = (DatePicker) dateTimePicker.findViewById(R.id.calendar);
        Button b1 = (Button) dateTimePicker.findViewById(R.id.pickDate2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sDate = date.getYear() + "/" + date.getMonth() + "/" + date.getDayOfMonth();
                startDate.setText(mainDate);
                dateTimePicker.dismiss();
            }
        });
        dateTimePicker.show();
    }

    @Click(R.id.pickEndDateEvent2)
    void endDate() {
        final Dialog dateTimePicker = new Dialog(this);
        dateTimePicker.setContentView(R.layout.datetime_pick);
        final DatePicker date = (DatePicker) dateTimePicker.findViewById(R.id.calendar);
        Button b1 = (Button) dateTimePicker.findViewById(R.id.pickDate2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eDate = date.getYear() + "/" + date.getMonth() + "/" + date.getDayOfMonth();
                endDate.setText(mainDate);
                dateTimePicker.dismiss();
            }
        });
        dateTimePicker.show();
    }

}
