package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test for FindSubStr.
 * @author achekhovsky
 * @version $Id$
 */
public class TrackerTest {
    /**
     * Test for Tracker.add and Tracker.updateItem methods
     */
    @Test
    public void whenUpdateWithEqualsIdThenConcatIntoOne() {
        Tracker track = new Tracker();
        Item i1 = new Item("First item", "First item for test");
        track.add(i1);
        i1.setId("fi");
        Item i2 = new Item("Second item", "Second item for test");
        i2.setId("fi");
        track.updateItem(i2);
        assertThat(track.findById("fi").getName(), is("Second item"));
    }
    /**
     * Test for Tracker.findAll method
     */
    @Test
    public void whenAddTwoItemThenFindAllSizeIsTwo() {
        Tracker track = new Tracker();
        Item i1 = new Item("First item", "First item for test");
        track.add(i1);
        Item i2 = new Item("Second item", "Second item for test");
        track.add(i2);
        assertThat(track.findAll().length, is(2));
    }

    /**
     * Test for Tracker.deleteItem method
     */
    @Test
    public void whenCreateFourButAddTreeItemAndDeleteOneThenFindAllSizeIsTwo() {
        Tracker track = new Tracker();
        Item i1 = new Item("First item", "First item for test");
        track.add(i1);
        Item i2 = new Item("Second item", "Second item for test");
        track.add(i2);
        Item i3 = new Item("Third item", "Third item for test");
        track.add(i3);
        Item i4 = new Item("Fourth item", "Fourth item for test");
        track.deleteItem(i2);
        track.deleteItem(i4);
        assertThat(track.findAll().length, is(2));
    }

    /**
     * Test for Tracker.findByName method
     */
    @Test
    public void whenAddTwoWithTheSameNameThenFindByNameSizeIsTwo() {
        Tracker track = new Tracker();
        Item i1 = new Item("First item", "First item for test");
        track.add(i1);
        Item i2 = new Item("Second item", "Second item for test");
        track.add(i2);
        Item i3 = new Item("Second item", "Third item for test");
        track.add(i3);
        Item i4 = new Item("Fourth item", "Fourth item for test");
        track.add(i4);
        assertThat(track.findByName("Second item").length, is(2));
    }

}