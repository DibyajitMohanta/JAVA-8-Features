package com.duration;

import java.time.Duration;
import java.time.LocalTime;

public class Minus_method_plus_method {

	public static void main(String[] args) {
		//minus()
		Duration d1=Duration.between(LocalTime.NOON,LocalTime.MAX);
		System.out.println(d1.getSeconds());
		Duration d2=d1.minus(d1);
		System.out.println(d2.getSeconds());
		//plus()
		Duration d3=Duration.between(LocalTime.NOON,LocalTime.MAX);
		System.out.println(d3.getSeconds());
		Duration d4=d3.plus(d3);
		System.out.println(d4.getSeconds());

	}

}
