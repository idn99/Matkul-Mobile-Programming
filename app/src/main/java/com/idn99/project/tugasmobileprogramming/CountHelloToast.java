package com.idn99.project.tugasmobileprogramming;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AlertDialogLayout;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CountHelloToast extends AppCompatActivity {

    private EditText edtNot, edtJudulNot, edtIsiNot;
    private Button btnTampil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_hello_toast);

        edtNot = findViewById(R.id.notifikasi);
        edtJudulNot = findViewById(R.id.judul_notifikasi);
        edtIsiNot = findViewById(R.id.isi_notifikasi);
        btnTampil = findViewById(R.id.btn_tampilkan);

        btnTampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(CountHelloToast.this);
                alert.setTitle("Warning").setIcon(R.drawable.ic_launcher_background).setMessage("Apakah Ingin Menampilkan Notifikasi");
                alert.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(CountHelloToast.this,
                                        "Notifikasi : "+edtNot.getText().toString()+
                                        ".  Judul : "+edtJudulNot.getText().toString()+ ".  Isi : "+edtIsiNot.getText().toString()
                                        , Toast.LENGTH_SHORT).show();
                            }
                        });
                alert.setNegativeButton("Tidak", null);
                AlertDialog alertDialog = alert.create();
                alertDialog.show();
            }
        });


    }
}
