package Nauroc.utils;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider
    public Object[][] CreateAccountDataProvider() {
        return new Object[][]{
                {"Simon", "Sidorov", "katranchik21@gmail.com", "Password@1"},
                {"Simon1", "Sidorov1", "katranchik1@gmail.com", "Password@2"},
                {"Simon2", "Sidorov2", "katranchik2@gmail.com", "Password@3"}
        };
    }

    @DataProvider
    public Object[][] loginDataProvider() {
        return new Object[][]{
                {"katranchik21@gmail.com", "Password@1"},
                {"katranchik21@gmail.com", "Password@1"},
                {"katranchik21@gmail.com", "Password@1"}
        };
    }
}
