package ru.job4j.collections.sort;

import java.util.Comparator;
import java.util.List;

/**
 * Compare two lists
 */
public class ListCompare implements Comparator<List<Integer>> {
    /**
     * Compare two lists
     * @param o1 - first list
     * @param o2 - second list
     * @return compare result
     */
    @Override
    public int compare(List<Integer> o1, List<Integer> o2) {
        int result = 0;
        for (int i = 0; (i < o1.size() && i < o2.size()); i++) {
            result = Integer.compare(o1.get(i), o2.get(i));
            if (result != 0) {
                break;
            }
        }
        return result == 0 ? Integer.compare(o1.size(), o2.size()) : result;
    }
}
