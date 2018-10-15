package Test;

import java.util.Scanner;

/**
 * Create by coldwarm on 2018/10/9.
 */

public class meiTuanTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int count = scanner.nextInt();
        int[] ints = new int[count];
        int zzz = 0;
        for (int j = 0;j<count;j++){
            zzz +=ints[j];
        }
        System.out.println();
        System.out.println(demo(zzz,count));

    }

    public static boolean demo(int zzz,int number){
        if ((2*zzz) < number){
            return true;
        }else{
            return false;
        }
    }
}
