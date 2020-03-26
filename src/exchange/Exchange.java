/*交换位置有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
 * 用数组复制的方法 先扩大数组 再裁掉 我觉得相对简单
 * 两个错误让我花了很多时间 一个是hasNextInt，没有int 一直循环执行 另一个是数组的最后一个元素是n-1而不是n 浪费了很多时间
 * **输入数组之后如何输入一个数字？ 多次应用Scanner可以吗？
 */
package exchange;
import java.util.Arrays;
import java.util.Scanner;

public class Exchange {
    public static void main(String[] arg){
        System.out.print("请输入一组数：");
        Scanner scan = new Scanner(System.in).useDelimiter("\\s");
        int[] a = new int[50];
        int m = 0;
        while(scan.hasNextInt()){
            a[m++] = scan.nextInt();
        }
        scan.close();
        int[] b = new int[m];
        for(int i=0;i<m;i++)
            b[i] = a[i];
        // 测试移动5位
        int n = 5;
        System.out.println("原始数组为："+Arrays.toString(b));
        exchange(b,n);
        ///!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!玄学了 不知道为什么错了 运行不了 明明一样（可算找到了 微笑脸）
//        System.out.print("请输入一组数字：");
//        Scanner in= new Scanner(System.in).useDelimiter("\\s");
//        int[] a = new int[50];
//        int m = 0;
//        while(in.hasNext()){     ////！！错误 应该是hasNextInt少了几个单词 程序一直疯狂执行
//            a[m++] = in.nextInt();
//        }
//        in.close();
//        int[] na = new int[m];
//        for(int i=0;i<m;i++)
//            na[i] = a[i];
// /////////////!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!111
    }
    static void exchange(int[] a,int n){
        int len = a.length+n;
        int[] xa = Arrays.copyOf(a,len);
        //System.out.println(Arrays.toString(xa));
        for(int i=0;i<a.length;i++){
                xa[i+n] = a[i];
        }
        //System.out.println(Arrays.toString(xa));
        for(int i =0;i<n;i++){
            xa[i] = xa[len-n+i];    //!!注意 数组的最后一位是n-1 直接n会报溢出错误！！
        }
        //System.out.println(Arrays.toString(xa));
        int[] nxa = Arrays.copyOf(xa,len-n);
        System.out.println("移动后的数组为："+Arrays.toString(nxa));
    }

}
