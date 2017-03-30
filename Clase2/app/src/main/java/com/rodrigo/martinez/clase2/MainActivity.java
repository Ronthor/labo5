package com.rodrigo.martinez.clase2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements IMostrarInfo {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main); //el xml es referenciado por un int (una id)

        TextView tv = (TextView) findViewById(R.id.editButton1);
        tv.setText("Cambiar");

        Button boton2 = (Button) findViewById(R.id.editButton2);

        View.OnClickListener my_listener = new MyListener(this);

        boton2.setOnClickListener(my_listener);

        Button boton1 = (Button) findViewById(R.id.editButton1);

        boton1.setOnClickListener(my_listener);


    }

    @Override
    public void mostrarInfo() {
        TextView texto = (TextView) super.findViewById(R.id.textView);
        texto.setText("se hizo click");
    }
}
