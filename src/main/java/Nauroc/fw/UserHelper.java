package Nauroc.fw;

import Nauroc.core.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserHelper extends BaseHelper {

    public UserHelper(WebDriver driver) {

        super(driver);
    }

    Logger logger = LoggerFactory.getLogger(UserHelper.class);

    public void typePassword(String password) {
        logger.info("Type password "+ password);

    }



    public void passwordInform(String password) {
        driver.findElement(By.id("loginform-password")).click();
        driver.findElement(By.id("loginform-password")).clear();
        driver.findElement(By.id("loginform-password")).sendKeys(password);
    }

    public void logInform(String email) {
        driver.findElement(By.id("loginform-login")).click();
        driver.findElement(By.id("loginform-login")).clear();
        driver.findElement(By.id("loginform-login")).sendKeys(email);
    }



    public void clickOnLoginButton() {
        driver.findElement(By.xpath("//button[.='Увійти']")).click();
    }
}
