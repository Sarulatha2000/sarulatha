package org.tesss;

import org.testng.annotations.DataProvider;

public class dataproviderr {
	
	@DataProvider(name="login",indices= {0,1,2},parallel=true)
	private Object[][] data(){
		Object[][]obj=new Object[][] {
			{"dinesh2022@gmail.com","1243435345"},
				{"green2022@gmail.com",	"231555555555"},	
				{"chennai2022@gmail.com","243656543"},
		};
		return obj;
	}
	

}
