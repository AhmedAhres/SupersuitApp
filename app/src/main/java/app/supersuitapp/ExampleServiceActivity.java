package app.supersuitapp;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.Toast;

public class ExampleServiceActivity extends Activity {
    BackgroundService backgroundService = null;
    boolean bound = false;

    private ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            BackgroundService.LocalBinder binder = (BackgroundService.LocalBinder) service;
            backgroundService = binder.getService();
            bound = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            bound = false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_example);
    }

    public void onStart() {
        super.onStart();
        bindService(
                new Intent(this, BackgroundService.class),
                serviceConnection,
                Context.BIND_AUTO_CREATE
        );
    }

    public void onStop() {
        super.onStop();
        unbindService(serviceConnection);
        bound = false;
    }

    public void onLocationRefresh(View view) {
        if (bound) {
            // Call a method from the LocalService.
            // However, if this call were something that might hang, then this request should
            // occur in a separate thread to avoid slowing down the activity performance.
            backgroundService.getLocation();
        } else {
            Toast.makeText(this, "Error: background service not running", Toast.LENGTH_LONG).show();
        }
    }
}
