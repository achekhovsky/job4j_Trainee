package ru.job4j.bank;

public class WrongAccountException extends RuntimeException {
    private String message = "";

    public WrongAccountException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format("WrongAccountException: %s", message);
    }
}
