/*将一个正整数分解质因数。例如：输入90,打印出90=2*3*5
*
*这个程序一开始没什么思路 但仔细想想似乎不是很难
*
* */
package SplitPrime;
public class SplitPrime {
    public static void main(String[] arg) {
        int x = 90;
        System.out.print(x+"可以分解为：");
        for (int i = 2; i < x + 1; i++) {
            while (x % i == 0 && x != i) {
                x = x / i;   //关键和重点 将x一直变小
                System.out.print(i + "*");
            }
            if (x == i) {
                System.out.println(i);
                break;
            }
        }
    }
}