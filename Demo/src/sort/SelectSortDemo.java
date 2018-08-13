package sort;

import java.util.Arrays;

/**
 * Create by coldwarm on 2018/8/13.
 */

public class SelectSortDemo {
    public static void main(String[] args) {

        int[] arr = {1,3,2,5,6,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        int n=arr.length;
        int i,j,nMinIndex;
        for (i=0; i<n;i++){
            nMinIndex=i;
            for (j=i+1;j<n;j++){
                if (arr[j] < arr[nMinIndex]){
                    nMinIndex=j;
                }
            }
            Swap1(arr,i,nMinIndex);
        }
    }
    public static void Swap1(int[] arr,int a, int b) {
        if (arr[a] != arr[b]) {
            arr[a] ^= arr[b];
            arr[b] ^= arr[a];
            arr[a] ^= arr[b];
        }

    }
}
