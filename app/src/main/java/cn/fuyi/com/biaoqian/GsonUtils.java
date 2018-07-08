package cn.fuyi.com.biaoqian;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.util.ArrayList;

/**
 * Created by marven on 2018/7/7.
 * 240902545@qq.com
 */

public class GsonUtils {
    public static <T> T getPerson(Class<T> cls, String jsonString) {
        T t = null;
        try {
            Gson gson = new Gson();
            t = gson.fromJson(jsonString, cls);
        } catch (Exception e) {
        }
        return t;
    }
}
