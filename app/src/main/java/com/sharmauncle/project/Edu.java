package com.sharmauncle.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Edu extends AppCompatActivity {
Button be1,be2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edu);
        be1=findViewById(R.id.be1);
        be2=findViewById(R.id.be2);
        be1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Edu.this,Schls.class);
                startActivity(i);
            }
        });


        be2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Edu.this,Colleges.class);
                startActivity(i);
            }
        });
    }
}
