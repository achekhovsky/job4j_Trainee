package ru.job4j.bank;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Abstract class of the bank
 * @author achekhovsky
 * @version 1.0
 */
public abstract class AbstractBank {
    private Map<AbstractUser, List<Account>> users;

    /**
     * The constructor in which the users field is initialized
     * @param users - A collection containing users
     */
    AbstractBank(Map<AbstractUser, List<Account>> users) {
        this.users = users;
    }

    /**
     * Add a user
     * @param user - new user
     * @throws WrongPassportException - if the user's passport already exist
     */
    abstract void addUser(AbstractUser user) throws WrongPassportException;
    /**
     * Remove user form the collection
     * @param user - deleted user
     */
    void deleteUser(AbstractUser user) {
        this.users.remove(user);
    }

    /**
     * Add account to user
     * @param passport - the passport of the user to which the account is added
     * @param account - new account
     * @throws WrongAccountException - if the account already exist
     */
    void addAccountToUser(String passport, Account account) throws  WrongAccountException {
        for (Account acc : this.getUserAccounts(passport)) {
            if (acc.getRequisites().equals(account.getRequisites())) {
                throw new WrongAccountException("This account requisites already used!");
            }
        }
        this.getUserAccounts(passport).add(account);
    }
    /**
     * Delete account from the user
     * @param passport - the passport of the user to which the account is deleted
     * @param account - deleted account
     */
    void deleteAccountFromUser(String passport, Account account) {
        this.getUserAccounts(passport).remove(account);
    }
    /**
     * Receiving of all accounts of the user
     * @param passport - the passport of the user
     * @return List of all accounts of the user
     */
    List<Account> getUserAccounts(String passport) {
        List<Account> result = null;
        Iterator iterator = users.keySet().iterator();
        while (iterator.hasNext()) {
            AbstractUser us = (AbstractUser) iterator.next();
            if (us.getPassport().equals(passport)) {
                result = users.get(us);
                break;
            }
        }
        return result;
    }
    /**
     * Transfer of money from account to account
     * @param srcPassport - the passport of the user from whose account the money will be transferred
     * @param srcRequisite - account requisites from which money will be transferred
     * @param destPassport - the passport of the user to the account of which money will be transferred
     * @param destRequisite - account requisites to which money will be transferred
     * @param amount - transfer amount
     * @return - true if success, else - false
     */
    boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite, double amount) {
        boolean result = false;

        Account srcAcc = null;
        Account destAcc = null;

        Iterator iterator = users.keySet().iterator();
        while (iterator.hasNext() && (srcAcc == null || destAcc == null)) {
            AbstractUser usr = (AbstractUser) iterator.next();
            if (usr.getPassport().equals(srcPassport)) {
                for (Account acc : users.get(usr)) {
                    if (acc.getRequisites().equals(srcRequisite)) {
                        srcAcc = acc;
                    }
                }
                if (srcAcc == null) {
                    break;
                }
                continue;
            } else if (usr.getPassport().equals(destPassport)) {
                for (Account acc : users.get(usr)) {
                    if (acc.getRequisites().equals(destRequisite)) {
                        destAcc = acc;
                    }
                }
                if (destAcc == null) {
                    break;
                }
            }
        }

        if (srcAcc != null && destAcc != null) {
            result = srcAcc.transferHimself(destAcc, amount);
        }

        return result;
    }
    /**
     * Getter for users
     * @return users
     */
    Map<AbstractUser, List<Account>> getUsers() {
        return users;
    }
    /**
     * Users in the string view
     * @return users in the string view
     */
    @Override
    public String toString() {
        StringBuilder strB = new StringBuilder();

        for (AbstractUser user : users.keySet()) {
            strB.append(String.format("%s (%s): ", user.getName(), user.getPassport()));
            if (users.get(user) != null) {
                for (Account acc : users.get(user)) {
                    strB.append(String.format("%s[%s] ", acc.getRequisites(), acc.getValue()));
                }
            }
            strB.append(System.lineSeparator());
        }
        return strB.toString();
    }
}
