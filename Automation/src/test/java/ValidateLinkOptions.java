import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ValidateLinkOptions {
    private WebDriver driver;
    @Test(alwaysRun=true,groups="properties")
    
    public void linkoptions() {
        //Call from one method to another method             
        Settings useInstance = new Settings(driver);
        useInstance.setUp();
        useInstance.loginToApplication();
        useInstance.linkoptionsdoc();
        useInstance.addSlide();
        useInstance.assertBrowseTemplate();
        useInstance.process();
        useInstance.smlprocess();
        useInstance.usebttndiagram();
        useInstance.insertdiagramslide();
        useInstance.amazingtemplink();
        useInstance.Hyperlink();
        useInstance.URL();
        useInstance.titletext();
        useInstance.detelebtn();
        useInstance.undo();
        useInstance.present();
        useInstance.amazingtemppresent();
        useInstance.closeBrowser();
        useInstance.setUp();
        useInstance.loginToApplication();
        useInstance.linkoptionsdoc();
        useInstance.addSlide();
        useInstance.assertBrowseTemplate();
        useInstance.carouselasset();
        useInstance.carouselhover();
        useInstance.usebttndiagram();
        useInstance.insertdiagramslide();
        useInstance.carousenext();
        useInstance.carousenext();
        useInstance.closeBrowser();
        

    }
}