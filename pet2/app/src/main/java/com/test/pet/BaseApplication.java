package com.test.pet;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import java.util.LinkedList;
import java.util.List;

/**
 * 作者：
 * 时间：2018/3/19:18:50
 * 描述：
 */

public class BaseApplication extends Application {

    public static BaseApplication instance;
    private List<Activity> activityList = new LinkedList<Activity>();
    private static Context context;

    public BaseApplication() {
        super();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        context = getApplicationContext();

    }

    public static BaseApplication getApplication() {
        if (instance == null) {
            instance = new BaseApplication();
        }
        return instance;
    }

    /**
     * 获取上下文
     * @return
     */
    public static Context getContext() {
        return context;
    }

    /**
     * 将activity添加到集合中
     * @param activity
     */
    public void addActivity(Activity activity) {
        activityList.add(activity);
    }

    /**
     * 移除activity
     * @param activity
     */
    public void removeActivity(Activity activity) {
        activityList.remove(activity);
    }

    /**
     * 清除所有activity出栈
     */
    public void clearActivityList() {
        for (Activity activity : activityList) {
            activity.finish();
        }
        activityList.clear();
    }

    public List<Activity> getActivityList() {
        return activityList;
    }

    /**
     * 退出
     */
    public void exit() {
        for (Activity activity : activityList) {
            activity.finish();
        }
    }
}
