/*求和 编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n,当输入n为奇数时，调用函数1/1+1/3+...+1/n
 ***注意保留小数的方法 double无法直接printf保留 转为字符串输出 形式为String result =String.format("%.2f",xxx)
 * 浮点类型能直接保留小数 但是注意是printf
 */
package CountNumber;
public class CountNumber {
    public static void main(String[] args){
        int n = 7;
        if(n%2==0)
            oushu(n);
        else
            jishu(n);
    }
    static void jishu(int n){
        float sum = 0;
        float ni = 0;
        for(int i=1;i<=n/2+1;i++){
            ni = (float)i;
            sum = sum + 1/(2*ni-1);
        }
        System.out.printf("%.3f",sum);
    }
    static void oushu(int n){
        float sum = 0;
        float ni = 0;
        for(int i=1;i<=n/2;i++){
            ni = (float) i;
            sum = sum + 1/(2*ni);
        }
        System.out.printf("%.3f",sum);
    }
}