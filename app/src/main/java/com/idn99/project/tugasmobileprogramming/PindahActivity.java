package com.idn99.project.tugasmobileprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PindahActivity extends AppCompatActivity {

    private Button btnLogout;
    private TextView tvNama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pindah);

        btnLogout = findViewById(R.id.btn_logout);
        tvNama = findViewById(R.id.nama_tv);

        Intent intent = getIntent();
        tvNama.setText(intent.getStringExtra("nama"));
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
