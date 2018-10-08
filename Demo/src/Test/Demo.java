package Test;

import java.util.Scanner;

/**
 * Create by coldwarm on 2018/9/15.
 */

import java.util.ArrayList;
import java.util.Scanner;

import javax.sql.rowset.FilteredRowSet;

public class Demo {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in

        );
        ArrayList<Integer> ins = new ArrayList<>();
        while(sc.hasNextInt()) {
            ins.add(sc.nextInt());
        }
        System.out.println(test1(ins));


    }

    public static int test1(ArrayList<Integer> ins) {


        for(int i=0;i<ins.size();i++) {

            for(int j=0;j<ins.size();j++)
            {
                if(i!=j) {
                    if(ins.get(i)==ins.get(j)) {
                        return ins.get(i);
                    }
                }
            }
        }

        return 1;
    }
}

