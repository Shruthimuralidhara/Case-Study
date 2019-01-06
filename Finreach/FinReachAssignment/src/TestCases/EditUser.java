package TestCases;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditUser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
	               "C:\\eclipse\\DriversDownloaded\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://cafetownsend-angular-rails.herokuapp.com/login");
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//Enter username
		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/label[1]/input")).sendKeys("Luke");

		//Enter password
	    driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/label[2]/input")).sendKeys("Skywalker");

				
		//Click on LoginButton
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/button")).click();
		driver.manage().window().maximize();

		//Edit an existing user 
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"employee-list\"]/li[66]")).click();
	
        
		List<WebElement> element = driver.findElements(By.xpath("//*[@id=\"employee-list\"]"));
		element.get(0).click(); 
		driver.findElement(By.xpath("//*[@id=\"employee-list\"]/li[66]")).click();
		driver.findElement(By.xpath("//*[@id=\"bEdit\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div/div/div/form/fieldset/label[1]/input")).sendKeys("Edited");
		driver.findElement(By.xpath("/html/body/div/div/div/form/fieldset/div/button[1]")).click();
		
	}

}
