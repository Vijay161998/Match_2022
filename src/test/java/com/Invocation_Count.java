package com.testng;

import org.testng.annotations.Test;

public class Invocation_Count {
	
	@Test(priority =-1)
	
	private void lanchBrowser() {
		
		System.out.println("LanchBrowser");
	}

	@Test
	
	private void lanchUrl() {
	
		System.out.println("LanchUrl");
	}
	
	@Test(priority = 1,  invocationCount = 3)
	
	private void refresh() {
	
		System.out.println("refresh");
	}
}
