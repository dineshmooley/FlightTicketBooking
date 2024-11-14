package com.flight.dto;

public class Passenger {

	private String name;
	private int age;
	private int noOfSeats;
	
	public Passenger(String name, int age, int noOfSeats) {
		this.name = name;
		this.age = age;
		this.noOfSeats = noOfSeats;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public int getNoOfSeats()	{
		return noOfSeats;
	}

	@Override
	public String toString() {
		return "Passenger [name=" + name + ", age=" + age + ", noOfSeats=" + noOfSeats + "]";
	}
	
	
	
}
