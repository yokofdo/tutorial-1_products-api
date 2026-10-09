package lk.yoko.oop.week3;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[]args){
        Set<Integer> set=new HashSet<>();//not sorted
        System.out.println(set.add(10));
        System.out.println(set.add(10));
        System.out.println(set.add(10));
        System.out.println(set.add(10));
        set.add(-10);
        set.add(25);
        set.add(15);
        set.add(8);
        System.out.println(set);

    }
}
