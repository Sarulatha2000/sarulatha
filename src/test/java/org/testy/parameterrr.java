package org.testy;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterrr {
	@Parameters({"username","password"})
		@Test
		public void testA1(String user,String pass) {
			System.out.println(user);	
			System.out.println(pass);	
			
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


