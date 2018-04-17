package com.test.pet.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 *
 * Created by root on 18-2-26.
 */

public class ViewPictureAdapter extends PagerAdapter {

    private static List<ImageView> List;

    //获取滑动空间的数量，设为最大值后可无限向右滑动
    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }

    //框架里用来判断view的id是不是这个object
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    //初始化
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        position=position%List.size();
        container.addView(List.get(position));
        return List.get(position);
    }

    //因为PagerAdapter里只缓存三张图片，如果超出范围，则调用此方法销毁
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
//        super.destroyItem(container, position, object);
        container.removeView((View) object);
    }

    public List<ImageView> getList() {
        return List;
    }

    public void setList(List<ImageView> List) {
        ViewPictureAdapter.List = List;
    }
}
