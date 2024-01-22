
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
public class ImageGrid {
    private static final Logger Log = LogManager.getLogger(ImageGrid.class);
    private WebDriver driver;
    Settings useInstance = new Settings(driver);
    @Test(priority=0,alwaysRun=true,groups="properties")
   public void grid() {
        useInstance.setUp();
        useInstance.loginToApplication();
        useInstance.imagegriddoc();
        useInstance.addSlide();
        useInstance.BrowseTemplate();
        useInstance.assertstack();                
        useInstance.ImagesList();
        useInstance.ExploreStyles();
        useInstance.GridOfImages();
        useInstance.insertslidegrid();
    }
    @Test(priority=1,alwaysRun=true,groups="properties")
    public void imageproperties() {
        useInstance.ParticularSlide();
        useInstance.Addpoint();
        useInstance.seventhslide();
    }
          
    @Test(priority=2,alwaysRun=true,groups="properties")
    public void imagesettings() {
        useInstance.FloaterSettings();
        useInstance.SettingsProperty();
        useInstance.TextPosition();
        useInstance.highlight();
        useInstance.Emphazize();
        useInstance.Hyperlink();
        useInstance.URL();
    }
    @Test(priority=3,alwaysRun=true,groups="properties")
    public void presentsettings() {
    useInstance.presentgrid();
       useInstance.closeBrowser();
        //secText();
       // useInstance.Hyperlink();
            }
}

   