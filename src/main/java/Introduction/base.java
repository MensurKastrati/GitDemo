package Introduction;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {  // me ble produkte, me ARRAY, ArrayList

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\BrowserDrivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot", "Carrot"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		Thread.sleep(3000);
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for(int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-"); // 'split' e ndan texting prej simbolit '-' qe gjendet ne text
			String fromattedName = name[0].trim(); // kjo e mer pjesen e par te textit dmth 'Brokolli ' dhe e eliminon spacein dhe mbetet 'Brocolli'
			//format name to get the actual vegetable name (so that you don't need to write the full name with KG on the array)
			
			//convert array into arraylist for easy search
			//check whether name you get is present in array or not
			
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			int j = 0;
			if (itemsNeededList.contains(fromattedName))
			{
				j++;
				//now click on Add to Card
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();  // get(i) - per shkak se eshte 'driver.findelements' (me S ne fund)
				// this xpath finds 30 elements but since we but in this for loop & IF condition, it will find only the one which contains 'Cucumber' text.
				
				// nese gjenden 3 elemented, atehere ndalo iterimin:
				if (j == itemsNeeded.length)
					break;
				
			}
		}
		
	}

}
