package com.idn99.project.tugasmobileprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class ListView extends AppCompatActivity {

    private android.widget.ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = findViewById(R.id.list);

        String[] values = new String[] { "Salad With Peanut Sauce",
                "Chicken obese",
                "Milo Fist Ice"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, android.R.id.text1, values);
        listView.setAdapter(adapter);
    }
}
