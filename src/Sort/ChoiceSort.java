/**选择排序 输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
 ***注意 数组的复制必须用copyOf 不能直接等 否则只是引用
 * **答案给出了一种从键盘输入数组的方式 此处也加进来了
 */
package Sort;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChoiceSort {
    public static void main(String[] arg){
        Logger.getGlobal().setLevel (Level.OFF);
        System.out.println("请输入一组数：");
        Scanner scan = new Scanner(System.in).useDelimiter("\\s");
        int[] a = new int[50];  //预先初始化一个数组大小 其不超过50个数
        int m = 0;  // 数组角标
        while(scan.hasNextInt()){
            a[m++] = scan.nextInt(); // 当检测到到还有输入时不断赋值
        }
        scan.close();
        int[] na = new int[m];  // 初始化数组大小 将原数组多余的零扔掉
        for(int i=0;i<m;i++)
            na[i] = a[i];
        System.out.println("原始数组为："+Arrays.toString(na));
//        int[] b = a;  // 错误！ 仅代表两个变量引用同一个数组 并没有实现拷贝 一旦对b进行排序 实质上a也会变
        int[] b = Arrays.copyOf(na,na.length); //将一个数组的所有值拷贝到一个新的数组中去，就要使用Arrays类的copyOf 方法：
        Arrays.sort(b);
        int min = b[0];  // 找出数组中的最小数
        int max = b[b.length-1]; //找出数组中的最大数
        for(int i=0;i<na.length;i++){
            if(na[i] == max){
                na[i] = na[na.length-1];
                na[na.length-1] = max;
                Logger.getGlobal().info(na[i]+ " "+ i);
            }
            if(na[i] == min){
                na[i] = na[0];
                na[0] = min;
                Logger.getGlobal().info(na[i]+ " "+ i);
            }
        }
        System.out.println("选择排序后的数组为："+Arrays.toString(na));
    }
}
