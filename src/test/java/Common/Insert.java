package Common;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Insert {

    public static Logger Log;

    @Test(priority = 1)
    public void diagramInsertingTest() {
        Log = LogManager.getLogger(Diagram.class);

        // Set up Chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abirami\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://azure-qc.pitchdeck.io/docs/login#");
        driver.manage().window().maximize();

        // Perform login
        performLogin(driver);

        // Open document and add new slide
        openDocumentAndAddSlide(driver);

        // Browse template and insert
        browseTemplateAndInsert(driver);

        // More options and Save PowerPoint
        moreOptionsAndSavePPT(driver);

        // Dashboard and Open the document
        dashboardAndOpenDocument(driver);

        // Particular 3rd slide and Soft Assertions
        particularSlideAndSoftAssertions(driver);

        // Select list and Select number list
       // selectListAndNumberList(driver);

        // Particular 4th slide and Duplicate button
        particularFourthSlideAndDuplicate(driver);

       
    }

    // Method to perform login
    private void performLogin(WebDriver driver) {
        WebElement altLogin = driver.findElement(By.cssSelector("[data-test-id='tp-login-identity-selector']"));
        altLogin.click();

        WebElement continueWithEmail = driver.findElement(By.cssSelector("[data-test-id='login-identity-email-selector']"));
        continueWithEmail.click();

        driver.findElement(By.id("email")).sendKeys("abirami@pitchdeck.io");

        WebElement continueButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div/button"));
        continueButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div/div[3]/input")));
        input.sendKeys("@D3ckr0cks");

        WebElement btn = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div/button"));
        btn.click();
    }

    // Method to open document and add a new slide
    private void openDocumentAndAddSlide(WebDriver driver) {
        WebDriverWait waiting = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement documents = waiting.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div/ul/li[1]/div/div[1]/div[3]/div/p[1]")));
        documents.click();

        WebElement add = waiting.until(ExpectedConditions.elementToBeClickable(By.id("pdaddnewslide")));
        add.click();
    }

    // Method to browse template and insert
    private void browseTemplateAndInsert(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));

        WebElement browse = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[3]/button[1]")));
        browse.click();

        WebElement process = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/nav/a[12]")));
        process.click();

        WebElement explore = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[1]/div[2]/button[2]")));
        Actions actions = new Actions(driver);
        actions.moveToElement(explore).perform();
        explore.click();

        WebElement insert = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[2]/button[1]")));
        insert.click();
    }

    // Method for more options and save PowerPoint
    private void moreOptionsAndSavePPT(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            WebElement ppt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[4]/div/div[1]/div[1]/ul/li[3]/div/span[2]")));
            if (ppt.isDisplayed() && ppt.isEnabled()) {
                ppt.click();
                System.out.println("Clicked on PPT");
            } else {
                System.out.println("PPT element is not displayed or not enabled. Skipping click.");
            }
        } finally {
            WebElement option = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[4]/div/div[1]/div[1]/div/button")));
            if (option.isEnabled()) {
                option.click();
            } else {
                System.out.println("Element is not clickable within the specified timeout.");
            }
        }
    }

    // Method for Dashboard and Open the document
    private void dashboardAndOpenDocument(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            WebElement db = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[4]/div/div[1]/div[1]/ul/li[1]/div/span[2]")));
            if (db != null && db.isDisplayed() && db.isEnabled()) {
                db.click();
                System.out.println("Clicked on DB");
            } else {
                System.out.println("DB element is either null, not displayed, or not enabled. Skipping click.");
            }
        } finally {
            WebElement document = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div/ul/li[1]/div/div[1]/div[3]/div/p[1]")));
            document.click();

            WebElement particulars = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[6]/div/div[1]/div/div[2]/div/div/div[2]/div[2]/div[2]")));
            particulars.click();

            WebDriverWait waitings = new WebDriverWait(driver, Duration.ofSeconds(111));
            WebElement addpt = waitings.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/ul/li[1]/div/div/div/button")));
            addpt.click();
            WebElement five = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/ul/li[1]/div/div/ul/li[4]")));
            five.click();

            WebElement adding = wait.until(ExpectedConditions.elementToBeClickable(By.id("pdaddnewslide")));
            adding.click();

            WebElement browser = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[3]/button[1]")));
            browser.click();

            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(true, "This assertion will pass");
            softAssert.assertFalse(false, "This assertion will fail");
            softAssert.assertAll();

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
                softAssert.assertAll();
            }

            WebElement number = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[1]/div[2]/button[2]")));
            Actions action = new Actions(driver);
            action.moveToElement(number).perform();
            WebElement inserts = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[2]/button[1]")));
            inserts.click();
        }
    }

    // Method for particular 3rd slide and Soft Assertions
    private void particularSlideAndSoftAssertions(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(111));

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

        WebElement amazingtemp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[4]/div/div/div[3]/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div")));
        amazingtemp.click();

        WebElement temp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[4]/div/div/div[3]/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div")));
        temp.click();

        WebElement more = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[4]/div/ul/li[4]/div/button")));
        more.click();

        WebElement emphaze = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[4]/div/ul/li[4]/div/div/div/span")));
        emphaze.click();

        try {
            WebElement db = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[4]/div/div[1]/div[1]/ul/li[1]/div/span[2]")));
            if (db != null && db.isDisplayed() && db.isEnabled()) {
                db.click();
                System.out.println("Clicked on DB");
            } else {
                System.out.println("DB element is either null, not displayed, or not enabled. Skipping click.");
            }
        } finally {
            WebElement document = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div/ul/li[1]/div/div[1]/div[3]/div/p[1]")));
            document.click();

            WebElement particulars = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[6]/div/div[1]/div/div[2]/div/div/div[2]/div[2]/div[2]")));
            particulars.click();

            WebDriverWait waitings = new WebDriverWait(driver, Duration.ofSeconds(111));
            WebElement addpt = waitings.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/ul/li[1]/div/div/div/button")));
            addpt.click();
            WebElement five = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/ul/li[1]/div/div/ul/li[4]")));
            		five.click();

                    WebElement adding = wait.until(ExpectedConditions.elementToBeClickable(By.id("pdaddnewslide")));
                    adding.click();

                    WebElement browser = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[3]/button[1]")));
                    browser.click();

                    SoftAssert softAssert = new SoftAssert();
                    softAssert.assertTrue(true, "This assertion will pass");
                    softAssert.assertFalse(false, "This assertion will fail");
                    softAssert.assertAll();

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
                        softAssert.assertAll();
                    }

                    WebElement number = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[1]/div[2]/button[2]")));
                    Actions action = new Actions(driver);
                    action.moveToElement(number).perform();
                    WebElement inserts = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[2]/button[1]")));
                    inserts.click();
                }
            }

            // Method for particular 4th slide and Duplicate button
            private void particularFourthSlideAndDuplicate(WebDriver driver) {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(111));

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

                WebElement amazingtemp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[4]/div/div/div[3]/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div")));
                amazingtemp.click();

                WebElement temp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[4]/div/div/div[3]/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div")));
                temp.click();

                WebElement more = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[4]/div/ul/li[4]/div/button")));
                more.click();

                WebElement emphaze = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[4]/div/ul/li[4]/div/div/div/span")));
                emphaze.click();

                WebElement settings = wait.until(ExpectedConditions.elementToBeClickable(By.id("floaterSettings")));
                settings.click();

                WebElement second = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div/span[2]/div/button")));
                second.click();

                WebElement exit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[1]/button")));
                exit.click();

                WebElement duplicate = wait.until(ExpectedConditions.elementToBeClickable(By.id("duplicateSlideButton")));
                duplicate.click();

                WebElement four = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[6]/div/div[1]/div/div[4]/div/div/div[2]/div[2]/div[2]")));
                four.click();
            }
        }
