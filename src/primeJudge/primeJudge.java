//weiwan
package primeJudge;
public class primeJudge {
    public static void main(String[] arg){
        int n =0;
        for(int i = 100;i < 201; i++){
            if(Judgement(i)){
                n++;
                System.out.println(i);
            }
        }
        System.out.println(n);
    }
    private static boolean Judgement(int i){
        boolean flag = false;
        if(i%6==1 || i%6==5){
            for(int j=2;j<Math.sqrt(j);j++){
                if(i%j == 0) {
                    flag = true;
                }
                else{
                    flag = false;
                }
            }
        }
        else{
            flag = false;
        }
        return flag;
    }
}
