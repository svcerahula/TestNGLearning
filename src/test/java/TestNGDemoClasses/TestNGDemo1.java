package TestNGDemoClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.HashMap;
import java.util.Map;

public class TestNGDemo1 {

    public WebDriver wd1 = null;

    @BeforeSuite
    public void testbeforeSuite() {
        System.out.println("Testing Before Suite , will run very first");
    }

    @AfterSuite
    public void testAfterSuite() {
        System.out.println("Testing After Suite , will run after all test scope tests at the last");
    }
    @BeforeClass
    public void testBeforeClass() {
        System.out.println("Run before class "+ getClassName()+" execution");
    }

    @AfterClass
    public void testAfterClass() {
        System.out.println("Run after after class "+getClassName() +" execution");
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

    @Parameters({"AmazonUrl"})
    @Test
    public void goToAmazonHomePage(String amazurl) {
        wd1.get(amazurl);
        System.out.println("Inside Amazon HomePage India");
    }

    @Parameters({"chromeAttrName","chromeDriverPath"})
    @Test
    public void goToGoogleHomePage(String chromeAttrName, String chromeDriverPath ) {
        wd1.get("http://www.google.in");
        System.out.println("Inside Google HomePage India");
        Assert.fail("Purposefully failing the test");
    }
    @AfterMethod
    public void closeSetup() {
        wd1.close();
    }

    public String getClassName() {
        Class<?> enclosingClass = getClass().getEnclosingClass();
        if (enclosingClass != null) {
            return enclosingClass.getName();
        } else {
            return getClass().getName();
        }
    }
}
