package sort;

import java.util.Arrays;

/**
 * Create by coldwarm on 2018/8/12.
 */

public class QuickSortDemo {
    public static void main(String[] args) {
        int[] arr = {4,5,7,8,1,2,3,6};
        quick_sort(arr, 0, arr.length - 1);
        System.out.println("排序结果：" + Arrays.toString(arr));
    }

    public static void quick_sort(int s[], int left, int right)
    {
        if (left < right)
        {
            //Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
            int i = left, j = right, x = s[left];
            while (i < j)
            {
                while(i < j && s[j] >= x) // 从右向左找第一个小于x的数
                    j--;
                if(i < j)
                    s[i++] = s[j];

                while(i < j && s[i] < x) // 从左向右找第一个大于等于x的数
                    i++;
                if(i < j)
                    s[j--] = s[i];
            }
            s[i] = x;
            quick_sort(s, left, i - 1); // 递归调用
            quick_sort(s, i + 1, right);
        }
    }
}
