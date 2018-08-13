package sort;

import java.util.Arrays;

/**
 * Create by coldwarm on 2018/8/12.
 */

public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,6,3};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void BubbleSort(int[] arr){
        int n = arr.length;
       int i,j;
       for (i=0;i<n;i++){
           for (j=1;j<n - i;j++){
               if (arr[j]<arr[j-1]){
                   swap(arr,j,j-1);
               }
           }
       }
    }
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
