package Common;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Inserting2 {
    
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
    }
}
