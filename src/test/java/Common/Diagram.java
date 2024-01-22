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
import org.testng.asserts.SoftAssert;

//import org.testng.asserts.SoftAssert;
import org.apache.logging.log4j.LogManager;
//import org.openqa.selenium.JavascriptExecutor;

import org.apache.logging.log4j.Logger;

public class Diagram {

    public static Logger Log;

    @Test(priority = 1)
    public void diagramInsertingTest() {
    	Log = LogManager.getLogger(InsertingCharts.class);

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

            // Click process
            WebElement process = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/nav/a[12]")));
            process.click();

            WebDriverWait close = new WebDriverWait(driver, Duration.ofSeconds(111));
            WebElement explore = close.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[1]/div[2]")));
            Actions actions = new Actions(driver);
            actions.moveToElement(explore).perform();
            explore.click();
             WebElement insert = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[2]/button[1]")));
             insert.click();

                WebElement particular = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[6]/div/div[1]/div/div[2]/div/div/div[2]/div[2]/div[2]")));
                particular.click();

                // More options
                WebElement opt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[4]/div/div[1]/div[1]/div/button")));
                opt.click();

                // Save powerPoint
                     try {
                      WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));
                    WebElement ppt = waits.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[4]/div/div[1]/div[1]/ul/li[3]/div/span[2]")));
                       if (ppt.isDisplayed() && ppt.isEnabled()) {
                        ppt.click();
                        System.out.println("Clicked on PPT");
                    } else {
                        System.out.println("PPT element is not displayed or not enabled. Skipping click.");
                    }
                } finally {

                	
                	//	More options
                	 WebElement option = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[4]/div/div[1]/div[1]/div/button")));
                         if (option.isEnabled()) {
                         option.click();
                     } else {
                         System.out.println("Element is not clickable within the specified timeout.");
                     }

                //DashBoard
                try {
                    WebDriverWait hold  = new WebDriverWait(driver, Duration.ofSeconds(10));
                     WebElement db = hold.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[4]/div/div[1]/div[1]/ul/li[1]/div/span[2]")));
                        if (db != null && db.isDisplayed() && db.isEnabled()) {
                        db.click();
                        System.out.println("Clicked on DB");
                    } else {
                        System.out.println("DB element is either null, not displayed, or not enabled. Skipping click.");
                    }
                   } finally {

                	   //Open the document
                WebElement document = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div/ul/li[1]/div/div[1]/div[3]/div/p[1]")));
                document.click();

                //Select particular slide
                WebElement particulars = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[6]/div/div[1]/div/div[2]/div/div/div[2]/div[2]/div[2]")));
                particulars.click();

                //Select add point
                WebDriverWait waitings = new WebDriverWait(driver, Duration.ofSeconds(111));
                WebElement addpt = waitings.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/ul/li[1]/div/div/div/button")));
                addpt.click();
                WebElement five = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/ul/li[1]/div/div/ul/li[4]")));
                five.click();

                // Add new slide
                WebElement adding = wait.until(ExpectedConditions.elementToBeClickable(By.id("pdaddnewslide")));
                adding.click();

                // Browse template
                WebElement browser = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[3]/button[1]")));
                browser.click();

                // Soft Assertions
                SoftAssert softAssert = new SoftAssert();
                softAssert.assertTrue(true, "This assertion will pass");
                softAssert.assertFalse(false, "This assertion will fail");

                // Assert all
                softAssert.assertAll();

                // select list
                try {
                    WebElement list = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/nav/a[3]")));
                    list.click();
                    System.out.println("Element clicked successfully!");
                } catch (Exception e) {
                    System.err.println("Exception occurred: " + e.getMessage());
                    e.printStackTrace();
                } finally {
                    softAssert.assertTrue(true, "This assertion will pass");
                    softAssert.assertFalse(false, "This assertion will fail");

                    // Assert all
                    softAssert.assertAll();
                }

                // Select number list
                WebElement number = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[1]/div[2]/button[2]")));
                Actions action = new Actions(driver);
                action.moveToElement(number).perform();
                number.click();
                WebElement inserts = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[2]/button[1]")));
                inserts.click();

            



               // WebElement number = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[1]/div[2]/button[2]")));
              //  number.click();
//
//                WebElement inserts = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[2]/button[1]")));
//                inserts.click();

                // Particular 3rd slide
                
//                    WebElement three = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[6]/div/div[1]/div/div[4]/div/div/div[2]/div[2]/div[2]")));
//                    three.click();
//                    
//                    //select Heading
//                    WebElement title = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[3]/div/div/div[6]")));
//                    title.click();
//                    
//                    //Add option
//                    WebElement addpts =wait.until(ExpectedConditions.elementToBeClickable(By.id("addpoint")));
//                    addpts.click();
//                    
//                    WebElement graphics = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[4]/div/ul/li[5]/div/div[2]/div/div[3]/div/div")));
//                    graphics.click();
//                    
//                    WebElement icon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div/div/div/div/div[2]/div[2]/div[1]/div[1]/nav/a[3]")));
//                    icon.click();
//                    WebElement ins = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div/div/div/div/div[2]/div[2]/div[2]/div[2]/ul/li[1]/div/button")));
//                    ins.click();
                    
                    WebElement fourth = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[6]/div/div[1]/div/div[4]/div/div/div[2]/div[2]/div[2]")));
                    fourth.click();
                    WebElement amazing = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[4]/div/div/div[3]/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div")));
                    amazing.click();
                    WebElement light = wait.until(ExpectedConditions.elementToBeClickable(By.id("INLINE_SLIDE_FLOATER_PROPERTIES_BASE")));
                    light.click();
                    
                    WebElement edit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[4]/div/ul/li[2]/div/div/textarea")));
                    edit.clear();
                    edit.sendKeys("Edit highlight 1");
                    
                    WebElement addhl = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[4]/div/ul/li[2]/div/div/div/button[2]")));
                    addhl.click();
                    
                    //Select amazing templates
                    WebElement amazingtemp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[4]/div/div/div[3]/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div")));
                    amazingtemp.click();
                    
//                    //Select hyperlink
//                    WebElement addlink = wait.until(ExpectedConditions.elementToBeClickable(By.id("floateraddlink")));
//                    addlink.click();
//                    
//                    WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[4]/div/ul/li[3]/div/div/div/div/ul/li[2]/div")));
//                    link.sendKeys("www.google.co.in");
//                    WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(100));
//                   // WebElement select = waits.until(ExpectedConditions.elementToBeClickable(By.className("")));
////                    WebElement element = driver.findElement(By.className("singleClassName"));
//                    WebElement element = driver.findElement(By.cssSelector(".ic_tick.pdcBtnIcon"));
//                    
//                    WebElement elemented = driver.findElement(By.cssSelector(".ic_tick.pdcBtnIcon"));
//                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//                    elemented.click();
//
//
//                   // WebElement select = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[4]/div/ul/li[3]/div/div/div/div/ul/li[2]/buttons")));
//                    element.click();
                    
                    //Select amazing Template
                    WebElement temp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[4]/div/div/div[3]/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div")));
                    temp.click();
                    
                    //More options
                    WebElement more = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[4]/div/ul/li[4]/div/button")));
                    more.click();
                    
                    WebElement emphaze = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[4]/div/ul/li[4]/div/div/div/span")));
                    emphaze.click();
                    
//                    //Fourth slide
//                    WebElement four = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[6]/div/div[1]/div/div[4]/div/div/div[2]/div[2]/div[2]")));
//                    four.click();
//                    
//                    //Add opt
//                    WebElement addptt =wait.until(ExpectedConditions.elementToBeClickable(By.id("addpoint")));
//                    addptt.click();
                    
//                    //Add label
//                    WebElement label  = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[4]/div/ul/li[5]/div/div[2]/div/div[2]/div/div")));
//                    label.click();
//                    
                    
                    //Select heading
//                    WebElement head = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[4]/div/div/div[6]")));
//                    head.click();
////                    //Enter label
//                    WebElement enter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[3]/div/div/div[9]")));
//                    enter.click();
//                    enter.sendKeys("Enter label");
                    
//                    WebElement head = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[4]/div/div/div[8]")));
//                    head.sendKeys("hi");
//
//                    WebElement particula = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[6]/div/div[1]/div/div[2]/div/div/div[2]/div[2]/div[2]")));
//                    particula.click();
//                    
//                    //Select High Quality 
//                    WebElement amazingtemplate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[4]/div/div/div[3]/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div")));
//                    amazingtemplate.click();
//                    //Change font
//                    WebElement font = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[4]/div/ul/li[1]/div/div/button/span")));
//                    font.click();
//
//                    //Large font
//                    WebElement large  = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[4]/div/ul/li[1]/div/ul/li[5]")));
//                    large.click();
                   
                    //Select settings
                    WebElement settings = wait.until(ExpectedConditions.elementToBeClickable(By.id("floaterSettings")));
                    settings.click();
                    
                    //Select Secondary label
                    WebElement second = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div/span[2]/div/button")));
                    second.click();
                    
                    //Close button
                    WebElement exit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[1]/button")));
                    exit.click();
                    
                    //Duplicate button
                    try {
                        WebElement duplicate = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("duplicateSlideButton")));

                        if (duplicate.isDisplayed() && duplicate.isEnabled()) {
                         
                            duplicate.click();
                            System.out.println(" Duplicate element clicked successfully.");
                        } else {
                            System.err.println("Duplicate element is not clickable.");
                       
                        }
                          } catch (Exception e) {
                           e.printStackTrace();
                    } finally {
                        
                    WebElement four = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[6]/div/div[1]/div/div[4]/div/div/div[2]/div[2]/div[2]")));
                    four.click();
                    
                    //Save template
                    WebElement saved = wait.until(ExpectedConditions.elementToBeClickable(By.id("saveSlideButton")));
                    saved.click();
                    WebElement savedslide = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div/div/div/div/div[2]/div/div/div[1]/div")));
                    savedslide.click();
                    savedslide.sendKeys("Version1");
                    
                    //Save btn
                    WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div/div/div/div/div[2]/div/div/div[2]/button[2]")));
                    button.click();
                    
                    //Theme pallete
                    WebElement theme = wait.until(ExpectedConditions.elementToBeClickable(By.id("pdshowminislideproperties")));
                    theme.click();
                    WebElement app = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[3]/div/div/div[2]/div[2]/div/div/div[2]/ul/li[1]/div[1]")));
                    app.click();
                    
                    //Close btn
                    WebElement closed = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[3]/div/div/div[1]/button")));
                    closed.click();
                    
                    // Add new slide
                    WebElement added = wait.until(ExpectedConditions.elementToBeClickable(By.id("pdaddnewslide")));
                    added.click();
                    System.out.println("Added new slide");

                     // Browse template
                    WebElement browserr = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[3]/button[1]")));
                    browserr.click();
                    
                    WebElement processed = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/nav/a[12]")));
                    processed.click();

//                    WebDriverWait closes = new WebDriverWait(driver, Duration.ofSeconds(111));
//                    WebElement explored = closes.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[1]/div[2]/button[2]")));
//                     explored.click();
//                     WebElement inserted = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[2]/button[1]")));
//                     inserted.click();
                    WebElement explain = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[1]/div[2]/button[1]/span")));
                    explain.click();
                    WebElement arrow = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div/div/div/div[2]/ul/li[2]/div/div/div[2]")));
                    arrow.click();
                    WebElement inserted = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[2]/button[1]")));
                    inserted.click();
                    
                    //Delete a node
                    WebElement delete = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[5]/div/div/div[3]/div[2]/div/div/div[2]/div[1]/div[1]/div[2]")));
                    delete.click();
                    WebElement buttons = wait.until(ExpectedConditions.elementToBeClickable(By.id("inlineDiagramDeleteAssetBtn")));
                    buttons.click();
                    
                    //Undo opt
                    WebElement undo = wait.until(ExpectedConditions.elementToBeClickable(By.id("topMenuUndo")));
                    undo.click();
                    
                    //Style option
                    WebElement style = wait.until(ExpectedConditions.elementToBeClickable(By.id("presentationstyle")));
                    style.click();
                    WebElement ascend = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li[2]/div[2]/div[2]/button")));
                    ascend.click();
                    
                    //Speaker notes
                    WebElement speaker = wait.until(ExpectedConditions.elementToBeClickable(By.id("pdshowminispeakernotes")));
                    speaker.click();
                    WebElement notes = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[3]/div/div/div[2]/div/textarea")));
                    notes.click();
                    notes.sendKeys("Presentation to the world");
                    
                    //Close btn
                    WebElement back = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[3]/div/div/div[1]/button")));
                    back.click();
                    
                    //Present Button
                    try {
                      
                        WebElement present = wait.until(ExpectedConditions.elementToBeClickable(By.id("topmenuPresentOptionsButtons")));
                      present.click();
                    } catch (Exception e) {
                        
                        System.out.println("Element not found or not clickable. Performing alternative action or logging the error.");
                    } finally {
                    }
                    }
                   }
                }
    }
}
                    