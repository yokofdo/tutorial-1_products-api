package lk.yoko.oop.week3;

import java.util.HashMap;
import java.util.Map;



public class MapDemo {
    public static void main(String[]args){
        Map<Integer,String> map=new HashMap<>();//key,value
        map.put(1,"I");
        map.put(2,"T");
        map.put(3,"T");
        map.put(4,"A");
        System.out.println(map);


    }
}
