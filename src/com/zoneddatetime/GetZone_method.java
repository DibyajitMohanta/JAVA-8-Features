package com.zoneddatetime;

import java.time.ZonedDateTime;

public class GetZone_method {

	public static void main(String[] args) {
		ZonedDateTime zone=ZonedDateTime.now();
		System.out.println(zone.getZone());
	}

}
