package com.example.myapplication1;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Page1 extends AppCompatActivity implements View.OnClickListener{

    private ListView listView;
    private List<Map<String, Object>> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btnpage1);

        listView = findViewById(R.id.listView);
        dataList = new ArrayList<>();

        String[] names = {"Lion", "Tiger", "Monkey", "Dog", "Cat","Elephant"};
        int[] photos = {R.drawable.lion, R.drawable.tiger, R.drawable.monkey, R.drawable.dog, R.drawable.cat, R.drawable.elephant};

        for (int i = 0; i < names.length; i++) {
            Map<String, Object> item = new HashMap<>();
            item.put("name", names[i]);
            item.put("photo", photos[i]);
            dataList.add(item);
        }

        SimpleAdapter adapter = new SimpleAdapter(
                this,
                dataList,
                R.layout.list_item,
                new String[]{"name", "photo"},
                new int[]{R.id.name, R.id.photo}
        );

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Map<String, Object> item = dataList.get(position);
                String name = (String) item.get("name");
                Toast.makeText(Page1.this, name, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(View view) {

    }
}
