package com.Localdatetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PlusDays_Method {

	public static void main(String[] args) {
	LocalDateTime datetime1=LocalDateTime.of(2017,1,14,10,34);
	LocalDateTime datetime2=datetime1.plusDays(120);
	System.out.println("Brfore Formatting: "+datetime2);
	DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
	String formatDateTime=datetime2.format(format);
	System.out.println("After formatting: "+formatDateTime);
	}

}
