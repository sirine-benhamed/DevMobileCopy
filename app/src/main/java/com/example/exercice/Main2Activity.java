package com.example.exercice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText _txtSource;
    EditText _txtDestination;
    Button _btnCopie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        _txtSource = ( EditText) findViewById(R.id.txtSource);
        _txtDestination = ( EditText) findViewById(R.id.txtDestination);
        _btnCopie= (Button) findViewById(R.id.btnCopie);
        _btnCopie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg=_txtSource.getText().toString();
                _txtDestination.setText(msg);

            }
        });
}
}