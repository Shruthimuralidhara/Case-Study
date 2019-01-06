package TestCases;

import org.openqa.selenium.WebDriver;

import LibraryFunctions.LoginFunctions;
import UIOperations.txtBoxOperations;

public class TestCase01 extends LoginFunctions{
	//static WebDriver driver;

	public static void main(String[] args) {
		
		//Navigate to the website
		if (LoginFunctions.navigateLink())
		{
			System.out.println("Login to cafeTownSend Website successful");
		}
		else
		{
			System.out.println("Login to cafeTownSend Website unsuccessful");
		}
		
		//Login to the application
		LoginFunctions.Login("Luke","Skywalker");
		
		
		
		
		

	}

}
