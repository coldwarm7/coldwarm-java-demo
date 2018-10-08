package Test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Create by coldwarm on 2018/9/28.
 */

public class aiqiyiTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] arrays = new int[number];
        for (int i = 0;i<number;i++){
            arrays[i] = scanner.nextInt();
        }


        Arrays.sort(arrays);
//        for (int i : arrays){
//            System.out.println(i);
//        }
        int count = 1;
        for (int i = 0;i<arrays.length;i++){
            for (int j=i+1;j<arrays.length;j++){
                if (arrays[i] == arrays[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
