package com.duration;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Get_method_isNegativ_method_between_method {

	public static void main(String[] args) {
		//get()
		Duration d=Duration.between(LocalTime.NOON,LocalTime.MAX);
		System.out.println(d.get(ChronoUnit.SECONDS));
		//isNegativ()
		Duration d1=Duration.between(LocalTime.MAX,LocalTime.NOON);
		System.out.println(d1.isNegative());
		Duration d2=Duration.between(LocalTime.NOON,LocalTime.MAX);
		System.out.println(d2.isNegative());
		//between()
		Duration duration=Duration.between(LocalTime.NOON,LocalTime.MAX);
		System.out.println(duration.get(ChronoUnit.SECONDS));

	}

}
