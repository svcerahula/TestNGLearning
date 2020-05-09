package BasicsTestNG;

import org.testng.annotations.Test;

public class TestNGDemo3 {

    @Test
    public void webLoginCarLoan() {
        //selenium code for weblogin
        System.out.println("Selenium code for weblogin");
    }

    @Test
    public void mobileLoginCarLoan() {
        //appium code for mobile login
        System.out.println("appium code for login");
    }

    @Test
    public void mobileLogoutCarLoan() {
        //appium code for mobile login
        System.out.println("appium code for logout");
    }

    @Test
    public void mobileGotoHomePageCarLoan() {
        //appium code for mobile login
        System.out.println("appium code for go to homepage");
    }

    @Test
    public void restapiLoginCarLoan() {
        //rest api code for rest api login
        System.out.println("rest api code for login");
    }
}
