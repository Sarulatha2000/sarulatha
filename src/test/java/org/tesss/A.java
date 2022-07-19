package org.tesss;

import org.testng.annotations.Test;

public class A {
	@Test(groups="smoke")
	private void TestA1() {
		System.out.print("TestA1");
	}
	@Test(groups="smoke")
	private void TestA2() {
		System.out.print("TestA2");
	}
	@Test(groups="smoke")
	private void TestA3() {
		System.out.print("TestA3");
	}
	@Test(groups="smoke")
	private void TestA4() {
		System.out.print("TestA4");
	}
	@Test(groups="smoke")
	private void TestA5() {
		System.out.print("TestA5");
	}
	@Test(groups="sanity")
	private void TestA6() {
		System.out.print("TestA6");
	}
	@Test(groups="Regersion")
	private void TestA7() {
		System.out.print("TestA7");
	}
}
