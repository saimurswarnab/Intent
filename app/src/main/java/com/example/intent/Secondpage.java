package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Secondpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);
        Button btn2 = (Button) findViewById(R.id.btn2);
        TextView tv = findViewById(R.id.tv1);
        Intent intent = getIntent();
        String b = intent.getStringExtra("Key");
        tv.setText(b);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Secondpage.this,MainActivity.class);
                startActivity(intent2);


            }
        });
    }
}