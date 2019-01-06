package LibraryFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import UIOperations.txtBoxOperations;

public class LoginFunctions extends txtBoxOperations{
	
	static WebDriver driver;
	String nameProp;
	
	public static WebDriver setDriver(WebDriver driver)
	{
		System.setProperty("webdriver.chrome.driver", 
	               "C:\\eclipse\\DriversDownloaded\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
		
		
	}
	
	public static boolean navigateLink()
	{
		System.setProperty("webdriver.chrome.driver", 
	               "C:\\eclipse\\DriversDownloaded\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://cafetownsend-angular-rails.herokuapp.com/login");
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		if (actTitle.equalsIgnoreCase("CafeTownsend-AngularJS-Rails"))
		{
			driver.manage().window().maximize();
			return true; 
		}
		
		return false; 
	}
	
	public static void Login(String usrName, String Pswd)
	{
		//Enter username
		WebElement obj = driver.findElement(By.xpath( "//*[@id=\"login-form\"]/fieldset/label[1]/input"));
		boolean flag = obj.isDisplayed();
		if(flag)
		txtBoxOperations.enterText(obj,usrName);
		
		//Enter password
		obj = driver.findElement(By.xpath( "//*[@id=\"login-form\"]/fieldset/label[2]/input"));
		flag = obj.isDisplayed();
		if(flag)
		txtBoxOperations.enterText(obj,Pswd);
		
		//Click on LoginButton
		obj = driver.findElement(By.xpath( "//*[@id=\"login-form\"]/fieldset/button"));
		flag = obj.isDisplayed();
		if(flag)
		txtBoxOperations.clickButton(obj);
		
	}
	
	public static boolean validateLogin()
	{
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebElement errorMsg = driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/p[1]"));
		String a = errorMsg.getText();
		System.out.println(a);
		return true;
	}
	
	

}
