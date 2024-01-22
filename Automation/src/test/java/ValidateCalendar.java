import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ValidateCalendar {
	
    private WebDriver driver;
    @Test(groups="Asset")

   public void calendarvalidate() {
	   
        
        //Call from one method to another method
        Settings useInstance = new Settings(driver);
        useInstance.setUp();
        useInstance.loginToApplication();
        useInstance.calendardoc();
        useInstance.addSlide();
        useInstance.assertBrowseTemplate();
        useInstance.TimeLine();
        useInstance.calendar();
        useInstance.insertdiagramslide();
        useInstance.date();
        useInstance.savevent();
        useInstance.settingscal();
        useInstance.Showtitle();
        useInstance.Displayview();
       // useInstance.Closebtn();
        useInstance.closeBrowser();
    }
}
  

