/*将一个偶数表示为两个素数之和
*本题知识点比较多 尤其是数组链表的使用
* 答案给的方法虽然看似简单 但是给出的结果不全
 */
package SplitNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SplitOdd {
    public static void main(String[] arg){
        System.out.println("请输入一个偶数：");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        split(n);
    }
    // 将偶数分为两个素数的方法（限制了输入的数不超过1000）
    static void split(int n){
        ArrayList<Integer> a = new ArrayList<>();
        Integer num = 0;
        // 将这个范围内的所有素数填入数组列表中
        for(int i=1;i<1000;i++){
            if(isPrime(i)){
                num = i;
                a.add(num);
            }
        }
        a.trimToSize(); //删除数组链表中空的部分（此处不需要，因为没有预先定义）
        Integer[] na = new Integer[a.size()];
        a.toArray(na); //将数组链表转换成数组 注意定义数组时要用类Integer 不能用int
        // System.out.println(Arrays.toString(na));  // 输出数组看对不对
        // 循环数组 找两数相加正好为n的数
        for(int i=0;i<na.length;i++){
            for(int j=i; j<na.length;j++){
                if(na[i]+na[j] == n)
                    System.out.println(n+"="+na[i]+"+"+na[j]);
            }
        }
    }
    // 判断是否是素数
    static boolean isPrime(int n){
        boolean flag = true;
        if (n==1)
            return false;
        if(n==2 || n==3){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
