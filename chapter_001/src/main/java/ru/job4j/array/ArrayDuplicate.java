package ru.job4j.array;

import java.util.Arrays;

/**
 * This class contains a method which removes duplicate.
 * @author achekhovsky
 * @version 1.0
 */
public class ArrayDuplicate {
    /**
     * This method removes duplicate.
     * @param arrayForDuplDelete - array with duplicates
     * @return array without duplicates
     */
    public String[] remove(String[] arrayForDuplDelete) {
        String buffer;
        int count = 0;
        for (int i = 0; i < arrayForDuplDelete.length - count; i++) {
            for (int j = 0; j < arrayForDuplDelete.length - count; j++) {
                if (i != j && arrayForDuplDelete[i].equals(arrayForDuplDelete[j])) {
                    count++;
                    buffer = arrayForDuplDelete[j];
                    arrayForDuplDelete[j] =  arrayForDuplDelete[arrayForDuplDelete.length - count];
                    arrayForDuplDelete[arrayForDuplDelete.length - count] = buffer;
                }
            }
        }
        return Arrays.copyOf(arrayForDuplDelete, arrayForDuplDelete.length - count);
    }
}
