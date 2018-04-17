package com.examplle.root.pet.HTTPUtils;

import android.util.Log;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

/**
 * Created by Administrator on 2016/8/27 0027.
 */
public class MyHttpPost {
    // 服务器地址
    private static String SERVER = "http://10.0.2.2:8080";
    // 项目地址
    private static String PROJECT = "/MyPet/";
    private static final int REQUEST_TIMEOUT = 0;
    // 读取超时
    private static final int SO_TIMEOUT = 0;
//    public static String bannerHttpPost(String servlet,List<NameValuePair> params) {




    // 通过 POST 方式获取HTTP服务器数据
    public static String executeHttpPost(String servlet, List<NameValuePair> params) {
        String baseURL = SERVER + PROJECT + servlet;
        String responseMsg = "FAILED";
        try {
            //连接到服务器端相应的Servlet
            HttpPost request = new HttpPost(baseURL);
            request.setEntity(new UrlEncodedFormEntity(params, HTTP.UTF_8));
            BasicHttpParams httpParams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(httpParams, REQUEST_TIMEOUT);
            HttpConnectionParams.setSoTimeout(httpParams, SO_TIMEOUT);
            HttpClient client = new DefaultHttpClient(httpParams);
            HttpResponse response = client.execute(request);
            if(response.getStatusLine().getStatusCode()==200)//是否成功收取信息
                responseMsg = EntityUtils.toString(response.getEntity());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.i("tag", "MyHttpPost: responseMsg = " + responseMsg);
        return responseMsg;
    }
//        String baseURL = SERVER + PROJECT + servlet;
//
//        HttpURLConnection conn = null;
//        InputStream is = null;
//        try {
//            HttpPost request = new HttpPost(baseURL);
//            request.setEntity(new UrlEncodedFormEntity(params, HTTP.UTF_8));
//            BasicHttpParams httpParams = new BasicHttpParams();
//            HttpConnectionParams.setConnectionTimeout(httpParams, REQUEST_TIMEOUT);
//            HttpConnectionParams.setSoTimeout(httpParams, SO_TIMEOUT);
//            HttpClient client = new DefaultHttpClient(httpParams);
//            HttpResponse response = client.execute(request);
//            conn = (HttpURLConnection) new URL(baseURL).openConnection();
//            conn.setConnectTimeout(3000); // 设置超时时间
//            conn.setReadTimeout(3000);
//            conn.setDoInput(true);
//            conn.setRequestMethod("GET"); // 设置获取信息方式
//            conn.setRequestProperty("Charset", "UTF-8"); // 设置接收数据编码格式
//
//            if (conn.getResponseCode() == 200) {
//                is = conn.getInputStream();
//                return parseInfo(is);
//            }
//            return null;
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            // 意外退出时进行连接关闭保护
//            if (conn != null) {
//                conn.disconnect();
//            }
//            if (is != null) {
//                    try {
//                        is.close();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//            }
//        }
//        return "error";
//    }
//    public static String parseInfo(InputStream inStream) throws Exception {
//        byte[] data = read(inStream);
//        // 转化为字符串
//        return new String(data, "UTF-8");
//    }
//
//    // 将输入流转化为byte型
//    public static byte[] read(InputStream inStream) throws Exception {
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        byte[] buffer = new byte[1024];
//        int len = 0;
//        while ((len = inStream.read(buffer)) != -1) {
//            outputStream.write(buffer, 0, len);
//        }
//        inStream.close();
//        return outputStream.toByteArray();
//    }
}
