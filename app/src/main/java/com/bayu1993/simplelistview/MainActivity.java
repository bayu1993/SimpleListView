package com.bayu1993.simplelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView ListItem;
    private String[] Clubs = new String[]{
            "Liverpool", "Arsenal", "Totenham Hotspurs",
            "Chelsea", "Manchester United", "Manchester City",
            "Everton", "Newcastle", "Swansea", "Watford"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListItem = (ListView)findViewById(R.id.list_item);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_expandable_list_item_1,
                android.R.id.text1, Clubs
                );
        ListItem.setAdapter(adapter);

        ListItem.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Toast.makeText(MainActivity.this, "Kamu Klik : "+Clubs[position], Toast.LENGTH_LONG).show();
            }
        });
    }
}
