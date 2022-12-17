package Introduction.MiscellaneousTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class BrokenLinksAndSoftAssertion {

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\BrowserDrivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Broken URL  - 404 Not found

        // 1. Get all URLs tied up to the links using Selenium
        // Java methods will call URLs and gets you the status code
        // If status code > 400, then that url is not working (link is broken)

//        String linku = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
//        HttpURLConnection conn = (HttpURLConnection) new URL(linku).openConnection();
//        conn.setRequestMethod("HEAD");
//        conn.connect();
//        System.out.println(conn.getResponseCode());

        List< WebElement> allLinks = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
        SoftAssert a = new SoftAssert();

        for (WebElement link : allLinks){
            String url = link.getAttribute("href");
            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();

            int responseCode = conn.getResponseCode();
            System.out.println(responseCode);

            a.assertTrue(responseCode<400, "The link with text '"+link.getText()+"' is broken with code "+responseCode);

        }

        a.assertAll();

    }
}
