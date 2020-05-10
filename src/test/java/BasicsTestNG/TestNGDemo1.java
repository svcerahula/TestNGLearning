package BasicsTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class TestNGDemo1 {

    public WebDriver wd1 = null;

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
    public void goToAmazonHomePage() {
        wd1.get("http://www.amazon.in");
        System.out.println("Inside Amazon HomePage India");
    }

    @Test
    public void goToGoogleHomePage() {
        wd1.get("http://www.google.in");
        System.out.println("Inside Google HomePage India");
    }
    @AfterMethod
    public void closeSetup() {
        wd1.close();
    }
}
