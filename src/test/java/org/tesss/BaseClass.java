package org.tesss;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.UnsupportedEncodingException;
import java.time.Duration;
import  java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	

//impwait
	public static void impWait(int i) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	//chromelaunch
	public static WebDriver chromeLaunch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		return driver;
	}
	public static WebDriver firefoxLaunch() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		return driver;
	}
	public static WebDriver edgeLaunch() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		return driver;
	}
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	public static void browserLaunch(String browsername) {
		switch (browsername) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
			
		case"edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
			
		case "fireforx":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		}
	}
	public static void sendkeys(WebElement e,String data) {
		e.sendKeys(data);
	}
	
	public static void clear(WebElement e) {
		e.clear();
	}
	public static void displayed (WebElement e) {
		boolean displayed = e.isDisplayed();
	}
	public static void enabled(WebElement e) {
		boolean enabled = e.isEnabled();
	}
	public static void selected(WebElement e) {
		boolean select = e.isSelected();
	}

	
	public static void cssValue(WebElement e,String propertyName) {
		e.getCssValue(propertyName);
	}
	public static void domAttribute(WebElement e,String name) {
		e.getAttribute(name);
	
	}
	public static void location(WebElement e) {
		e.getLocation();
	}
	public static void rectangle(WebElement e) {
		e.getRect();
	}
	
	public static void size(WebElement e) {
		e.getSize();
	}
	public static void tagName(WebElement e) {
		e.getTagName();
	}
	public static void text(WebElement e) {
		e.getText();
	}
	public static void hashCode(WebElement e,int object ) {
		int code = e.hashCode();
	}
	public static void accept() {
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	public static void dismiss() {
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}
	public static void promptAlert(String name) {
		Alert alert=driver.switchTo().alert();
		alert.sendKeys(name);
	}
	public static void getText(String Alert) {
		Alert alert=driver.switchTo().alert();
		alert.getText();
	}
	public static void getText() {
		Alert alert=driver.switchTo().alert();
		alert.getText();
	}
	public static void dragAndDrop(WebElement from,WebElement to) {
		Actions a=new Actions(driver);
		a.dragAndDrop(from, to).perform();
	}
	public static void actclick(WebElement target) {
		Actions a=new Actions(driver);
		a.click(target).perform();
	}
	public static void doubleclick(WebElement target) {
		Actions a=new Actions(driver);
		a.doubleClick().perform();
	}
	public static void contextclick(WebElement target) {
		Actions a=new Actions(driver);
		a.contextClick().perform();
	}
	public static void clickandHold () {
		Actions a=new Actions(driver);
		a.clickAndHold().perform();
	}
	public static void moveToElement(WebElement target) {
		Actions a=new Actions(driver);
		a.moveToElement(target).perform();
	}
	public static void release() {
		Actions a=new Actions(driver);
		a.release().perform();
	}
	public static void build() {
		Actions a=new Actions(driver);
		a.build().perform();
	}
	public static void ClickandHold(WebElement e) {
		Actions a=new Actions(driver);
		a.clickAndHold().perform();
	}
	public static void hashCode(int code) {
		Actions a=new Actions(driver);
		int hashCode = a.hashCode();
	}
	public static void Keydown(String key) {
		Actions a=new Actions(driver);
		a.keyDown(key).perform();
	}
	public static void keydown(WebElement from,String to) {
		Actions a=new Actions(driver);
		a.keyDown(from, to).perform();
	}
	public static void durationPause() {
		Actions a=new Actions(driver);
		a.pause(Duration.ofSeconds(10)).perform();
	}
	public static void perform() {
		Actions a=new Actions(driver);
		a.perform();
	}
	public static void upperCase() {
		Actions a=new Actions(driver);
		a.toString().toUpperCase();
	}
	public static void lowerCase() {
		Actions a=new Actions(driver);
		a.toString().toLowerCase();
	}
	public static void codePoint() {
		Actions a=new Actions(driver);
		a.toString().codePointAt(0);
	}
	public static void pointBefore() {
		Actions a=new Actions(driver);
		a.toString().codePointBefore(0);
	}
	public static void countPoint(int start,int end) {
		Actions a=new Actions(driver);
		a.toString().codePointCount(start, end);
	}
	public static void compareString(String value) {
		Actions a=new Actions(driver);
		a.toString().compareTo(value);
	}
	public static void concat(String value) {
		Actions a=new Actions(driver);
		a.toString().concat(value);
	}
	public static void contains(String value) {
		Actions a=new Actions(driver);
		a.toString().contains(value);
	}
	public static void contentEquals(String name) {
		Actions a=new Actions(driver);
		a.toString().contentEquals(name);
	}
	public static void endwith(String value) {
		Actions a=new Actions(driver);
		a.toString().endsWith(value);
	}
	public static void toEquals(String d) {
		Actions a=new Actions(driver);
		a.toString().equals(d);
	}
	public static void equalIgnoreCase(String s) {
		Actions a=new Actions(driver);
		a.toString().equalsIgnoreCase(s);
	}
	public static void getByte() {
		Actions a=new Actions(driver);
		a.toString().getBytes();
	}
	public static void getBytes(String ds) throws UnsupportedEncodingException {
		Actions a=new Actions(driver);
		a.toString().getBytes(ds);
	}
	public static void indexOf(int one) {
		Actions a=new Actions(driver);
		a.toString().indexOf(one);
	}
	public static void indexOfBoth(int start,int end) {
		Actions a=new Actions(driver);
		a.toString().indexOf(start, end);
	}
	public static void intern() {
		Actions a=new Actions(driver);
		a.toString().intern();
	}
	public static void isEmpty() {
		Actions a=new Actions(driver);
		a.toString().isEmpty();
	}
	public static void lastIndexOf(String end) {
		Actions a=new Actions(driver);
		a.toString().lastIndexOf(end);
	}
	public static void lastIndexOf1(String ofend) {
		Actions a=new Actions(driver);
		a.toString().lastIndexOf(ofend);
	}
	public static void lastIndexOf(int start,int end) {
		Actions a=new Actions(driver);
		a.toString().lastIndexOf(start, end);
	}
	public static void lastIndexOf(String d,int id) {
		Actions a=new Actions(driver);
		a.toString().lastIndexOf(d, id);
	}
	public static void length() {
		Actions a=new Actions(driver);
		a.toString().length();
	}
	public static void matches(String type) {
		Actions a=new Actions(driver);
		a.toString().matches(type);
	}
	public static void replace() {
		Actions a=new Actions(driver);
		a.toString().trim();
	}
	public static void tick(long pause) {
		Actions a=new Actions(driver);
		a.pause(pause);
	}
   public static void deselectall(WebElement e) {
		Select s=new  Select(e);
		s.deselectAll();
	}
   public static void name(WebElement e) {
	Select s=new Select(e);
	s.toString().hashCode();
   }

	public static void selectByIndex(WebElement object,int index) {
		Select s=new Select(object);
		s.deselectByIndex(index);
	}
	public static void deselectByValue(WebElement e,String value) {
		Select s=new Select(e);
		s.deselectByValue(value);
	}
	public static void deselectByVisibleText(WebElement e,String text) {
		Select s=new Select(e);
		s.deselectByVisibleText(text);
	}
	public static void equals(WebElement e,Object o) {
		Select s=new Select(e);
		s.equals(o);
	}
	public static void getFirstSelectOption(WebElement e) {
		Select s=new Select(e);
		s.getFirstSelectedOption();
	}
	public static void getWrappedElement(WebElement e) {
		Select s=new Select(e);
		s.getWrappedElement();
	}
	public static void hashcode(WebElement e,int code) {
		Select s=new Select(e);
		s.hashCode();
	}
	public static void isMultiple(WebElement e) {
		Select s=new Select(e);
		boolean multiple = s.isMultiple();
	}
	public static void quit() {
		driver.quit();
	}
	public static void close() {
		driver.close();
	}
	public static String getCurrentUrl() {
		String url=driver.getCurrentUrl();
		return url;
	
	}
	//getattribute
	public String getAttribute(WebElement e) {
		String s=e.getAttribute("value");
		return s;
	}
	//click
	public static void Click(WebElement target) {
		Actions a=new Actions(driver);
		a.click(target).perform();
	}
	
	
public static void switchIntoFrame(int index) {
		driver.switchTo().frame(index);
	}
	
	
	public static void pageSource(String pageSource) {
		driver.getPageSource();
	}
	public static void windowHandle() {
		driver.getWindowHandle();
	}
	public static void option() {
		driver.manage();
	}
	public static void navigation() {
		driver.navigate();
	}
	public static void getPageSource() {
		driver.getPageSource();
	}
	public static void optionManage() {
		driver.manage();
	}
	public static void indexFrame(int index) {
		driver.switchTo().frame(index);
	}
	public static void Concat(String value) {
		driver.toString().concat(value);
	}
	public static void keyPress(int keycode) throws AWTException {
		Robot r=new Robot();
		r.keyPress(keycode);
	}
	public static void keyRelease(int keycode) throws AWTException {
		Robot r=new Robot();
		r.keyRelease(keycode);
	}
	public static  void mousemove(int from,int to) throws AWTException {
		Robot r=new Robot();
		r.mouseMove(from, to);
	}
	public static void mousePress(int release) throws AWTException {
		Robot r=new Robot();
		r.mousePress(release);
	}
	public static void autoDelay() throws AWTException {
		Robot r=new Robot();
		r.getAutoDelay();
	}
	public static void pixelColor(int from,int to) throws AWTException {
		Robot r=new Robot();
		r.getPixelColor(from, to);
	}
	public static void waitForldle() throws AWTException {
		Robot r=new Robot();
		boolean waitForIdle = r.isAutoWaitForIdle();
	}
	public static void wheel(int from) throws AWTException {
		Robot r=new Robot();
		r.mouseWheel(from);
	}
	public static void autoPlay(int  value) throws AWTException {
		Robot r=new Robot();
		r.setAutoDelay(value);
	}
	public static void waitForldle1() throws AWTException {
		Robot r=new Robot();
		r.setAutoWaitForIdle(true);
	}
	public static void delay() throws AWTException {
		Robot r=new Robot();
		r.delay(0);
	}	
	public void selectByValue(Object object, String value) {
		Select s=new Select((WebElement) object);
		s.selectByValue(value);
	}}





















