package Introduction.Dropdowns;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {
	
	// AutoSuggestive = kur i shkrun tri shkronjat e para (psh GER) dhe ta sygjeron komplet emrin posht (GERMANY).

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\BrowserDrivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");  // india, indionesia, British India.
		Thread.sleep(3000);
		
		
		
		List<WebElement> options = driver.findElements(By.cssSelector("li[class=\"ui-menu-item\"] a"));
		
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("india")) {
				option.click();
				break;
			}
		}
		

	}

}
