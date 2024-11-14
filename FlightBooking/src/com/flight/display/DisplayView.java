package com.flight.display;

import java.util.List;

import com.flight.dto.Flight;
import com.flight.dto.Passenger;
import com.flight.repository.Repository;

public class DisplayView {

	private Repository repository;
	private List<Flight> flightList;
	public DisplayView()	{
		
		repository = Repository.getInstance();
		
		this.flightList = repository.getFlights();
		
		for(Flight fl: flightList)	{
			System.out.println("Flight number: " + fl.getFlightNo());
			if(!fl.getPassengers().isEmpty()) {
				for(Passenger pass: fl.getPassengers())	{
					System.out.println(pass.toString());
				}
			} else	{
				System.out.println("The flight is empty");
			}
		}
	}
	
}
