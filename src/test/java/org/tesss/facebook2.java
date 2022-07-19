package org.tesss;
import org.test.Login;
import org.testng.annotations.Test;

public class facebook2 extends BaseClass {
	@Test(dataProvider="login",dataProviderClass=dataproviderr.class,    priority=-2,invocationCount=1,enabled=true)
	private void test1(String user,String pass) throws InterruptedException{
		chromeLaunch();
		   impWait(10);
   urlLaunch("https://www.facebook.com/");
   //softAssert s=new SoftAssert();
     //s.assertEquals(getCurrenturl().contains("facebook"),"verify Url");
  // Assert.assertTrue("Url verify",getcurrenturl().contains("facebook"));
  
   
   Login l =new Login();
   
   sendkeys(l.getusername(),user);
   //s.assertEquals(getAttribute(l.getusername()),"saru","verify username");
   sendkeys(l.getpassword(),pass);
   //s.assertEquals(getAttribute(l.getpassword()),"65367","verify password");
   Click(l.getbtnlogin());
   Thread.sleep(5000);
   //s.assertTrue(getCurrenturl().contains("privacy_mutation_token"),"After Login");	
		
	}}
