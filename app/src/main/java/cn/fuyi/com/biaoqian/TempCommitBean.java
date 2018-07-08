package cn.fuyi.com.biaoqian;

/**
 * Created by marven on 2018/7/8.
 * 240902545@qq.com
 */

public class TempCommitBean {
    private int tid;
    private int questionId;

    public TempCommitBean(int tid, int questionId) {
        this.tid = tid;
        this.questionId = questionId;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }
}
