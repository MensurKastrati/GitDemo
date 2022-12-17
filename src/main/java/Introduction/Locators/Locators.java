package Introduction.Locators;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	/*
	 ID
	 Xpath
	 CSS Selector
	 name
	 Class Name
	 Tag Name
	 Link Text
	 Partial Link Test
	 */
	
	public static void main(String[] args) throws InterruptedException {
		//implicit wait
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\BrowserDrivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  //implicit wait
		
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("123456");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());	
		driver.findElement(By.linkText("Forgot your password?")).click();  //kur eshte link perdoret linkText si ne kete rast: <a href="#">Forgot your password?</a>
		Thread.sleep(2000);     // 2 sekonda duhet me prit ngase nuk ndrrohet url mirpo vetem ndrrohet dizajni i faqet se pastaj mund te kete exception
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");     //  <input type="text" placeholder="Name">
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("54351234");
		//         //form/input    when you wrtite '//' it will look for 'form' on the hole page. Only '/' (/inpunt) will look for the input only inside the 'form'.   If we write //input it will look for 'input' in the hole page
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();  //this is to go to Log-in Page again
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");  //  Simboli * u perdor ketu sepse po dojm me na shfaq secilin type qe permban fjalen 'pass'-mirepo qe munesh me permbajt edhe shkronja tjera
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
		
	/*
		CSS selector: 
		
		1. tagname.classname
		2. tagname#id    or  
		3. tagname[attribute='value'
			
		example: <input type="text" placeholder="Username" id="inputUsername" value="">
		the CSS selector would be: input#inputUsername

		example: <input type="text" placeholder="Username" value="">
		CSS selector: input[placeholder='Username']			
	*/
		
	/*
		Xpath:
		
		//tagname[@attribute='value']     - you have to write // as well
	
	 	example: <input type="text" placeholder="Username" value="">
	 	//input[@placeholder='Username']	
		
	*/
		
		
	}

}
