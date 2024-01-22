import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class InsertingCharts {
    private WebDriver driver;
    Settings useInstance = new Settings(driver);
    @Test(alwaysRun=true,groups="properties")
   public void charts() {
        useInstance.setUp();
        useInstance.loginToApplication();
        useInstance.chartdoc();
        useInstance.addSlide();
        useInstance.BrowseTemplate();
        useInstance.chart();
        useInstance.exploreStyleTest();
        useInstance.insertslideCharts();
        useInstance.Editbtn();
        useInstance.addRow();
        useInstance.Savebtn();
        useInstance.Saving();
        useInstance.Deleterow();
    }
    @Test
    public void chartsettings() {
        useInstance.FloaterSettings();
        useInstance.properties();
        useInstance.closebtn();
        useInstance.styles();
        useInstance.layout();
        useInstance.left();
        useInstance.applyStyle();
        //useInstance.Moreoptions();
        useInstance.backtodb();
        useInstance.closeBrowser();
    }
}
  