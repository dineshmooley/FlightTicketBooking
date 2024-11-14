package com.flight.booking;

import java.util.Scanner;

public class BookingView {
	
	private String name;
	private int age;
	private int flightNo;
	private int noOfTickets;
	
	public BookingView() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name: ");
		this.name = sc.next();
		
		System.out.println("Enter your age: ");
		this.age = sc.nextInt();
		
		System.out.println("Enter the flight number: ");
		this.flightNo = sc.nextInt();
		
		System.out.println("Enter the number of tickets: ");
		this.noOfTickets = sc.nextInt();
		
		new BookingViewModel(this, name, age, flightNo, noOfTickets);
		
	}
	
	public void onSuccess(int ticketCost)	{
		System.out.println("The Ticket has been successfully booked. It costed Rs." + ticketCost);
	}
	
	public void onFailure()	{
		System.out.println("The Ticket couldn't been booked");
		new BookingView();
	}
	
	public void onNoFlight()	{
		System.out.println("There is no such flight");
		new BookingView();
	}
	
}
