package com.example.task1injava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
    }
    void initView(){
        TextView tv_second = findViewById(R.id.tv_second);
        String text = getIntent().getStringExtra("name");
        String age = getIntent().getStringExtra("age");
        tv_second.setText(text+age);
    }
}