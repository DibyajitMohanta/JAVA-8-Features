package com.java8.dateandtime;

import java.time.LocalDate;

public class Demonstrate_parse_method {

	public static void main(String[] args) {
		String dlnstr="2011-09-01";
		LocalDate d1=LocalDate.parse(dlnstr);
		System.out.println("String to LocalDate: "+d1);
		
	}

}
