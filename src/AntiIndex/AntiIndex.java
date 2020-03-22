/*一球从100米高度自由落下，每次落地后反跳回原高度的一半再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
*送分题 技术上没有难点 搞清楚物理上的关系就行
 */
package AntiIndex;
public class AntiIndex {
    public static void main(String[] arg){
        double h = 100;
        double s = 0; //初始化经过的路程
        for(int i=1;i<=10;i++){
            s = s+h;
            h = h/2;
            s = s+h;
        }
        System.out.println("第10次的反弹高度为"+h+" m,总共经过"+s+" m");
    }
}
