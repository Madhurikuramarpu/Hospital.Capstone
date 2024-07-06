package com.wipro.hopsital.exceptions;

public class AdminNotFoundException extends Exception {
	public AdminNotFoundException(String message) {
    	System.out.println("Admin not found");
    }


}
