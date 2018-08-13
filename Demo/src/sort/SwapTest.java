package sort;

import java.util.Arrays;

/**
 * Create by coldwarm on 2018/8/13.
 */

public class SwapTest {
    public static void main(String[] args) {
        int[] arr = {1,3};
        Swap1(arr,0,1);
        System.out.println(Arrays.toString(arr));

        int a=2,b=6,c;
        c=2^6;
        System.out.println(c);
    }

    //数组为引用类型，对数组进行修改，原数组的内容也会被修改，所以这里调用方法之后数组两个数据会被调换
    //如果传入int类型，为基本数据类型，只是传入数字到方法中，对main函数中的a,b并没有影响，不会被改变
    public static void Swap1(int[] arr,int a, int b) {
        if (arr[a] != arr[b]) {
            arr[a] ^= arr[b];
            arr[b] ^= arr[a];
            arr[a] ^= arr[b];
        }

    }
}
