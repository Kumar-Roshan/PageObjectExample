package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Hello world!
 *
 */
public class LoginPage
{
    WebDriver driver;
    By username = By.id("user-name");
    By pass= By.id("password");

    By Login = By.id("login-button");

    public LoginPage(WebDriver driver){
        this.driver=driver;

    }
    public void enterUsername(){
        driver.findElement(username).sendKeys("standard_user");
    }
    public void enterPassword(){
        driver.findElement(pass).sendKeys("secret_sauce");
    }

   public void loginButton(){
        driver.findElement(Login).click();
   }
}
