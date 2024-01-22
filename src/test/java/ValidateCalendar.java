import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ValidateCalendar {
	
    private WebDriver driver;
    Settings useInstance = new Settings(driver);
    @Test(priority=0,groups="properties")

   public void calendarvalidate() {
        useInstance.setUp();
        useInstance.loginToApplication();
        useInstance.calendardoc();
        useInstance.addSlide();
        useInstance.BrowseTemplate();
    }
    @Test(priority=1,groups="properties")
    public void settings() {
        useInstance.TimeLine();
        useInstance.testCalendar();
       useInstance.insertdiagramslide();
        useInstance.date();
        useInstance.savevent();
        useInstance.settingscal();
        useInstance.Showtitle();
        useInstance.Displayview();
        useInstance.Closebtn();
        useInstance.deletebtn();
        useInstance.present();
//        useInstance.closepresent();
//        useInstance.backtodb();
        useInstance.closeBrowser();
    }
}


