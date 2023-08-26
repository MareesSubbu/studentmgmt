package com.asm.student.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Setter
@Getter
public class Address {

	private String addressLineOne;
	private String addressLineTwo;
	private String city;
	private String landmark;
	private String district;
	private String state;
	private String pincode;
	private String country;
	
}
