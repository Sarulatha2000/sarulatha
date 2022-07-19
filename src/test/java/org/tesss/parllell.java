package org.tesss;

import org.testng.annotations.Test;

public class parllell {
	@Test
		public void testA1() {
			
			System.out.println("TestA1");	
			System.out.println(Thread.currentThread().getId());
			
		}
		@Test
		public void testA2() {
			System.out.println("TESTA2");
			System.out.println(Thread.currentThread().getId());
			
	}
		@Test
		public void testA3() {
			System.out.println("TESTA3");
			System.out.println(Thread.currentThread().getId());
			
		}
@Test
		public void testB1() {
			System.out.println("TESTB1");
			System.out.println(Thread.currentThread().getId());
			
		}
		@Test
		public void testB2() {
			System.out.println("TESTB2");
			System.out.println(Thread.currentThread().getId());
			
	}
		@Test
		public void testB3() {
			System.out.println("TESTB3");
			System.out.println(Thread.currentThread().getId());
			
		}

		@Test
		public void testC1() {
			System.out.println("TESTC1");
			System.out.println(Thread.currentThread().getId());
			
			
		}
		@Test
		public void testC2() {
			System.out.println("TESTC2");
			System.out.println(Thread.currentThread().getId());
			
	}
		@Test
		public void testC3() {
			System.out.println("TESTC3");
			System.out.println(Thread.currentThread().getId());
			
		}
	}




