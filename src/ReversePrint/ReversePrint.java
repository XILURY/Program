/*倒序打印。给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
***题目本身不难 但是在剥离数字的时候花了时间比较多 参考答案的方法比较好 建议学习
* */
package ReversePrint;
//import java.util.Scanner;
//public class ReversePrint {
//    public static void main(String[] arg){
//        Scanner in = new Scanner(System.in);
//        System.out.print("请输入一个整数：");
//        int num = in.nextInt();
//        System.out.println("您输入的数字是"+Judge(num)+"位数，它的倒序输出是"+print(num));
//    }
//    //判断是几位数
//    static int Judge(int num){
//        int n = 0;
//        int x = 0; //初始化位数
//        for(int i=10;i>0;i--){   //此处的i的值可以控制输入最大多少位 目前是10位
//            n = (int)(num/(Math.pow(10,i-1)));
//            if(n!=0){
//                x = i;
//                break;
//            }
//        }
//        return x;
//    }
//    //倒序输出
//    static int print(int num){
//        int nnum = 0; //初始化倒序后的数字
//        int xx = num; //复制
//        int xi = 0; //初始化剥离数字
//        int x = Judge(num); //获得位数
//        for(int i=1;i<=x;i++){
//            xi = xx%10;
//            xx = xx/10;
//            //System.out.println(xi); //测试剥离各个数字是否正确
//            nnum = nnum + xi*(int)(Math.pow(10,x-i));
//        }
//        return nnum;
//    }
//}

//参考答案很简单 使用数组 简单很多
import java.util.Scanner;
public class ReversePrint{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("请输入数字（0-9999）：");
        int n = in.nextInt();
        int i = 0;
        int[] a = new int[5];
        do{
            a[i] = n%10;
            n /= 10;
            i++;
        }while(n!=0);
        System.out.print("这是一个"+i+"位数，倒序输出为：");
        for(int j=0;j<i;j++)
            System.out.print(a[j]);
    }
}