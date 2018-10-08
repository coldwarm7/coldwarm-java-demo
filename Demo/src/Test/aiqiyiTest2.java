package Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Create by coldwarm on 2018/9/28.
 */

public class aiqiyiTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int number;

        int[] arrays = new int[count];
        for (int i = 0;i<count;i++){
            arrays[i] = i+1;
        }
        int a = count;

        ArrayList<Integer> list1 = new ArrayList<>(); //偶数
        ArrayList<Integer> list2 = new ArrayList<>(); //奇数

        for (int i : arrays){
            if (i%2==0){
                list1.add(i);
            }else {
                list2.add(i);
            }
        }

        number = getSubsets(list1) + getSubsets(list2);

        if (count < 4){
            System.out.println(number-1);
        }else if (count > 4){
            System.out.println(number+1);
        }else if (count == 4){
            System.out.println(number);
        }

    }
    public static int getSubsets(ArrayList<Integer> subList) {
        HashSet<ArrayList<Integer>> allsubsets = new HashSet<ArrayList<Integer>>();
        int max = 1 << subList.size();
        for(int loop = 0; loop < max; loop++) {
            int index = 0;
            int temp = loop;
            ArrayList<Integer> currentCharList = new ArrayList<Integer>();
            while(temp > 0) {
                if((temp & 1) > 0) {
                    currentCharList.add(subList.get(index));
                }
                temp>>=1;
                index++;
            }
            allsubsets.add(currentCharList);
        }
        return allsubsets.size();
    }
}
