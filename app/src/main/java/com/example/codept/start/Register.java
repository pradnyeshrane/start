package com.example.codept.start;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
 public static Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        register();

    }
    public void register(){
        final EditText uname=(EditText)findViewById(R.id.uname);
        final EditText upassword=(EditText)findViewById(R.id.pass);
        final EditText pass1=(EditText)findViewById(R.id.pass1);
        final EditText phone=(EditText)findViewById(R.id.phone);
        btn=(Button)findViewById(R.id.subr);

        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                if(upassword.getText().toString().equals(pass1.getText().toString()))
                {
                    Toast.makeText(Register.this, " Username:"+uname.getText().toString()+"\nPhoneno: "+phone.getText().toString(), Toast.LENGTH_LONG).show();
                }
                else
                    Toast.makeText(Register.this, " incorrect password", Toast.LENGTH_LONG).show();

            }
    });
}
}
