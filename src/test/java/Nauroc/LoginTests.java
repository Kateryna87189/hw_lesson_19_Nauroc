package Nauroc;

import Nauroc.utils.DataProviders;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    @BeforeMethod
    public void preCondition(){

    }
    @Test
    public void testLogin() {
        app.getUserHelper().click(By.xpath("//a[normalize-space(text())='Вхід']"));
        app.getUserHelper().logInform("katranchik21@gmail.com");
        app.getUserHelper().passwordInform("Password@1");
        app.getUserHelper(). clickOnLoginButton();
    }
    @Test(dataProvider = "loginDataProvider", dataProviderClass = DataProviders.class)
    public void testDataProviderLogin(String email, String password) {
        app.getUserHelper().click(By.xpath("//a[normalize-space(text())='Вхід']"));
        app.getUserHelper().logInform(email);
        app.getUserHelper().passwordInform(password);
        app.getUserHelper(). clickOnLoginButton();
    }
    @AfterMethod
    public void postCondition(){


    }
}
