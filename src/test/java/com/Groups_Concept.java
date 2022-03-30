package com.testng;


import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Groups_Concept {


	@Test(priority =-3,groups = "Study")

	private void book() {

		System.out.println("book");
	}

	@Test(priority = -1,groups = "Social Media")

	private void whatsapp() {

		System.out.println("Whatsapp");
	}

	@Ignore

 	@Test(groups = "Social Media")

	private void faceBook() {

		System.out.println("FaceBook");
	}

	@Test(groups = "Music")

	private void gana() {

		System.out.println("Gana");
	}

   @Test(priority =-2 , groups = "Music")

	private void wynkMusic() {

		System.out.println("WynkMusic");
	}

}

	

