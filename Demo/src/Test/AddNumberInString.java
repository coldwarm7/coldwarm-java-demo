package Test;

import java.util.ArrayList;
import java.util.List;


/**
 * Create by coldwarm on 2018/9/16.
 * 求字符串中最大的连续数字之和
 */

public class AddNumberInString {
    public static void main(String[] args) {
        String b = "1 3 -1 4 5 6 ds d -1";
        //b=b.replace(" ","");
        b = b.replaceAll(" ","");
        for (int j =0;j<b.length();j++){
            if (b.charAt(j) == '-'){
                b = removeCharAt(b,j+1);
            }
        }
        String[] str = b.split("-");
        List<Integer> integers = new ArrayList<>();
        for (String string : str){
            integers.add(add(string));
        }
        int finallyNumber = 0;
        for (int q= 0; q<integers.size();q++){

            if (integers.get(q) > finallyNumber){
                finallyNumber = integers.get(q);
            }
        }
        System.out.println(finallyNumber);


    }
    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }

    public static int add(String string){
        int count = 0;
        for (int i = 0;i<string.length();i++){
            if (Character.isDigit(string.charAt(i))){  //判断是否为数字
                count = count + Integer.parseInt(string.charAt(i)+"");
            }
        }
        return count;
    }

}
