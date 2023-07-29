package com.Localdatetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Now_method {

	public static void main(String[] args) {
		LocalDateTime datetime1=LocalDateTime.now();
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatDateTime=datetime1.format(formatter);
		System.out.println(formatDateTime);
	}

}
