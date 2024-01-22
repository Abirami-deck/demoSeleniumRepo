import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
public class SectionBreak {
    private WebDriver driver;
    
    @Test(alwaysRun=true,groups="properties")
public void sectionbreak() {
	//Call from one method to another method             
        Settings useInstance = new Settings(driver);
        useInstance.setUp();
        useInstance.loginToApplication();
        useInstance.sectiondoc();
        useInstance.addSlidesection();                             
        useInstance.assertBrowseTemplate();
        useInstance.sectionasset();
        useInstance.usebtnsection();
        useInstance.FloaterSettings();
        useInstance.sectionlogo();
        
    }
}