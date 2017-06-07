package mic.unlimited.com.reportingapp.Phases.Answer;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ItemClick;
import org.androidannotations.annotations.OptionsItem;
import org.androidannotations.annotations.OptionsMenu;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;
import mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db;
import mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db;
import mic.unlimited.com.reportingapp.Database.Mother;
import mic.unlimited.com.reportingapp.Phases.ActivityPhases_;
import mic.unlimited.com.reportingapp.Phases.Question.PhaseFourQ_;
import mic.unlimited.com.reportingapp.R;

/**
 * Created by Bibesh on 5/3/17.
 */

@OptionsMenu(R.menu.plus)

@EActivity(R.layout.phase_user)
public class Phase4UserList extends AppCompatActivity {
    @ViewById
    ListView phaseUser;

    @AfterViews
    void run() {
        getName();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, names);
        phaseUser.setAdapter(adapter);
    }

    @OptionsItem(R.id.add)
    void addPhase() {
        PhaseFourQ_.intent(this).start();
    }

    ArrayList<String> names;


    @ItemClick(R.id.phaseUser)
    void ok(String pos) {
        Phase4A_.intent(getApplicationContext()).extra("motherId", pos).start();
    }

    public void getName() {
        names = new ArrayList<>();
        Realm.init(getApplicationContext());
        RealmConfiguration configuration = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(configuration);
        RealmResults<ActivityPhase4Db> phase4 = mReal.where(ActivityPhase4Db.class).findAll();
        for (int i = 0; i < phase4.size(); i++) {
            ActivityPhase4Db phase4Db = phase4.get(i);
            Mother m4 = phase4Db.getMotherId();
            if (m4.equals(null)) {
                continue;
            }
            names.add(m4.getMotherId() + ") " + m4.getMotherName());
        }

    }
}
