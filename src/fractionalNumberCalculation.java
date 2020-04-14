/*分数的加减乘除 相对来说也不是很难
*但是没有考虑负分数 程序的实现还是有点问题的
*
*/
public class fractionalNumberCalculation {
    public static void main(String[] arg){
        // 以数组形式输入分数 数组第一位为分子，第二位为分母
        int[] a =new int[]{2,3};
        int[] b =new int[]{1,3};
        System.out.println(str(a)+" + "+str(b)+" = "+add(a,b));
        System.out.println(str(a)+" - "+str(b)+" = "+sub(a,b));
        System.out.println(str(a)+" ✖ "+str(b)+" = "+mul(a,b));
        System.out.println(str(a)+" ➗ "+str(b)+" = "+div(a,b));
    }

    // 将输入的数组转换成字符串
    static String str(int[] a){
        String s = a[0] +"/"+a[1];
        return s;
    }

    //计算最大公因数
    static int commonFactor(int m,int n){
        int c = Math.min(m, n);
        int commonFactor = 0;
        for(int i=1;i<=c;i++){
            if(m%i==0 && n%i==0)
                commonFactor = i;
        }
        return commonFactor;
    }

    // 计算最小公倍数 分母通分
    static int  commonMultiple(int m,int n){
        return (m*n/(commonFactor(m,n)));
    }

    // 通分计算
    static int[] commonDenominator(int[] a,int comMultiple){
        a[0] = a[0]*(comMultiple/a[1]);
        a[1] = comMultiple;
        return a;
    }

    // 加减计算
    static String add(int[] a,int[] b){
        int[] na = commonDenominator(a,commonMultiple(a[1],b[1]));
        int[] nb = commonDenominator(b,commonMultiple(a[1],b[1]));
        int[] result = new int[]{na[0]+nb[0],na[1]};
        return resultOut(result);
    }

    // 减法计算
    static String sub(int[] a,int[] b){
        int[] na = commonDenominator(a,commonMultiple(a[1],b[1]));
        int[] nb = commonDenominator(b,commonMultiple(a[1],b[1]));
        int[] result = new int[]{na[0]-nb[0],na[1]};
        return resultOut(result);
    }

    // 乘法计算
    static String mul(int[] a,int[] b){
        int[] result = new int[]{a[0]*b[0],a[1]*b[1]};
        return resultOut(result);
    }

    // 除法计算
    static String div(int[] a,int[] b){
        int[] result = new int[]{a[0]*b[1],a[1]*b[0]};
        return resultOut(result);
    }

    // 约分并当分母为1时只需输出分子即可
    static String resultOut(int[] a){
        int comF = commonFactor(a[0],a[1]);
        int[] na = new int[]{a[0]/comF,a[1]/comF};
        String s = "";
        if(na[1] == 1)
            s = String.valueOf(na[0]);
        else
            s = na[0] +"/"+ na[1];
        return s;
    }
}
