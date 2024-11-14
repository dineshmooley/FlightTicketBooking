package com.flight.dto;

import java.util.ArrayList;
import java.util.List;

public class Flight {

	private int flightNo; 
	private int seatAvailable;
	private int ticketPrice;
	private List<Passenger> passengerList;
	
	public Flight(int flightNo) {
		
		this.flightNo = flightNo;
		this.seatAvailable = 50;
		this.ticketPrice = 5000;
		passengerList = new ArrayList<>();
		
	}
	
	public List<Passenger> getPassengers()	{
		
		return passengerList;
		
	}

	public int getFlightNo() {
		return flightNo;
	}

	public int getSeatAvailable() {
		return seatAvailable;
	}

	public void setSeatAvailable(int seatAvailable) {
		this.seatAvailable = seatAvailable;		
	}
	
	public int getTicketPrice()	{
		return ticketPrice;
		}
	
	public void setTicketPrice(int ticketPrice)	{
		this.ticketPrice = ticketPrice;
	}
	
}
