import java.util.Arrays;

/*打印出杨辉三角形（要求打印出10行如下图）
* 不知道它的规律 难以下手 规律是下面的一个数是上一行相邻的两数之和
*/
public class YHtriangle {
    public static void main(String[] args){
        int[][] n = new int[10][21];
        n[0][10] = 1;
        for(int i=1;i<10;i++)
            for(int j=10-i;j<10+i+1;j++)
                n[i][j] = n[i-1][j-1]+n[i-1][j+1];
        //System.out.println(Arrays.deepToString(n)); // 打印多维数组 用deepToString

        // 开始输出 将原始二维数组中的零替换成空格输出
        for(int i=0;i<10;i++){
            for(int j=0;j<21;j++){
                if(n[i][j]==0)
                    System.out.print("   ");
                else{
                    if(n[i][j]<10)
                        System.out.print("  "+n[i][j]);//空格为了美观需要
                    else if(n[i][j]<100)
                        System.out.print(" "+n[i][j]);
                    else
                        System.out.print(n[i][j]);
                }
            }
            System.out.println();
        }
    }
}