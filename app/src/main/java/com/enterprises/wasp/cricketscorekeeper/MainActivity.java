package com.enterprises.wasp.cricketscorekeeper;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);

        ListView listViewMatch = findViewById(R.id.list_view_match);
        View emptyView = findViewById(R.id.empty_view);
        listViewMatch.setEmptyView(emptyView);

        FloatingActionButton floatingActionButton = findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        "Wheeee!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

