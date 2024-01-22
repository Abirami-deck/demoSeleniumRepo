package Common;

	import java.time.Duration;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
	import org.openqa.selenium.JavascriptExecutor;
	import org.apache.logging.log4j.Logger;
	public class DocstoPdf{
		public static Logger Log;
		@Test
		public static void main(String[] args)
		{
			Log=LogManager.getLogger(DocstoPdf.class);
			
		     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abirami\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			Log.info("Chromedriver setup is complete");
			
			WebDriver driver = new ChromeDriver();
			Log.info("Initialize a WebDriver instance for Chrome using new ChromeDriver");
			
			driver.get("https://azure-qc.pitchdeck.io/docs/login#");
			Log.info("Logged in to qc.presentations.ai");
			
			driver.manage().window().maximize(); //To maximize the window
		
			
	        // View alternative log in or sign up methods
			WebElement altlogin = driver.findElement(By.cssSelector("[data-test-id='tp-login-identity-selector']"));
			Log.info("altlogin");
			altlogin.click();
			Log.info("Alt login clicking");
			
			
			//Continue with email
			WebElement continuewithemail = driver.findElement(By.cssSelector("[data-test-id='login-identity-email-selector']"));
			Log.info("continuewithemail");
			continuewithemail.click();
			Log.info("continuewithemail button");
			
			//entering email
			driver.findElement(By.id("email")).sendKeys("abirami@pitchdeck.io");
			Log.info("Entering email");
			
			//Continue button
			WebElement but = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div/button"));
			Log.info("Cont button");
			but.click();
			Log.info("click button");
			
			//Entering password
	         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		     WebElement Input = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div/div[3]/input")));
		     Input.sendKeys("@D3ckr0cks");
		     
		     //Continue button
		     WebElement btn = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div/button"));
		     btn.click();
		     
		     //Open docs
		     WebElement docs = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div/ul/li[1]/div/div[1]/div[3]/div/p[1]")));
		     docs.click();
		     
		     //Share btn
		     WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.id("pdtopmenushare")));
		     button.click();
		     WebElement export = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div/div/nav/div[3]/a")));
		     export.click();
		     
		     //Export to pdf
		      WebDriverWait stop = new WebDriverWait(driver, Duration.ofSeconds(100));
		     WebElement pdf = stop.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/div[3]/div/div/div[2]/div[1]/div/img")));
		     pdf.click();
		     
		     WebElement close = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/button")));
		     close.click();
		     
		     WebElement buttons = wait.until(ExpectedConditions.elementToBeClickable(By.id("pdtopmenushare")));
		     buttons.click();
		     WebElement exports = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div/div/nav/div[3]/a")));
		     exports.click();
		     
		     WebElement butto = driver.findElement(By.xpath("your_button_xpath"));
		     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
		     butto.click();

		     
		     //Export to Image
		     WebElement img = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/div[3]/div/div/div[2]/div[2]/div")));
		     img.click();
		       
		}
	}


