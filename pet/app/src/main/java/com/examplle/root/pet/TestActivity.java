package com.examplle.root.pet;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.examplle.root.pet.Services.MemberService;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class TestActivity extends AppCompatActivity {
     Button test;
    Handler handler;
    TextView te;
    ImageView im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        test = findViewById(R.id.btn_test);
        te=findViewById(R.id.text_test);
        im = findViewById(R.id.test_image);
        test.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                new memThread().start();
            }
        });
        handler = new Handler() {
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                if (msg.what == 11) {  // 处理发送线程传回的消息
//            te.setText(msg.toString());
                  Bitmap bitmap =(Bitmap) msg.obj;
               im.setImageBitmap(bitmap);
                }
            }


        };

    }

    private class memThread extends Thread{
        public void run() {
            List<NameValuePair> params = new ArrayList<NameValuePair>();
            params.add(new BasicNameValuePair("dowhat", "query"));
            String memlist=MemberService.getList(params);
            try {
                JSONObject memberJson = new JSONObject(memlist);
                JSONArray memberList = memberJson.getJSONArray("memlist");

                Message msg = handler.obtainMessage();
                // 设置消息默认值
                msg.what = 11;
                 String image=memberList.getJSONObject(0).getString("image").toString();
                System.out.println("==");
                System.out.println(image);
                byte[]bitmapArray;
                bitmapArray = Base64.decode(image,Base64.NO_PADDING);
                Bitmap bitmap = BitmapFactory.decodeByteArray(bitmapArray,0,bitmapArray.length);
               // msg.obj=memlist;
                msg.obj = bitmap;
               // System.out.println(msg);
                handler.sendMessage(msg);
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
    }
}
