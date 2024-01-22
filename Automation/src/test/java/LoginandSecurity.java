import java.time.Duration;
//import java.util.ArrayList;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginandSecurity {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abirami\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://azure-qc.pitchdeck.io/docs/login#");
        driver.manage().window().maximize();
    }

    @Test
    public void loginTest() {
        WebElement altLogin = driver.findElement(By.id("login-viewalternativelogin"));
        altLogin.click();
        //Log.info("Login Test");

        WebElement continueWithEmail = driver.findElement(By.id("login-email"));
        continueWithEmail.click();
        continueWithEmail.sendKeys("avinash@deck.in");

        WebElement continueButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div[2]/div/button"));
        continueButton.click();  
      // Log.info("Login Test");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-password")));
        input.click();
        input.sendKeys("w2w");
        System.out.println("Password entered successfully");
        ////Log.info("Login Test");
        
        WebElement btn = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div/button"));
        btn.click();
       // Log.info("Login Test");

        

 
        //Call from one method to another method
        Settings useInstance = new Settings(driver);
        profile();
        profilesettings();
        Password();
        useInstance.closeBrowser();
        
    }
    public void profile() {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
    WebElement view = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/nav/div[2]/div[2]/div/button/img")));
   view.click();
    }
   
  public void profilesettings() {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
   WebElement profile = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/nav/div[2]/div[2]/div[2]/div[2]/a")));
   profile.click();
  }
   
   public void Password() {
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
   WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/a[2]/span")));
   login.click();
   
   WebDriverWait waited = new WebDriverWait(driver, Duration.ofSeconds(120));
   WebElement Pass = waited.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div/div/div/div/div/div/div/div[1]/div/div/input")));
   Pass.click();
   Pass.sendKeys("Avinash@deck");
   
   WebDriverWait waiting = new WebDriverWait(driver, Duration.ofSeconds(120));
   WebElement pass = waiting.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div/div/div/div/div/div/div/div[2]/div/div/input")));
   pass.click();
   pass.sendKeys("Avinash@deck");
   
   //Change button
 //  WebElement change = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div/div/div/div/div/div/button")));
 //  change.click();
}
}