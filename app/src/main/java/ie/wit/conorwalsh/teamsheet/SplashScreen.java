package ie.wit.conorwalsh.teamsheet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


/**
 * Created by Conor on 11/09/2015.
 */
public class SplashScreen extends Activity {
    private static boolean splashLoaded = false;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (!splashLoaded) {
            setContentView(R.layout.splash_screen_layout);
            splashLoaded = true;

            int secondsDelayed = 1;
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    startActivity(new Intent(SplashScreen.this, MainActivity.class));
                    finish();
                }
            }, secondsDelayed * 500);
        }
        else {  //if splash is loaded already and user presses back
            Intent goToHomeActivity = new Intent(SplashScreen.this, MainActivity.class);
            goToHomeActivity.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            startActivity(goToHomeActivity);
            finish();
        }
    }
}