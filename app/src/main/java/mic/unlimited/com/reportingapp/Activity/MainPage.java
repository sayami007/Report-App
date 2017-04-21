package mic.unlimited.com.reportingapp.Activity;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import android.util.Log;
import android.widget.Toast;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.OptionsItem;
import org.androidannotations.annotations.OptionsMenu;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;

import mic.unlimited.com.reportingapp.Events.Events_;
import mic.unlimited.com.reportingapp.Phases.ActivityPhasesAnswer;
import mic.unlimited.com.reportingapp.Phases.ActivityPhasesAnswer_;
import mic.unlimited.com.reportingapp.Phases.ActivityPhases_;
import mic.unlimited.com.reportingapp.R;

@OptionsMenu(R.menu.main_page_menu)
@EActivity(R.layout.activity_main_page)
public class MainPage extends AppCompatActivity {

    //Shared and preference
    @Pref
    LoginActivity_.preference_ user;


    //Go to Behavior Page
    @Click(R.id.behavior)
    void goToBehavior() {
        Toast.makeText(this, "EVENTS", Toast.LENGTH_SHORT).show();
    }

    //Go to Activity Page
    @Click(R.id.activity)
    void goToActivity() {
        ActivityPhases_.intent(this).start();
    }

    //Go To Events Page
    @Click(R.id.events)
    void goToEvents() {
        Events_.intent(this).start();
    }


    //Sign Out Options
    @OptionsItem(R.id.signOut)
    void signOut() {
        user.clear();
        LoginActivity_.intent(this).start();
        this.finish();
    }

    @OptionsItem(R.id.savedActivity)
    void savedActivity() {
        ActivityPhasesAnswer_.intent(this).start();
    }


    @OptionsItem(R.id.savedBehavior)
    void savedBehavior() {
        Toast.makeText(this, "Beha", Toast.LENGTH_SHORT).show();
    }


    @OptionsItem(R.id.savedEvents)
    void savedEvents() {
        Toast.makeText(this, "Events", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder quit = new AlertDialog.Builder(this);
        quit.setTitle(R.string.quit);
        quit.setMessage(R.string.quitMessage);
        quit.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                System.exit(0);
            }
        });
        quit.setNegativeButton(R.string.no , new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        quit.show();
    }
}
