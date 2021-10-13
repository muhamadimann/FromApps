package com.muhamad.iman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputName = (findViewById(R.id.id_input_name));
        EditText inputmail = (findViewById(R.id.id_input_email));
        EditText inputphone = (findViewById(R.id.id_input_nomor));
        EditText inputpassword = (findViewById(R.id.id_input_password));
        Button btnSave = (Button) findViewById(R.id.id_input_save);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //kode aksi klik btn
                Log.d("--Name--", inputName.getText().toString());
                Log.d("--Email--", inputmail.getText().toString());
                Log.d("--No Telp--", inputphone.getText().toString());
                Log.d("--Password--", inputpassword.getText().toString());
            }
        });
    }
}