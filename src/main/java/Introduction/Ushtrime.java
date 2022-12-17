package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Ushtrime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\BrowserDrivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("autosuggest")).sendKeys("ind");  // india, indionesia, British India.
		Thread.sleep(3000);

		List<WebElement> opsionet = driver.findElements(By.cssSelector("li[class=\"ui-menu-item\"] a"));

		for (WebElement opsion : opsionet) {
			if (opsion.getText().equalsIgnoreCase("India")) {
				System.out.println(opsion.getText());
				opsion.click();
				break;
			}
		}


	}


}
