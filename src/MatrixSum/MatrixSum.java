/*求一个3*3矩阵对角线元素之和
*主要复习多维数组的输入、输出
* */
package  MatrixSum;
import java.util.Arrays;

public class MatrixSum {
    public static void main(String[] arg){
        int[][] a =new int[][]{{1,2,3},{4,5,6},{7,8,9}}; //多维数组的输入方式
        System.out.println(Arrays.deepToString(a));  //快速打印多维数组的方法
        int sum = 0;
        for(int i = 0; i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j){
                    System.out.println(a[i][j]);
                    sum = sum +a[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
