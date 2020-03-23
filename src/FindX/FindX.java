/*一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
*简单题
*/
package FindX;
public class FindX {
    public static void main(String[] arg){
        for(int i=0;i<100000;i++){
            if(Judge(i))
                System.out.println(i);
        }
    }
    //判断是否为是否满足条件
    static boolean Judge(int i){
        boolean flag = false;
        int ni = i + 100;
        int nni = i +168;
        if(ni%Math.sqrt(ni)==0 && nni%Math.sqrt(nni)==0)
            flag = true;
        return flag;
    }
}
