import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class CustomOrder16889 {
    private static final Logger Log = LogManager.getLogger(DiagramProperties4183.class);
    private WebDriver driver;
    @Test(alwaysRun=true,groups="Validation")

   public void order() {
     Settings useInstance = new Settings(driver);
     useInstance.setUp();
     useInstance.loginToApplication();
     useInstance.customorder();
     useInstance.exportppt();
     useInstance.exportcredits();
     useInstance.exportcontinue();
     useInstance.backtodb();
     useInstance.customsorder();
     useInstance.closeBrowser();
    }
}