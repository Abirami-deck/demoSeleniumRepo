import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Validatedisplay {
    private WebDriver driver;
    @Test(alwaysRun=true,groups="properties")
    
    public void display() {
        //Call from one method to another method             
        Settings useInstance = new Settings(driver);
        useInstance.setUp();
        useInstance.loginToApplication();
        useInstance.Validatedisplayoutline();
        useInstance.addSlide();
        useInstance.assertBrowseTemplate();
        useInstance.outlinestory();
        useInstance.outlinetitle();
        useInstance.addsubtitle();
        useInstance.addsubtitletext();
        useInstance.outlinelabel();
        useInstance.editlabel();
        useInstance.addtable();
        useInstance.suggestslides();
        useInstance.displayinsert();
        useInstance.addSlide();
        useInstance.assertBrowseTemplate();
        useInstance.listasset();
        useInstance.numberedlist();
        useInstance.Explorestylenumber();
        useInstance.variation();
        useInstance.numberassetvar();
        useInstance.insertdiagramslide();
        useInstance.FloaterSettings();
        useInstance.sectext();
        useInstance.addSlide();
        useInstance.assertBrowseTemplate();
        useInstance.chart();
        useInstance.charthover();
        useInstance.usebttndiagram();
        useInstance.chartaddrow();
        useInstance.insertslideCharts();
        useInstance.detelebtn();
        useInstance.undo();
        useInstance.closeBrowser();
        
    }
}