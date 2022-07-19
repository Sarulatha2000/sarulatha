package org.tesss;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testngggs {
	
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
	@Test(priority=5,invocationCount=5,enabled=false)
	private  void  test1() {
		System.out.println("tset1");
	}
	@Test(priority=-9)
	private void test2() {
		System.out.println("Test2");
	}
	@Test(priority=-8)
	private void test3() {
		System.out.println("Test3");
	

}}
