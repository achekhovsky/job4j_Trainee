package ru.job4j.loop;

import java.util.Arrays;
import java.util.Objects;

/**
 * This class contains a method which search substring in the String object.
 * @author achekhovsky
 * @version 1.0
 */
public class FindSubStr {
    /**
     * The method which search substring in the String object
     * @param origin - string in which the search
     * @param sub - substring
     * @return
     */
    public boolean contains(String origin, String sub) {
        char[] originChars = origin.toCharArray();
        char[] subChars = sub.toCharArray();
        int count = 0;
        if ((originChars.length > 0 && subChars.length > 0)) {
            for (int i = 0; (i < originChars.length && count != subChars.length); i++) {
                if (subChars[count] == originChars[i]) {
                    count++;
                } else {
                    count = 0;
                }

            }
        }
        return count == subChars.length;
    }
}
