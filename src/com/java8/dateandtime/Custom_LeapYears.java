package com.java8.dateandtime;

import java.time.LocalDate;
import java.util.Scanner;

public class Custom_LeapYears {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year");
		int year=sc.nextInt();
		System.out.println("Enter Month");
		int month=sc.nextInt();
		System.out.println("Enter date");
		int date=sc.nextInt();
		LocalDate leap=LocalDate.of(year, month, date);
		if(leap.isLeapYear())
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}
		
	}

}
