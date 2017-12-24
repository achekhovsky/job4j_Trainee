package ru.job4j.collections.sort;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test for SortUser class
 */
public class SortUserTest {
    /**
     *  Test for SortUser.sort method
     */
    @Test
    public void whenUsersListThenUsersTreeSetSortedByAge() {
        SortUser su = new SortUser();
        ArrayList<User> unsortedLst = new ArrayList<User>();
        unsortedLst.add(new User("name1", 10));
        unsortedLst.add(new User("name2", 9));
        unsortedLst.add(new User("name3", 6));
        unsortedLst.add(new User("name4", 5));
        unsortedLst.add(new User("name5", 8));

        StringBuffer expected = new StringBuffer();
        expected.append("[name4 - 5, ");
        expected.append("name3 - 6, ");
        expected.append("name5 - 8, ");
        expected.append("name2 - 9, ");
        expected.append("name1 - 10]");

        assertThat(expected.toString(), is(su.sort(unsortedLst).toString()));
    }

    /**
     *  Test for SortUser.sortNameLength method
     */
    @Test
    public void whenLengthComparatorThenUsersSortedByNameLength() {
        SortUser su = new SortUser();
        ArrayList<User> unsortedLst = new ArrayList<User>();
        unsortedLst.add(new User("n", 1));
        unsortedLst.add(new User("name", 1));
        unsortedLst.add(new User("na", 1));
        unsortedLst.add(new User("nam", 1));

        StringBuffer expected = new StringBuffer();
        expected.append("[n - 1, ");
        expected.append("na - 1, ");
        expected.append("nam - 1, ");
        expected.append("name - 1]");

        assertThat(expected.toString(), is(su.sortNameLength(unsortedLst).toString()));
    }

    /**
     *  Test for SortUser.sortNameLength method
     */
    @Test
    public void whenAllFieldsThenUsersSortedByAllFields() {
        SortUser su = new SortUser();
        ArrayList<User> unsortedLst = new ArrayList<User>();
        unsortedLst.add(new User("A", 2));
        unsortedLst.add(new User("B", 4));
        unsortedLst.add(new User("A", 1));
        unsortedLst.add(new User("B", 3));

        StringBuffer expected = new StringBuffer();
        expected.append("[A - 1, ");
        expected.append("A - 2, ");
        expected.append("B - 3, ");
        expected.append("B - 4]");

        assertThat(expected.toString(), is(su.sortByAllFields(unsortedLst).toString()));
    }

}