package ru.job4j.tracker;

public class StubInput implements Input {
    private int position = 0;
    private String[] action;

    StubInput(String...act) {
        action = act;
    }

    @Override
    public String ask(String question) {
        return action[position++];
    }
}
