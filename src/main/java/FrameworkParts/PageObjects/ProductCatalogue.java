package FrameworkParts.PageObjects;

import FrameworkParts.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ProductCatalogue extends AbstractComponent {

    WebDriver driver;

    public ProductCatalogue(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
    // or
    @FindBy(css = ".mb-3")
    List<WebElement> products;

    @FindBy(css = ".ng-animating")
    WebElement spinner;


    By productsBy = By.cssSelector(".mb-3");
    By addToCard = By.cssSelector(".card-body button:last-of-type");

    By toastMessage = By.cssSelector("#toast-container");

    public List<WebElement> getProducts(){
        waitForElementToAppear(productsBy);
        return products;
    }

    public WebElement getProductByName(String productName){
        WebElement prod = getProducts().stream()
                .filter(product -> product.findElement(By.cssSelector("b")).getText().equals(productName))
                .findFirst().orElse(null);
        return prod;
    }

    public void addProductToCart(String productName){
        WebElement prod = getProductByName(productName);
        prod.findElement(addToCard).click();
        waitForElementToAppear(toastMessage);
        waitForElementToDisappear(spinner);
    }

}
