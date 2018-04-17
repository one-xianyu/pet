package com.examplle.root.pet;


import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private Fragment[] fragments;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragments=DataGenerator.getFragments("TabLayout");
        initView();
    }

    private void initView() {
        tabLayout=findViewById(R.id.tab_layout);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                onTabItemSelected(tab.getPosition());
//                for (int i=0;i<tabLayout.getTabCount();i++){
//                    if(i==tab.getPosition()){
//                    }else {
//                    }
//                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        tabLayout.addTab(tabLayout.newTab().setText(DataGenerator.mTabTitle[0]));;
        tabLayout.addTab(tabLayout.newTab().setText(DataGenerator.mTabTitle[1]));;
        tabLayout.addTab(tabLayout.newTab().setText(DataGenerator.mTabTitle[2]));;
        tabLayout.addTab(tabLayout.newTab().setText(DataGenerator.mTabTitle[3]));
    }
    private void onTabItemSelected(int position){
        Fragment fragment=null;
        switch (position){
            case 0:
                fragment=fragments[0];
                break;
            case 1:
                fragment=fragments[1];
                break;
            case 2:
                fragment=fragments[2];
                break;
            case 3:
                fragment=fragments[3];
                break;
        }
        if (fragment!=null){
            getSupportFragmentManager().beginTransaction().replace(R.id.home_container,fragment).commit();
        }
    }
}
