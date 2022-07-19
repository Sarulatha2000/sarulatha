

	

	import java.sql.Driver;

    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
   import org.test.base.BaseClass;

	public class Login extends BaseClass{
		
			



			public Login   () {
		     
			WebDriver driver = null;
			PageFactory.initElements(driver, this);
			}
//			@FindBy(id="email"),@FindBy(xpath="//input[@id="email']")})
		//	private WebElement txtusername;		
		
//			@FindAll({id="pass"),@FindBy(xpath="//input[@id="amzon']")})
//			private WebElement txtpassword;
//			
	  @FindBy(name="login")
		private WebElement btnlogin;
			
		@FindBy(xpath="//input[@type='text'])[2]")
		private WebElement username;
		
		@FindBy(xpath="input[contains(@class,'_2IX_2-_3mctLh VJZDxu']")
			private WebElement password;
		@FindBy(xpath="//bitton[contains(@type,'submit')]) [2]")
		private WebElement login;
		@FindBy(xpath="//button[contains(@class,'_2KpZ61_2doB4z')]")
		private WebElement Click;
		@FindBy(xpath="//input[contains(@class.'_3704LK')]")
		private WebElement search;
		@FindBy(xpath="//a[contains(@class,'_1_3W1N')]")
		private WebElement Loginbtn;
			
			
			
			//------------------GETTER---------------
			
		
			public WebElement getbtnlogin() {
				return getbtnlogin();
			}
			//	public WebElement getTxtusername1() {
					
				//	return getTxtusername1();
			//	}
			//	public WebElement getTxtpassword1() {
				
				//	return getTxtpassword1();
			//	}
			
			public WebElement getusername() {
				
				return getusername();
			}
			public WebElement getpassword() {
			
				return getpassword();
			}
			
			public Object getLocation() {
				
				return getLocation();
			}
			public WebElement getHotels() {
				
				return getHotels();
			}
			public WebElement getsubmit() {
			
				return getsubmit();
			}
			public WebElement getfirstname() {
			
				return getfirstname() ;
			}
			
			public WebElement getLastname() {
				
				return getLastname();
			}
			public WebElement getAdress() {
			
				return getAdress();
			}
			public WebElement getCcnum() {
			
				return getCcnum();
			}
			public Object getCcexpmonth() {
				
				return  getCcexpmonth();
			}
			public Object getCcexpyear() {
			
				return getCcexpyear();
			}
			public WebElement getfCcvv() {
			
				return getfCcvv();
			}
			public WebElement getBooknow() {
			
				return getBooknow();
			}
	}	

	



	
		


	
	


