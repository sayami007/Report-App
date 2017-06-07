package mic.unlimited.com.reportingapp.Phases.Answer;

import android.support.v7.app.AppCompatActivity;
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
import mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db;
import mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db;
import mic.unlimited.com.reportingapp.Database.Mother;
import mic.unlimited.com.reportingapp.Phases.ActivityPhases_;
import mic.unlimited.com.reportingapp.Phases.Question.PhaseOneQ_;
import mic.unlimited.com.reportingapp.Phases.Question.PhaseThreeQ_;
import mic.unlimited.com.reportingapp.R;

/**
 * Created by Bibesh on 5/3/17.
 */
@OptionsMenu(R.menu.plus)

@EActivity(R.layout.phase_user)
public class Phase3UserList extends AppCompatActivity {


    @ViewById
    ListView phaseUser;

    ArrayList<String> names;
    @AfterViews
    void run() {

        getName();
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,names);
        phaseUser.setAdapter(adapter);
    }



    @ItemClick(R.id.phaseUser)
    void ok(String pos) {
        Phase3A_.intent(getApplicationContext()).extra("motherId",pos).start();;
    }

    @OptionsItem(R.id.add)
    void addPhase(){
        PhaseThreeQ_.intent(this).start();
    }


    public void getName() {
        names = new ArrayList<>();
        Realm.init(getApplicationContext());
        RealmConfiguration configuration = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm mReal = Realm.getInstance(configuration);
        RealmResults<ActivityPhase3Db> phase3 = mReal.where(ActivityPhase3Db.class).findAll();
        for (int i = 0; i < phase3.size(); i++) {
            ActivityPhase3Db phase3Db = phase3.get(i);
            Mother m3 = phase3Db.getMotherID();
            if (m3.equals(null)) {
                continue;
            }
            names.add(m3.getMotherId()+") "+m3.getMotherName());
        }

    }
}
