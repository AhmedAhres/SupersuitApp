package app.supersuitapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BatteryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battery);
        setTitle("Battery");
    }
}
