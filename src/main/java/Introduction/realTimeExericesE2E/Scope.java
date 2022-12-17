package Introduction.realTimeExericesE2E;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\BrowserDrivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
//1. Give me the count of links on the page
				// krejt linkat e kan tagname=a  -> Per kete arsye e perdorim: driver.findElements(By.tagName("a")).size();
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		
//2. Give me the count of links which are present on the Footer session.
		
		WebElement footerDriver = driver.findElement(By.xpath("//div[@id='gf-BIG']"));			
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
	
		
//3. Give me the count of links on the first colon of the Footer
		
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		
//4. Click on each link in the column and check if the pages are opening
		
		for (int i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++)
		{
			String clickOnLinkWithCTRL = Keys.chord(Keys.CONTROL,Keys.ENTER);  //Kjo e mban CTRL dhe klikon mi link - ne menyr qe me hap TAB te ri dhe mos me kalu ne faqen tjeter nga aktualja	
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkWithCTRL);
			
			Thread.sleep(5000);
			
		}
			
			//Go to each page and get the Title
			
			Set <String> abc = driver.getWindowHandles();
			Iterator<String> it = abc.iterator();
			
			while(it.hasNext()) {		
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());	
			}

		
	}

}
