package Introduction.Locators;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		
		String name = "mensur";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\BrowserDrivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  //implicit wait
		
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.className("signInBtn")).click();
		
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText()); //ose rreshti i meposhtem 
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		
		System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText()); ////ose rreshti i meposhtem 
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");  //name eshte variabla String name = "Mensur" 
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
		//driver.close();
								
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		
		//Please use temporary password 'rahulshettyacademy' to Login.
		//passwordText.split("'"); // this will divide the sentence into two parts (arrays)or indexes.
		//0th index - Please use temporary password 
		//1st index - 'rahulshettyacademy' to Login.
		
		// so wee need to access the 1st index like this:
		String[] passwordArray = passwordText.split("'");
		passwordArray[1].split("'");
		
		//0th index = rahulshettyacademy
		//1st index =  to Login.
//		String[] passwordArray2 = passwordText.split("'");
//		passwordArray2[0].split("'");
		
		//or instead of creating two arrays, you can write:
		String password = passwordArray[1].split("'")[0];
		
		return password;
		
		
	}

}
