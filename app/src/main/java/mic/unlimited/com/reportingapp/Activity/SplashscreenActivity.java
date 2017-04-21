package mic.unlimited.com.reportingapp.Activity;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

import mic.unlimited.com.reportingapp.R;

@EActivity(R.layout.activity_splashscreen)
public class SplashscreenActivity extends AppCompatActivity {

    //SplashScreen view for beginning of the application
    @AfterViews
    void runSplash() {
        CountDownTimer loadCertainTime = new CountDownTimer(2000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                LoginActivity_.intent(SplashscreenActivity.this).start();
                SplashscreenActivity.this.finish();
            }
        };

        loadCertainTime.start();
    }
}
