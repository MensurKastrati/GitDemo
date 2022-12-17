package Introduction.Locators;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		
		// Sibling - Child to parent traverse
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\BrowserDrivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
		//kjo dmth shko te button[1] pastaj zgjidhe buttonin e par ne radhe qe eshte pas tij
		
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		
		
		//ndersa kjo eshte nese shkon te nje element, pastaj don me u kthy te parent i tij dhe me zgjedh nje element tjeter tek parent it tij
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
		
		
		
		
		
		

	}

}
