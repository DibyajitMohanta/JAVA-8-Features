package com.java8.dateandtime;

import java.time.LocalDate;

public class Now_MinusDays_PlusDays {

	public static void main(String[] args) {
		LocalDate now=LocalDate.now();
		LocalDate yesterday=now.minusDays(1);
		LocalDate tomorrow=yesterday.plusDays(2);
		System.out.println("Today date: "+now);
		System.out.println("Yesterday date: "+yesterday);
		System.out.println("Tomorow date: "+tomorrow);

	}

}
