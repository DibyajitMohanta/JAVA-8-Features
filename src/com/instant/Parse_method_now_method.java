package com.instant;

import java.time.Instant;

public class Parse_method_now_method {

	public static void main(String[] args) {
		Instant inst=Instant.parse("2017-02-03T10:37:30.00Z");
		System.out.println(inst);
		Instant instant=Instant.now();
		System.out.println(instant);
	}
}
