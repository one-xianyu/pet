package com.test.pet.fragment;


import android.app.Application;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.test.pet.R;
import com.test.pet.adapter.FosterListAdapter;
import com.test.pet.bean.FosterInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * 首页界面
 */
public class HomeFragment extends Fragment {
    private String mFrom;
    private Application application;

    public static HomeFragment newInstance(String from) {
        HomeFragment fragment = new HomeFragment();
        Bundle bundle = new Bundle();
        bundle.putString("from", from);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mFrom = getArguments().getString("from");
        }
    }

    private List<FosterInfo> fosterInfos;
    private FosterListAdapter fosterListAdapter;
    private ListView foster_lv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, null);
        foster_lv = view.findViewById(R.id.home_lv);
        fosterInfos = new ArrayList<>();
        getData(fosterInfos);
        fosterListAdapter = new FosterListAdapter(getActivity(), fosterInfos);
        foster_lv.setAdapter(fosterListAdapter);
        return view;
    }

    private void getData(List<FosterInfo> fosterInfos) {
        for (int i = 0; i < 10; i++) {
            FosterInfo fosterInfo = new FosterInfo();
            fosterInfo.setName("Tom");
            fosterInfo.setAddress("America");
            fosterInfos.add(fosterInfo);
        }
    }
}

