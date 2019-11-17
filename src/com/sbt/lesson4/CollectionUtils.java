package com.sbt.lesson4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionUtils {

    public static <T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    public static <T> List<T> newArrayList() {
        return new ArrayList<T>();
    }

    public static <T> int indexOf(List<? extends T> source, T o) {
        return source.indexOf(o);
    }

    public static <T> List<T> limit(List<? extends T> source, int size) {
        List<T> list = new ArrayList<T>();
        if (size > source.size()) {
            list.addAll(source);
        } else {
            for (int i = 0; i < size; i++) {
                list.add(source.get(i));
            }
        }
        return list;
    }

    public static <T> void add(List<? super T> source, T o) {
        source.add(o);
    }

    public static <T> void removeAll(List<? super T> removeFrom, List<? extends T> c2) {
        removeFrom.removeAll(c2);
    }

    public static <T> boolean containsAll(List<? extends T> c1, List<? extends T> c2) {
        return c1.containsAll(c2);
    }

    public static <T> boolean containsAny(List<? extends T> c1, List<? extends T> c2) {
        for (T tmp : c2) {
            if (c1.contains(tmp)) {
                return true;
            }
        }
        return false;
    }

    public static <T extends Comparable<T>> List<T> range(List<? extends T> list, T min, T max) {
        List<T> temp = newArrayList();
        for (T elem : list) {
            if (elem.compareTo(min) >= 0 && elem.compareTo(max) <= 0) {
                temp.add(elem);
            }
        }
        return temp;
    }

    public static <T extends Comparable<T>> List<T> range(List<? extends T> list, T min, T max, Comparator<T> comparator) {
        List<T> temp = newArrayList();
        for (T elem : list) {
            if (comparator.compare(elem, min) >= 0 && comparator.compare(elem, max) <= 0) {
                temp.add(elem);
            }
        }
        return temp;
    }

}
