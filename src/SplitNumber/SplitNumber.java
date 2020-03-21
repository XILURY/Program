/*打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位
*本质是将数值拆解+幂的计算
* */
package SplitNumber;
public class SplitNumber {
    public static void main(String[] arg){
        System.out.println("水仙花数为：");
        for(int i = 100;i<1000;i++){
            int hundreds = i/100; //百位
            int ten = i/10%10;  //十位
            int single = i%100%10;  //个位
            int calculation = (int) (Math.pow(hundreds,3)+Math.pow(ten,3)+Math.pow(single,3));//注意幂次计算的方式 ^为异或符号 不能计算
            if(calculation == i){
                System.out.print(i+" ");
            }
        }
    }
}
