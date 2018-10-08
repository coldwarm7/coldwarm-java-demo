package Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Create by coldwarm on 2018/9/15.
 */

public class SingletDemo {
    private SingletDemo(){}
    public static SingletDemo singletDemo = new SingletDemo();
    public static SingletDemo getSingletDemo(){
        return singletDemo;
    }


}
