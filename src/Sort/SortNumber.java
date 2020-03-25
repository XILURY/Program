/*对10个数进行排序
*想使用数组直接快速排序 需要将字符串分割存入字符串数组中 再将字符串转化为整型
***答案提供的方法也需掌握
*/
package Sort;

import java.util.Arrays;
import java.util.Scanner;

//采用数组的sort方法快速排序，只能实现从小到大的排序
public class SortNumber {
    public static void main(String[] arg){
        System.out.println("请输入要排序的整数（以逗号分隔）：");
        Scanner in = new Scanner(System.in);
        String ss = in.nextLine();   //以字符串形式读取输入
        //int[] a = new int[]{21,55,87,654,44,56,96,75,13,54,63,20};  //测试用 数组初始化的方式不是很熟练
        String[] nss = ss.split(",");  //分割之前的字符串 存在字符串数组中
        int [] num= new int[nss.length];    //定义一个整型数组 长度和分割之后的字符串数组一样
        for(int i=0;i<num.length;i++) {
            num[i] = Integer.parseInt(nss[i]);  //将字符串转换为整型并填入数组中 parseInt(String s): 返回用十进制参数表示的整数值
        }
        Arrays.sort(num);   //数组的快速排序
        System.out.print("排序之后顺序为:");
        for(int i = 0;i<num.length;i++){
            System.out.print(num[i]+ " ");
        }
    }
}

//答案的方法 通过循环的方式 可以既可以实现从大到小排序 也可以实现从小到大排序
//public class SortNumber {
//    public static void main(String[] arg){
//        int[] a = new int[]{21,55,87,654,44,56,96,75,13,54,63,20};//数组初始化的方式不是很熟练
//        int temp = 0;
//        for(int i=0;i<10;i++){
//            for(int j=i;j<10;j++){
//                if(a[i]<a[j]){ //从大到小排序
//                    temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(a));
//    }
//}



