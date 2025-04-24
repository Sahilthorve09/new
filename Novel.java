package com.practice_session;

public class Novel extends Book {
	
	String genre;

    public Novel(String title, String genre) {
        super(title);  
        this.genre = genre;
    }

    // Method to get genre
    public String getGenre() {
        return genre;
    }
}
	

