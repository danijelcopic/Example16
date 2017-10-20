package com.danijelcopic.example15dc.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.danijelcopic.example15dc.R;
import com.danijelcopic.example15dc.provider.FoodProvider;

import java.util.List;

public class FirstActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_relative);

        final List<String> foodNames = FoodProvider.getFoodNames();

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.list_item, foodNames);
        ListView listView = (ListView) findViewById(R.id.lv_list);

        listView.setAdapter(dataAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("position", position);
                startActivity(intent);
            }
        });
    }
}



