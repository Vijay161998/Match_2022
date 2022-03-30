package com.testng;

import org.testng.annotations.Test;

public class Dependency_Concept {
	
	@Test	
	private void mobile() {

		
		System.out.println("mobile prize");
	}
	
	@Test(dependsOnMethods = "watch")//depends upon watch method so first executed on watch

	private void discount() {


		System.out.println("discount for Watch");
	}

    @Test
    
    private void watch() {


    	System.out.println("Watch Prize");
	}

}

