
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class RealTime {
    private static final Logger Log = LogManager.getLogger(RealTime.class);
    private WebDriver driver;

    @Test(alwaysRun=true,groups="properties")
   public void share() {
        //Call from one method to another method
        Settings useInstance = new Settings(driver);
        useInstance.setUp();
        useInstance.loginToApplication();
        useInstance.realtime();
        useInstance.Sharbutton();
        useInstance.edit();
        useInstance.Invitemembers();
       useInstance.mail();
        useInstance.sendinvite();
        useInstance.closeBrowser();
    }
}