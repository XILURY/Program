import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class try2{
    public static void main(String[] args) {
        List numList = new ArrayList();
        Scanner in = new Scanner(System.in);
        System.out.println("请输入要排序的数字，以空格间隔");
        String num = in.nextLine();
//        numList.add(num);
//        for(int i=0;i<numList.size();i++) {
//            // 将每个数输出即可
//            System.out.println(numList.get(i));
        String[] xx = num.split("\\s");
        System.out.println(Arrays.toString(xx));
        }
    }