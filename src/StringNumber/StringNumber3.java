/*实现一串字符中每一个重复符号个数的统计
列表数组和Collections排序 indexOf和lastIndexOf
*
* */
package StringNumber;
import java.util.*;
public class StringNumber3{
    public static void main(String[] args){
        System.out.println("请输入一行字符：");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        count(str);
    }
    //统计输入的字符
    private static void count(String str){
        List<String> list = new ArrayList<String>(); //数组列表自动分配存储空间
        char[] array_Char = str.toCharArray(); //将字符串转换成字符数组
        for(char c:array_Char)
            list.add(String.valueOf(c));//将字符作为字符串添加到list表中
        Collections.sort(list);//排序
        for(String s:list){
            int begin = list.indexOf(s); //indexOf 返回指定字符在字符串中第一次出现处的索引
            int end = list.lastIndexOf(s); //返回指定字符在此字符串中最后一次出现处的索引
            System.out.println("字符‘"+s+"’有"+(end-begin+1)+"个");
            //索引结束统计字符数
//            if(list.get(end)==s) //到达数组列表最后一个值
//                System.out.println("字符‘"+s+"’有"+(end-begin+1)+"个");
        }
    }
}