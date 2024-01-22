
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class DiagramProperties4183 {
    private static final Logger Log = LogManager.getLogger(DiagramProperties4183.class);
    private WebDriver driver;
    Settings useInstance = new Settings(driver);
   
    @Test(priority=0,alwaysRun=true,groups="properties")

   public void diagram() {
     useInstance.setUp();
     useInstance.loginToApplication();
     useInstance.diagramdoc();
    }
    @Test(priority=1,alwaysRun=true,groups="properties")
    public void diagramdoc() {
     useInstance.addSlide();
       useInstance.BrowseTemplate();
        useInstance.process();
        useInstance.smallprocess();
        useInstance.explorestylesdiagram();
        useInstance.variation();
        useInstance.diagramasset();
       useInstance.insertdiagramslide();
    
}
    @Test(priority=2,alwaysRun=true,groups="properties")
    public void properties() {
       useInstance.addpoint();
       useInstance.sixthpoint();
       useInstance.amazingtemp();
       useInstance.highlightdiagram();
       useInstance.edithgl();
       useInstance.addhl();
    }
    @Test(priority=3,alwaysRun=true,groups="properties")
    public void diagramproperties() {
       useInstance.amazingtemp1();
       useInstance.moreopt();
       useInstance.amazingtemp2();
       useInstance.FloaterSettings();
       useInstance.sectext();
       useInstance.sectextclose();
       useInstance.deletebtn();
       useInstance.undo();
       useInstance.speakernotes();
       useInstance.notes();
    }
    @Test(priority=4,alwaysRun=true,groups="properties")
    public void savetemplate() {
       useInstance.saveslideTemplate();
       useInstance.saveslide();
       useInstance.savebtn();
    }
    @Test(priority=5,alwaysRun=true,groups="properties")
    public void settings() {
       useInstance.themepalette();
       useInstance.cornelred();
       useInstance.closed();
       useInstance.backtodb();
       useInstance.closeBrowser();
       }
}
       