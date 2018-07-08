package cn.fuyi.com.biaoqian;

import java.util.List;

/**
 * Created by marven on 2018/7/7.
 * 240902545@qq.com
 */

public class TestBean {
    private int type;
    private String title;
    private int tid;
    private List<ItemBean> result;

    public TestBean(int type, String title, int tid, List<ItemBean> result) {
        this.type = type;
        this.title = title;
        this.tid = tid;
        this.result = result;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public List<ItemBean> getResult() {
        return result;
    }

    public void setResult(List<ItemBean> result) {
        this.result = result;
    }
}
