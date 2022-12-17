package Introduction.Dropdowns;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	
	// DYNAMIC drowpdown with WebDriver API
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\BrowserDrivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  //implicit wait
		  
		
		/*
		  	//a[@value='MAA']   -  Xpath for Chennai (city)
		  	 
		  	 Kur e zgjedh prej cilit qytet ki me fluturu, ne fillim ta gjen vetem ni element me emrin Chennai,
		  	 per shkak se dropdowni i listes se dyt (ku ki me shku) nuk eshte hap hala.
		  	 
		  	 Mirepo kur e hap dropdownin e dyt (listen e qyteteve ku ki me shku) atehere per secilen Value,
		  	 ti gjen 2 elemente - dmth edhe te listes se pare edhe te listes se dyte.
		  	 
		  	 E ne kete rast duhet te futet xpathi ne kllapa ( ) dhe te shtohet indexi 2 ne fund
		  	 (//a[@value='MAA'])[2]       Keshtu do ta zgjedh qytetin ne listen e dyte, dmth ku ki me shku
		  	 
		*/
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();  // buttoni i par prej cilit vend don me fluturu
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		/*
			But lots of companies don't like to use indexes and they don't accept this way of going to that element.
			Another way to find that sepecific element (on the second list) is with Parent-Child mechanism:
			
			Parent xPath (komplet dropdowni ose windowsi i listes):
			//div[@id="glsctl00_mainContent_ddl_originStation1_CTNR"]
			
			Child xPath:
			//a[@value='BLR']
			
			I bashkon dyjat dmth: "//div[@id="glsctl00_mainContent_ddl_originStation1_CTNR"] //a[@value='BLR']"
			
			Me nje SPACE ndermjet tyre i ndan
		 
		*/
		
		driver.findElement(By.xpath("//div[@id=\"ctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@value='MAA']")).click();
		
		
		// Calendar & Dates
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();  // data aktuale
		
		
	}

}
