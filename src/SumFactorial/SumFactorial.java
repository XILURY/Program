/*求1+2!+3!+...+20!的和
参考答案是错的 正确结果应该为2561327494111820313
注意使用long用int结果会溢出得不到正确答案！
* */
package SumFactorial;
public class SumFactorial {
    public static void main(String[] arg){
        long res = 0;
        for(int i=1;i<21;i++){
            res = res +CalculationF(i);
        }
        System.out.println("结果为："+res);
    }
    //计算阶乘
    static long CalculationF(int n){
        long result = 1;
        for(int i=1;i<=n;i++){
            result = result*i;
        }
        return result;
    }
}