import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ValidateQuote {
	 private static final Logger Log = LogManager.getLogger(OldDocs.class);
	    private WebDriver driver;
	    Settings useInstance = new Settings(driver);
	    @Test(priority=0,alwaysRun=true,groups="properties")

  public void quote() {
      useInstance.setUp();
      useInstance.loginToApplication();
      useInstance.quotesdoc();
      useInstance.addSlide();
      useInstance.BrowseTemplate();
      useInstance.peopleslides();
      useInstance.quoteshover();
      useInstance.explorestyleQuote();
      useInstance.quoteasset();
      useInstance.insertslidequote();
	    }

	    @Test(priority=1,alwaysRun=true,groups="properties")
	    public void quoteproperties() {
      useInstance.titletextquote();
      useInstance.explorestyleeditor();
      useInstance.variation();
      useInstance.varquote();
      useInstance.applyStyle();
	    
      useInstance.deletebtn();
      useInstance.undo();
	    }

	    @Test(priority=2,alwaysRun=true,groups="properties")
public void variation() {
      useInstance.Styleoptions();
      useInstance.agencymoods();
      useInstance.closeBrowser();

  }
  }