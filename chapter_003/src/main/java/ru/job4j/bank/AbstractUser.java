package ru.job4j.bank;

/**
 * Abstract class of the user
 * @author achekhovsky
 * @version 1.0
 */
public abstract class AbstractUser {
    private String name;
    private String passport;

    /**
     * The constructor in which the user's name and user's passport are initialized
     * @param name - the user name
     * @param passport - the user passport
     */
    AbstractUser(String name, String passport) {
        this.name = name;
        this.passport = passport;
    }

    /**
     * Getter for user name
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for user name
     * @param name - new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for user passport
     * @return the passport
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Setter for user passport
     * @param passport - new passport
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }
}
