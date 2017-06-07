package mic.unlimited.com.reportingapp.Phases.Answer;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ItemClick;
import org.androidannotations.annotations.ItemSelect;
import org.androidannotations.annotations.OptionsItem;
import org.androidannotations.annotations.OptionsMenu;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;
import mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db;
import mic.unlimited.com.reportingapp.Database.Mother;
import mic.unlimited.com.reportingapp.Phases.ActivityPhases_;
import mic.unlimited.com.reportingapp.Phases.Question.PhaseTwoQ_;
import mic.unlimited.com.reportingapp.R;

/**
 * Created by Bibesh on 5/3/17.
 */

@OptionsMenu(R.menu.plus)
@EActivity(R.layout.phase_user)
public class Phase2UserList extends AppCompatActivity {

    ArrayList<String> names;

    @ViewById
    ListView phaseUser;

    @AfterViews
    void run() {
        getName();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, names);
        phaseUser.setAdapter(adapter);
    }


    @ItemClick(R.id.phaseUser)
    void ok(String pos) {
        Phase2A_.intent(getApplicationContext()).extra("motherId",pos).start();;
    }

    @OptionsItem(R.id.add)
    void addPhase() {
        PhaseTwoQ_.intent(this).start();
        this.finish();
    }

    public void getName() {
        names = new ArrayList<>();
        Realm.init(getApplicationContext());
        RealmConfiguration configuration = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(configuration);
        RealmResults<ActivityPhase2Db> phase2 = mReal.where(ActivityPhase2Db.class).findAll();
        for (int i = 0; i < phase2.size(); i++) {
            ActivityPhase2Db phase2Db = phase2.get(i);
            Mother m2 = phase2Db.getMother();
            if (m2.equals(null)) {
                continue;
            }
            names.add(m2.getMotherId() + ") " + m2.getMotherName());
        }

    }
}
