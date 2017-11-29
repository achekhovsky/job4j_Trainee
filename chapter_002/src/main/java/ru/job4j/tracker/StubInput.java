package ru.job4j.tracker;

/**
 * The implementation of the input interface to test the application
 */
public class StubInput implements Input {
    private int position = 0;
    private String[] action;

    /**
     * The constructor accepting as parameter an array of commands
     * @param act
     */
    StubInput(String...act) {
        action = act;
    }

    @Override
    public String ask(String question) {
        return action[position++];
    }
}
