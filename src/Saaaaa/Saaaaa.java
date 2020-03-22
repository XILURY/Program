/*求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
程序分析：关键是计算出每一项的值。
*
* */
package Saaaaa;
import java.util.Scanner;

public class Saaaaa {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入您想相加的次数:");
        int n = in.nextInt();
        System.out.println("请输入a的值:");
        int a = in.nextInt();
        count(a,n);
    }
    static void count(int a,int n){
        int s = a;
        int na = a;
        System.out.print("s="+a+"+");
        for(int i=2;i<=n;i++){
            na = (int) (na + a*Math.pow(10,i-1)); //这里是难点 草稿纸上画画应该能找出关系和规律
            s = s+na;
            if(i!=n){
                System.out.print(na+"+");
            }else{
                System.out.print(na+"="+s);
            }
        }
    }
}
