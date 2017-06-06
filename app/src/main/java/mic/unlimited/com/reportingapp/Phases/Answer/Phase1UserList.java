package mic.unlimited.com.reportingapp.Phases.Answer;

import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.OptionsItem;
import org.androidannotations.annotations.OptionsMenu;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;
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
    void run() {
        getName();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, names);
        phaseUser.setAdapter(adapter);
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
        RealmResults<Mother> mothers = mReal.where(Mother.class).findAll();
        for (int i = 0; i < mothers.size(); i++) {
            Mother mother = mothers.get(i);
            names.add(mother.getMotherName());
        }
    }
}
