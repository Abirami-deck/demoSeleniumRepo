import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AccountDetails {
    private static final Logger Log = LogManager.getLogger(AccountDetails.class);
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abirami\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://azure-qc.pitchdeck.io/docs/login#");
        driver.manage().window().maximize();
        Log.info("Setup");
    }

    @Test
    public void loginTest() {
        WebElement altLogin = driver.findElement(By.id("login-viewalternativelogin"));
        altLogin.click();
        Log.info("Login Test");

        WebElement continueWithEmail = driver.findElement(By.id("login-email"));
        continueWithEmail.click();
        continueWithEmail.sendKeys("avinash@deck.in");

        WebElement continueButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div[2]/div/button"));
        continueButton.click();  
       Log.info("Login Test");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-password")));
        input.click();
        input.sendKeys("w2w");
        System.out.println("Password entered successfully");
        Log.info("Login Test");
        
        WebElement btn = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div/button"));
        btn.click();
        Log.info("Login Test");
    }

    @Test
    public void properties() {
        // Call from one method to another method
        profile();
        Accountinformation();
        Firstname();
        Lastname();
        Designation();
        Role();
        Language();
    }

    public void profile() {
      	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
      WebElement view = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/nav/div[2]/div[2]/div/button")));
      view.click();
      Log.info("profile");
      }
       
      public void settings() {
      	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
      WebElement profile = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/nav/div[2]/div[2]/div[2]/div[2]/a")));
      profile.click();
      Log.info("settings");
      }
      
    private void Accountinformation() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement account = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/a[1]")));
        account.click();
        Log.info("Account information");
    }

    private void Firstname() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement name = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div/div/div/div/div/div/div/div[2]/div[2]/div[1]/div")));
        name.click();
        name.clear();
        name.sendKeys("Abirami ");
        Log.info("First name updated");
    }

    private void Lastname() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement last = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div/div/div/div/div/div/div/div[2]/div[2]/div[2]/div")));
        last.click();
        last.clear();
        last.sendKeys("v");
        Log.info("Last name updated");
    }

    private void Designation() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement des = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div/div/div/div/div/div/div/div[2]/div[3]/div/div")));
        des.click();
        des.clear();
        des.sendKeys("Trainee");
        Log.info("Designation updated");
    }

    private void Role() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement role = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div/div/div/div/div/div/div/div[2]/div[4]/div/div/div/button")));
        role.click();
        Log.info("Role updated");
    }

    private void Language() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement lan = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div/div/div/div/div/div/div/div[2]/div[5]/div/div/div/div/span")));
        lan.click();
        lan.clear();
        lan.sendKeys("English");
        Log.info("Language updated");
    }
}
