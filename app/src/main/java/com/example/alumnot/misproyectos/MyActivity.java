package com.example.alumnot.misproyectos;

import android.app.ListActivity;
import android.content.Intent;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MyActivity extends ListActivity
{

    private String practicas[]={"Actividad1","CicloDeVida","Intents_Act_01","Actividad3","Actividad2_2","Actividad2_1"};
    final static String TAG= MyActivity.class.getName();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        ArrayAdapter<String>adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,practicas);
        setListAdapter(adapter);



    }

    @Override
    protected void onListItemClick(ListView lista, View vista,int posicion,long id)
    {

        super.onListItemClick(lista,vista,posicion,id);
        //guardamos el nombre de la actividad seleccionada
        String nombrePractica = practicas[posicion];
        try{
           Class<?>clase= Class.forName("com.example.alumnot.misproyectos."+nombrePractica);
            Intent intent = new Intent(this,clase);
            startActivity(intent);

        }
        catch(ClassNotFoundException e){
           Log.e(TAG, "Actividad no creada", e);

        }



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings)
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
