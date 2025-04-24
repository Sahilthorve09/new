package com.practice_session;

public class FlightDteails {

	public static void main(String[] args) {
        // Creating two flight objects
        Flight flight1 = new Flight("AI101", "Air India", 180, 5000.0f, true, 'E');
        Flight flight2 = new Flight("BA202", "British Airways", 250, 15000.0f, false, 'B');

        // Display original flight details
        flight1.displayFlightDetails();
        flight2.displayFlightDetails();

        // Update ticket rate
        flight1.updateTicketRate(5500.0f);
        flight2.updateTicketRate(14000.0f);

        // Display updated details
        System.out.println("\nAfter updating ticket rates:");
        flight1.displayFlightDetails();
        flight2.displayFlightDetails();
    }
	
}
