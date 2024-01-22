import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ValidateLinkOptions {
    private WebDriver driver;
    Settings useInstance = new Settings(driver);
    @Test(priority=0,groups="properties")
    
    public void linkoptions() {  
        useInstance.setUp();
        useInstance.loginToApplication();
        useInstance.linkoptionsdoc();
        useInstance.addSlide();
        useInstance.BrowseTemplate();
        useInstance.process();
        useInstance.smallprocess();
        useInstance.explorestylesdiagram();
        useInstance.insertdiagramslide();
        useInstance.amazingtemplink();
        useInstance.Hyperlink();
        useInstance.URL();
        useInstance.titletext();
        useInstance.deletebtn();
        useInstance.undo();
        useInstance.present();
        useInstance.amazingtemppresent();
        useInstance.closeBrowser();
    }
     @Test(priority=1,groups="properties")
    public void browser() {
        useInstance.setUp();
        useInstance.loginToApplication();
        useInstance.linkoptionsdoc();
        useInstance.addSlide();
        useInstance.BrowseTemplate();
        useInstance.carouselasset();
        useInstance.carouselhover();
        useInstance.explorestylesdiagram();
        useInstance.insertdiagramslide();
        useInstance.carousenext();
        useInstance.carousenext();
        useInstance.closeBrowser();
        

    }
}