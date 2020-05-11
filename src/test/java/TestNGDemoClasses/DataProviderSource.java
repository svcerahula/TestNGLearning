package TestNGDemoClasses;

import org.testng.annotations.DataProvider;

public class DataProviderSource {

    @DataProvider
    public Object[][] dataSetCredentials() {
        Object[][] data2 = {{1,2},{3,4}};
        return new Object[][]{
                {"newdata1","newpasssword1"},
                {"newdata2","newpasssword2"}
        };
    }
}
