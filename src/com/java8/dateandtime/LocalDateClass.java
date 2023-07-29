package com.java8.dateandtime;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateClass {

	public static void main(String[] args) {
		LocalDate now=LocalDate.now();
		System.out.println(now);
		//custom date
		LocalDate customDate=LocalDate.of(1990, 02, 07);
		System.out.println(customDate);
		int monthValue = now.getMonthValue();
		System.out.println(monthValue);
		int dayOfMonth = now.getDayOfMonth();
		Month month = now.getMonth();
		int year = now.getYear();
		System.out.println(dayOfMonth);
		System.out.println(month);
		System.out.println(year);
	}

}
