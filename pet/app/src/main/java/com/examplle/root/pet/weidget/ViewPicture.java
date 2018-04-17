package com.examplle.root.pet.weidget;

import android.content.Context;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;


import com.examplle.root.pet.Adapter.ViewPictureAdapter;
import com.examplle.root.pet.R;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by root on 18-2-26.
 */

public class ViewPicture extends RelativeLayout implements ViewPager.OnPageChangeListener {
    private LinearLayout dotGroup;
    private ViewPager viewPager;

    private ViewPictureAdapter viewPictureAdapter;
    Handler mHandler=new Handler();
    public ViewPicture(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.viewpicture, this);
        viewPager=findViewById(R.id.view_pager);
        dotGroup= view.findViewById(R.id.dotGroup);
        List<ImageView> mList = new ArrayList<>();
        int[] mImages = {R.mipmap.banner1, R.mipmap.banner2, R.mipmap.banner3, R.mipmap.banner4};
        for(int i = 0; i< mImages.length; i++){
            ImageView imageView=new ImageView(context);
            imageView.setImageResource(mImages[i]);
            mList.add(imageView);
            ImageView dot=new ImageView(context);
            dot.setImageResource(R.drawable.dot_selector);
            int dot_size=getResources().getDimensionPixelSize(R.dimen.dot_size);
            LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(dot_size,dot_size);
            if (i>0){
                params.leftMargin=getResources().getDimensionPixelSize(R.dimen.dot_margin);
                dot.setSelected(false);
            }else {
                dot.setSelected(true);
            }
            dot.setLayoutParams(params);
            dotGroup.addView(dot);
        }
        viewPictureAdapter=new ViewPictureAdapter();
        viewPictureAdapter.setList(mList);
        viewPager.setAdapter(viewPictureAdapter);
        viewPager.addOnPageChangeListener(this);
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                int currentPosition=viewPager.getCurrentItem();
                if(currentPosition==viewPager.getAdapter().getCount()-1){
                    viewPager.setCurrentItem(0);
                }else {
                    viewPager.setCurrentItem(currentPosition+1);
                }
                mHandler.postDelayed(this,3000);
            }
        },3000);
    }



    int lastPosition;
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        position=position%viewPictureAdapter.getList().size();
        dotGroup.getChildAt(position).setSelected(true);
        dotGroup.getChildAt(lastPosition).setSelected(false);
        lastPosition=position;
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
