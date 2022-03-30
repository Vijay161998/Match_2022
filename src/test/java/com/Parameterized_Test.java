package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {
	
	
	@Test

	@Parameters({"username","password"})
	
	private void userLogin(String username,@Optional("876")int password) {

		System.out.println("Enter the Username:"+username);
		System.out.println("Enter the Password:"+password);
	}

}

