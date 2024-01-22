import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
public class SectionBreak {
    private WebDriver driver;
    Settings useInstance = new Settings(driver);
    
    @Test(priority=0,alwaysRun=true,groups="properties")
public void sectionbreak() {
	
        useInstance.setUp();
        useInstance.loginToApplication();
        useInstance.sectiondoc();
        useInstance.addSlide(); 
        useInstance.BrowseTemplate();
        useInstance.sectionasset();
        useInstance.explorestylesection();
        useInstance.sectionassets();
        useInstance.insertdiagramslide();
    }
    @Test(priority=1,alwaysRun=true,groups="properties")
    public void settings() {
        useInstance.FloaterSettings();
        useInstance.sectionlogo();
        useInstance.explorestyleeditor();
        useInstance.backgroundslide();
        useInstance.sectionbackgrndasset();
        useInstance.applyStyle();
        useInstance.deletebtn();
        useInstance.undo();
    }
    @Test(priority=2,alwaysRun=true,groups="properties")
    public void variation() {
        useInstance.themepalette();
        useInstance.apptheme();
        useInstance.outlineeditor();
        useInstance.editoutlinetextsection();
        useInstance.updatebtnoutline();
        useInstance.clickorpress();
        useInstance.closeBrowser();
        
    }
}