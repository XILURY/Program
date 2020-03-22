/**主要是注意charAt从字符串里面取值 取出的类型是char不能直接和字符串比较 需要用ASCII编码 注意编码的进制问题 编译器默认是十进制的
 */
package StringNumber;
public class StringNumber1 {
    public static void main(String[] arg){
        String str = "asdhasdjk asd 23 %%^7!@FHJ25_96大家思考大哥我可"; //字符串直接定义的方式复习 不要忘记加“”
        CountString(str);
    }
    static void CountString(String str){
        int AmountLetterB = 0; //初始化大写字母数量
        int AmountLetterS = 0; //初始化小写字母数量
        int AmountChinese = 0; //初始化汉字数量
        int AmountDigital = 0;//初始化数字数量
        int AmountSpace = 0; //初始化空格数量
        int AmountOthers = 0; //初始化其它字符数量
        for(int i=0;i<str.length();i++){ //注意一定不要加等号 加了等号会越界 字符串从0开始编号
            char c = str.charAt(i);
            if(c>=0x30 && c<=0x39){ //注意加0x表示16进制（30-39） 不加编译器默认为10进制（48-57）
                AmountDigital++;
            }else if (c>=0x61 && c<=0x7A){ //小写字母范围61-7A
                AmountLetterS++;
            }else if(c>=0x41 && c<=0x5A){ //大写字母范围 41-5A
                AmountLetterB++;
            }else if(c == 0x20){ //空格
                AmountSpace++;
            }else if(c>=0x4E00 && c<0x9FA5){ //汉字范围4E00-9FA5
                AmountChinese++;
            }else {
                AmountOthers++;
            }
        }
        System.out.println("汉字有"+AmountChinese+"个,大写写字母有"+AmountLetterB+"个,小写字母有"+AmountLetterS+"个,数字有"
                +AmountDigital+"个，空格有"+AmountSpace+"个，其它字符有"+AmountOthers+"个");
    }
}
