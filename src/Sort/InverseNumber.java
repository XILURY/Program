/*将一个数组逆序输出。用第一个与最后一个交换
 *
 */
package Sort;

import java.util.Arrays;

public class InverseNumber {
    public static void main(String[] arg){
        int[] a = new int[]{2,5,8,7,2,6,9,7};
        int x = a.length;
        int[] na = new int[x];
        for(int i=0;i<x;i++){
            na[i]=a[x-i-1];
        }
        System.out.println("原数组为："+ Arrays.toString(a));
        System.out.println("逆序输出数组为："+ Arrays.toString(na));
    }
}
