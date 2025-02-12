package Nauroc;

import Nauroc.utils.DataProviders;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{
    @BeforeMethod
    public void precondition() {
//        if (app.getCreateAccountHelper().isElementPresent(By.xpath("//a[contains(text(),'Реєстрація')]"))) {
//            app.getUserHelper().clickOnSignOutButton();
//        }

    }

    @Test
    public void testCreateAccount()  {
        app.driver.findElement(By.xpath("//a[contains(text(),'Реєстрація')]")).click();



        app.driver.findElement (By.xpath("//input[@id='firstname']")).click();
        app.driver.findElement (By.xpath("//input[@id='firstname']")).clear();
        app.driver.findElement (By.xpath("//input[@id='firstname']")).sendKeys("Simon");

        app.driver.findElement (By.xpath("//input[@id='lastname']")).click();
        app.driver.findElement (By.xpath("//input[@id='lastname']")).clear();
        app.driver.findElement (By.xpath("//input[@id='lastname']")).sendKeys("Sidorov");

        app.driver.findElement(By.id("email")).click();
        app.driver.findElement(By.id("email")).clear();
        app.driver.findElement(By.id("email")).sendKeys("katranchik21@gmail.com");

        app.driver.findElement(By.id("password")).click();
        app.driver.findElement(By.id("password")).clear();
        app.driver.findElement(By.id("password")).sendKeys("Password@1");

        app.driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
    }

    @Test(dataProvider = "CreateAccountDataProvider", dataProviderClass = DataProviders.class)
    public void testDataProviderCreateAccount(String name, String lastName, String email, String password){
        app.driver.findElement(By.xpath("//a[contains(text(),'Реєстрація')]")).click();



        app.driver.findElement (By.xpath("//input[@id='firstname']")).click();
        app.driver.findElement (By.xpath("//input[@id='firstname']")).clear();
        app.driver.findElement (By.xpath("//input[@id='firstname']")).sendKeys(name);

        app.driver.findElement (By.xpath("//input[@id='lastname']")).click();
        app.driver.findElement (By.xpath("//input[@id='lastname']")).clear();
        app.driver.findElement (By.xpath("//input[@id='lastname']")).sendKeys(lastName);

        app.driver.findElement(By.id("email")).click();
        app.driver.findElement(By.id("email")).clear();
        app.driver.findElement(By.id("email")).sendKeys(email);

        app.driver.findElement(By.id("password")).click();
        app.driver.findElement(By.id("password")).clear();
        app.driver.findElement(By.id("password")).sendKeys(password);

        app.driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
    }



}
