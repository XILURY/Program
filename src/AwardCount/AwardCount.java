/*企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；利润高于10万元，低于20万元时，
低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；20万到40万之间时，高于20万元的部分，可提成5%；
40万到60万之间时高于40万元的部分，可提成3%；60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，
超过100万元的部分按1%提成，从键盘输入当月利润I，求应发放奖金总数
***********************************************************************************************************
**注意将浮点数保留两位小数的方法 String result =String.format("%.2f",Award);
* */
package AwardCount;
import java.util.*;
public class AwardCount {
    public static void main(String[] arg){
        System.out.println("请输入当月利润:");
        Scanner in = new Scanner(System.in);
        int I = in.nextInt();
        System.out.println("当月利润"+I+"万元,当月发放奖金总数为"+AwardCount(I)+"万元!");
    }
    private static String AwardCount(int I) {
        double Award = 0;
        if(I<=10){
            Award = I*0.1;
        }else if(I>10 && I<=20){
            Award = (10*0.1 + 0.075*(I-10));
        }else if(I>20 && I<=40){
            Award = (10*0.1 + 0.075*10 + 0.05*(I-20));
        }else if(I>40 && I<=60){
            Award = (10*0.1 + 0.075*10 + 0.05*20 + 0.03*(I-40));
        }else if (I>60 && I<=100){
            Award = (10*0.1 + 0.075*10 + 0.05*20 + 0.03*20 +0.015*(I-60));
        }else{
            Award = (10*0.1 + 0.075*10 + 0.05*20 + 0.03*20 +0.15*40 +0.01*(I-100));
        }
        String result =String.format("%.3f",Award);  //将浮点数转换为保留两位小数
        return result;
    }
}
