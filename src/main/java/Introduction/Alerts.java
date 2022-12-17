package Introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\BrowserDrivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		
		String text = "Mensur";
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();		
		// here the  Pop up Alert with only one button will appear
		
		System.out.println(driver.switchTo().alert().getText());  //this will print the text of the alers
		driver.switchTo().alert().accept();       // this will accept the alert
		
		driver.findElement(By.id("confirmbtn")).click();
		// here the alert with two buttons (OK, Cancel) will appear.
		
		//we didn't fill the name here.. but it doesn't matter
		//System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();  // this will reject (no, cancel, etc...) the alert
		
		

	}

}
