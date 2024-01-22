import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Stack  {
    private WebDriver driver;
    Settings useInstance = new Settings(driver);
    
    @Test(alwaysRun=true,groups="properties")
        
        public void setupapp() {
        useInstance.setUp();
        useInstance.loginToApplication();
        }
    @Test(priority=0,groups="properties")
    public void stackasset() {
        useInstance.stackdoc();
        useInstance.addSlide();
        useInstance.BrowseTemplate();
        useInstance.ProductScreen();
        useInstance.mobileasset();
        useInstance.usebtns();
        useInstance.insertStackslide();
       useInstance.editextstack();
       
    }
    @Test(priority=1,groups="properties")
    public void assetproperties() {
    	 useInstance.addpoint();
        useInstance.sixthpoint();
        useInstance.deletebtn();
        useInstance.undo();
    }
    @Test(priority=2,groups="properties")
    public void chooseasset() {
        useInstance.explorestyleeditor();
        useInstance.backgroundslide();
        useInstance.backgroundcolorstack();
        useInstance.applyStyle();
    }

    @Test(priority=3,groups="properties")
    public void editimage() {
        useInstance.replaceimgstack();
        useInstance.fittocanva();
        useInstance.tickbtn();
    }
    @Test(priority=4,groups="properties")
    public void selecttheme() {
        useInstance.themepalette();
        useInstance.apptheme();
        useInstance.appthemeclose();
        useInstance.outlineeditor();
        useInstance.editoutlinetext();
        useInstance.updatebtnoutline();
    }
    @Test(priority=5,groups="properties")
    public void present() {
       useInstance.clickorpress();
       useInstance.closepresent();
       useInstance.backtodb();
        useInstance.closeBrowser();
}
}
