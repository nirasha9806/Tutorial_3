package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

        public void sendMessage(View view) {
            Intent intent = new Intent(this, SecondActivity.class);
            EditText editText1 = (EditText)findViewById(R.id.num1);

            String msg1 = editText1.getText().toString();

            EditText editText2 = (EditText)findViewById(R.id.num2);
            String msg2 = editText2.getText().toString();
            intent.putExtra("num1", msg1);
            intent.putExtra("num2", msg2);

            startActivity(intent);



            //Creating the LayoutInflater instance
            LayoutInflater li = getLayoutInflater();

            //Getting the View object as defined in the custom_toast.xml file
            View layout = li.inflate(R.layout.custom_toast, (ViewGroup)
                    findViewById(R.id.custom_toast_layout));

            //Creating the Toast object
            Toast toast = new Toast(getApplicationContext());
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setView(layout);//setting the view of custom toast layout
            toast.show();

        }

}
