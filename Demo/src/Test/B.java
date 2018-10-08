package Test;

/**
 * Create by coldwarm on 2018/9/11.
 */

public class B extends A {
    void test(){
        super.test();
        System.out.println("B");
    }
    public static int a = 2;

    public static void main(String[] args) {
        System.out.println(a);
    }
}
