
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class DiagramProperties {
    private static final Logger Log = LogManager.getLogger(DiagramProperties.class);
    private WebDriver driver;
   
    @Test(alwaysRun=true,groups="properties")

   public void diagram() {
////        //Call from one method to another method
     Settings useInstance = new Settings(driver);
     useInstance.setUp();
     useInstance.loginToApplication();
     useInstance.diagramdoc();
     useInstance.addSlide();
       useInstance.assertBrowseTemplate();
        useInstance.process();
        useInstance.smlprocess();
        useInstance.usebttndiagram();
       useInstance.insertdiagramslide();
       useInstance.addpts();
       useInstance.amazingtemp();
       useInstance.edithgl();
       useInstance.addhl();
       useInstance.amazingtemp1();
       useInstance.moreopt();
       useInstance.amazingtemp2();
       useInstance.FloaterSettings();
       useInstance.sectext();
       useInstance.detelebtn();
       useInstance.undo();
       useInstance.speakernotes();
       useInstance.notes();
       useInstance.saveslideTemplate();
       useInstance.saveslide();
       useInstance.savebtn();
       useInstance.themepalette();
       useInstance.cornelred();
       useInstance.closed();
       useInstance.backtodb();
       useInstance.closeBrowser();
       }
       }