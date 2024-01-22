
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class clipboard {
    private static final Logger Log = LogManager.getLogger(DiagramProperties4183.class);
    private WebDriver driver;
   
    @Test(alwaysRun=true,groups="properties")

   public void copy() {
////        //Call from one method to another method
     Settings useInstance = new Settings(driver);
     useInstance.setUp();
     useInstance.loginToApplication();
     useInstance.clipboarddoc();
     useInstance.outlineeditorclipboard();
     useInstance.clipboardtext();
    // useInstance.entersubtitleclip();
    }
}
