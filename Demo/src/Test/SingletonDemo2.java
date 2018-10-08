package Test;

/**
 * Create by coldwarm on 2018/9/15.
 */

public class SingletonDemo2 {
    private SingletonDemo2(){}
    public static volatile SingletonDemo2 singletonDemo2 = null;
    public static SingletonDemo2 getSingletonDemo2(){
        if (singletonDemo2 == null){
            synchronized (SingletonDemo2.class){
                if (singletonDemo2 == null){
                    singletonDemo2 = new SingletonDemo2();
                }
            }
        }
        return singletonDemo2;
    }
}
