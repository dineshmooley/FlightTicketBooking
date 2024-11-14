package com.flight.cancelling;

import java.util.Scanner;

public class CancellingView {

	private String name;
	private int age;
	private int flightNo;
	
	public CancellingView() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		this.name = sc.next();
		
		System.out.println("Enter your age: ");
		this.age = sc.nextInt();
		
		System.out.println("Enter the flight number: ");
		this.flightNo = sc.nextInt();
		
		new CancellingViewModel(name, age, flightNo, this);
		
	}
	
	public void onSuccess() {
		System.out.println("Ticket has been cancelled successfully");
	}
	
	public void onNoPassenger() {
		System.out.println("There is no such passenger");
		new CancellingView();
	}
	
	public void onNoFlight() {
		System.out.println("There is no such flight");
		new CancellingView();
	}
		
}
