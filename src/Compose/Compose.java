/*有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
*初一看被吓住了 其实很简单的一个题目 没什么技术难点 如果是任意4个数字 难度会大不少
* */
package Compose;
public class Compose {
    public static void main(String[] arg){
        int num = 0;
        int count = 0;
        for(int i=1;i<5;i++){
            for(int j=1;j<5;j++){
                for (int k=1;k<5;k++){
                    if(i!=j && i!=k && j!=k){
                        num =100*i+10*j+k;
                        count++;
                        System.out.print(num+" ");
                    }
                }
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
