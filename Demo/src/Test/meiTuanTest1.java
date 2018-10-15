package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Create by coldwarm on 2018/10/9.
 *
 * 你打开了美了么外卖，
 * 选择了一家店，你手里有一张满X元减10元的券，
 * 店里总共有n种菜，第i种菜一份需要Ai元，因为你不想吃太多份同一种菜，
 * 所以每种菜你最多只能点一份，现在问你最少需要选择多少元的商品才能使用这张券。
 */

/**
 * 第一行两个正整数n和X，分别表示菜品数量和券的最低使用价格。（1≤n≤100, 1≤X≤10000）
 *
 * 接下来一行n个整数，第i个整数表示第i种菜品的价格。（1≤Ai≤100）
 */
public class meiTuanTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count  = scanner.nextInt();
        int money = scanner.nextInt();
        int[] ints = new int[count];
        for (int i = 0;i < count;i++){
            ints[i] = scanner.nextInt();
        }

        ArrayList<Integer> number = new ArrayList<>();

        ArrayList<ArrayList<Integer>> result = getSubsets(ints,count);
        for (ArrayList<Integer> i : result){
            int q = 0;
            for (Integer j : i){
                q += j;
            }
            number.add(q);
        }

        Collections.sort(number);
        for (Integer i : number){
            if (i > money){
                System.out.println(i);
                break;
            }
        }

    }


    public static ArrayList<ArrayList<Integer>> getSubsets(int[] A, int n) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(A);
        int max = 1 << n;
        for (int k = max - 1; k >= 1; k--) {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for (int i = k, index = 0; i > 0; i >>= 1, index++) {
                if ((i & 1) == 1) {
                    arr.add(0, A[index]);
                }
            }
            list.add(arr);
        }
        return list;
    }

}