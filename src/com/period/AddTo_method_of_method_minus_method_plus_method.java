package com.period;

import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.Temporal;

public class AddTo_method_of_method_minus_method_plus_method {

	public static void main(String[] args) {
		//addTo()
		try {
		Period period=Period.ofDays(24);
		Temporal temp=period.addTo(LocalTime.now());
		System.out.println(temp);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		//of()
		Period period1=Period.of(2017,02,16);
		System.out.println(period1.toString());
		//minus()
		Period period2=Period.ofMonths(4);
		Period period3=period2.minus(Period.ofMonths(2));
		System.out.println(period3);
		//plus()
		Period period4=Period.ofMonths(4);
		Period period5=period4.plus(Period.ofMonths(2));
		System.out.println(period5);
	}

}
