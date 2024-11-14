package com.flight.repository;

import java.util.ArrayList;
import java.util.List;
import com.flight.dto.Flight;

public class Repository {
	
	private static Repository repository;
	private List<Flight> flightList;
	
	private Repository()	{
		
		flightList = new ArrayList<>();
		flightList.add(new Flight(121));
		flightList.add(new Flight(556));
		flightList.add(new Flight(895));
		
	}
	
	public static Repository getInstance()	{
		
		if(repository == null)	repository = new Repository();
		return repository;
	}

	public List<Flight> getFlights() {
		
		return flightList;
	}

}
