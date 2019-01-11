package Test;

import java.util.ArrayList;

/**
 * Create by coldwarm on 2019/1/11.
 */

public class suanfaDemo {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add(0," _ ");
        list1.add(1,"   ");
        list1.add(2," _ ");
        list1.add(3," _ ");
        list1.add(4,"   ");
        list1.add(5," _ ");
        list1.add(6," _ ");
        list1.add(7," _ ");
        list1.add(8," _ ");
        list1.add(9," _ ");
        list1.add(10," _ ");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add(0,"| |");
        list2.add(1,"  |");
        list2.add(2,"  |");
        list2.add(3,"  |");
        list2.add(4,"| |");
        list2.add(5,"|  ");
        list2.add(6,"|  ");
        list2.add(7,"  |");
        list2.add(8,"| |");
        list2.add(9,"| |");
        list2.add(10,"|  ");

        ArrayList<String> list3 = new ArrayList<>();
        list3.add(0,"   ");
        list3.add(1,"   ");
        list3.add(2," _ ");
        list3.add(3," _ ");
        list3.add(4," _ ");
        list3.add(5," _ ");
        list3.add(6," _ ");
        list3.add(7,"   ");
        list3.add(8," _ ");
        list3.add(9," _ ");
        list3.add(10," _ ");

        ArrayList<String> list4 = new ArrayList<>();
        list4.add(0,"| |");
        list4.add(1,"  |");
        list4.add(2,"|  ");
        list4.add(3,"  |");
        list4.add(4,"  |");
        list4.add(5,"  |");
        list4.add(6,"| |");
        list4.add(7,"  |");
        list4.add(8,"| |");
        list4.add(9,"  |");
        list4.add(10,"|  ");

        ArrayList<String> list5 = new ArrayList<>();
        list5.add(0," _ ");
        list5.add(1,"   ");
        list5.add(2," _ ");
        list5.add(3," _ ");
        list5.add(4,"   ");
        list5.add(5," _ ");
        list5.add(6," _ ");
        list5.add(7,"   ");
        list5.add(8," _ ");
        list5.add(9," _ ");
        list5.add(10," _ ");

        int[] number = {1,2,3};
        StringBuilder line1=new StringBuilder();
        StringBuilder line2=new StringBuilder();
        StringBuilder line3=new StringBuilder();
        StringBuilder line4=new StringBuilder();
        StringBuilder line5=new StringBuilder();

        for (int i : number){
            line1 = line1.append(list1.get(i));
            line2 = line2.append(list2.get(i));
            line3 = line3.append(list3.get(i));
            line4 = line4.append(list4.get(i));
            line5 = line5.append(list5.get(i));
        }


        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);

    }
}
