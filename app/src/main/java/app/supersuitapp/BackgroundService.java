package app.supersuitapp;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.widget.Toast;

// The background service that can take weightmeasurements, locate the suitcase, etc.
public class BackgroundService extends Service {
    // Binder given to clients
    private final IBinder mBinder = new LocalBinder();

    /**
     * Class used for the client Binder.  Because we know this service always
     * runs in the same process as its clients, we don't need to deal with IPC.
     */
    public class LocalBinder extends Binder {
        BackgroundService getService() {
            // Return this instance of BackgroundService so clients can call public methods
            return BackgroundService.this;
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    public BackgroundService() {
    }

    public void getLocation() {
        Toast.makeText(this, "Finding Suitcase...", Toast.LENGTH_LONG).show();
    }

    // Other methods to run in service (e.g. measure weight) to be added here
}
