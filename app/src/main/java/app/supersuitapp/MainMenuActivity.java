package app.supersuitapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

//    ImageView mImageView = (ImageView)findViewById(R.id.settingsButton);
//    mImageView.setOnClickListener(new View.OnClickListener() {
//
//        @Override
//        public void onClick(View view) {
//            // do stuff
//        }
//
//    });


//    mImageView.setOnClickListener(new View.OnClickListener() {
//
//        @Override
//        public void onClick(View view) {
//            // do stuff
//        }
//
//    });


    public void openBatteryScreen() {
        Intent intent = new Intent(this, BatteryActivity.class);
        startActivity(intent);
        finish();
    }

    public void openSettingsScreen() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
        finish();
    }

    public void openWeightScreen() {
        Intent intent = new Intent(this, Weight.class);
        startActivity(intent);
        finish();
    }

}
