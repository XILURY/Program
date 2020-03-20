/*有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....
*
善于看到本质内容 题目本身只是个斐波那契数列的运算。后一个数等于前两个数之和 按照此思路即可求解
注意：int的最大范围是2^31-1=2147483647,当过大时 应该使用大数值。大数值计算时速度比较慢 n=50时就要等好久
***程序调试 成功通过
* */
package RabitNumber;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.logging.Logger;

public class RabitNumber {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入当前月份：");
        int n = in.nextInt();
        System.out.println("第"+n+"个兔子的数量是"+numberCount(n));
    }
     private static BigInteger numberCount(int n){ //n较大时 返回值会比较大 采用大数值
        if (n<3){
            return BigInteger.valueOf(1);
        }
        else{
            return numberCount(n-1).add(numberCount(n-2));
        }
    }
}
