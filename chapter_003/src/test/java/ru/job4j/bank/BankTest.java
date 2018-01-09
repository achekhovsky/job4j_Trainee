package ru.job4j.bank;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BankTest {
    /**
     * Test for Bank.addUser method
     */
    @Test
    public void whenCreateDuplicatePassThenException() {
        ByteArrayOutputStream expected = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(expected);
        System.setOut(out);

        AbstractBank bnk = new Bank(new HashMap<>());

        bnk.addUser(new User("User1", "2303 141421"));
        try {
            bnk.addUser(new User("User2", "2303 141421"));
        } catch (WrongPassportException wpe) {
            System.out.print(wpe.toString());
        }

        String actual = "WrongPassportException: This passport already used!";

        assertThat(actual, is(expected.toString()));
    }
    /**
     * Test for Bank.addAccountToUser method
     */
    @Test
    public void whenCreateDuplicateAccThenException() {
        ByteArrayOutputStream expected = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(expected);
        System.setOut(out);

        AbstractBank bnk = new Bank(new HashMap<>());

        bnk.addUser(new User("User1", "2303 141421"));
        try {
            bnk.addAccountToUser("2303 141421", new Account());
            bnk.addAccountToUser("2303 141421", new Account());
            bnk.addAccountToUser("2303 141421", bnk.getUserAccounts("2303 141421").get(0));
        } catch (WrongAccountException wpe) {
            System.out.print(wpe.toString());
        }

        String actual = "WrongAccountException: This account requisites already used!";

        assertThat(actual, is(expected.toString()));
    }
    /**
     * Test for Bank.addUser method
     */
    @Test
    public void whenAddTwoUsersThenBankContainTwoUsers() {
        AbstractBank bnk = new Bank(new HashMap<>());

        bnk.addUser(new User("User1", "2303 141421"));
        bnk.addUser(new User("User2", "2404 141421"));

        assertThat(2, is(bnk.getUsers().size()));
    }
    /**
     * Test for Bank.addAccountToUser method
     */
    @Test
    public void whenAddThreeAccountsToUserThenBankContainUserWithTreeAcc() {
        AbstractBank bnk = new Bank(new HashMap<>());

        bnk.addUser(new User("User1", "2303 141421"));
        bnk.addAccountToUser("2303 141421", new Account());
        bnk.addAccountToUser("2303 141421", new Account());
        bnk.addAccountToUser("2303 141421", new Account());

        assertThat(3, is(bnk.getUserAccounts("2303 141421").size()));
    }
    /**
     * Test for Bank.deleteUser method
     */
    @Test
    public void whenDeleteOneUserThenBankContainOnOneUserLess() {
        AbstractBank bnk = new Bank(new HashMap<>());

        AbstractUser usr = new User("User1", "2304 141421");

        bnk.addUser(new User("User1", "2303 141421"));
        bnk.addUser(usr);
        bnk.addUser(new User("User1", "2305 141421"));

        bnk.deleteUser(usr);

        assertThat(2, is(bnk.getUsers().size()));
    }
    /**
     * Test for Bank.deleteAccountFromUser method
     */
    @Test
    public void whenDeleteOneAccountFromUserThenUserContainOnOneAccountLess() {
        AbstractBank bnk = new Bank(new HashMap<>());

        bnk.addUser(new User("User1", "2303 141421"));
        bnk.addAccountToUser("2303 141421", new Account());
        bnk.addAccountToUser("2303 141421", new Account());
        bnk.addAccountToUser("2303 141421", new Account());

        bnk.deleteAccountFromUser("2303 141421", bnk.getUserAccounts("2303 141421").get(0));

        assertThat(2, is(bnk.getUserAccounts("2303 141421").size()));
    }
    /**
     * Test for Bank.transferMoney method
     */
    @Test
    public void whenTransferMoreMoneyThenIsInTheAccountThenNothing() {
        AbstractBank bnk = new Bank(new HashMap<>());

        Account srcAcc = new Account();
        srcAcc.setValue(200d);
        Account destAcc = new Account();

        bnk.addUser(new User("User1", "1111 111111"));
        bnk.addAccountToUser("1111 111111", srcAcc);
        bnk.addUser(new User("User2", "2222 222222"));
        bnk.addAccountToUser("2222 222222", destAcc);

        bnk.transferMoney("1111 111111",
                srcAcc.getRequisites(),
                "2222 222222",
                destAcc.getRequisites(), 250d);

        assertThat(200d, is(srcAcc.getValue()));
    }
    /**
     * Test for Bank.transferMoney method
     */
    @Test
    public void whenTransferMoneyToOtherAccountThenMoreMoneyOnThisAcc() {
        AbstractBank bnk = new Bank(new HashMap<>());

        Account srcAcc = new Account();
        srcAcc.setValue(200d);
        Account destAcc = new Account();

        bnk.addUser(new User("User1", "1111 111111"));
        bnk.addAccountToUser("1111 111111", srcAcc);
        bnk.addUser(new User("User2", "2222 222222"));
        bnk.addAccountToUser("2222 222222", destAcc);

        bnk.transferMoney("1111 111111",
                srcAcc.getRequisites(),
                "2222 222222",
                destAcc.getRequisites(), 150d);

        assertThat(150d, is(destAcc.getValue()));
    }

}