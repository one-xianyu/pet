package com.test.pet.activity;

import android.app.Dialog;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.test.pet.BaseApplication;
import com.test.pet.R;


/**
 * activity的基类
 */

public abstract class BaseActivity extends FragmentActivity {

    /**
     * 加载布局
     * @return
     */
    public abstract int getResId();

    /**
     * 初始化布局
     */
    public abstract void initView();

    /**
     * 初始化数据
     */
    public abstract void initData();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BaseApplication.getApplication().addActivity(this);
        if (getResId() > 0) {
            setContentView(getResId());
        }

        initView();
        initData();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        BaseApplication.getApplication().removeActivity(this);
    }

    public void showTAG(String toast) {
        Log.e("控制台输出信息：", toast);
    }

    public void ToastView(String msg) {
        Toast toast = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT);
        toast.show();
    }

}
