package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plus(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.textField1);
        String str1 = myTextField1.getText().toString();
        EditText myTextField2 = (EditText) findViewById(R.id.textField2);
        String str2 = myTextField2.getText().toString();

        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);
        int c = a+b;

        Intent intent = new Intent (this, answer.class);
        intent.putExtra("answer", Integer.toString(c));
        startActivity(intent);
    }

    public void minus(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.textField1);
        String str1 = myTextField1.getText().toString();
        EditText myTextField2 = (EditText) findViewById(R.id.textField2);
        String str2 = myTextField2.getText().toString();

        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);
        int c = a-b;

        Intent intent = new Intent (this, answer.class);
        intent.putExtra("answer", Integer.toString(c));
        startActivity(intent);
    }

    public void divide(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.textField1);
        String str1 = myTextField1.getText().toString();
        EditText myTextField2 = (EditText) findViewById(R.id.textField2);
        String str2 = myTextField2.getText().toString();

        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);
        int c = a/b;

        Intent intent = new Intent (this, answer.class);
        intent.putExtra("answer", Integer.toString(c));
        startActivity(intent);
    }

    public void multiply(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.textField1);
        String str1 = myTextField1.getText().toString();
        EditText myTextField2 = (EditText) findViewById(R.id.textField2);
        String str2 = myTextField2.getText().toString();

        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);
        int c = a*b;

        Intent intent = new Intent (this, answer.class);
        intent.putExtra("answer", Integer.toString(c));
        startActivity(intent);
    }
}