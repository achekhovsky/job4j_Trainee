package ru.job4j.bank;

/**
 * The class that describes the account of the user
 * @author achekhovsky
 */
public class Account {
    private String requisites;
    private double value = 0d;

    /**
     * The constructor in which the account requisites are initialized
     */
    public Account() {
        this.requisites = this.generateRequisites();
    }

    /**
     * Money transfer from account to account
     * @param acc - account for the transfer
     * @param amount - transfer amount
     * @return true if the transfer is carried out, otherwise false
     */
    public boolean transferHimself(Account acc, double amount) {
        boolean success = false;
        if (acc != null && amount > 0 && this.value >= amount) {
            acc.value += amount;
            this.value -= amount;
            success = true;
        }
        return success;
    }

    /**
     * Getter for requisites
     * @return requisites
     */
    public String getRequisites() {
        return requisites;
    }

    /**
     * Getter for value
     * @return value
     */
    public double getValue() {
        return value;
    }

    /**
     * Setter for value
     * @param value
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Generation of a unique requisites
     * @return unique requisites
     */
    private String generateRequisites() {
        return String.format("acc_%s", this.hashCode());
    }

}
