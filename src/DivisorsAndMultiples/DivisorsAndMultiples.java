/*输入两个正整数m和n，求其最大公约数和最小公倍数。
程序分析：最大公因数可以找都被两数整除的最大的那个数。最小公倍数为两数相乘除以最大公因数
*程序调试通过
***参考答案提出了一种辗除法求最大公因数 不是很好理解
* */
package DivisorsAndMultiples;
public class DivisorsAndMultiples {
    public static void main(String[] arg){
        int m = 60;
        int n = 20;
        System.out.println("两数的最大公倍数是："+Multiple(m,n));
        System.out.println("两数的最大公因式是："+Divisors(m,n));
    }
    static int Divisors(int m, int n){ //最大公因数
        int smaller = Math.min(m, n);
        int CoNumber = 0;
        for(int i=2;i<=smaller;i++){ //循环 寻找最大的被两数都整除的数 即为最大公因数 特别注意等号 后来才发发现错误
            if(m%i==0 && n%i==0){
                CoNumber = i;
            }
        }
        return CoNumber;
    }
    static int Multiple(int m, int n){ //最大公倍数 最大公倍数等于两数相乘除以最大公因数
        return m*n/(Divisors(m,n));
    }
}
//参考答案
//public class DivisorsAndMultiples{
//    public static void main(String[] args){
//        int m,n;
//        try{
//            m = Integer.parseInt(args[0]);
//            n = Integer.parseInt(args[1]);
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("输入有误");
//            return;
//        }
//        max_min(m,n);
//    }
//    //求最大公约数和最小公倍数
//    private static void max_min(int m, int n){
//        int temp = 1;
//        int yshu = 1;
//        int bshu = m*n;
//        if(n<m){
//            temp = n;
//            n = m;
//            m = temp;
//        }
//        while(m!=0){   //求取最大公因数的方法思路和我不一致，其采取“辗除法”不是很好理解
//            temp = n%m;
//            n = m;
//            m = temp;
//        }
//        yshu = n;
//        bshu /= n;
//        System.out.println(m+"和"+n+"的最大公约数为"+yshu);
//        System.out.println(m+"和"+n+"的最小公倍数为"+bshu);
//    }
//}
