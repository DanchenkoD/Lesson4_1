package com.sbt.lesson4;

import java.util.Map;

public interface CountMap<E> {
    // добавляет элемент в этот контейнер.
    void add(E element);

    //Возвращает количество добавлений данного элемента
    int getCount(E element);

    //Удаляет элемент и контейнера и возвращает количество его добавлений(до удаления)
    int remove(E element);

    //количество разных элементов
    int size();

    //Добавить все элементы из source в текущий контейнер, при совпадении ключей,     суммировать значения
    void addAll(CountMap<? extends E> source);

    //Вернуть java.util.Map. ключ - добавленный элемент, значение - количество его добавлений
    Map<E, Integer> toMap();

    //Тот же самый контракт как и toMap(), только всю информацию записать в destination
    void toMap(Map<? super E, ? super Integer> destination);

}
