package com.idn99.project.tugasmobileprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TugasActivity extends AppCompatActivity {

    private EditText edtNama;
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas);

        edtNama = findViewById(R.id.edt_nama);
        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PindahActivity.class);
                intent.putExtra("nama", edtNama.getText().toString());
                startActivity(intent);
                Toast.makeText(TugasActivity.this, edtNama.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
