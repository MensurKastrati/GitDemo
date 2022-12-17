package Introduction.Dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\BrowserDrivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
		driver.findElement(By.className("ui-datepicker-today")).click();
		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("It's enabled.");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		for (int i = 0; i < 4; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		Select lista = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		lista.selectByValue("USD");

		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		
		//driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		driver.findElement(By.cssSelector("input[value='Search']")).click();
	}

}
