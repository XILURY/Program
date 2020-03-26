/*四位数加密算法
*故意做复杂了 复习数字转字符串转字符数组转整型的方法
* Integer.parseInt(String.valueOf(c)) 字符转整型
 */
package  EncryptionAlgorithm;
import java.util.Scanner;

public class EncryptionAlgorithm {
    public static void main(String[] arg){
        System.out.println("请输入四位数密码：");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("未加密前的密码是："+n);
        String s = String.valueOf(n);
        char[] a = s.toCharArray();
        int[] na = new int[4];
        for(int i=0;i<a.length;i++){
            na[i] = countNew(a[i]);
        }
        int temp =0;
        temp = na[0];
        na[0] = na[3];
        na[3] = temp;
        temp = na [1];
        na[1] = na[2];
        na[2] = temp;
        for(int e:na)
            System.out.print(e);
    }
    //转换
    static int countNew(char c){
        int d = Integer.parseInt(String.valueOf(c)); //讲字符串转变成整型
        int nd = (d+5)%10;
        return nd;
    }
}
