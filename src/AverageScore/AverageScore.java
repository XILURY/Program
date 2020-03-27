/*version1 通过类的方法 实现学生总分的计算 熟悉类的和对象的使用
*version2 创建一个方法计算各科平均分
* version3 输出到文件 PrintWriter
* */
package  AverageScore;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class AverageScore {
    public static void main(String[] arg) throws IOException {
        Student[] ss = new Student[5];
        ss[0] = new Student("ZZ", 1, 95, 88 , 92);
        ss[1] = new Student("XX", 2, 79, 75 , 68);
        ss[2] = new Student("LL", 3, 86, 75 , 80);
        ss[3] = new Student("HH", 4, 88, 82 , 88);
        ss[4] = new Student("JJ", 5, 91, 82 , 85);
        Double[] gra1 = new Double[5];
        Double[] gra2 = new Double[5];
        Double[] gra3 = new Double[5];
        Double[] total = new Double[5];
        for(int i=0;i<5;i++){
            System.out.println(ss[i].getStudentID()+"号学生"+ss[i].getName()+"总分为："+ss[i].total());
            // 依次将学科1，学科2，学科3和总分放入数组中 便于后续操作
            gra1[i] = ss[i].getGrade1();
            gra2[i] = ss[i].getGrade2();
            gra3[i] = ss[i].getGrade3();
            total[i] = ss[i].total();
        }
//        System.out.println("科目1平均分为："+average(gra1));
//        System.out.println("科目2平均分为："+average(gra2));
//        System.out.println("科目3平均分为："+average(gra3));
        PrintWriter outtxt = new PrintWriter("myfile.txt", "UTF-8") ;
        outtxt.println("学号"+"  姓名"+"  科目1"+"    科目2"+"    科目3"+"     总分");
        for(int i=0;i<5;i++){
            outtxt.println(" "+ss[i].getStudentID()+"       "+ss[i].getName()+"     "+ss[i].getGrade1()+"     "+
                    ss[i].getGrade2()+"     "+ss[i].getGrade3()+"       "+total[i]);
        }
        outtxt.println("科目1平均分为："+average(gra1));
        outtxt.println("科目2平均分为："+average(gra2));
        outtxt.println("科目3平均分为："+average(gra3));
        outtxt.close(); //一定要有close()否则输出的txt是空白的
    }

    // 计算每科平均分的方法
    static double average(Double[] gra){
        double sum = 0;
        double avar = 0;
        for(int i=0;i<gra.length;i++){
            sum = sum + gra[i];
        }
        avar = sum/gra.length;
        return avar;
        }
}

// 创建学生类
class Student{
    private String name;
    private long studentID;
    private double grade1;
    private double grade2;
    private double grade3;

    public Student(String name,long studentID,double grade1,double grade2,double grade3){
        this.name = name;
        this.studentID = studentID;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }
    public String getName(){
        return name;
    }
    public long getStudentID(){
        return studentID;
    }
    public double getGrade1(){
        return grade1;
    }
    public double getGrade2(){
        return grade2;
    }
    public double getGrade3(){
        return grade3;
    }
    public double total(){
        return grade1+grade2+grade3;
    }
}
