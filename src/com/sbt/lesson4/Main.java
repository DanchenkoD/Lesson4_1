package com.sbt.lesson4;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        CountMap1<Integer> map = new CountMap1<>();

        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);
        map.print("map");

        System.out.println("Элементов 5: "+ map.getCount(5)); // 2
        System.out.println("Элементов 6: "+ map.getCount(6)); // 1
        System.out.println("Элементов 10: "+ map.getCount(10)); // 3

        CountMap1<Integer> map1 = new CountMap1<>();

        map1.add(23);
        map1.add(17);
        map1.add(5);
        map1.add(12);
        map1.add(17);
        map1.add(10);
        map1.print("map1");

        map.addAll(map1);
        map.print("map");
        Map<Integer, Integer> map2; //= new HashMap<>();
        map2=map.toMap();

        //map2.print("map2");
        System.out.println("map2 size-> "+ map2.size());
        System.out.println();
        map2.put(25,1);
        System.out.println("map2 size-> "+ map2.size());
        map.print("map");

        map.remove(17);
        map.print("map");

        Map<Integer, Integer> map3 =new HashMap<>();
        map.toMap(map3);

        System.out.println("map3 size-> "+ map3.size());

        System.out.print("map3 -> ");
        map3.forEach((k, v) -> System.out.print(" "+k + ": " + v+ "; "));
        System.out.println();
        map3.put(30,1);
        map.print("map");




        List<Number> listNum = new ArrayList<>(Arrays.asList(5, 100, 3.14, 2, 4.7, 5));
        List<Integer> listInt = new ArrayList<>(Arrays.asList(1, 5, 10, 25, 30, 35));
        System.out.println(CollectionUtils.containsAll(listNum,listInt));
        System.out.println(CollectionUtils.containsAny(listNum,listInt));
        CollectionUtils.removeAll(listNum, listInt);
        System.out.println(listNum);
        System.out.println(CollectionUtils.limit(listInt,4));
        System.out.println(CollectionUtils.range(listInt,4,30));






    }

    public static class MyComporator implements Comparator<Integer>{
        public int compare(Integer o1, Integer o2) {
            return (o1 < o2) ? -1 : ((o1.equals(o2)) ? 0 : 1);
        }
    }
}
