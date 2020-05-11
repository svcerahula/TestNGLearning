package TestNGDemoClasses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGDemo3 {
    @Parameters({"URL"})
    @Test(timeOut = 20)
    public void webLoginCarLoan(String url) {
        //selenium code for weblogin
        System.out.println("Selenium code for weblogin carloan");
        System.out.println(url+ "in method webLoginCarLoan()");
    }

    @Parameters({"URL"})
    @Test(enabled=true)
    public void webLoginHomeLoan(String url) {
        System.out.println("Selenium code for weblogin homeloan");
        System.out.println(url+ "in method webLoginHomeLoan()");
    }
    @Test(dataProvider="getData")
    public void mobileLoginCarLoan(String username,String password) {
        //appium code for mobile login
        System.out.println("appium code for login");
        System.out.println("for mobile login : username : "+username+" password : "+ password);
    }

    @Test(groups={"regressionTests"})
    public void mobileLogoutCarLoan() {
        //appium code for mobile login
        System.out.println("appium code for logout");
    }

    @Test(groups={"mobileTests"})
    public void mobileGotoHomePageCarLoan() {
        //appium code for mobile login
        System.out.println("appium code for go to homepage");
    }

    @Test(dependsOnMethods = {"webLoginCarLoan","webLoginHomeLoan"})
    public void apiLoginCarLoan() {
        //rest api code for rest api login
        System.out.println("rest api code for login");
    }

    @Test(dataProvider = "dataSetCredentials",dataProviderClass = DataProviderSource.class)
    public void webLoginPersonalLoan(String username, String password) {
        System.out.println("Selenium code for weblogin personal loan");
        System.out.println("user : "+username+ " passwd : "+password);
    }
    @DataProvider
    public Object[][] getData() {
        return new Object[][]{
                {"rahula","password1"},
                {"omkar","password2"}
        };
    }
}
