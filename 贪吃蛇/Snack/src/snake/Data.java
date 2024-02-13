package snake;

import javax.swing.*;
import java.net.URL;

/**
 * ClassName: Data
 * Package: snack
 * Description:
 *      加载静态资源
 *      游戏需要加载贪吃蛇的蛇头和蛇身，用不同的图片表示，蛇头又需要四个方向的蛇头
 *      通过URL类代表了一个统一的定位符，getResource表示获取Java文件，
 *      使用位于javax.swing包中的ImageIcon类，可以根据image绘制icon
 * @Author xu
 * @Create 2024/2/13 21:00
 * @Version 1.0
 */
public class Data {
    //贪吃蛇头部
    public static URL upUrl = Data.class.getResource("/statics/up.png");
    public static ImageIcon up = new ImageIcon(upUrl);
    public static URL downUrl = Data.class.getResource("/statics/down.png");
    public static ImageIcon down = new ImageIcon(downUrl);
    public static URL leftUrl = Data.class.getResource("/statics/left.png");
    public static ImageIcon left = new ImageIcon(leftUrl);
    public static URL rightUrl = Data.class.getResource("/statics/right.png");
    public static ImageIcon right = new ImageIcon(rightUrl);
    //贪吃蛇的身体
    public static URL bodyUrl = Data.class.getResource("/statics/body.png");
    public static ImageIcon body = new ImageIcon(bodyUrl);
    //food
    public static URL foodUrl = Data.class.getResource("/statics/food.png");
    public static ImageIcon food = new ImageIcon(foodUrl);
}
