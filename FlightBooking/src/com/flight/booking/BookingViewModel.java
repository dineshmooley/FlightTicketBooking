package com.flight.booking;

import com.flight.dto.Flight;
import com.flight.dto.Passenger;
import com.flight.repository.Repository;

class BookingViewModel {
	
	private BookingView bookingView;
	private String name;
	private int age;
	private int flightNo;
	private int noOfSeat = 0;
	private Repository repository = Repository.getInstance();
		
	BookingViewModel(BookingView bookingView, String name, int age, int flightNo, int noOfSeat)	{
		
		this.bookingView = bookingView;
		this.name = name;
		this.age = age;
		this.flightNo = flightNo;
		this.noOfSeat = noOfSeat;
		
		Flight flight = null;
		for(Flight fl: repository.getFlights())	{
			
			if (fl.getFlightNo() == flightNo)	{
				flight = fl;
				break;
			}	 
		}
		if(flight == null)	bookingView.onNoFlight();
		else if(flight.getSeatAvailable() < noOfSeat)	bookingView.onFailure();
		
		else	{
			
			int ticketCost = 0;
			for(int i=1; i<=noOfSeat; i++)	{
				ticketCost += flight.getTicketPrice();
				flight.setTicketPrice(flight.getTicketPrice() + 200);
			}
			
			flight.setSeatAvailable(flight.getSeatAvailable() - noOfSeat);
			bookingView.onSuccess(ticketCost);
			flight.getPassengers().add(new Passenger(name, age, noOfSeat));
		}
		
	}
	
	
}
