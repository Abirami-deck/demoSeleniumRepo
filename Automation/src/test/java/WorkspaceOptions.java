import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class WorkspaceOptions {
    private WebDriver driver;
    @Test(alwaysRun=true,groups="properties")
    
    public void workspace() {
        //Call from one method to another method             
        Settings useInstance = new Settings(driver);
        useInstance.setUp();
        useInstance.loginToApplication();
        useInstance.settingsdash();
        useInstance.membersandgroups();
        useInstance.invmembersworkspace();
        useInstance.mailworkspace();
        useInstance.sendinvite();
        useInstance.backbtn();
        useInstance.status();
        useInstance.plusfolder();
        useInstance.folname();
        useInstance.createfolder();
        useInstance.addmembersworkspace();
        useInstance.chooseworkspace();
        useInstance.addmembersspace();
        useInstance.viewandedit();
        useInstance.addmember();
        useInstance.closeBrowser();
        //useInstance.moreopt();
        //useInstance.choosefolder();
//        useInstance.Aitemplate();
//        useInstance.generatebtnai();
//        useInstance.clickorpress();

        
    }
}  