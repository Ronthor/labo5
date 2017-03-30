package com.rodrigo.martinez.clase2;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by alumno on 23/03/2017.
 */

public class MyListener implements View.OnClickListener{

    //la firma contiene un view que es lo q se le pasa, asi se usa en distintas vistas el mismo boton
    //NOTA: En realidad le paso la activitiy, pero hago una interfaz, para que el usuario que la use, solo acceda a ese metodo.
    private IMostrarInfo act;

    public MyListener(IMostrarInfo valor)
    {
        this.act = valor;
    }

    public void onClick(View v)
    {
        this.act.mostrarInfo();
    }

/*
    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.editButton1)
        {
            TextView texto = (TextView) this.activity.findViewById(R.id.textView);
            texto.setText("se hizo click");
        }else{
    /*        Log.d("Click","Se hizo click en el boton");
        }
    }
   */
}
