/*回文数 一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
*/
package Palindrome;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个五位数：");
        int n =in.nextInt();
        if(Judge(n))
            System.out.println("这个数字是回文数！");
        else
            System.out.println("这个数字不是回文数！");
    }
    static boolean Judge(int n){
        boolean flag = false;
        int[] a = new int[5]; //注意数组怎么定义和初始化
        int i = 0;
        do{
            a[i] = n%10;
            n = n/10;
            i++;
        }while (n!=0);
        if(a[0]==a[4]&&a[1]==a[3])
            flag = true;
        return flag;
    }
}
