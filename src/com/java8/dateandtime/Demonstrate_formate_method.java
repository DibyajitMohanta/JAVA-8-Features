package com.java8.dateandtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Demonstrate_formate_method {

	public static void main(String[] args) {
	LocalDate d1=LocalDate.now();
	String d1str=d1.format(DateTimeFormatter.ISO_DATE);
	System.out.println("Date 1 in string : "+d1str);
	LocalDate d2=LocalDate.of(2002,05,01);
	String d2str=d2.format(DateTimeFormatter.ISO_DATE);
	System.out.println(d2str);
	}

}
