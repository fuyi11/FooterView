package cn.fuyi.com.biaoqian;

import java.util.List;

/**
 * Created by marven on 2018/7/7.
 * 240902545@qq.com
 */

public class GengBean {

    private List<ThreeBean> guide;
    private List<OneBean> labelQuestion;
    private List<TwoBean> labelQuestionTwo;

    public List<ThreeBean> getGuide() {
        return guide;
    }

    public void setGuide(List<ThreeBean> guide) {
        this.guide = guide;
    }

    public List<OneBean> getLabelQuestion() {
        return labelQuestion;
    }

    public void setLabelQuestion(List<OneBean> labelQuestion) {
        this.labelQuestion = labelQuestion;
    }

    public List<TwoBean> getLabelQuestionTwo() {
        return labelQuestionTwo;
    }

    public void setLabelQuestionTwo(List<TwoBean> labelQuestionTwo) {
        this.labelQuestionTwo = labelQuestionTwo;
    }
}
