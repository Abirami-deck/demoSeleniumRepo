import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Stack  {
    private WebDriver driver;
    
    @Test(alwaysRun=true,groups="properties")
   public void stack() {
      
        //Call from one method to another method
        Settings useInstance = new Settings(driver);
        useInstance.setUp();
        useInstance.loginToApplication();
        useInstance.stackdoc();
        useInstance.addSlide();
        useInstance.assertBrowseTemplate();
        useInstance.ProductScreen();
        useInstance.mobileasset();
        useInstance.usebtn();
        useInstance.insertStackslide();
        useInstance.editextstack();
        useInstance.addpt();
        useInstance.detelebtn();
        useInstance.undo();
        useInstance.explorestyleeditor();
        useInstance.backgroundslide();
        useInstance.backgroundcolorstack();
        useInstance.applyStyle();
        useInstance.replaceimgstack();
        useInstance.fittocanva();
        useInstance.tickbtn();
        useInstance.themepalette();
        useInstance.apptheme();
        useInstance.outlineeditor();
        useInstance.editoutlinetext();
        useInstance.updatebtnoutline();
        useInstance.clickorpress();
       // useInstance.Moreoptions();
        useInstance.backtodb();
        useInstance.closeBrowser();
}
}