package cn.fuyi.com.biaoqian;

/**
 * Created by marven on 2018/7/7.
 * 240902545@qq.com
 */

public class ItemBean {
    private int id;
    private String question;
    private boolean isCheck;
    private String itemName;
    public ItemBean(int id, String question, boolean isCheck) {
        this.id = id;
        this.question = question;
        this.isCheck = isCheck;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public boolean isCheck() {
        return isCheck;
    }

    public void setCheck(boolean check) {
        isCheck = check;
    }
}
