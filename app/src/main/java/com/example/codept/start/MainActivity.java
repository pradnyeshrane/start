package com.example.codept.start;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log();
        Reg();




    }



    public void Log() {
        btn = (Button) findViewById(R.id.login);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent("com.example.codept.start.Login");
                startActivity(intent);

            }
        });
    }



    public void Reg(){
        btn =(Button)findViewById(R.id.register);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent("com.example.codept.start.Register");
                startActivity(intent);

            }
        });



    }
}
