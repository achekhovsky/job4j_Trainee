package ru.job4j.bank;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class AccountTest {
    /**
     * Test for Account.transferHimself method
     */
    @Test
    public void whenTransferMoreMoneyThenOnAccThenFalse() {
        Account srcAcc = new Account();
        srcAcc.setValue(200d);
        Account destAcc = new Account();

        boolean expected = srcAcc.transferHimself(destAcc, 201d);

        assertThat(false, is(expected));
    }
    /**
     * Test for Account.transferHimself method
     */
    @Test
    public void whenTransferMoneyThenMoreMoneyOnTheDestAcc() {
        Account srcAcc = new Account();
        srcAcc.setValue(200d);
        Account destAcc = new Account();

        srcAcc.transferHimself(destAcc, 50d);

        assertThat(50d, is(destAcc.getValue()));
    }

}