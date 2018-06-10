package app.supersuitapp;

import android.content.Intent;
import android.drm.DrmStore;
import android.graphics.Typeface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        openBattery();
        openWeight();
        openSettings();
        TextView tx = (TextView)findViewById(R.id.titleView);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "font/coolvetica.ttf");
        tx.setTypeface(custom_font);

    }

    public void openBattery() {
        ImageView mImageView = (ImageView) findViewById(R.id.batteryButton);
        mImageView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                openBatteryScreen();
            }

        });
    }

    public void openWeight() {
        ImageView mImageView = (ImageView) findViewById(R.id.WeightButton);
        mImageView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                openWeightScreen();
            }

        });
    }

    public void openSettings() {
        ImageView mImageView = (ImageView) findViewById(R.id.settingsButton);
        mImageView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                openSettingsScreen();
            }

        });
    }

    public void openBatteryScreen() {
        Intent intent = new Intent(this, BatteryActivity.class);
        startActivity(intent);
    }

    public void openSettingsScreen() {
        Intent intent = new Intent(this, OurSettingsActivity.class);
        startActivity(intent);
    }

    public void openWeightScreen() {
        Intent intent = new Intent(this, Weight.class);
        startActivity(intent);
    }

}
