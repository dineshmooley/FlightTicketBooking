package com.flight;

import java.util.Scanner;

import com.flight.booking.BookingView;
import com.flight.cancelling.CancellingView;
import com.flight.display.DisplayView;

public class Main {
	
	public static void main(String[] args)	{
		
		Scanner sc = new Scanner(System.in);
		boolean t = true;
		
		while(t)	{
			System.out.println(" 1. Book Ticket \n 2. Cancel Ticket \n 3. Flight Details \nEnter your choice: ");
			int ch = sc.nextInt();
			
			switch(ch)	{
			
			case 0:
				t = false;
				break;
			
			case 1:
				new BookingView();
				break;
				
			case 2:
				new CancellingView();
				break;
				
			case 3:
				new DisplayView();
				break;
				
			default:
				System.out.println("Please enter the valid inputs");
			
			}
		}
		
		sc.close();
	}
	
}
