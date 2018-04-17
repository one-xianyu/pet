package com.test.pet.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.test.pet.Service.LoginPostService;
import com.test.pet.R;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;

public class LoginActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button register;
    private Button login;
    Handler handler;
    static int LOGIN_FAILED = 0;
    static int LOGIN_SUCCEEDED = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username=findViewById(R.id.login_et_name);
        password=findViewById(R.id.login_et_password);
        register=findViewById(R.id.login_bt_register);
        login=findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new LoginPostThread(username.getText().toString(),
                        password.getText().toString()).start();

            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
        handler = new Handler() {
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                if (msg.what == 111) {  // 处理发送线程传回的消息
                    if(msg.obj.toString().equals("SUCCEEDED")){
                        //跳转
                        Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(LoginActivity.this, "账号和密码不匹配", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        };

    }

public class LoginPostThread extends Thread {
    public String id, password;

    public LoginPostThread(String id, String password) {
        this.id = id;
        this.password = password;
    }

    @Override
    public void run() {
        // Sevice传回int
        int responseInt = 0;
        if(!id.equals("")) {
            // 要发送的数据
            List<NameValuePair> params = new ArrayList<NameValuePair>();
            params.add(new BasicNameValuePair("name", id));
            params.add(new BasicNameValuePair("password",password));
            params.add(new BasicNameValuePair("dowhat", "login"));
            // 发送数据，获取对象
            responseInt = LoginPostService.send(params);
            Log.i("tag", "LoginActivity: responseInt = " + responseInt);
            // 准备发送消息
            Message msg = handler.obtainMessage();
            // 设置消息默认值
            msg.what = 111;
            // 服务器返回信息的判断和处理
            if(responseInt == LOGIN_FAILED) {
                msg.obj = "FAILED";
            }else if(responseInt == LOGIN_SUCCEEDED) {
                msg.obj = "SUCCEEDED";
            }
            handler.sendMessage(msg);

        }
    }
}
}
