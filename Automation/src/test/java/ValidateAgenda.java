
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ValidateAgenda {
    private static final Logger Log = LogManager.getLogger(ValidateAgenda.class);
    private WebDriver driver;
    @Test(alwaysRun=true,groups="properties")

    public void agendaValidate() {

        // Call from one method to another method
        Settings useInstance = new Settings(driver);
        useInstance.setUp();
        useInstance.loginToApplication();
        useInstance.agendadoc();
        useInstance.addSlide();
        // Browse template
        useInstance.assertBrowseTemplate();
       useInstance.agenda();
       useInstance.usebtnagenda();
        useInstance.agendainsertbutton();
        useInstance.addpt();
        //useInstance.Moreoptions();
        useInstance.backtodb();
        useInstance.closeBrowser();
    }
}
