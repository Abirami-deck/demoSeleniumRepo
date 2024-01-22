import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
public class Validatepitchcreation4176 {
    private WebDriver driver;
    
    @Test(alwaysRun=true,groups="properties")
public void outline() {
	//Call from one method to another method             
        Settings useInstance = new Settings(driver);
        useInstance.setUp();
        useInstance.loginToApplication();
        useInstance.outlinetodeck();
        useInstance.edittextdash();
        useInstance.outlinecontbtn();
        useInstance.companyname();
        useInstance.authorname();
        useInstance.genpresentation();
        useInstance.clickorpress();
        useInstance.disastertext();
        useInstance.explorestyleeditor();
        useInstance.backgroundslide();
        useInstance.outlinebackgrnd();
        useInstance.applyStyle();
        useInstance.detelebtn();
        useInstance.undo();
        useInstance.addSlide();
        useInstance.assertBrowseTemplate();
        useInstance.listasset();
        useInstance.numberedlist();
        useInstance.usebtn();
        useInstance.outlineaddrow();
        useInstance.insertoutline();
        useInstance.addSlide();
        useInstance.assertBrowseTemplate();
        useInstance.listasset();
        useInstance.bulletlist();
        useInstance.usebtnbulletlist();
        useInstance.outlineaddrow();
        useInstance.insertoutline();
        useInstance.detelebtn();
        useInstance.undo();
        useInstance.addSlide();
        useInstance.assertBrowseTemplate();
        useInstance.chart();
        useInstance.chartasset();
        useInstance.usebtn();
        useInstance.chartaddrow();
        useInstance.chartinsertslide();
        useInstance.chartproperties();
        useInstance.addpt();
        useInstance.duplicateslide();
        useInstance.detelebtn();
        //useInstance.Moreoptions();
        useInstance.backtodb();
        useInstance.closeBrowser();
    }
}