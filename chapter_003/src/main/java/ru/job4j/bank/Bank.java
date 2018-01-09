package ru.job4j.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Class of the bank
 * @author achekhovsky
 * @version 1.0
 */
public class Bank extends AbstractBank {
    /**
     * The constructor in which the users field is initialized
     * @param users - A collection containing users
     */
    public Bank(Map<AbstractUser, List<Account>> users) {
        super(users);
    }
    /**
     * Add a user
     * @param user - new user
     * @throws WrongPassportException - if the user's passport already exist
     */
    public void addUser(AbstractUser user) throws  WrongPassportException {
        if (this.getUsers().keySet().contains(user)) {
            throw new WrongPassportException("This passport already used!");
        } else {
            this.getUsers().put(user, new ArrayList<>());
        }
    }


}
