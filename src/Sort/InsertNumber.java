/*比较排序 有一个已经排好序的数组，现输入一个数，要求按原来的规律将它插入数组中
*数组的拷贝 插值
*/

package Sort;

import java.util.Arrays;

public class InsertNumber {
    public static void main(String[] arg){
        int[] a = new int[]{1,5,6,9,22,64,85,146,875};
        System.out.println("未插值数组为："+Arrays.toString(a));
        int[] na = Arrays.copyOf(a, a.length+1) ;;  //copy原数组并把数组维数+1形成插值后的数组
        int n = 55; //要插入的数字
        int xx = 0; //初始化插入的位置
        for (int i=0;i<a.length;i++){
            if(a[i]<n)
                na[i] = a[i];
            else{
                na[i] = n;
                xx = i+1;
                //System.out.println(xx);
                break;
            }
        }
        for(int i=xx;i<na.length;i++){
            na[i] = a[i-1];
        }
        System.out.println("插值后数组为："+Arrays.toString(na));
    }
}
