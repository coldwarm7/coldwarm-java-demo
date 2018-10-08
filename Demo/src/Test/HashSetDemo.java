package Test;

import java.util.HashSet;

/**
 * Create by coldwarm on 2018/9/15.
 */

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add(new String("abc"));
        hashSet.add(new String("abd"));
        hashSet.add(new String("abc"));

        System.out.println(hashSet);
    }
}
