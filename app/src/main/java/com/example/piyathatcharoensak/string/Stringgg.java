package com.example.piyathatcharoensak.string;

import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.nio.file.Files;

public class Stringgg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stringgg);
        final EditText str1 = findViewById(R.id.E1);
        final EditText str2 = findViewById(R.id.E2);
        Button C = findViewById(R.id.B1);

        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String S = " ";
                    if (str1.getText().toString().equals(str2.getText().toString())){
                    S="Yes";
                }else {
                        S = "No";
                }
                AlertDialog.Builder dia = new AlertDialog.Builder(Stringgg.this);
                    dia.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                dia.setTitle("เหมือนกันไหมน้า");
                dia.setMessage(S);
                dia.show();

            }


        });

    }
}
