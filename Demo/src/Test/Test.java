package Test;


import jdk.nashorn.internal.ir.IfNode;

import java.util.concurrent.CountDownLatch;

/**
 * Create by coldwarm on 2018/9/11.
 * 求1-100质数和
 */

public class Test {
    public static void main(String[] args) {

       // function(1,100);
        function_1();
    }

    public static void function_1(){
        int x = 0;
        int count = 0;
        for (int i = 2;i < 100;i ++){
            x = 0;
            for (int j = 1; j < i ;j ++){
                if (i %j == 0){
                    x++;
                }
            }
            if (x == 1){
                System.out.println(i);
            }
        }
    }

    private static void function(int startNum,int endNum) {
        // TODO Auto-generated method stub
        int start = startNum;
        int end = endNum;
        int count = 0;
        int x = 0;

        for (int i = 2; i < end; i++) {
            x=0;
            for (int j = 2; j <= (int)Math.sqrt(i); j++) {
                if (i%j==0) {
                    x++;

                }
            }
            if (x==0) {
                count++;
                System.out.println(i);
            }
        }

        System.out.println("==========");
        System.out.println(count);
    }

}
