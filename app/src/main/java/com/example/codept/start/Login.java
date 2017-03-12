package com.example.codept.start;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private static Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login();

    }
    public void login(){
        final EditText uname=(EditText)findViewById(R.id.uname);
        final EditText upass=(EditText)findViewById(R.id.pass);
        btn=(Button)findViewById(R.id.submit);

        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                if((uname.getText().toString().equals("admin"))&&(upass.getText().toString().equals("admin")))
                {
                    Toast.makeText(Login.this, "Login successfull", Toast.LENGTH_LONG).show();
                }
                else
                    Toast.makeText(Login.this, "Login unsuccessfull", Toast.LENGTH_LONG).show();

            }
        });

    }



}
