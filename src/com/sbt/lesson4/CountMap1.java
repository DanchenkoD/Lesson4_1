package com.sbt.lesson4;

import java.util.HashMap;
import java.util.Map;

public class CountMap1<E> implements CountMap<E> {

    private Map<E, Integer> map = new HashMap<>();


    @Override
    public void add(E element) {
        if (!map.containsKey(element)) {
            map.put(element, 1);
        } else {
            map.put(element, map.get(element) + 1);
        }

    }

    @Override
    public int getCount(E element) {
        if (map.containsKey(element)) {
            return map.get(element).intValue();
        } else {
            return 0;
        }
    }

    @Override
    public int remove(E element) {
        if (map.containsKey(element)) {
            int count= map.get(element).intValue();
            map.remove(element);
            return count;
        } else {
            return 0;
        }
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public void addAll(CountMap<? extends E> source) {
        for (E element: source.toMap().keySet()) {
            if (!map.containsKey(element)) {
                map.put(element, 1);
            } else {
                map.put(element, map.get(element) + 1);
            }
        }

    }

    @Override
    public Map<E, Integer> toMap() {
        return map;
    }

    @Override
    public void toMap(Map<? super E, ? super Integer> destination) {
        destination.clear();
        destination.putAll(map);
    }

    public void print(String name){
        System.out.print(name+" -> ");
        map.forEach((k, v) -> System.out.print(" "+k + ": " + v+ "; "));
        System.out.println();
    }
}


