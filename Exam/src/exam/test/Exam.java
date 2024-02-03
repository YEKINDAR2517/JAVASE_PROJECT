package exam.test;

import exam.service.ItemService;
import exam.view.ExamView;

import java.io.File;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: Exam
 * Package: exam.test
 * Description:
 *       仿真实现一个基于文本界面的考试管理系统
 *          仿真实现基于文本界面的考试管理系统。
 *          应提供机上考试功能，并且能够自动判分。
 *          能够自动记录最后一次考试成绩。
 *          应尽量做到界面友好，操作方便。
 *          可选步骤，能够查询显示最后一次考试的答题情况和成绩。
 *
 *       Exam类 — 程序入口类(main方法)
 * @Author xu
 * @Create 2024/2/3 19:03
 * @Version 1.0
 */
public class Exam {
    public static void main(String[] args) {
        ExamView examView = new ExamView();
        examView.enterMainMenu();
    }
}
