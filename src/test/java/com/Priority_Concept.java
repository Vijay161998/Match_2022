package com.testng;

import org.testng.annotations.Test;

public class Priority_Concept {

	@Test(priority =-3)

	private void book() {

		System.out.println("book");
	}

	@Test(priority = -1)

	private void whatsapp() {

		System.out.println("Whatsapp");
	}

	
	
	@Test(priority = 1)

	private void faceBook() {

		System.out.println("FaceBook");
	}

	@Test

	private void gana() {

		System.out.println("Gana");
	}

	@Test(priority = -1)

	private void wynkMusic() {

		System.out.println("WynkMusic");
	}

}


