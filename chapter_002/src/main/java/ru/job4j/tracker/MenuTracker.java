package ru.job4j.tracker;

import java.util.Arrays;

/**
 * Show all items in the tracker
 */
class ShowAllAction implements UserAction {
    @Override
    public int key() {
        return 1;
    }
    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println(Arrays.deepToString(tracker.findAll()));
    }
    @Override
    public String info() {
        return this.key() + ". Show all items";
    }
}

/**
 * Display the menu and handle the actions selected by the user
 * @author achekhovsky
 * @version 1.0
 */
public class MenuTracker {
    private Input input;
    private Tracker tracker;
    private UserAction[] actions;

    /**
     * Constructor which initializes the tracker and input method
     * @param input -  input method
     * @param tracker - tracker
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
        actions  = new UserAction[6];
        this.fillMenu();
    }

    /**
     * Show menu in the console
     */
    public void showMenu() {
        for (UserAction ua : actions) {
            System.out.println(ua.info());
        }
    }

    /**
     * Handles the action that the user chooses
     * @param i - the index of action
     */
    public void select(int i) {
        this.actions[i].execute(this.input, this.tracker);
    }

    private void fillMenu() {
        this.actions[0] = new MenuTracker.AddAction();
        this.actions[1] = new ShowAllAction();
        this.actions[2] = this.new EditAction();
        this.actions[3] = this.new DeleteAction();
        this.actions[4] = this.new FindByIdAction();
        this.actions[5] = this.new FindByNameAction();
    }

    /**
     * Add item in the tracker
     */
    private static class AddAction implements UserAction {
        @Override
        public int key() {
            return 0;
        }
        @Override
        public void execute(Input input, Tracker tracker) {
            tracker.add(new Item(
                    input.ask("Enter the name: "),
                    input.ask("Enter the description: "))
            );
        }
        @Override
        public String info() {
            return this.key() + ". Add new item";
        }
    }
    /**
     * Edit item in the tracker
     */
    private class EditAction implements UserAction {
        @Override
        public int key() {
            return 2;
        }
        @Override
        public void execute(Input input, Tracker tracker) {
            Item itm = new Item();
            itm.setId(input.ask("Enter item id: "));
            itm.setName(input.ask("Enter the name: "));
            itm.setDescription(input.ask("Enter the description: "));
            tracker.updateItem(itm);
        }
        @Override
        public String info() {
            return this.key() + ". Edit item";
        }
    }
    /**
     * Delete item from the tracker
     */
    private class DeleteAction implements UserAction {
        @Override
        public int key() {
            return 3;
        }
        @Override
        public void execute(Input input, Tracker tracker) {
            tracker.deleteItem(tracker.findById(input.ask("Enter item id: ")));
        }
        @Override
        public String info() {
            return this.key() + ". Delete item";
        }
    }
    /**
     * Find item by id in the tracker
     */
    private class FindByIdAction implements UserAction {
        @Override
        public int key() {
            return 4;
        }
        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.printf("Finded item - %s " + System.lineSeparator(),
                    tracker.findById(input.ask("Enter item id: "))
            );
        }
        @Override
        public String info() {
            return this.key() + ". Find item by id";
        }
    }
    /**
     * Find item by name in the tracker
     */
    private class FindByNameAction implements UserAction {
        @Override
        public int key() {
            return 5;
        }
        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.printf("Finded items - %s " + System.lineSeparator(),
                    Arrays.deepToString(tracker.findByName(input.ask("Enter item name: ")))
            );
        }
        @Override
        public String info() {
            return this.key() + ". Find items by name";
        }
    }
}
