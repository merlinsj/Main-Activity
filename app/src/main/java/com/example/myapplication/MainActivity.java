package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
  EditText t1,t2,t3,t4,t5,t6;
  AppCompatButton b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        t1=(EditText) findViewById(R.id.emcode);
        t2=(EditText) findViewById(R.id.name);
        t3=(EditText) findViewById(R.id.desgn);
        t4=(EditText) findViewById(R.id.cname);
                t5=(EditText) findViewById(R.id.sal);
                t6=(EditText) findViewById(R.id.mobno);

        b1=(AppCompatButton) findViewById(R.id.reg);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Toast.makeText(getApplicationContext(),"saving",Toast.LENGTH_LONG).show();
            }
        });
    }
}