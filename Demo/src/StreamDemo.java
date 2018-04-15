import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;
/**
 * Created by xu on 18/4/14.
 */
public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(8,6,5,7,4,6,2,1,9));
        collectorsDemo(list);
//        list.stream().filter(e -> e >= 5).forEach(e -> System.out.print(e + " "));

//        System.out.println(function(list));
//        System.out.println(findSquareOfMaxOdd(list));
    }
    private static void collectorsDemo(List<Integer> list){
        List<Integer> List1 = list.stream().filter(e -> e % 2 == 1).collect(Collectors.toList());
        Iterator iterator = List1.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
    private static int findSquareOfMaxOdd(List<Integer> numbers){
        return numbers.stream()
                .filter(i -> isGreaterThan3(i))
                .filter((i) -> i < 11)
                .max(Comparator.naturalOrder())
                .map(i -> i*i)
                .get();
    }
    private static boolean isGreaterThan3(Integer integer){
        return integer > 3;
    }


    private static Integer function(List<Integer> list){
        Iterator iterator = list.iterator();
        Integer result = 0;
        Integer number = 0;

        while (iterator.hasNext()){
            number++;
            if (number < 6) {
                Integer v = (Integer) iterator.next();
                if (v % 2 == 0) {
                    result += v;
                }
            }else {
                return result;
            }
        }
        return  1;
    }
}
