
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
public class ImageGrid {
    private static final Logger Log = LogManager.getLogger(ImageGrid.class);
    private WebDriver driver;
    @Test(alwaysRun=true,groups="properties")

   public void grid() {
        //Call from one method to another method
        Settings useInstance = new Settings(driver);
        useInstance.setUp();
        useInstance.loginToApplication();
        useInstance.imagegriddoc();
        useInstance.addSlide();
        useInstance.assertBrowseTemplate();
        useInstance.assertstack();                
        useInstance.ImagesList();
        useInstance.ExploreStyles();
        useInstance.GridOfImages();
        useInstance.insertslidegrid();
        useInstance.ParticularSlide();
        useInstance.Addpoint();
        useInstance.seventhslide();
        //ChangeImage();
       // Exploresettings();
        //useInstance.variation();
       // variation();
       // useInstance.applyStyle();                         
        useInstance.FloaterSettings();
        useInstance.SettingsProperty();
        useInstance.TextPosition();
        useInstance.highlight();
        useInstance.Emphazize();
        useInstance.Hyperlink();
        useInstance.URL();
        useInstance.presentgrid();
      useInstance.exitgrid();
       useInstance.closeBrowser();
        //secText();
       // useInstance.Hyperlink();
            }
}
   