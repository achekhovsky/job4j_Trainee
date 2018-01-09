package ru.job4j.bank;

public class WrongPassportException extends RuntimeException {
    private String message = "";

    public WrongPassportException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format("WrongPassportException: %s", message);
    }
}
