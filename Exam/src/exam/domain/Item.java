package exam.domain;

import java.util.Arrays;

/**
 * ClassName: Item
 * Package: exam.domain
 * Description:
 * Item类 — 表示考试题目类，每个Item对象对应一道题目
 *
 * @Author xu
 * @Create 2024/2/3 19:05
 * @Version 1.0
 */
public class Item {
    private String question;
    private String[] options;
    private char answer;

    public Item(String question, String[] options, char answer) {
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    public Item() {
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public char getAnswer() {
        return answer;
    }

    public void setAnswer(char answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return question + '\n' +
                options[0] + '\n' +
                options[1] + '\n' +
                options[3] + '\n' +
                options[4] + '\n' +
                "正确答案:" + answer;
    }
}
