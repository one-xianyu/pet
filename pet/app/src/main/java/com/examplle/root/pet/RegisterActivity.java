package com.examplle.root.pet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    private EditText username;
    private EditText phone;
    private EditText email;
    private EditText password;
    private EditText confirm_password;
    private Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username=findViewById(R.id.register_et_name);
        phone=findViewById(R.id.register_et_phone);
        email=findViewById(R.id.register_et_email);
        password=findViewById(R.id.register_et_password);
        confirm_password=findViewById(R.id.register_et_confirm);
        register=findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
