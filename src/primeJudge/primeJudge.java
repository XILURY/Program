/*判断0-100000之间有多少个素数，并输出所有素数。
程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除，则表明此数不是素数，反之是素数。
*
更进一步 如果是素数 其必在6n的两侧 可以采用这种方法预先筛选一轮。只要注意比6小的几个素数2.3.5即可
另外 在用一个数分别去除2到sqrt(这个数)时候一定 要注意带等号 之前没带等号调试了很久一直出错
* */
package primeJudge;
public class primeJudge {
    public static void main(String[] arg){
        long start = System.currentTimeMillis() ;
        int number =0;
        int m = 0;
        int n = 2000000;
        for(int i = m;i < n+1; i++){
            if(Judgement(i)){
                number++;
                System.out.print(i+"  ");
                if(number%10==0){
                    System.out.println();//每十个数换一行，使得输出美观
                }
            }
        }
        System.out.println();
        //System.out.println(m+"和"+n+"间的素数个数为："+number);
        long end = System.currentTimeMillis() ;
        System.out.println(number + " primes");
        System.out.println((end - start) + " milliseconds");
    }
    private static boolean Judgement(int i){
        boolean flag = false;
        if(i==1){
            return false;
        }
        if(i==2 || i==3 || i==5){
            return true;
        }
//无脑循坏依次判断的方法
//        for(int j=2;j<i;j++){
//            if(i%j==0){
//                flag = false;
//                break;
//            }else{
//                flag = true;
//            }
//        }

//节省计算量的方法 素质必然在6或6的倍数两侧
        if(i%6==1 || i%6==5){
            for(int j=2;j<=Math.sqrt(i);j++){    //一定注意有等号 之前没有等号25/49这些数会进来 调试了很久也不对
                if(i%j == 0) {
                    flag = false;
                    break;
                }
                else{
                    flag = true;
                }
            }
        }
        return flag;
    }
}

