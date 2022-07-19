package org.tesss;

import org.testng.annotations.Test;




public class TestA {
	
		@Test(dataProvider="login")
		public void testA1(String user,String pass) {
			System.out.println("user");	
			System.out.println("pass");	
			
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