package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LoginPageTest{

    ChromeDriver driver;
   @Test(priority = 1)
    void loginVerification () {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        LoginPage login =new LoginPage(driver);
        login.enterUsername();
        login.enterPassword();
        login.loginButton();



        driver.quit();
    }
   /* @Test(priority = 2)
    Void AddToCartVerification(){

        AddToCart Cart = new AddToCart(driver);
    }

    */
}
