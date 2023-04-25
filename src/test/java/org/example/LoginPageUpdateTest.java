package org.example;

import com.browser.FactoryBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageUpdateTest {
    @Test
    public void verifyLoginTest(){
        WebDriver driver=FactoryBrowser.setupBrowser("chrome","https://www.saucedemo.com/");

        PageFactory.initElements(driver,LoginPageUpdate.class);
}

}