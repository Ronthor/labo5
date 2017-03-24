package com.rodrigo.martinez.clase2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main); //el xml es referenciado por un int (una id)

        TextView tv = (TextView) findViewById(R.id.editButton1);
        tv.setText("Cambiar");

        Button boton2 = (Button) findViewById(R.id.editButton2);

        View.OnClickListener my_listener = new MyListener();

        boton2.setOnClickListener(my_listener);


    }
}
