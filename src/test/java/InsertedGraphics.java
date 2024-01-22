import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class InsertedGraphics {
    private WebDriver driver;
    @Test(alwaysRun=true,groups="properties")
  
  public void graphics() {
  //Call from one method to another method
    Settings useInstance = new Settings(driver);
    useInstance.setUp();
    useInstance.loginToApplication();
    useInstance.graphicsdoc();
    useInstance.addSlide();
    useInstance.BrowseTemplate();
    useInstance.assertstack();
    useInstance.icons();
    useInstance.explorestyleicon();
    useInstance.variation();
    useInstance.iconasset();
    useInstance.graphicsinsertslide();

   // useInstance.particularSlide();
    useInstance.EditText();
    useInstance.addpts();
    useInstance.themepalette();
    useInstance.apptheme();
    useInstance.Styleoptions();
    useInstance.agencymoods();
    useInstance.closeBrowser();
   // useInstance.present();
//    useInstance.begin();
//    useInstance.exit();
//    useInstance.moreoptgraphics();;
//   useInstance.dashboard();
  }
    }
