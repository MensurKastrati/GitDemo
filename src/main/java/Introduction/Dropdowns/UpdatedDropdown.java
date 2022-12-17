package Introduction.Dropdowns;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\BrowserDrivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		//Checkbox 
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		// Check if the 'Return Date' is enabled or disabled
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());  // Kjo nuk funksionin sepse butoni eshte aktiv, mirepo vetem opacity i ndrron
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));  //display: block; opacity: 0.5;
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));   //display: block; opacity: 1;
		
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("it's enabled");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		
		
		
		//count the number of checkboxes:
		//fist get a common locator for all checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		driver.findElement(By.id("divpaxinfo")).click();   //Passangers
		Thread.sleep(2000);
		//driver.findElement(By.id("hrefIncAdt")).click();   // Adults +1
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	
		//ose +4 Adults
		int i = 1;	
		while (i < 5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		
		//ose
//		for (int i = 1; i<5; i++) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//		}
			
		driver.findElement(By.id("btnclosepaxoption")).click(); // Done
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}

}
