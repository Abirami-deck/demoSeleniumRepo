import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Validatedisplay {
    private WebDriver driver;
    Settings useInstance = new Settings(driver);
    @Test(priority=0,alwaysRun=true,groups="properties")
    
    public void display() {
        useInstance.setUp();
        useInstance.loginToApplication();
        useInstance.Validatedisplayoutline();
        useInstance.addSlide();
        useInstance.BrowseTemplate();
        useInstance.outlinestory();
        useInstance.outlinetitle();
        useInstance.addsubtitle();
        useInstance.addsubtitletext();
        useInstance.outlinelabel();
        useInstance.editlabel();
        useInstance.addtable();
        useInstance.suggestslides();
        useInstance.displayinsert();
    }
    @Test(priority=1,alwaysRun=true,groups="properties")
    public void properties() {
        useInstance.addSlide();
        useInstance.BrowseTemplate();
        useInstance.listasset();
        useInstance.numberedlist();
        useInstance.Explorestylenumber();
        useInstance.variation();
        useInstance.numberassetvar();
        useInstance.insertdiagramslide();
}
    @Test(priority=2,alwaysRun=true,groups="properties")
    public void settings() {
        useInstance.FloaterSettings();
        useInstance.sectext();   
        useInstance.sectextclose();
        useInstance.addSlide();
        useInstance.BrowseTemplate();
        useInstance.chart();
        useInstance.charthover();
        useInstance.explorestylesdiagram();
        useInstance.variation();
        useInstance.chartvar();
     //   useInstance.chartaddrow();
        useInstance.insertslideCharts();
        useInstance.deletebtn();
        useInstance.undo();
        useInstance.closeBrowser();
//        
  }
}