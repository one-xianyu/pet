package com.test.pet.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.test.pet.R;
import com.test.pet.bean.FosterInfo;

import java.util.List;

/**
 * Created by root on 18-3-7.
 */

public class FosterListAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private List<FosterInfo> fosterInfos;
    protected Context context;

    public FosterListAdapter(Context context, List<FosterInfo> fosterInfos) {
        setData(fosterInfos);
        this.context = context;
        this.inflater=LayoutInflater.from(context);
    }

    public void setData(List<FosterInfo> fosterInfos){
        this.fosterInfos=fosterInfos;
    }
    @Override
    public int getCount() {
        return fosterInfos.size();
    }

    @Override
    public Object getItem(int i) {
        return fosterInfos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        FosterInfo fosterInfo=fosterInfos.get(i);
        if(view==null){
            view=inflater.inflate(R.layout.foster_info_item,null);
        }
        // TODO: 18-3-7 :在这里填写寄养师信息
        return view;
    }
}
