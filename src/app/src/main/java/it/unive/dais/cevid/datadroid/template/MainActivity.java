package it.unive.dais.cevid.datadroid.template;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.location.Location;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openMap (View view){
        startActivity(new Intent("android.intent.action.MapsActivity"));
    }

    public void openList1 (View view){
        startActivity(new Intent("android.intent.action.ListActivityDOC"));
    }

    public void openList2 (View view){
        startActivity(new Intent("android.intent.action.ListActivityDOCG"));
    }
    /**
    public void onStart()
    {
        super.onStart();
        Log.d(tag, "Evento onStart()");
    }

    public void onRestart()
    {
        super.onRestart();
        Log.d(tag, "Evento onRestart()");
    }

    public void onResume()
    {
        super.onResume();
        Log.d(tag, "Evento onResume()");
    }

    public void onPause()
    {
        super.onPause();
        Log.d(tag, "Evento onPause()");
    }

    public void onStop()
    {
        super.onStop();
        Log.d(tag, "Evento onStop()");
    }

    public void onDestroy()
    {
        super.onDestroy();
        Log.d(tag, "Evento onDestroy()");
    }
     */
}