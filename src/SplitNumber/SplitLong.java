/*取一个整数a从右端开始的4～7位
*toCharArray()将字符串转化成字符数组 再输出
* 答案多了一部把long转化成String的过程 Long.toString(xxx)
*/
package SplitNumber;

import java.util.Arrays;
import java.util.Scanner;

public class SplitLong {
    public static void main(String[] arg){
        System.out.println("请输入一个数字（不少于7位数）：");
        Scanner in = new Scanner(System.in);
        String  num = in.nextLine();
        try{
            SplitLong(num);
        }catch (Exception e){
            System.out.println("输入错误");
        }
    }
    static void SplitLong(String num){
        char[] a = num.toCharArray();
        System.out.println(a[7]);
        int xx = a.length; //获取字符数组的长度
        System.out.println("该整数从右往左第4-7位为："+a[xx-4]+" "+a[xx-5]+" "+a[xx-6]+" "+a[xx-7]);
    }
}
