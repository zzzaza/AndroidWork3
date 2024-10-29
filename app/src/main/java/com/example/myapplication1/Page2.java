package com.example.myapplication1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Page2 extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_btnpage2);

        // 使用LayoutInflater获取自定义布局
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.activity_btnpage2, null);

        // 创建AlertDialog.Builder对象
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(dialogView);

        // 获取按钮并设置点击事件
        Button buttonCancel = dialogView.findViewById(R.id.buttonCancel);
        Button buttonSignIn = dialogView.findViewById(R.id.buttonSignIn);

        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Page2.this, "Cancel clicked", Toast.LENGTH_SHORT).show();
                // 这里可以添加取消操作的逻辑
            }
        });

        buttonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Page2.this, "Login clicked", Toast.LENGTH_SHORT).show();
                // 这里可以添加登录操作的逻辑
            }
        });

        // 显示对话框
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    @Override
    public void onClick(View view) {

    }
}
