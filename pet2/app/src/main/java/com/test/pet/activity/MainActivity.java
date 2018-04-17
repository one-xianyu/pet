package com.test.pet.activity;

import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.test.pet.R;
import com.test.pet.adapter.MainViewPagerAdapter;
import com.test.pet.fragment.HomeFragment;
import com.test.pet.fragment.MallFragment;
import com.test.pet.fragment.MyFragment;
import com.test.pet.fragment.PetCircleFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity implements RadioGroup.OnCheckedChangeListener{

    private List<Fragment> fragmentList;
    private ViewPager mViewPager;
    private RadioGroup radioGroup;
    private RadioButton mHomeButton;
    private RadioButton mMallButton;
    private RadioButton mPetCircleButton;
    private RadioButton mMyButton;
    private MainViewPagerAdapter viewPagerAdapter;

    @Override
    public int getResId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        mViewPager = (ViewPager) findViewById(R.id.mViewPager);
        radioGroup = (RadioGroup) findViewById(R.id.mRadioGroup);

        mHomeButton = (RadioButton) findViewById(R.id.mHomeButton);
        mMallButton = (RadioButton) findViewById(R.id.mMallButton);
        mPetCircleButton = (RadioButton) findViewById(R.id.mPetCircleButton);
        mMyButton = (RadioButton) findViewById(R.id.mMyButton);
        radioGroup.setOnCheckedChangeListener(this);

        changeImageSize();
    }

    @Override
    public void initData() {
        initFragment();
        viewPagerAdapter = new MainViewPagerAdapter(getSupportFragmentManager(), fragmentList);
        mViewPager.setAdapter(viewPagerAdapter);
        mViewPager.setCurrentItem(0); //默认加载第一页
        mViewPager.setOffscreenPageLimit(3); //预加载4个
    }

    /**
     * 点击底部按钮改变页面
     * @param radioGroup
     * @param checkedId
     */
    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
        switch (checkedId){
            case R.id.mHomeButton : //首页
                mViewPager.setCurrentItem(0);
                break;
            case R.id.mMallButton: //商城
                mViewPager.setCurrentItem(1);
                break;
            case R.id.mPetCircleButton: //宠圈
                mViewPager.setCurrentItem(2);
                break;
            case R.id.mMyButton:  //我的
                mViewPager.setCurrentItem(3);
                break;
        }
    }

    /**
     * 初始化界面(首页、分类、发布、好友、我的)
     */
    private void initFragment() {
        fragmentList = new ArrayList<>();
        HomeFragment homeFragment = new HomeFragment();
        MallFragment mallFragment = new MallFragment();
        PetCircleFragment petCircleFragment = new PetCircleFragment();
        MyFragment myFragment = new MyFragment();

        fragmentList.add(homeFragment);
        fragmentList.add(mallFragment);
        fragmentList.add(petCircleFragment);
        fragmentList.add(myFragment);
    }

    /**
     * 定义底部标签图片大小
     */
    private void changeImageSize() {
        Drawable drawableHome = getResources().getDrawable(R.drawable.radio_home_seector);
        drawableHome.setBounds(0,0,80,80);    //第一0是距左右边距离，第二0是距上下边距离，第三长度,第四宽度
        mHomeButton.setCompoundDrawables(null,drawableHome,null,null);   //只放上面

        Drawable drawableCategory = getResources().getDrawable(R.drawable.radio_mall_seector);
        drawableCategory.setBounds(0,0,80,80);    //第一0是距左右边距离，第二0是距上下边距离，第三长度,第四宽度
        mMallButton.setCompoundDrawables(null,drawableCategory,null,null);   //只放上面

        Drawable drawableFriend = getResources().getDrawable(R.drawable.radio_pet_circle_seector);
        drawableFriend.setBounds(0,0,80,80);    //第一0是距左右边距离，第二0是距上下边距离，第三长度,第四宽度
        mPetCircleButton.setCompoundDrawables(null,drawableFriend,null,null);   //只放上面

        Drawable drawableMy = getResources().getDrawable(R.drawable.radio_my_seector);
        drawableMy.setBounds(0,0,80,80);    //第一0是距左右边距离，第二0是距上下边距离，第三长度,第四宽度
        mMyButton.setCompoundDrawables(null,drawableMy,null,null);   //只放上面

    }
}
