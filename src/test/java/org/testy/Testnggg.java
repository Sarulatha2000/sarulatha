package org.testy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testnggg {
	
	public class sample{
		
		@BeforeClass
		
		private void beforeClass() {
			System.out.println("BeforeClass");
		}
		@AfterClass
		private void afterclass() {
			System.out.println("AfterClass");
		}
		@ BeforeMethod
		private void beforeMethod() {
			System.out.println("Before Method");
		}
		@AfterMethod
		private void afterMethod() {
			System.out.println("After Method");
		}
		@Test
		private void test1() {
			System.out.println("Test 1");
		}
		
		
	}

}
