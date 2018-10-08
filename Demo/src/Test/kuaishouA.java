package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Create by coldwarm on 2018/9/25.
 */

public class kuaishouA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <count ;i++){
            list.add(scanner.nextInt());
        }

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        int number = 0;

        //int a = count % 2;
        //System.out.println(a);
        for (int i = 0;i<3;i++){
            list1.add(list.get(i));
        }
        for (int i = (count - 2);i<count;i++){
            list3.add(list.get(i));
        }
        function(list1,list3);

        System.out.println(list1.toString());
        System.out.println(list3.toString());

    }

    public static Integer add(ArrayList<Integer> arrayList){
        int addList = 0;
        for (Integer integer : arrayList){
            addList += integer;
        }
        return addList;
    }

    public static void function(ArrayList<Integer> list1,ArrayList<Integer> list3){
        if (add(list1) == add(list3)){
            System.out.println(add(list1));
        }else if (add(list1) < add(list3)){
            list3.remove(0);
            function(list1,list3);
        }else if (add(list1) > add(list3)){
            list1.remove(list1.size()-1);
            function(list1, list3);
        }else {
            System.out.println(0);
        }
    }
}
