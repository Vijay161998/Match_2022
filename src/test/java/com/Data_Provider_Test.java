package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_Test {

	
	@Test(dataProvider = "testData")
	private void adactin(String username,int password) {
	
		System.out.println(username);
		System.out.println(password);
	}
	
	
	@Test
	@DataProvider
	private Object[][] testData() {
	
	return new Object[][] {
		
		{"vijay",876},

		{"siva",37847}
		};

	}

	@Test(dataProvider = "testData")
	
	private void automation(String username,int password) {
	
		System.out.println(username);
		System.out.println(password);

		
	}
}