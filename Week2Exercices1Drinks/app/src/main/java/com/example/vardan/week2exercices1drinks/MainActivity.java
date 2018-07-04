package com.example.vardan.week2exercices1drinks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Drinks> drinksArrayList = DrinksProvider.getDrinkProvider(this);
        final DrinksAdapter drinksAdapter = new DrinksAdapter(this, R.layout.content_main, drinksArrayList);
        final ListView listView = findViewById(R.id.listView);
        listView.setAdapter(drinksAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(drinksArrayList.get(position).getInternetUrl()));
                startActivity(intent);
            }
        });
    }
}
