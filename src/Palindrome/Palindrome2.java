//参考答案 BufferedReader及异常的使用
package Palindrome;
import java.io.*;
public class Palindrome2{
    public static void main(String[] args){
        int n = 0;
        System.out.print("请输入一个5位数：");
        BufferedReader bufin = new BufferedReader(new InputStreamReader(System.in));
//        try{
//            n = Integer.parseInt(bufin.readLine());
//        }catch(IOException e){
//            e.printStackTrace();
//        }finally{    //当代码抛出一个异常时， 就会终止方法中剩余代码的处理，并退出这个方法的执行。如
//                    //果方法获得了一些本地资源，并且只有这个方法自己知道，又如果这些资源在退出方法之前
//                    //必须被回收，那么就会产生资源回收问题。不管是否有异常被捕获， finally 子句中的代码都被执行
//                    //我们认为在需要关闭资源时， 用这种方式使用finally 子句是一种不错的选择。
//            try{
//                bufin.close();
//            }catch(IOException e){
//                e.printStackTrace();
//            }
//        }
        //建议强烈建议解搞合try/catch 和try/finally 语句块。这样可以提高代码的清晰度。改写上述代码如下：
        try{
            try{
                n = Integer.parseInt(bufin.readLine());
            }finally {
                bufin.close();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    //判断
    private static void palin(int n){
        int m = n;
        int[] a = new int[5];
        if(n<10000 || n>99999){
            System.out.println("输入的不是5位数！");
            return;
        }else{
            for(int i=0;i<5;i++){
                a[i] = n%10;
                n /= 10;
            }
            if(a[0]==a[4] && a[1]==a[3])
                System.out.println(m+"是一个回文数");
            else
                System.out.println(m+"不是回文数");
        }
    }
}