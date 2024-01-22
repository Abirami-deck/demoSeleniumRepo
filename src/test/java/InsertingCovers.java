import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class InsertingCovers {
    private WebDriver driver;
    Settings useInstance = new Settings(driver);
    
    @Test(priority=0,alwaysRun=true,groups="properties")
    
public void sectionbreak() {
       
       useInstance.setUp();
       useInstance.loginToApplication();
       useInstance.coverdoc();
       useInstance.addSlide();
       useInstance.BrowseTemplate();
       useInstance.Bookend();
       useInstance.coverhover();
       useInstance.exploreStyle();
       useInstance.variation();
       useInstance.testCoverImgVar();
       useInstance.insertdiagramslide();
    }
    @Test(priority=1,alwaysRun=true,groups="properties")
    public void settings() {
       useInstance.FloaterSettings();
       useInstance.coverimglogo();
       useInstance.deletebtn();
       useInstance.undo();
       useInstance.explorestyleeditor();
       useInstance.variation();
       useInstance.changeimgcover();
       useInstance.applyStyle();
    }

    @Test(priority=2,alwaysRun=true,groups="properties")
    public void variation() {
       useInstance.themepalette();
       useInstance.apptheme();
       useInstance.outlineeditor();
       useInstance.outlinetextcover();
       useInstance.updatebtnoutline();
       useInstance.clickorpress();
       useInstance.backtodb();
       useInstance.closeBrowser();
    }
}