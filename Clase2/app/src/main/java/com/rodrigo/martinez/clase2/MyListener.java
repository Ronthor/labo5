package com.rodrigo.martinez.clase2;

import android.util.Log;
import android.view.View;

/**
 * Created by alumno on 23/03/2017.
 */

public class MyListener implements View.OnClickListener{

    //la firma contiene un view que es lo q se le pasa, asi se usa en distintas vistas el mismo boton

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.editButton1)
        {
            Log.d("CLICK","se hizo click en el boton1");
        }else{
            Log.d("Click","Se hizo click en el boton");
        }
    }
}
