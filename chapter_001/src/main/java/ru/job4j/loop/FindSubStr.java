package ru.job4j.loop;

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
        if ((origin.length() > 0 && sub.length() > 0)) {
            for (char baseSymbol : origin.toCharArray()) {
                if (sub.charAt(0) == baseSymbol && origin.length() >= sub.length()) {
                    return Objects.equals(sub, origin.substring(0, sub.length()));
                }
                origin = origin.substring(1);
            }
        }
        return Objects.equals(sub, origin);
    }
}
