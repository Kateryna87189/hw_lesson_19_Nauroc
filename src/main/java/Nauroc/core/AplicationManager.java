package Nauroc.core;

import Nauroc.fw.CreateAccountHelper;
import Nauroc.fw.UserHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class AplicationManager {
    private final String browser;
    public WebDriver driver;

    UserHelper userHelper;
    CreateAccountHelper createAccountHelper;



    public AplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("chrome-headless")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("headless");
            // options.addArguments("window-size=1920x1080");
            driver = new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("safari")) {
            driver = new SafariDriver();
        } else {

            throw new IllegalArgumentException("❌ Некорректный браузер: " + browser +
                    ". Доступные варианты: chrome, firefox, edge, safari.");
        }
        driver.get("https://naurok.com.ua/test");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        userHelper = new UserHelper(driver);
        createAccountHelper = new CreateAccountHelper(driver);
    }

    public UserHelper getUserHelper() {
        if (userHelper == null) {
            throw new IllegalStateException("UserHelper не ініціалізований. Викликайте init() перед використанням.");
        }
        return userHelper;
    }

    public CreateAccountHelper getCreateAccountHelper() {
        return createAccountHelper;
    }

    public void stop() {
        if (driver != null) {
            driver.quit();
        }
    }

}
