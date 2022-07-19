package org.tesss;
import org.test.Login;
import org.test.base.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class Softassert  extends BaseClass{
	
@BeforeClass
public static void beforeClass() {
}

	@AfterClass
	public  static void afterclass() {
		//quite();
	}
	
@	Test
public void test1()throws InterruptedException{
	chromeLaunch();
	impWait();
	urlLaunch("https://www.facebook.com/");
    SoftAssert s=new SoftAssert();
    s.assertEquals(getCurrentUrl().contains("facebook"),"verify Url");
	//Assert.assertTrue(b);
	//Assert.assertTrue("Url verify",getCurrenturl().contains("facebook"));
	Login l=new Login();
	
	sendkeys(l.getusername(),"saru");
	 s.assertEquals(getAttribute(l.getusername()),"saru","verify username");
	sendkeys(l.getpassword(),"2362");
	 s.assertEquals(getAttribute(l.getpassword()),"65367","verify password");
	
	Click(l.getbtnlogin());
	Thread.sleep(5000);
	s.assertTrue(getCurrentUrl().contains("privacy_mutation_token"),"After Login");
	
	
}}









