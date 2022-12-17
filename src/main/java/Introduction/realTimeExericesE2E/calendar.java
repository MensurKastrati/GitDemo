package Introduction.realTimeExericesE2E;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\BrowserDrivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.erifly.eu/");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@id='FLGARTNj�drejtimshe']")).click(); //nje drejtimshe
		driver.findElement(By.xpath("//input[@id='DATUM_HIN_input']")).click();
		
		while (!driver.findElement(By.xpath("//select[@aria-label='Month']")).getText().contains("Janar")) {
			driver.findElement(By.xpath("//span[@xpath='1']")).click();
	
		}
		
		
		
		//Click on Date 27
		//Logic: Grab the common attribute, put it into list, and iterate
		
		List<WebElement> dates = driver.findElements(By.className("flatpickr-day"));
		
		for (int i = 0; i < dates.size(); i++) {
			
			String text = driver.findElements(By.className("flatpickr-day")).get(i).getText();
			if(text.equalsIgnoreCase("22")) {
				driver.findElements(By.className("flatpickr-day")).get(i).click();
				break;
			}
		}

	}

}
