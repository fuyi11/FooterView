package cn.fuyi.com.biaoqian;

/**
 * Created by marven on 2018/7/7.
 * 240902545@qq.com
 * 提交实体
 */

public class commitBean {
    private int tid;//题目id
    private String questionId;//答案id
    private int type;//类型  0 单选 1多选

    public commitBean(int tid, String questionId, int type) {
        this.tid = tid;
        this.questionId = questionId;
        this.type = type;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
