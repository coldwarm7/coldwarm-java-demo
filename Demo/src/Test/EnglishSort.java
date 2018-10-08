package Test;

import java.util.*;

/**
 * Create by coldwarm on 2018/9/18.
 */

public class EnglishSort {

    public static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        String string = scanner.nextLine();
        String[] strings = string.split(" ");

        for (String s : strings){
            list.add(s);
        }

        String start = list.get(0);
        char[] startChar = start.toCharArray();
        for (String s : list){
            char[] chars = s.toCharArray();
            if (startChar.length > chars.length){
                for (int i = 0;i<chars.length;i++){
                    if (chars[i] != startChar[i]){
                        count += demo(chars[i],startChar[i]);
                        chars[i] = startChar[i];
                    }
                }
                count = count + (startChar.length - chars.length) * 3;
                arr.add(count);
                count = 0;
            }else if (startChar.length < chars.length){
                for (int i = 0;i<startChar.length;i++){
                    if (chars[i] != startChar[i]){
                        count += demo(chars[i],startChar[i]);
                        chars[i] = startChar[i];
                    }
                }
                count = count + (chars.length - startChar.length) * 3;
                arr.add(count);
                count = 0;
            }
        }
//        for (Integer integer :arr){
//            System.out.println(integer);
//        }

        demo_1(arr,list);



    }

    public static void demo_1(ArrayList<Integer> intList,ArrayList<String> stringList){
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0;i < intList.size();i++){
            map.put(stringList.get(i+1),intList.get(i));
        }
        List<Map.Entry<String, Integer>> infoIds = new ArrayList<>(map.entrySet());
        // 对HashMap中的 value 进行排序
        Collections.sort(infoIds, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o1.getValue()).toString().compareTo(o2.getValue().toString());
            }
        });


        // 对HashMap中的 value 进行排序后  显示排序结果
        for (int i = 0; i < 3; i++) {
            String id = infoIds.get(i).getKey();
            System.out.print(id + "  ");
        }

    }
    public static int demo(char a,char b){
        char[] fenzu1 = {'q','w','e','r','t','a','s','d','f','g','z','x','c','v'};
        char[] fenzu2 = {'y','u','i','o','p','h','j','k','l','b','n','m',};
        int number = 0;
        int number2= 0;
        for (char cc : fenzu1){
            if (a == cc){
                number = 1;
            }else{
                number = 2;
            }
        }
        for (char cc : fenzu1){
            if (b == cc){
                number2 = 1;
            }else {
                number2 = 2;
            }
        }
        if (number == number2){
            return 1;
        }else {
            return 2;
        }
    }
}
