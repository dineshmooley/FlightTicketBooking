# Flight Ticket Booking System
A console-based Flight Ticket Booking System built in Java, implementing the MVVM (Model-View-ViewModel) architecture. This project allows users to book and cancel flight tickets, view available flights, and learn about seats remaining in a simple, organized way.

## Features
- Book Flight Tickets: Allows users to select a flight and specify the number of tickets they wish to book. If seats are available, the booking is confirmed.
- Cancel Flight Tickets: Enables users to cancel previously booked tickets.
- Flight Details: Displays a list of available flights and the number of seats left.
## Project Structure
This project is structured according to the MVVM pattern:

- Model (Flight, Repository): Contains the core business logic and data, including flight details and seat availability.
- View (BookingView, CancellingView): Handles user interactions, receiving inputs for booking or canceling tickets and displaying results.
- ViewModel (BookingViewModel): Acts as a mediator between the View and the Model. It processes user input from the View, interacts with the Model to perform operations, and returns the results to the View for display.
## Classes
1. Main.java - The main entry point of the application. Guides users to book, cancel, or view flights.
2. BookingView.java - Captures user input for booking flights, then displays success or failure messages.
3. CancellingView.java - Manages ticket cancellation, taking the necessary details and showing results.
4. Repository.java - Contains flight information, such as flight numbers and seat availability, and implements the Singleton pattern to maintain a single instance across the application.
5. Flight.java - Represents a flight entity with properties like flightNo and seatAvailable.
6. BookingViewModel.java - The mediator between the View and Model for booking tickets, validating input, updating seat availability, and communicating outcomes back to the BookingView.

## Sample Usage
- Booking a Ticket: Enter the flight number and the number of seats you wish to book. The system will confirm the booking if seats are available.
- Canceling a Ticket: Provide the flight number and ticket details to cancel an existing booking.
- View Flights: Displays a list of available flights and remaining seats.
## Future Enhancements
- Adding user authentication to ensure secure access.
- Enhanced data storage, potentially integrating with a database for persistent storage.
- Additional validation for user input and improved error handling.
## Key Concepts and Skills
- Java Collections and data handling.
- MVVM Architecture for modular, testable, and maintainable code.
- Exception Handling for input validation and error management.
- Singleton Pattern for repository management.
