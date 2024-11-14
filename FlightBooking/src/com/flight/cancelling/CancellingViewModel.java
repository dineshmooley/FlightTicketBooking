package com.flight.cancelling;

import java.util.List;
import com.flight.dto.Flight;
import com.flight.dto.Passenger;
import com.flight.repository.Repository;

class CancellingViewModel {

	private String name;
	private int age;
	private int flightNo;
	private CancellingView cancellingView;
	private Repository repository = Repository.getInstance();
	
	CancellingViewModel(String name, int age, int flightNo, CancellingView cancellingView) {
		
		this.name = name;
		this.age = age;
		this.flightNo = flightNo;
		this.cancellingView = cancellingView;
		
		List<Flight> flightList = repository.getFlights();
		
		Flight flight = getFlight(flightNo, flightList);
		if(flight == null)	cancellingView.onNoFlight();
		
		if(cancelTicket(name, age, flight))	cancellingView.onSuccess();
		else cancellingView.onNoPassenger();
		
	}
	
	private boolean cancelTicket(String name, int age, Flight flight) {
		
		int noOfTicket = 0;
		for(Passenger pas: flight.getPassengers())	{
			if(pas.getAge() == age && pas.getName().equals(name))	{
				noOfTicket = pas.getNoOfSeats();
				flight.getPassengers().remove(pas);
				
				for(int i=1; i<=noOfTicket; i++)	{
					flight.setTicketPrice(flight.getTicketPrice() - 200);
				}
				
				return true;
				
			}
		}
		
		return false;
	}

	private Flight getFlight(int flightNo, List<Flight> flightList)	{
		
		Flight flight = null;
		for(Flight fl: flightList)	{
			if(fl.getFlightNo() == flightNo)	flight = fl;
		}
		
		return flight;
		
	}
	
	
	
	
}
