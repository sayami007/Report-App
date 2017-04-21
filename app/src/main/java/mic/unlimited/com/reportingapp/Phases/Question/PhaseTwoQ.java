package mic.unlimited.com.reportingapp.Phases.Question;

import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.App;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import mic.unlimited.com.reportingapp.Activity.LoginActivity_;
import mic.unlimited.com.reportingapp.R;

/**
 * Created by Bibesh on 4/20/17.
 */

@EActivity(R.layout.activity_phase2)
public class PhaseTwoQ extends AppCompatActivity{
    ArrayList<String> vdcList;

    //Shared and preference
    @Pref
    LoginActivity_.preference_ user;

    //Taking the reference of layout
    @ViewById
    Spinner healthPostPhase2;

    //Load the page for the first time
    @AfterViews
    void loadFirst() {
        vdcList = new ArrayList<>();
        try {
            //get the user information from the saved shared preference
            String information = user.fullInformation().get();

            //Convert the information into array
            JSONArray infoArray = new JSONArray(information);
            for (int i = 0; i < infoArray.length(); i++) {
                JSONObject object = infoArray.getJSONObject(i);
                JSONArray vdcArray = new JSONArray(object.getString("vdc"));
                for (int j = 0; j < vdcArray.length(); j++) {
                    //Get the String value of the JSON Object from the information array
                    JSONObject posts = vdcArray.getJSONObject(j);
                    vdcList.add(posts.getString("vdcHealthPost"));
                }
            }
        } catch (JSONException err) {
            Toast.makeText(this, "" + err.getMessage(), Toast.LENGTH_SHORT).show();
        } finally {
            //Create Adapter for the Spinner that show the list of the VDC health post
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, android.R.id.text1, vdcList);
            healthPostPhase2.setAdapter(adapter);
        }
    }

}
