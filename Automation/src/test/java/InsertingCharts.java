import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class InsertingCharts {
    private WebDriver driver;
    @Test(alwaysRun=true,groups="properties")
   public void charts() {
        //Call from one method to another method
        Settings useInstance = new Settings(driver);
        useInstance.setUp();
        useInstance.loginToApplication();
        useInstance.chartdoc();
        useInstance.addSlide();
        useInstance.assertBrowseTemplate();
        useInstance.chart();
        useInstance.ExploreStyle();
        useInstance.insertslideCharts();
        useInstance.Editbtn();
        useInstance.Addrow();
        useInstance.Savebtn();
        useInstance.Saving();
        useInstance.Deleterow();
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
  