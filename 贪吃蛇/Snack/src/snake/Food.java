package snake;

import java.util.Random;

/**
 * ClassName: Food
 * Package: snack
 * Description:
 *      食物要随机生成，需要一张图片来表示食物
 * @Author xu
 * @Create 2024/2/9 14:11
 * @Version 1.0
 */
public class Food {
    //所在的位置
    public static int X;
    public static int Y;

    private static Random random = new Random();
    public static void getFood(int[] snakeX,int[] snakeY ) {
        X = 25+25*random.nextInt(17);
        Y = 25+25*random.nextInt(16);
        for (int i = 0;i<SnakePanel.length;i++){
            if (snakeX[i]==X && snakeY[i]==Y){
                X = 25+25*random.nextInt(17);
                Y = 25+25*random.nextInt(16);
                //为了避免再次随机生成的位置和蛇身重合，将i重设为0，重新判断
                i = 0;
            }
        }
    }
}
