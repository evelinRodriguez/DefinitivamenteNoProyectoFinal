package com.example.familia.proyectofinal;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentoInsertar extends Fragment implements View.OnClickListener{

    private EditText salon,sede,edificio;
    private Button miBoton;


    public FragmentoInsertar() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista=inflater.inflate(R.layout.fragment_fragmento_insertar, container, false);
        salon=vista.findViewById(R.id.txtSalon);
        sede=vista.findViewById(R.id.txtSede);
        edificio=vista.findViewById(R.id.txtEdificio);

        miBoton=(Button) vista.findViewById(R.id.btnInsertar);
        miBoton.setOnClickListener(this);

        return  vista;
    }

    @Override
    public void onClick(View v) {

        int miSalon=Integer.parseInt(salon.getText().toString());
        String miSede=sede.getText().toString();
        String miEdificio=edificio.getText().toString();

        Ubicacion miUbicacion=new Ubicacion();

        miUbicacion.setSalon(miSalon);
        miUbicacion.setSede(miSede);
        miUbicacion.setEdificion(miEdificio);



        MainActivity.miDatabase.daoUbicacion().addUbicacion(miUbicacion);

        Toast.makeText(getActivity(),"Éxito",Toast.LENGTH_SHORT).show();



    }


    }
