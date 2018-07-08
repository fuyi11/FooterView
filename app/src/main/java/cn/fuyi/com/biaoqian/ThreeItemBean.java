package cn.fuyi.com.biaoqian;

/**
 * Created by marven on 2018/7/7.
 * 240902545@qq.com
 */

public class ThreeItemBean {
    private int id;
    private String optionName;

    public ThreeItemBean(int id, String optionName) {
        this.id = id;
        this.optionName = optionName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }
}
