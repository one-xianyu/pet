package com.examplle.root.pet.Services;

import com.examplle.root.pet.HTTPUtils.MyHttpPost;

import org.apache.http.NameValuePair;

import java.util.List;

/**
 * Created by asus on 2018/3/19.
 */

public class MemberService {




    public static String getList(List<NameValuePair> params) {
        return MyHttpPost.executeHttpPost("MemberServlet",params);
    }
}
