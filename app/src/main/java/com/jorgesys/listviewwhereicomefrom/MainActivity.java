package com.jorgesys.listviewwhereicomefrom;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        /* Populate the ListView */
        ArrayList<myObjeto> datos  = new ArrayList<>();
        datos.add(new myObjeto("1", "BUHO", "Búho es el nombre"));
        datos.add(new myObjeto("2", "COLIBRÍ", "Los troquilinos"));
        datos.add(new myObjeto("3", "PORC", "Los ratones locos"));
        datos.add(new myObjeto("4", "BROASCA", "BROASCA es el nombre"));
        datos.add(new myObjeto("5", "LEOAICA", "Los troquilinos"));
        datos.add(new myObjeto("6", "SORICEL", "Los ratones locos"));
        datos.add(new myObjeto("7", "PANTERA", "Búho es el nombre"));
        datos.add(new myObjeto("8", "PUMA", "Los troquilinos"));
        datos.add(new myObjeto("9", "CABALLO", "Los ratones locos"));
        datos.add(new myObjeto("10", "JIRAFA", "Búho es el nombre"));
        datos.add(new myObjeto("11", "CUINE", "Los troquilinos"));
        datos.add(new myObjeto("12", "PASARICA", "Los ratones locos"));
        datos.add(new myObjeto("12.5", "CERDO", "Búho es el nombre"));
        datos.add(new myObjeto("14", "VEVERITA", "Los troquilinos"));
        datos.add(new myObjeto("15", "FOX", "Los ratones locos"));



        ListAdapter adapter = new ListAdapter(this, datos);
        listView.setAdapter(adapter);
    }
}
