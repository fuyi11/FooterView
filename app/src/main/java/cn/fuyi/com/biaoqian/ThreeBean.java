package cn.fuyi.com.biaoqian;

import java.util.List;

/**
 * Created by marven on 2018/7/7.
 * 240902545@qq.com
 */

public class ThreeBean {
    private String topicName;
    private int id;
    private List<ThreeItemBean> option;

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ThreeItemBean> getOption() {
        return option;
    }

    public void setOption(List<ThreeItemBean> option) {
        this.option = option;
    }
}
