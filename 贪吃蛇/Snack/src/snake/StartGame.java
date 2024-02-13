package snake;

import javax.swing.*;

/**
 * ClassName: StartGame
 * Package: snack
 * Description:
 *      创建一个500*500大小的游戏界面，这里使用JFrame类实现，窗口设置居中。
 * @Author xu
 * @Create 2024/2/13 21:00
 * @Version 1.0
 */
public class StartGame {
    public static void main(String[] args) {
        //标题
        JFrame jFrame = new JFrame("贪吃蛇");
        //窗口大小
        jFrame.setSize(500,500);
        //窗口设置居中
        jFrame.setLocationRelativeTo(null);
        //固定窗口大小
        jFrame.setResizable(false);
        //设置窗口关闭事件
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //添加游戏内容
        jFrame.add(new SnakePanel());
        //设置窗口可见
        jFrame.setVisible(true);

    }
}
