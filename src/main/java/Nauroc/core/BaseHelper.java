package Nauroc.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseHelper {
    protected WebDriver driver;

    public BaseHelper(WebDriver driver) {

        this.driver = driver;
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }
}
