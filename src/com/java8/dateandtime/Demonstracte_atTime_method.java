package com.java8.dateandtime;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class Demonstracte_atTime_method {
	public static void main(String[] args) {
		LocalDate date=LocalDate.of(2017, 1, 13);
		LocalDateTime datetime=date.atTime(1,50,9);
		System.out.println(datetime);
	}
}
