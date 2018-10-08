package Test;

/**
 * Create by coldwarm on 2018/9/11.
 */

public class A {
    public static int a = 1;
    public static void main(String[] args) {
        B b = new B();
        b.test();
    }
    void test(){
        System.out.println("A");
    }
}
