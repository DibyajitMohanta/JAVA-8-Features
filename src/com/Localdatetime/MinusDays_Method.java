package com.Localdatetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MinusDays_Method {

	public static void main(String[] args) {
		LocalDateTime datetime1=LocalDateTime.of(2017, 1,14,10,34);
		LocalDateTime datetime2=datetime1.minusDays(100);
		System.out.println("Before formatting: "+datetime2);
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		String formatDateTime=datetime2.format(format);
		System.out.println("After Formating: "+formatDateTime);
	}

}
