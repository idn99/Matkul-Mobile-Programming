package com.idn99.project.tugasmobileprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent;
        TabHost tabHost = getTabHost();
        TabHost.TabSpec tabSpec;
        intent = new Intent(this, TugasActivity.class);
        tabSpec = getTabHost().newTabSpec("tab1").setIndicator(
                "Activity").setContent(intent);
        tabHost.addTab(tabSpec);
        intent = new Intent(this, CountHelloToast.class);
        tabSpec = getTabHost().newTabSpec("tab2").setIndicator(
                "Hello Toast").setContent(intent);
        tabHost.addTab(tabSpec);
        intent = new Intent(this, ListView.class);
        tabSpec = getTabHost().newTabSpec("tab3").setIndicator(
                "List View").setContent(intent);
        tabHost.addTab(tabSpec);

    }

}

