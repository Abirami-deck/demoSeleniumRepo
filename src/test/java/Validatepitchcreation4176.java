import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
public class Validatepitchcreation4176 {
    private WebDriver driver;
    Settings useInstance = new Settings(driver);
    
    @Test(alwaysRun=true,groups="properties")
public void outline() {
	
        useInstance.setUp();
        useInstance.loginToApplication();
        useInstance.outlinetodeck();
        useInstance.edittextdash();
        useInstance.outlinecontbtn();
        useInstance.companyname();
        useInstance.authorname();
        useInstance.genpresentation();
        useInstance.clickorpress();
    }
    @Test
    public void creation() {
        useInstance.disastertext();
        useInstance.explorestyleeditor();
        useInstance.backgroundslide();
        useInstance.outlinebackgrnd();
        useInstance.applyStyle();
    }
}
//        useInstance.deletebtn();
//        useInstance.undo();
//    }
//    @Test
//    public void properties() {
//        useInstance.addSlide();
//        useInstance.BrowseTemplate();
//        useInstance.listasset();
//        useInstance.numberedlist();
//        useInstance.usebtns();
//        useInstance.outlineaddrow();
//        useInstance.insertoutline();
//        useInstance.addSlide();
//        useInstance.BrowseTemplate();
//        useInstance.listasset();
//        useInstance.bulletlist();
//        useInstance.usebtnbulletlist();
//        useInstance.outlineaddrow();
//        useInstance.insertoutline();
//        useInstance.deletebtn();
//        useInstance.undo();
//        useInstance.addSlide();
//        useInstance.BrowseTemplate();
//        useInstance.chart();
//        useInstance.chartasset();
//        useInstance.usebtns();
//        useInstance.chartaddrow();
//        useInstance.chartinsertslide();
//        useInstance.chartproperties();
//        useInstance.addpoint();
//        useInstance.duplicateSlide();
//        useInstance.deletebtn();
//        useInstance.backtodb();
//        useInstance.closeBrowser();
//    }
//}