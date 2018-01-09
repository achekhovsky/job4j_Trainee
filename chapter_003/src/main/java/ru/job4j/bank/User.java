package ru.job4j.bank;
/**
 * Class of the user
 * @author achekhovsky
 * @version 1.0
 */
public class User extends AbstractUser {
    /**
     * The constructor in which the user's name and user's passport are initialized
     * @param name - the user name
     * @param passport - the user passport
     */
    User(String name, String passport) {
        super(name, passport);
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * @param o - the reference object with which to compare
     * @return true if this object is the same as the obj argument; false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        User user = (User) o;

        return this.getPassport().equals(user.getPassport());
    }

    /**
     * Returns a hash code value for the user
     * @return hash code
     */
    @Override
    public int hashCode() {
        return this.getPassport().hashCode();
    }

}
