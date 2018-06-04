package app.supersuitapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OurSettingsActivity extends AppCompatPreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.xml.settingsscreen);
    }
}
