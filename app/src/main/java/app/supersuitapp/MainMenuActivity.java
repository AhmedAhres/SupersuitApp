package app.supersuitapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    ImageView button = (ImageView) findViewById(R.id.settingsButton);

    /**
     * opens the initial state and closes this state
     */
    public void openBatteryScreen() {
        Intent intent = new Intent(this, BatteryActivity.class);
        startActivity(intent);
        finish();
    }

    /**
     * opens the initial state and closes this state
     */
    public void openSettingsScreen() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
        finish();
    }

    /**
     * opens the initial state and closes this state
     */
    public void openWeightScreen() {
        Intent intent = new Intent(this, Weight.class);
        startActivity(intent);
        finish();
    }

}
