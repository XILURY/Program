/**输入三个整数x,y,z，请把这三个数由小到大输出。
 程序分析：我们想办法把最小的数放到x上，先将x与y进行比较，如果x>y则将x与y的值进行交换，然后再用x与z进行比较，如果x>z则将x与z的值进行交换，这样能使x最小。
 *参考答案没有我的方法简单和快速
 * **掌握数组的初始化 输出和排序 及for-each的使用
 */
package Sort;
import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in).useDelimiter("\\s");
        System.out.println("请输入三个整数（空格间隔）：");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int a[] = {x,y,z}; //数组初始化的方式 把三个数填到数组里面
        Arrays.sort(a); //对数组元素快速排序 从小到大
        System.out.println(Arrays.toString(a)); //不能直接输出数组 通过toString实现 输出[x,y,z]
        System.out.print("三个数字从小到大排列为：");
        for(int element:a){
            System.out.print(element+" ");
        }
    }
}
