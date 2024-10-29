package com.example.myapplication1;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Page3 extends AppCompatActivity implements View.OnClickListener{

    private TextView textTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btnpage3);

        textTest = findViewById(R.id.text_test);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.page3_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.menu_font_size_small:
                textTest.setTextSize(10);
                return true;
            case R.id.menu_font_size_medium:
                textTest.setTextSize(16);
                return true;
            case R.id.menu_font_size_large:
                textTest.setTextSize(20);
                return true;
            case R.id.menu_normal_item:
                Toast.makeText(this, "普通菜单项被点击", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_font_color_red:
                textTest.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                return true;
            case R.id.menu_font_color_black:
                textTest.setTextColor(getResources().getColor(android.R.color.black));
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {

    }
}
