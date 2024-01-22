import org.openqa.selenium.WebDriver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
//import java.util.ArrayList;

public class ViewProfile {
    private static final Logger Log = LogManager.getLogger(OldDocs.class);
    private WebDriver driver;
    @Test(alwaysRun=true,groups="properties")
public void profiles() {
        //call from method
        Settings useInstance = new Settings(driver);
        useInstance.setUp();
        useInstance.loginToApplication();
        useInstance.Viewprofile();
        useInstance.settings();
        useInstance.youraccountdetails();
        useInstance.lastname();
        useInstance.Designation();
        useInstance.Role();
        useInstance.Language();
        useInstance.OrgInfo();
        useInstance.Socialmedia();
        useInstance.closeBrowser();

    }
}