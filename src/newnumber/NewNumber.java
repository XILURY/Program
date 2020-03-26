/*求0—7所能组成的奇数个数
 *以为是个编程题 其实是个数学题 没有利用程序的优势 罗列出所有的数在判断
 */
package newnumber;
public class NewNumber {
    public static void main(String[] args){
        int count = 0;
        //声明由数字组成的数
        int n = 8;
        //一位数
        count = n/2;
        //两位数
        count += (n-1)*n/2;
        //三位数
        count += (n-1)*n*n/2;
        //四位数
        count += (n-1)*n*n*n/2;
        //五位数
        count += (n-1)*n*n*n*n/2;
        //六位数
        count += (n-1)*n*n*n*n*n/2;
        //七位数
        count += (n-1)*n*n*n*n*n*n/2;
        System.out.println("0-7所能组成的奇数个数："+count);
    }
}