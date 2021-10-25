package com.lab02.view;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ListView valores;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valores = (ListView) findViewById(R.id.list_view);
        ArrayAdapter <CharSequence> adaptador = ArrayAdapter.createFromResource(this, R.array.ArrayValore, android.R.layout.simple_expandable_list_item_1);
        valores.setAdapter(adaptador);
    }
}