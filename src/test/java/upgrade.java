import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
public class upgrade {
    private WebDriver driver;
    
    @Test(alwaysRun=true,groups="properties")
public void upgraded() {
	//Call from one method to another method             
        Settings useInstance = new Settings(driver);
        useInstance.setUp();
        useInstance.loginToApplication();
        useInstance.upgradebtn();
    }
}