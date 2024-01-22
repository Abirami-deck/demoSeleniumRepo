
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ValidateAgenda {
    private static final Logger Log = LogManager.getLogger(ValidateAgenda.class);
    private WebDriver driver;
    Settings useInstance = new Settings(driver);
    @Test(priority=0,alwaysRun=true,groups="properties")
    public void agendaValidate() {
        useInstance.setUp();
        useInstance.loginToApplication();
        useInstance.agendadoc();
        useInstance.addSlide();
        useInstance.BrowseTemplate();
    }
    @Test(priority=1,alwaysRun=true,groups="properties")
    public void properties() {
       useInstance.agenda();
       useInstance.usebtnagenda();
        useInstance.agendainsertbutton();
        useInstance.addpoint();
        useInstance.backtodb();
        useInstance.closeBrowser();
    }
}
