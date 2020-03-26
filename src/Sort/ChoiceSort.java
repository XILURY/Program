/**选择排序 输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
 ***注意 数组的复制必须用copyOf 不能直接等 否则只是引用
 */
package Sort;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChoiceSort {
    public static void main(String[] arg){
        Logger.getGlobal().setLevel (Level.OFF);
        int[] a = new int[]{52,58,27,16,12,35,58,32,12,39};
        System.out.println("原始数组为："+Arrays.toString(a));
//        int[] b = a;  // 错误！ 仅代表两个变量引用同一个数组 并没有实现拷贝 一旦对b进行排序 实质上a也会变
        int[] b = Arrays.copyOf(a,a.length); //将一个数组的所有值拷贝到一个新的数组中去，就要使用Arrays类的copyOf 方法：
        Arrays.sort(b);
        int min = b[0];  // 找出数组中的最小数
        int max = b[b.length-1]; //找出数组中的最大数
        for(int i=0;i<a.length;i++){
            if(a[i] == max){
                a[i] = a[a.length-1];
                a[a.length-1] = max;
                Logger.getGlobal().info(a[i]+ " "+ i);
            }
            if(a[i] == min){
                a[i] = a[0];
                a[0] = min;
                Logger.getGlobal().info(a[i]+ " "+ i);
            }
        }
        System.out.println("选择排序后的数组为："+Arrays.toString(a));
    }
}
