package com.example.familia.proyectofinal;


import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Database;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    public static BaseDatos miDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miDatabase=Room.databaseBuilder(getApplicationContext(),BaseDatos.class,"ubicaciondb").allowMainThreadQueries().build();

        FragmentManager miGestionador;
        FragmentTransaction miTransaccion;
        FragmentoInsertar miInsercion;
        MenuApp miMenuApp;

        miGestionador=getSupportFragmentManager();
        miTransaccion=miGestionador.beginTransaction();

        miMenuApp=new MenuApp();
        miInsercion=new FragmentoInsertar();

        miTransaccion.add(R.id.layoutFragmentos,miMenuApp);
        miTransaccion.commit();
        }

        public void  InsertarUbica (View miVista){

            FragmentManager miGestionador;
            FragmentTransaction miTransaccion;
            FragmentoInsertar miincersion;

            MenuApp miMenuApp;
            miGestionador=getSupportFragmentManager();
            miTransaccion=miGestionador.beginTransaction();

            miMenuApp=new MenuApp();
            miincersion=new FragmentoInsertar();

            miTransaccion.replace(R.id.layoutFragmentos,miincersion);
            miTransaccion.commit();
            Log.d("MyApp","I am here");


        }

    }

