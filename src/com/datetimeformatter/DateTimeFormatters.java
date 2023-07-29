package com.datetimeformatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatters {

	public static void main(String[] args) {
		
		//Create a DateTimeFormatter for the desired format
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date=LocalDate.now();
		
		//Format a localDate to a string
		String formattedDate=date.format(formatter);
		System.out.println("Formatted date: "+formattedDate);
		
		//parse a date string into a localDate object
		String dateString="29-07-2023";
		LocalDate parsedDate=LocalDate.parse(dateString,formatter);
		System.out.println("Parsed date: "+parsedDate);

	}

}
