package com.example.alumnot.misproyectos;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class CicloDeVida extends ActionBarActivity {

    private static final String TAG = CicloDeVida.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciclo_de_vida);


        android.util.Log.i(TAG,"onCreate");
    }

    @Override
    protected void onStart()
    {
        super.onStart();


        android.util.Log.i(TAG,"onStart");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();


        android.util.Log.i(TAG,"onRestart");
    }

    @Override
    protected void onResume()
    {
        super.onResume();


        android.util.Log.i(TAG,"onResume");
    }

    @Override
    protected void onPause()
    {
        super.onPause();


        android.util.Log.i(TAG,"onPause");
    }

    @Override
    protected void onStop()
    {
        super.onStop();


        android.util.Log.i(TAG,"onStop");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();


        android.util.Log.i(TAG,"onDestroy");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ciclo_de_vida, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
