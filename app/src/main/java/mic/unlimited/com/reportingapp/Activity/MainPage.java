package mic.unlimited.com.reportingapp.Activity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import android.widget.Toast;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.OptionsItem;
import org.androidannotations.annotations.OptionsMenu;
import org.androidannotations.annotations.sharedpreferences.Pref;

import mic.unlimited.com.reportingapp.Behavior.SavedBehavior_;
import mic.unlimited.com.reportingapp.Events.Events_;
import mic.unlimited.com.reportingapp.Phases.ActivityPhasesAnswer;
import mic.unlimited.com.reportingapp.Phases.ActivityPhasesAnswer_;
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
        SavedBehavior_.intent(this).start();
    }

    //Go to Activity Page
    @Click(R.id.activity)
    void goToActivity() {
        ActivityPhasesAnswer_.intent(this).start();
    }

    //Go To Events Page
    @Click(R.id.events)
    void goToEvents() {
        Events_.intent(this).start();
    }


    //Sign Out Options
    @OptionsItem(R.id.signOut)
    void signOut() {
        AlertDialog.Builder signOut = new AlertDialog.Builder(this);
        signOut.setMessage(R.string.signoutMessage);
        signOut.setPositiveButton(R.string.no, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        signOut.setNegativeButton(R.string.yes, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                user.clear();
                LoginActivity_.intent(getApplicationContext()).start();
                finish();
            }
        });
        signOut.show();
    }

    //On back Button Pressed
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
        quit.setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        quit.show();
    }
}
