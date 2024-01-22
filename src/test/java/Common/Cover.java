package Common;



	import java.time.Duration;
	import java.util.ArrayList;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	//import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	//import org.openqa.selenium.support.ui.Wait;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	public class Cover {
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

	        WebElement continueWithEmail = driver.findElement(By.cssSelector("[data-test-id='login-identity-email-selector']"));
	        continueWithEmail.click();

	        driver.findElement(By.id("email")).sendKeys("abirami@pitchdeck.io");

	        WebElement continueButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div/button"));
	        continueButton.click();

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
	        WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div/div[3]/input")));
	        input.sendKeys("@D3ckr0cks");
	        System.out.println("Password entered successfully");

	        WebElement btn = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div/button"));
	        btn.click();

	        // Open a new tab using JavaScript
	        ((JavascriptExecutor) driver).executeScript("window.open('https://azure-qc.pitchdeck.io/#/docs/edit/318763', '_blank');");

	        // Get the handles of all open tabs
	        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

	        // Switch to the new tab
	        driver.switchTo().window(tabs.get(1));                      ///html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[1]/div[2]
	       driver.get("https://azure-qc.pitchdeck.io/#/docs/edit/318817");
//	       
//	       //Add slide
	       // Add new slide
           WebElement add = wait.until(ExpectedConditions.elementToBeClickable(By.id("pdaddnewslide")));
           add.click();
           System.out.println("Added new slide");

            // Browse template
           WebElement browse = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[3]/button[1]")));
           browse.click();
           
           
//         	  WebElement bookend = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/nav/a[1]"));
//         	  bookend.click();
//         	  
//         	 WebDriverWait waited = new WebDriverWait(driver, Duration.ofSeconds(120));
//         	 try {
//                 Thread.sleep(5000); // Sleep for 5 seconds
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//             WebElement cover = waited.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[1]/div[2]")));
//             cover.click();
//
//             WebElement hover = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[1]/div[2]")));
//             Actions actions = new Actions(driver);
//             actions.moveToElement(hover).perform();
//             WebDriverWait waiting = new WebDriverWait(driver, Duration.ofSeconds(120));
//             
           
           }

}
	
