package TestNGDemoClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class TestNGDemo2 {
    WebDriver wd1 = null;

    @BeforeTest
    public void beforeTestExample() {
        System.out.println("Before Test example");
    }
    @BeforeMethod
    public void setupDriver() {
        System.setProperty("webdriver.chrome.driver","C:\\Rahula Space\\Drivers\\chromedriver_win32_ver79\\chromedriver.exe");
        ChromeOptions option1 = new ChromeOptions();
        Map<String,Object> prefs = new HashMap<>();
        //setting this value for ignoring /block notification in the browser
        prefs.put("profile.default_content_setting_values.notifications",2);
        option1.setExperimentalOption("prefs",prefs);
        wd1 = new ChromeDriver(option1);
    }

    @Test
    public void goToFlipKartHomePage() {
        wd1.get("https://www.flipkart.com/");
        System.out.println("Inside FlipKart Homepage");
        wd1.close();
    }

    @Test
    public void goToFacebookHomePage() {
        System.setProperty("webdriver.chrome.driver","C:\\Rahula Space\\Drivers\\chromedriver_win32_ver79\\chromedriver.exe");
        wd1 = new ChromeDriver();
        wd1.get("https://www.facebook.com/");
        System.out.println("Inside Facebook Homepage");
        wd1.close();
    }

    @AfterTest
    public void afterTestExample() {
        System.out.println("After Test example");
    }
}
