import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
public class Validatepitchcreation {
    private WebDriver driver;
    
    @Test(alwaysRun=true,groups="properties")

    	public void outline() {
    		//Call from one method to another method             
    	        Settings useInstance = new Settings(driver);
    	        useInstance.setUp();
    	        useInstance.loginToApplication();
    	        useInstance.UseanAItemplate();
    	        useInstance.continueaibtn();
    	        useInstance.aigeneratebutton();
    	        useInstance.welcomepresentscreen();
    	        useInstance.closeBrowser();
    	        // useInstance.clickorpress();
    }
}