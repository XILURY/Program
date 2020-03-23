/**输出9*9口诀。
 程序分析：分行与列考虑，共9行9列，i控制行，j控制列
*
* */
package MuplyTable;
public class MuplyTable {
    public static void main(String[] arg){
        for(int i=1;i<10;i++){
            for(int j=1;j<i+1;j++){
                    System.out.print(j+"*"+i+"="+i*j+" ");
            }
            System.out.println();
        }
    }
}
