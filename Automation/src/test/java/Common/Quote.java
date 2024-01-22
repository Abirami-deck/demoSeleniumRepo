package Common;

import java.time.Duration;
//import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.JavascriptExecutor;

import org.apache.logging.log4j.Logger;

public class Quote {

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
         
            // Continue button
            WebElement btn = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div/button"));
            btn.click();
            
            //Open the docs
            WebElement docs = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div/ul/li[1]/div/div[1]/div[3]/div/p[1]")));
            docs.click();
            
          //Add slide button
   	     WebElement add = wait.until(ExpectedConditions.elementToBeClickable(By.id("pdaddnewslide")));
   	     add.click();
   	    
   	     //Browse Template
   	     WebElement temp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div[3]/button[1]")));
   	     temp.click();
   	     
   	     //Select people slide
   	     WebElement slide = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/nav/a[4]")));
   	     slide.click();
   	     
   	      //Select quote
   	      WebElement scrollbtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[2]/div/ul/li[4]/div[2]/button[1]"));
	     JavascriptExecutor js = (JavascriptExecutor) driver;
	     scrollbtn.click();
	     
	     WebDriverWait waited = new WebDriverWait(driver, Duration.ofSeconds(600));
	     WebElement explore = waited.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[4]/div[2]/button[1]")));
	     explore.click();
	     WebDriverWait waiting = new WebDriverWait(driver, Duration.ofSeconds(100));
	     WebElement quote = waiting.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div/div/div/div[2]/ul/li[2]/div/div")));
//	     WebDriverWait waittime = new WebDriverWait(driver, Duration.ofSeconds(100));
	     quote.click();
//	     WebDriverWait paused = new WebDriverWait(driver, Duration.ofSeconds(100));
//	     WebElement insert = paused.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[2]/button[1]")));
//	     insert.click();
	     
    }
    }

   	    
   	 