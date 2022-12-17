package Introduction.JavaStreams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\BrowserDrivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        driver.findElement(By.id("search-field")).sendKeys("Rice");

        List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));  //5 results

        List<WebElement> filteredList = veggies.stream()
                .filter(s -> s.getText().contains("Rice"))
                .collect(Collectors.toList());
        //1 result

        Assert.assertEquals(veggies.size(),filteredList.size());

    }
}
