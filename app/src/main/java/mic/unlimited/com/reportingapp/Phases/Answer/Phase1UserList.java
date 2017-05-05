package mic.unlimited.com.reportingapp.Phases.Answer;

import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.OptionsItem;
import org.androidannotations.annotations.OptionsMenu;
import org.androidannotations.annotations.ViewById;

import mic.unlimited.com.reportingapp.Phases.ActivityPhases;
import mic.unlimited.com.reportingapp.Phases.ActivityPhases_;
import mic.unlimited.com.reportingapp.Phases.Question.PhaseOneQ_;
import mic.unlimited.com.reportingapp.R;

/**
 * Created by Bibesh on 5/3/17.
 */

@OptionsMenu(R.menu.plus)
@EActivity(R.layout.phase_user)
public class Phase1UserList extends AppCompatActivity {

    @ViewById
    ListView phaseUser;

    @AfterViews
    void run() {

        String[] names = {"१. सिता श्रेष्ठ ", "२. गिता पुन", "३. रिता श्रेष्ठ "};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,names);
        phaseUser.setAdapter(adapter);
    }

    @OptionsItem(R.id.add)
    void addPhase(){
        PhaseOneQ_.intent(this).start();
    }
}
