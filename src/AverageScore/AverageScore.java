/*03.27 通过类的方法 实现学生总分的计算 熟悉类的和对象的使用
*
* */
package  AverageScore;
import java.util.Arrays;

public class AverageScore {
    public static void main(String[] arg){
        Student[] ss = new Student[5];
        ss[0] = new Student("ZZ", 1, 95, 88 , 92);
        ss[1] = new Student("XX", 2, 79, 75 , 68);
        ss[2] = new Student("LL", 3, 86, 75 , 80);
        ss[3] = new Student("HH", 4, 88, 82 , 88);
        ss[4] = new Student("JJ", 5, 91, 82 , 85);
        Double[] total = new Double[5];
        for(int i=0;i<5;i++){
            System.out.println(ss[i].getStudentID()+"号学生"+ss[i].getName()+"总分为："+ss[i].total());
            total[i] = ss[i].total();
        }
        System.out.println(Arrays.toString(total));
//        for(Student s:ss){
//            System.out.println(s.getStudentID()+"号学生"+s.getName()+"总分为："+s.total());
//            //System.out.println(s.getGrade1());
//        }
    }
}

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
