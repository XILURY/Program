/*输入某年某月某日，判断这一天是这一年的第几天？
 *程序分析：以3月5日为例，应该先把前两个月的加起来，然后再加上5天即本年的第几天，特殊情况，闰年且输入月份大于3时需考虑多加一天。
 *参考答案过于复杂 其实可以直接用LocalDate类的方法getDayOfYear实现
 */
package CountDay;
import java.time.LocalDate;
import java.util.Scanner;

public class CountDay {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in).useDelimiter("\\s");
        System.out.println("请输入年月日（以空格间隔）：");
        int year = in.nextInt();
        int month = in.nextInt();
        int day = in.nextInt();
        System.out.println("这一天是这一年的第"+Account(year,month,day)+"天！");
    }
    //直接用LocalDate类中的getDayOfYear这个方法求得是这一年的第几天
    static int Account(int year,int month,int day){
        LocalDate date = LocalDate.of(year,month,day);
        return date.getDayOfYear();
    }
}
//其它知识点补充
//    LocalDate today = LocalDate.now(); //获取今天的日期无需new(获取时间 Date xx = new Date();)
//    int year = today.getYear(); //获取年份
//    int month = today.getMonthValue(); //获取月份
//                    int getDayOfMonth( ) //获取日
//    int day = today.getDayOfYear(); //可以直接用getDayOfYear这个方法获取这一天是这一年的第几天
//        System.out.println(day);