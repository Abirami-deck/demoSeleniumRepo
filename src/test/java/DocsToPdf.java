import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class DocsToPdf {
    private WebDriver driver;
    @Test(alwaysRun=true,groups="Validation")
    public void documents() {
      //Call from one method to another method
        Settings useInstance = new Settings(driver);
        useInstance.setUp();
        useInstance.loginToApplication();
        useInstance.pdfdoc();
        useInstance.Sharebtn();
        useInstance.Export();
        useInstance.Exporttopdf();
//       close();
//        useInstance.Sharebtn();
//        useInstance.Exports();
//        useInstance.Exporttoimage();
        useInstance.closeBrowser();
    }
}
    