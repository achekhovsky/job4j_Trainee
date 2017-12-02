package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Scanner;

/**
 * The class which organizes reading validated data from the console
 * @author achekhovsky
 * @version 1.0
 */
public class ValidateInput extends ConsoleInput {
    private Scanner scn;
    /**
     * This constructor initializes the scanner
     */
    public ValidateInput() {
        scn = new Scanner(System.in);
    }

    /**
     * Method which organizes reading data from the console with the input restrictions
     * @param question - the question that is displayed to the console before reading the data
     * @param range - restrictions
     * @return The data that the user entered in the console
     */
    @Override
    public String ask(String question, int[] range) throws MenuOutException {
        String inp = super.ask(question);
        if (Arrays.stream(range).anyMatch((v)->inp.equals(String.valueOf(v)))) {
            return inp;
        } else {
            throw new MenuOutException(inp);
        }
    }
}
