package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test for StartUI.
 * @author achekhovsky
 * @version $Id$
 */
public class StubInputTest {
    /**
     * Test for StartUI action menu
     */
    @Test
    public void whenAddTwoItemThenFindAllSizeTwo() {
        Tracker trc = new Tracker();
        Input input = new StubInput(
                "0",
                "name1", "desc1",
                "0",
                "name2", "desc2",
                "6");
        new StartUI(trc, input).init();
        assertThat(trc.findAll().length, is(2));
    }
    /**
     * Test for StartUI action menu
     */
    @Test
    public void whenEditNameThenNameEditName() {
        Tracker trc = new Tracker();
        Item itm = new Item("Name", "Desc");
        trc.add(itm);
        itm.setId("id1");
        Input input = new StubInput(
                "2",
                "id1", "EditName", "EditDesc",
                "6");
        new StartUI(trc, input).init();
        assertThat(trc.findById("id1").getName(), is("EditName"));
    }
    /**
     * Test for StartUI action menu
     */
    @Test
    public void whenAddItemAndDeleteThenSizeZero() {
        Tracker trc = new Tracker();
        Item itm = new Item("Name", "Desc");
        trc.add(itm);
        itm.setId("id1");
        Input input = new StubInput(
                "3",
                "id1",
                "6");
        new StartUI(trc, input).init();
        assertThat(trc.findAll().length, is(0));
    }
    /**
     * Test for StartUI action menu
     */
    @Test
    public void whenAddItemThenFindItById() {
        Tracker trc = new Tracker();
        Item itm = new Item("Name", "Desc");
        trc.add(itm);
        itm.setId("id1");
        Input input = new StubInput(
                "4",
                "id1",
                "6");
        new StartUI(trc, input).init();
        assertThat(trc.findById("id1").getName(), is("Name"));
    }
    /**
     * Test for StartUI action menu
     */
    @Test
    public void whenAddTwoItemWithEqualsNameThenFindByNameSizeTwo() {
        Input input = new StubInput(
                "0",
                "name1", "desc1",
                "0",
                "name2", "desc2",
                "0",
                "name1", "desc3",
                "6");
        Tracker trc = new Tracker();
        new StartUI(trc, input).init();
        assertThat(trc.findByName("name1").length, is(2));
    }

}