package sort;

import java.util.Arrays;

/**
 * Create by coldwarm on 2018/8/12.
 */

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,6,3};
//        BubbleSort(arr);
//        quickSort(arr,0,arr.length-1);
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr){
        int n = arr.length;
        int i,j;
        for (i = 1; i < n;i++){
            for (j=i-1;j>=0 && arr[j] > arr[j+1];j--){
                swap(arr,j,j+1);
            }
        }
    }

    public static void BubbleSort(int[] arr){
        int n = arr.length;
        int i,j;
        for (i=0;i<n;i++){
            for (j=1;j<n-i;j++){
                if (arr[j] < arr[j-1]){
                    int temp =0;
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    public static void quickSort(int[] arr,int left,int right){
        if (left<right){
            int i = left,j=right,x= arr[left];
            while (i<j){
                while (i<j && arr[j] > x){
                    j--;
                }
                if (i<j)
                    arr[i++] = arr[j];
                while (i<j && arr[i] < x){
                    i++;
                }
                if (i<j)
                    arr[j--] = arr[i];
            }
            arr[i] = x;
            quickSort(arr,left,i-1);
            quickSort(arr,i+1,right);
        }
    }
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
