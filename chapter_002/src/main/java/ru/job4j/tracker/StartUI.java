package ru.job4j.tracker;

import java.util.Arrays;

/**
 * The main class in which organized interface user interaction
 */
public class StartUI {
    private MenuTracker menu;
    private Input input;
    private Tracker tracker;
    /**
     * Constructor which initializes the tracker and input method
     * @param input - the input method
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public static void main(String[] args) {
        new StartUI(new ValidateInput(), new Tracker()).init();
    }

    /**
     * The method of organizing the output,input and processing of data
     */
    public void init() {
        this.menu = new MenuTracker(this.input, this.tracker);
        do {
            this.menu.showMenu();
            try {
                this.menu.select(Integer.parseInt(this.input.ask("Select: ", new int[] {0, 1, 2, 3, 4, 5})));
            } catch (MenuOutException moe) {
                System.out.println(moe);
            }
        } while (!"exit".equals(input.ask("Enter 'exit' for exit or any key to continue...")));
    }

}
