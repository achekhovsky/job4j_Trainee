package ru.job4j.collections.listtomap;

import java.util.Random;

/**
 * Description user
 * @author achekhovsky
 *
 */
public class User {
	private final int id;
	private String name;
	private String city;
	
	private Random rnd = new Random();
	
	/**
	 * User's constructor
	 * @param name - user name
	 * @param city - user city
	 */
	public User(String name, String city) {
		this.id = rnd.nextInt(100);
		this.name = name;
		this.city = city;
	}

	/**
	 * Getter for name
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter for name
	 * @param name 
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter for city
	 * @return city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Setter for city
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Getter for id
	 * @return id
	 */
	public int getId() {
		return id;
	}
}
