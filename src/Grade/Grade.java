/*利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
程序分析：(a>b)?a:b这是条件运算符的基本例子。
*
*主要掌握条件运算符的使用 注意从右往左的运算顺序 记得必要的时候加括号
一般不会写成这样 不利于程序的可读性
**参考答案里面有一点异常的内容 可以看看了解一下
* */
package Grade;
import java.util.Scanner;

public class Grade {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        int grade = in.nextInt();
        GradeJudge(grade);
    }
    static void GradeJudge(int grade) {
        System.out.print("你的成绩是" + grade);
        if (grade > 100 || grade < 0) {
            System.out.println("成绩输入无效");
        } else {
            String Judge = (grade >= 90) ? ",等级为A" : ((grade > 60) ? ",等级为B" : ",等级为C"); //(a>b)?a:b
            System.out.println(Judge);
        }
    }
}
//参考答案
//public class Prog5{
//    public static void main(String[] args){
//        int n = -1;
//        try{
//            n = Integer.parseInt(args[0]);   //arg[0]指的是是通过命令符运行时的第一个参数
//                                              //Integer.parseInt()是把()里的内容转换成整数。Integer.parseInt(String)遇到一些不能被转换为整型的字符时，会抛出异常。
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("请输入成绩");
//            return;
//        }
//        grade(n);
//    }
//    //成绩等级计算
//    private static void grade(int n){
//        if(n>100 || n<0)
//            System.out.println("输入无效");
//        else{
//            String str = (n>=90)?"分，属于A等":((n>60)?"分，属于B等":"分，属于C等");
//            System.out.println(n+str);
//        }
//    }
//}