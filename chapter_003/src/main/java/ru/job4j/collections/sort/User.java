package ru.job4j.collections.sort;

public class User implements Comparable<User> {
	private String name;
	private int age;

	/**
	 * User constructor
	 * @param name - the user name
	 * @param age - the user age
	 */
	public User(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}
	
	@Override
	public int compareTo(User arg0) {
		return Integer.compare(this.age, arg0.age);
	}
	
	@Override
	public String toString() {
		return String.format("%s - %s", this.name, this.age);
	}

	/**
	 * Getter for name
	 * @return User name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter for name
	 * @param name - the user name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter for age
	 * @return User age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Setter for age
	 * @param age - the user age
	 */
	public void setAge(int age) {
		this.age = age;
	}

}
