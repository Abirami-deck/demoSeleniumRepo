import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
@Test
public class LoginandSecurity {
    private WebDriver driver;

  public void login() {
        Settings useInstance = new Settings(driver);
        useInstance.setUp();
       // useInstance.loginToApplications();
        //useInstance.afterlogins();
        useInstance.profile();
        useInstance.profilesettings();
        useInstance.Password();
        useInstance.closeBrowser();
        
    }
//    public void profile() {
//    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
//    WebElement view = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/nav/div[2]/div[2]/div/button/img")));
//   view.click();
//    }
//   

   
   
   
   //Change button
 //  WebElement change = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div/div/div/div/div/div/button")));
 //  change.click();
}