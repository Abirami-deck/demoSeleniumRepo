
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class OldDocs {
    private static final Logger Log = LogManager.getLogger(OldDocs.class);
    private WebDriver driver;
    @Test(alwaysRun=true,groups="Validation")

    public void properties() {
        Settings useInstance = new Settings(driver);
        useInstance.setUp();
        useInstance.loginToApplication();
        useInstance.olddoc();
        useInstance.dropdowndb();                    
        useInstance.savePresentation();
        useInstance.Sharebtn();
        useInstance.publishSettings();             
        useInstance.close();                   
        useInstance.present();
        useInstance.presentclose();
      // useInstance.Moreoptions();
       useInstance.backtodb();
        useInstance.closeBrowser();
    }
}