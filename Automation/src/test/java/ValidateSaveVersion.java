
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ValidateSaveVersion {
    private static final Logger Log = LogManager.getLogger(ValidateSaveVersion.class);
    private WebDriver driver;
@Test
 public void save() {        
        //Call from one method to another method
        Settings useInstance = new Settings(driver);
        useInstance.setUp();
        useInstance.loginToApplication();
        useInstance.saveversiondoc();
        //useInstance.Saveversion();
        useInstance.dropdowndb();                 
      useInstance.Saveversion();
        useInstance.Version1();
        useInstance.Saveversion1();
        useInstance.addSlide();
        useInstance.assertBrowseTemplate();
        useInstance.assertstack();
        useInstance.Explorestyles();
        useInstance.insertslidesave();
        useInstance.dropdowndb();  
        useInstance.Saveversion();
        useInstance.Versioning1();
        useInstance.Savedversion2();
        useInstance.dropdowndb();      
        useInstance.Viewbtn();
        useInstance.closeBrowser();
       
    }

}