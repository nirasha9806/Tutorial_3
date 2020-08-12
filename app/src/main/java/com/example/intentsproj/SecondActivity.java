package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView resultText;
    int n1,n2,result;
    Button add,sub,multiply,divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //toast
        Context context = getApplicationContext(); //The context to use. Usually your Application or Activity object
        CharSequence message = "You just clicked the OK button"; //Display string
        int duration = Toast.LENGTH_SHORT; //How long the toast message will lasts
        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
        toast.setGravity(Gravity.TOP | Gravity.LEFT, 300, 300);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        final String num1 =intent.getStringExtra("num1");
        final String num2 =intent.getStringExtra("num2");

        // Capture the layout's TextView and set the string as its text
        final TextView textView1 = (TextView)findViewById(R.id.num3);
        textView1.setText(num1);

        final TextView textView2 = (TextView)findViewById(R.id.num4);
        textView2.setText(num2);

        //capture layout's views
        resultText = findViewById(R.id.result);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);

        //convert String values to integers
        n1 = Integer.parseInt(num1);
        n2 = Integer.parseInt(num2);

        //add method
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = n1+n2;
                resultText.setText(num1 + "+" + num2+ "=" + String.valueOf(result));
            }
        });

        //subtract method
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = n1-n2;
                resultText.setText(num1 + "-" + num2 + "=" + String.valueOf(result));
            }
        });

        //multiply method
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = n1*n2;
                resultText.setText(num1 + "*" + num2 + "=" + String.valueOf(result));
            }
        });

        //divide method
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = n1/n2;
                resultText.setText(num1 + "/" + num2+ "=" + String.valueOf(result));
            }
        });

    }
}