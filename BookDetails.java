package com.practice_session;

public class BookDetails {
	 public static void main(String[] args) {
	        Novel novel = new Novel("The Alchemist", "Adventure");

	        System.out.println("Title: " + novel.getTitle());
	        System.out.println("Genre: " + novel.getGenre());
	    }
}
