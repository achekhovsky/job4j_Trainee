package ru.job4j.tracker;

import java.util.Arrays;

/**
 * The main class in which organized interface user interaction
 */
public class StartUI {
    private static final String ADD =  "0";
    private static final String SHOW =  "1";
    private static final String EDIT =  "2";
    private static final String DELETE =  "3";
    private static final String FIND_BY_ID =  "4";
    private static final String FIND_BY_NAME =  "5";
    private static final String EXIT =  "6";

    private Tracker tracker;
    private Input input;

    /**
     * The output in the console menu for user interaction
     */
    private void showMenu() {
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    /**
     * Constructor which initializes the tracker and input method
     * @param trck - the tracker
     * @param input - the input method
     */
    public StartUI(Tracker trck, Input input) {
        this.tracker = trck;
        this.input = input;
    }

    public static void main(String[] args) {
        new StartUI(new Tracker(), new ConsoleInput()).init();
    }

    /**
     * The method of organizing the output,input and processing of data
     */
    public void init() {
        boolean exit = true;
        while (exit) {
            this.showMenu();
            switch (input.ask("Select: ")) {
                case ADD :
                    this.addToTracker();
                    break;
                case SHOW :
                    this.showAllItems();
                    break;
                case EDIT :
                    this.editItemFromTheTracker();
                    break;
                case DELETE :
                    this.deleteItemFromTheTracker();
                    break;
                case FIND_BY_ID:
                    this.findByIdFromTheTracker();
                    break;
                case FIND_BY_NAME:
                    this.findByNameFromTheTracker();
                    break;
                case EXIT :
                    exit = false;
                    break;
                default:  System.out.println("Entered the wrong value! Try again: ");
            }
        }
    }

    private void addToTracker() {
        tracker.add(new Item(
                input.ask("Enter the name: "),
                input.ask("Enter the description: "))
        );
    }

    /**
     * Show all items in the tracker
     */
    private void showAllItems() {
        System.out.println(Arrays.deepToString(tracker.findAll()));
    }

    /**
     * Edit item from the tracker
     */
    private void editItemFromTheTracker() {
        Item itm = new Item();
        itm.setId(input.ask("Enter item id: "));
        itm.setName(input.ask("Enter the name: "));
        itm.setDescription(input.ask("Enter the description: "));
        tracker.updateItem(itm);
    }

    /**
     * Delete item from the tracker
     */
    private void deleteItemFromTheTracker() {
        tracker.deleteItem(tracker.findById(input.ask("Enter item id: ")));
    }

    /**
     * Find by id item in the tracker
     */
    private void findByIdFromTheTracker() {
        System.out.printf("Finded item - %s " + System.lineSeparator(),
                tracker.findById(input.ask("Enter item id: "))
        );
    }

    /**
     * Find by name items in the tracker
     */
    private void findByNameFromTheTracker() {
        System.out.printf("Finded items - %s " + System.lineSeparator(),
                Arrays.deepToString(tracker.findByName(input.ask("Enter item name: ")))
        );
    }
}
