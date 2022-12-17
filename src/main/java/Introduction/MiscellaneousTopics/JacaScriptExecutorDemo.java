package Introduction.MiscellaneousTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class JacaScriptExecutorDemo {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\BrowserDrivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Stringu ne thonjeza eshte javascript code
        js.executeScript("window.scrollBy(0,600)");
        Thread.sleep(3000);
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");


        //get all numbers on the table, then check if the sum of them is given correctly

        List<WebElement> values = driver.findElements(By.xpath("//div[@class='tableFixHead'] //td[4]"));

        int sum = 0;
        for (int i = 0; i<values.size(); i++){
            //System.out.println(Integer.parseInt(values.get(i).getText()));   //values jane Strings, prandaj ketu i parsojm ne Integer
            sum = sum + Integer.parseInt(values.get(i).getText());
        }

        System.out.println(sum);

        int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());

        Assert.assertEquals(sum, total);



        //sum of the all prices in the other table on that page
        List<WebElement> values2 = driver.findElements(By.xpath("//table[@name='courses'] //td[3]"));

        int sum2 = 0;
        for (int i = 0; i<values.size(); i++){
            sum2 = sum2 + Integer.parseInt(values2.get(i).getText());
        }

        System.out.println(sum2);
    }
}
