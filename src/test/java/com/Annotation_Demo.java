package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_Demo {

	@BeforeSuite

	private void setProperty() {


		System.out.println("Set Property");
	}

	@BeforeTest

	private void url() {

		System.out.println("url");
	}

	@BeforeClass

	private void window_Open() {

		System.out.println("Open Successfully");
	}

	@Test

	private void login() {


		System.out.println("login");
	}

	@Test

	private void userName() {


		System.out.println("UserName");
	}


	@BeforeMethod

	private void browser_Lanch() {

		System.out.println("BrowserLanch");

	}

	@AfterMethod

	private void signout() {

		System.out.println("Signout");
	}

	@AfterClass

	private void verify_HomePage() {

		System.out.println("Verify HomePage");
	}

	@AfterTest

	private void close() {

		System.out.println("Close");
	}

	@AfterSuite

	private void deletercookies() {

		System.out.println("deletercookies");

		
	}

}
