package ru.job4j.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionsTester {
    public static void main(String[] args) {
        AddDeleteTimer adt  = new AddDeleteTimer();
        Collection<String> list = new ArrayList();
        Collection<String> linked = new LinkedList();
        Collection<String> tree = new TreeSet();

        System.out.println(String.format("Execution time for add in TreeSet   - %s", adt.add(tree, 10000)));
        System.out.println(String.format("Execution time for add in ArrayList   - %s", adt.add(list, 10000)));
        System.out.println(String.format("Execution time for add in LinkedList - %s", adt.add(linked, 10000)));

        System.out.println(String.format("Execution time for delete in LinkedList - %s", adt.delete(linked, 10000)));
        System.out.println(String.format("Execution time for delete in TreeSet   - %s", adt.delete(tree, 10000)));
        System.out.println(String.format("Execution time for delete in ArrayList   - %s", adt.delete(list, 10000)));
    }
}