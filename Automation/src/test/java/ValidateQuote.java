import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ValidateQuote {
	 private static final Logger Log = LogManager.getLogger(OldDocs.class);
	    private WebDriver driver;

@Test
  public void quote() {
      Settings useInstance = new Settings(driver);
      useInstance.setUp();
      useInstance.loginToApplication();
      useInstance.quotesdoc();
      useInstance.addSlide();
      useInstance.assertBrowseTemplate();
      useInstance.peopleslides();
      useInstance.selectquote();
      useInstance.usebtnQuote();
      useInstance.insertbutton();
      useInstance.textquote();
      useInstance.explorequote();
      useInstance.variation();
      useInstance.varquote();
      useInstance.applyStyle();
      useInstance.detelebtn();
      useInstance.undo();
      useInstance.styleoption();
      useInstance.agencymoods();
      useInstance.Moreoptions();
      useInstance.dashboard();
      

  }
	  
  }