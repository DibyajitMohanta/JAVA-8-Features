package com.zoneddatetime;

import java.time.Period;
import java.time.ZonedDateTime;

public class Minus_Method {

	public static void main(String[] args) {
		ZonedDateTime zone=ZonedDateTime.now();
		ZonedDateTime m=zone.minus(Period.ofDays(126));
		System.out.println(m);

	}

}
