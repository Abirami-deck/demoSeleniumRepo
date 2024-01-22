import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class InsertingCovers {
    private WebDriver driver;
    
    @Test(alwaysRun=true,groups="properties")
    
public void sectionbreak() {
       Settings useInstance = new Settings(driver);
       useInstance.setUp();
       useInstance.loginToApplication();
       useInstance.coverdoc();
       useInstance.addSlide();
       useInstance.assertBrowseTemplate();
       useInstance.Bookend();
       useInstance.coverhover();
       useInstance.exploreStyle();
       useInstance.variation();
       useInstance.coverimgvar();
       useInstance.insertdiagramslide();
       useInstance.FloaterSettings();
       useInstance.coverimglogo();
       useInstance.detelebtn();
       useInstance.undo();
       useInstance.explorestyleeditor();
       useInstance.variation();
       useInstance.changeimgcover();
       useInstance.applyStyle();
       useInstance.themepalette();
       useInstance.apptheme();
       useInstance.outlineeditor();
       useInstance.outlinetextcover();
       useInstance.updatebtnoutline();
       useInstance.clickorpress();
      // useInstance.Moreoptions();
       useInstance.backtodb();
       useInstance.closeBrowser();
    }
}