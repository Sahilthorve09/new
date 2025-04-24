package com.practice_session;

public class Flight {
	
	 private String flightNumber;
	    private String airline;
	    private int capacity;
	    private float ticketRate;
	    private boolean isDomestic;
	    private char flightClass; // 'E' for economy, 'B' for business

	    // Constructor
	    public Flight(String flightNumber, String airline, int capacity, float ticketRate, boolean isDomestic, char flightClass) {
	        this.flightNumber = flightNumber;
	        this.airline = airline;
	        this.capacity = capacity;
	        this.ticketRate = ticketRate;
	        this.isDomestic = isDomestic;
	        this.flightClass = flightClass;
	    }

	    // Getters
	    public String getFlightNumber() {
	        return flightNumber;
	    }

	    public String getAirline() {
	        return airline;
	    }

	    public int getCapacity() {
	        return capacity;
	    }

	    public float getTicketRate() {
	        return ticketRate;
	    }

	    public boolean isDomestic() {
	        return isDomestic;
	    }

	    public char getFlightClass() {
	        return flightClass;
	    }

	    // Setters
	    public void setFlightNumber(String flightNumber) {
	        this.flightNumber = flightNumber;
	    }

	    public void setAirline(String airline) {
	        this.airline = airline;
	    }

	    public void setCapacity(int capacity) {
	        this.capacity = capacity;
	    }

	    public void setTicketRate(float ticketRate) {
	        this.ticketRate = ticketRate;
	    }

	    public void setDomestic(boolean isDomestic) {
	        this.isDomestic = isDomestic;
	    }

	    public void setFlightClass(char flightClass) {
	        this.flightClass = flightClass;
	    }

	    // Method to update ticket rate
	    public void updateTicketRate(float newRate) {
	        this.ticketRate = newRate;
	    }

	    // Method to check flight type
	    public void checkFlightType() {
	        if (isDomestic) {
	            System.out.println("Flight " + flightNumber + " is a Domestic flight.");
	        } else {
	            System.out.println("Flight " + flightNumber + " is an International flight.");
	        }
	    }

	    // Display flight details
	    public void displayFlightDetails() {
	        System.out.println("\nFlight Details:");
	        System.out.println("Flight Number: " + flightNumber);
	        System.out.println("Airline: " + airline);
	        System.out.println("Capacity: " + capacity);
	        System.out.println("Ticket Rate: ₹" + ticketRate);
	        System.out.println("Flight Class: " + (flightClass == 'E' ? "Economy" : "Business"));
	        checkFlightType();
	    }
	}
	

