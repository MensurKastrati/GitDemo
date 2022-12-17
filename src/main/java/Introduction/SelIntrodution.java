package Introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntrodution{
	
	public static void main(String[] args) {
		
		//Chrome - ChromeDriver -> Methods
		//Firefox - FirefoxDriver -> Methods
		//Safari - SafariBrowser -> Methods
		//WebDriver = it is an interface	
		// chromedriver.exe => Chrome browser
		// webdriver.chrome.driver -> value of path

				
//		ChromeDriver driver = new ChromeDriver(); //driver object here has access to all the methods of Chrome driver
		
		//Chrome
		//chromedriver.exe
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\BrowserDrivers/chromedriver_win32/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();  // driver object here has access to the methods of Chrome driver which are defined in Web Driver interface
		
		
		//Firefox
		// geckodriver.exe (webdriver.gecko.driver) - is like chromedriver for chrome, but this is for firefox
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Downloads\\BrowserDrivers\\geckodriver-v0.31.0-win64/geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
		
		//Microsoft Edge
		//msedgedriver.exe
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Lenovo\\Downloads\\BrowserDrivers\\edgedriver_win64/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
//		driver.close();  //closes only that particular tab
//		driver.quit();   //closes all windows that were opened by selenium
		
		
		
	}

}
