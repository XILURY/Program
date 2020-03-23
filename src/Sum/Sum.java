/*有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
程序分析：请抓住分子与分母的变化规律。
***和之前的斐波那契数列规律一致 但是答案给的似乎更加简洁
*/
package Sum;
public class Sum {
    public static void main(String[] arg){
        double sum = 0;
        double num = 0;
        for(int i=1;i<21;i++){
            //System.out.println((int)funmolecule(i)+"/"+(int)funDenominator(i)); //输出每一项 看对不对
            num = funmolecule(i)/funDenominator(i);
            sum = sum + num;
        }
        System.out.println("前20个数列和为："+sum);
    }
    //求第n个数的分母
    static double funDenominator(int n){
        double m = 1;
        if(n == 2){
            m =2;

        } else if(n>=3){
            m = funDenominator(n-2) +funDenominator(n-1);
        }
        return m;
    }
    //求第n个数的分子
    static double funmolecule(int n){
        double m = 2;
        if(n == 2){
            m =3;

        } else if(n>=3){
            m = funmolecule(n-2) +funmolecule(n-1);
        }
        return m;
    }
}

//参考答案
//public class Sum{
//    public static void main(String[] args){
//        double n1 = 1;
//        double n2 = 1;
//        double fraction = n1/n2;
//        double Sn = 0;
//        for(int i=0;i<20;i++){
//            double t1 = n1;
//            double t2 = n2;
//            n1 = t1+t2;
//            n2 = t1;
//            fraction = n1/n2;
//            Sn += fraction;
//        }
//        System.out.print(Sn);
//    }
//}