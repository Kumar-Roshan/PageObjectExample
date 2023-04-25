import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCart {
    WebDriver driver;
    By Product = By.className("secret_sauce");
    By AddProduct = By.id("add-to-cart-sauce-labs-backpack");
    By ViewCart = By.className("shopping_cart_link");

    public AddToCart(WebDriver driver) {
        this.driver = driver;
    }

    public void viewProduct(){
        driver.findElement(Product).click();
    }
    public void AddTheProduct(){
        driver.findElement(AddProduct).click();
    }
    public void ViewTheCart(){
        driver.findElement(ViewCart).click();
    }
}
