package Introduction.JavaStreams;

import graphql.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class LiveDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\BrowserDrivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //Test if when clicking on the colomn, the list gets sorted


        //1. click on column
        //2. capture all the webelements into list
        //3. capture (getText) of all webElements into new list - (original list)
        //4. sort on the original list - sorted list
        //5. compare orginial list vs sorted list


        driver.findElement(By.xpath("//tr/th[1]")).click();

        List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));

        List<String> originalList = elementsList.stream().map(s -> s.getText()).collect(Collectors.toList());

        List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

        Assert.assertTrue(originalList.equals(sortedList));

        List<String> price;

        // scan the name column with getText 'Beans', then print the prices of the Beans

        do {
            List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
            price = rows.stream()
                    .filter(s -> s.getText().contains("Rice"))
                    .map(s -> getPriceVeggie(s))             // metod e krijuar nga une
                    .collect(Collectors.toList());

            price.forEach(a -> System.out.println(a));

            if (price.size() < 1) {
                driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
            }
        }
        while (price.size() < 1);

    }

    private static String getPriceVeggie(WebElement s) {
        String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
        return priceValue;
    }
}
