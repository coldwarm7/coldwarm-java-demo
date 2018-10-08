package Test;

/**
 * Create by coldwarm on 2018/9/11.
 */

public class Example {
    public static void main(String[] args) {
        int[] arr = {-1,2,1};
        System.out.println(MaxSubSum3(arr,3));
    }
    public static int MaxSubSum3(int[]arr,int len)
    {
        int i;
        int MaxSum = 0;
        int CurSum = 0;
        for(i=0;i<len;i++)
        {
            CurSum += arr[i];
            if(CurSum > MaxSum)
                MaxSum = CurSum;
            if(CurSum < 0)
                CurSum = 0;
        }
        return MaxSum;
    }
}
