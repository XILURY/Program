/*有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....
*
善于看到本质内容 题目本身只是个斐波那契数列的运算。后一个数等于前两个数之和 按照此思路即可求解
*
* */
package RabitNumber;
import java.util.Scanner;

public class RabitNumber {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入当前月份：");
        int n = in.nextInt();
        System.out.println("第"+n+"个兔子的数量是"+numberCount(n));
    }
     private static int numberCount(int n){
        if (n<3){
            return 1;
        }
        else{
            return numberCount(n-1)+numberCount(n-2);
        }
    }
}
