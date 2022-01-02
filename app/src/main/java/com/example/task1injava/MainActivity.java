package com.example.task1injava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    void initView(){
        Button button = (Button) findViewById(R.id.btn_open_second);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSecondActivity();
            }
        });
    }
    void openSecondActivity(){
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("name","Ilhombek ");
        intent.putExtra("age","24");
        startActivity(intent);
    }
}