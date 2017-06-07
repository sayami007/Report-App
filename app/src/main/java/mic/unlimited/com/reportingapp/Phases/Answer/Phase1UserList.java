package mic.unlimited.com.reportingapp.Phases.Answer;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ItemClick;
import org.androidannotations.annotations.OptionsItem;
import org.androidannotations.annotations.OptionsMenu;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;
import mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db;
import mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db;
import mic.unlimited.com.reportingapp.Database.Mother;
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

    ArrayList<String> names;
    @ViewById
    ListView phaseUser;

    @AfterViews
    void init() {
        getName();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, names);
        phaseUser.setAdapter(adapter);

    }

    @ItemClick(R.id.phaseUser)
    void run(){
        Log.v("SDF",phaseUser.getSelectedItemId()+"");
    }

    @OptionsItem(R.id.add)
    void addPhase() {
        PhaseOneQ_.intent(this).start();
        this.finish();
    }



    public void getName() {
        names = new ArrayList<>();
        Realm.init(getApplicationContext());
        RealmConfiguration configuration = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(configuration);
        RealmResults<ActivityPhase1Db> phase1 = mReal.where(ActivityPhase1Db.class).findAll();
        for (int i = 0; i < phase1.size(); i++) {
            ActivityPhase1Db phase1Db = phase1.get(i);
            Mother m1 = phase1Db.getMother();
            if (m1.equals(null)) {
                continue;
            }
            names.add(m1.getMotherId()+") "+m1.getMotherName());
        }

    }
}
