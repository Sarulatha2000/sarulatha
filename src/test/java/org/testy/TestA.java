package org.testy;


import static org.junit.Assert.assertFalse;

import org.junit.Assert;
import org.junit.Test;

public class TestA {
	
		@Test
		public void testA1() {
			Assert.assertFalse(true);
			System.out.println("TestA1");	
			
		}
		@Test
		public void testA2() {
			System.out.println("TESTA2");
			
	}
		@Test
		public void testA3() {
			System.out.println("TESTA3");
			
		}
}