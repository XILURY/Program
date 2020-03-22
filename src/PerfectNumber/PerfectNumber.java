/*一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程找出1000以内的所有完数。
* 题目比较简单
*/
package PerfectNumber;
public class PerfectNumber {
    public static void main(String[] arg){
        int m = 1000;
        for(int i=1;i<m;i++){
            if(i == Count(i))
                System.out.println(i);
        }
    }
    //计算某数的因数和(不含本身)
    static int Count(int i){
        int s = 0;
        for(int j=1;j<i;j++){
            if(i%j==0) {
                s = s + j;
            }
        }
        return s;
    }
}
