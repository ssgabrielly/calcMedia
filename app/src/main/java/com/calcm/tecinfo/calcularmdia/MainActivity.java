package com.calcm.tecinfo.calcularmdia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nota1 = (EditText) findViewById(R.id.input1);
        final EditText nota2 = (EditText) findViewById(R.id.input2);
        final EditText nota3 = (EditText) findViewById(R.id.input3);
        final EditText nota4 = (EditText) findViewById(R.id.input4);

        final Button btnC = (Button) findViewById(R.id.btn_calc);

        final TextView dResult = (TextView) findViewById(R.id.displayResultado);



    }
}
