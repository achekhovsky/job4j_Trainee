package ru.job4j.professions;

import java.util.Objects;

/**
 * This parent class for other professions.
 * @author achekhovsky
 * @version 1.0
 */
public class Profession {
    private String name;
    private String surname;
    private int age;

    /**
     * Construct a new Profession object with default values.
     */
    public Profession() {
        this.name = "";
        this.surname = "";
        this.age = 0;
    }

    /**
     * Construct a new Profession object with the specified values.
     * @param name - the name
     * @param surname - the surname
     * @param age - the age
     */
    public Profession(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    /**
     * This method return Profession.name
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * This method set Profession.name
     * @param name - value for Profession.name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method return Profession.surname
     * @return surname
     */
    public String getSurname() {
        return surname;
    }
    /**
     * This method set Profession.name
     * @param surname - value for Profession.surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * This method return Profession.age
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * This method set Profession.age
     * @param age - value for Profession.surname
     */
    public void setAge(int age) {
        this.age = age;
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

        Profession that = (Profession) o;

        if (age != that.age) {
            return false;
        }
        if (!name.equals(that.name)) {
            return false;
        }
        return surname.equals(that.surname);
    }

    /**
     * Hashcode
     * @return hashcode of the object
     */
    @Override
    public int hashCode() {
        int result = Objects.hash(getClass().getName(), this.name, this.surname, this.age);
        return result;
    }

    /**
     * The method returns a string that "textually represents" this object.
     * @return string representation of the object.
     */
    @Override
    public String toString() {
        return getClass().getName() + "{ " + name + " " + surname + " (age:" +  age + ") }";
    }
}
