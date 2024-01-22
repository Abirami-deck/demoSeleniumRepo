package Common;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.logging.log4j.Logger;  
import org.apache.logging.log4j.LogManager;

@Test
public class Inserts {
	
    
    private static final Logger Log = LogManager.getLogger(Diagram.class);
    private WebDriver driver;
@BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abirami\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
        driver.get("https://azure-qc.pitchdeck.io/docs/login#");
        driver.manage().window().maximize(); // To maximize the window
    }

    private void login() {
    	 WebElement altlogin = driver.findElement(By.cssSelector("[data-test-id='tp-login-identity-selector']"));
          altlogin.click();
        
      // Continue with email
         WebElement continuewithemail = driver.findElement(By.cssSelector("[data-test-id='login-identity-email-selector']"));
         continuewithemail.click();
         
         // entering email
         driver.findElement(By.id("email")).sendKeys("abirami@pitchdeck.io");
       
         // Continue button
         WebElement but = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div/button"));
        but.click();

         // Entering password
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
         WebElement Input = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div/div[3]/input")));
         Input.sendKeys("@D3ckr0cks");

         // Continue button
         WebElement btn = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div/button"));
         btn.click();
    }
    


{
  
        try {
            login();
            openDocuments();
            addNewSlide();
             browseTemplate();
             clickProcess();
             explore();
           // openAsset();
           // insertAsset();
           // savePPT();
            selectList();
            selectNumberList();
        } catch (Exception e) {
            Log.error("Test execution failed: " + e.getMessage());
            e.printStackTrace();
        } finally {
       
        }
    }
@AfterMethod
    private void openDocuments() {
    	 WebDriverWait waiting = new WebDriverWait(driver, Duration.ofSeconds(100));
         WebElement documents = waiting.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div/ul/li[1]/div/div[1]/div[3]/div/p[1]")));
         documents.click();
        
    }

    private void addNewSlide() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
    	WebElement add = wait.until(ExpectedConditions.elementToBeClickable(By.id("pdaddnewslide")));
        add.click();

    }

    private void browseTemplate() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
    	WebElement browse = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[3]/button[1]")));
        browse.click();
        
    }

    private void clickProcess() {
    	 try {
    	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
             WebElement process = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/nav/a[12]")));
             process.click();
             System.out.println("Element clicked successfully!");
         } catch (Exception e) {
             System.err.println("Exception occurred: " + e.getMessage());
             e.printStackTrace();
         } finally {
    }
    }

    private void explore() {
    	try {
        
    	 WebDriverWait close = new WebDriverWait(driver, Duration.ofSeconds(111));
         WebElement explore = close.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[1]/div[2]/button[1]")));
         Actions actions = new Actions(driver);
         actions.moveToElement(explore).perform();
    	 explore.click();
    	} catch (Exception e) {
             System.err.println("Exception occurred: " + e.getMessage());
             e.printStackTrace();
         } finally {
    }
    }
    

    // Other methods for different actions...

    private void selectList() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
            WebElement list = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/nav/a[3]")));
            list.click();
            Log.info("List element clicked successfully!");
        } catch (Exception e) {
            Log.error("Exception occurred while selecting the list: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void selectNumberList() {
        // Your code to select number list
    }
}
