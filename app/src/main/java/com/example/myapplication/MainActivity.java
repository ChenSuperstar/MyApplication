package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvTitle;       //静态文本框
    private TextView tvResult;
    private EditText editInput = (EditText)findViewById(R.id.value_hint);     //定义文本框
    private String inputText = editInput.getText().toString();
    private Button btnC2F;          //定义按钮
    private Button btnF2C;
    private Button btnF2C_plus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}