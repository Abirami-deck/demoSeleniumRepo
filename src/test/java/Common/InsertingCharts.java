
package Common;

import java.time.Duration;
//import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
import org.apache.logging.log4j.LogManager;
//import org.openqa.selenium.JavascriptExecutor;

import org.apache.logging.log4j.Logger;

public class InsertingCharts {

    public static Logger Log;

    @Test(priority = 1)
    public void diagramInsertingTest() {
    	Log = LogManager.getLogger(Diagram.class);

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abirami\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
          driver.get("https://azure-qc.pitchdeck.io/docs/login#");
            driver.manage().window().maximize(); 
            
           // View alternative log in or sign up methods
            WebElement altLogin = driver.findElement(By.cssSelector("[data-test-id='tp-login-identity-selector']"));
            altLogin.click();
           
            // Continue with email
            WebElement continueWithEmail = driver.findElement(By.cssSelector("[data-test-id='login-identity-email-selector']"));
           continueWithEmail.click();
             // Entering email
             driver.findElement(By.id("email")).sendKeys("abirami@pitchdeck.io");
            // Continue button
            WebElement continueButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div/button"));
            continueButton.click();
         
             // Entering password
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
            WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div/div[3]/input")));
            input.sendKeys("@D3ckr0cks");
            System.out.println("Password entered successfully");

            // Continue button
            WebElement btn = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div/button"));
            btn.click();
            
             // Open document
            WebDriverWait waiting = new WebDriverWait(driver, Duration.ofSeconds(100));
            WebElement documents = waiting.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div/ul/li[1]/div/div[1]/div[3]/div/p[1]")));
            documents.click();
            System.out.println("Open the document");

             // Add new slide
            WebElement add = wait.until(ExpectedConditions.elementToBeClickable(By.id("pdaddnewslide")));
            add.click();
            System.out.println("Added new slide");

             // Browse template
            WebElement browse = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[3]/button[1]")));
            browse.click();
            
            //Select chart
            WebElement chart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/nav/a[8]")));
            chart.click();
            
          
          //  WebDriverWait close = new WebDriverWait(driver, Duration.ofSeconds(111));
            
   	     WebElement explore = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[1]/div[1]")));
   	     Actions actions = new Actions(driver);
   	     actions.moveToElement(explore).perform();
   	     WebElement explored = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[1]/div[2]/button[2]")));
   	     explored.click();
   	     
   	     //Insert slide
   	     WebElement insert = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[2]/button[1]")));
   	     insert.click();
   	     
   	     //Edit btn
   	     WebElement edit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/ul/li[1]/button")));
   	     edit.click();
   	     
   	     
   	     //Add row
   	     WebElement row = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div/div[3]/div[2]/div/button")));
   	     row.click();
   	     
   	     //Save btn
   	     WebElement saved = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[1]/button")));
   	     saved.click();
   	     
   	      WebElement edited = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/ul/li[1]/button")));
	     edited.click();
	     WebElement editing = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div/div[3]/div[2]/div/table/tbody/tr[8]/td[1]/div")));
	     editing.click();
	     editing.clear();
	     editing.sendKeys("Deck");
	     
	     //Saving
	     WebElement saving = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[1]/button")));
   	     saving.click();
   	     
   	     //Delete row
   	  try {
       
          WebElement delete = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[2]/div/div/div[3]/div[2]/div/div[1]/div[1]/div/div/div[8]/div[2]/div/div[1]/div/div[2]/div")));
          delete.click();
      } catch (Exception e) {
          e.printStackTrace();
      } finally {
    	  
   	     WebElement rows = wait.until(ExpectedConditions.elementToBeClickable(By.id("inlineDiagramDeleteAssetBtn")));
   	     rows.click();
   	     
   	     //Click settings
   	     WebElement settings = wait.until(ExpectedConditions.elementToBeClickable(By.id("floaterSettings")));
   	     settings.click();
   	     
   	     //Click properties
   	     WebElement axis = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div[1]/button")));
   	     axis.click();
   	     WebElement line = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/button")));
   	     line.click();
   	     
   	     //Category
   	     WebElement category = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/nav/div[2]/a")));
   	     category.click();
   	     
   	     WebElement baseline = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/button")));
   	     baseline.click();
   	     
   	     //Select close btn
   	     WebElement closed = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[1]/button")));
   	     closed.click();
   	     
   	     //Select explore styles
   	     WebElement explorestyle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[2]/ul/li[1]/button")));
   	     explorestyle.click();
   	     
   	     //Select layout
   	     WebElement layout = wait.until(ExpectedConditions.elementToBeClickable(By.id("pdslidelayout")));
   	     layout.click();
   	     WebElement left = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div[2]/ul/li[2]/div/div/div[2]")));
   	     left.click();
   	     
   	     //Apply style
   	     WebElement style = wait.until(ExpectedConditions.elementToBeClickable(By.id("pdapplystle")));
   	     style.click();
   	     
   	     //More Options
   	     WebElement more = wait.until(ExpectedConditions.elementToBeClickable(By.id("pdmainmenu")));
   	     more.click();
   	     
   	     //Back to DB
   	     WebElement db = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[4]/div/div[1]/div[1]/ul/li[1]/div/span[2]")));
   	     db.click();
   	     
   	  WebElement finaldocs = waiting.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div/ul/li[1]/div/div[1]/div[3]/div/p[1]")));
      finaldocs.click();
      }
   	  
   	  
    }
}
