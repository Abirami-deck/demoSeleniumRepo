import static org.testng.Assert.assertTrue;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Settings {
		private WebDriver driver;
	    private String originalTab;
	    private static final Logger Logs = LogManager.getLogger(Settings.class);
	    public static Logger Log;
	    SoftAssert softassert = new SoftAssert();
	    public Settings(WebDriver driver) {
	        this.driver = driver;   
	    }
	    public WebDriver getDriver() {
	        return driver;
	    }
	      @Test
	      public void testSetup()
	      {
	      	Log=LogManager.getLogger(Settings.class);
	      System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\Abirami\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	      Log.info("Chromedriver setup is complete");
	      Reporter.log("Chrome driver setup is complete");
	      driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      softassert.assertAll();
	      }
	      
	      @Test
	      public void setUp() {
	    	  Log=LogManager.getLogger(Settings.class);
	          System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abirami\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	          Log.info("Chromedriver setup is complete");
	          Reporter.log("Chrome driver setup is complete");
	          driver = new ChromeDriver();
	          driver.get(Paths.APP_SERVER);
	          driver.manage().window().maximize();
	      }
	      @Test
	      public void loginToApplication() {
	          SoftAssert softAssert = new SoftAssert();
	          driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	          WebElement altLogin = driver.findElement(By.id("login-viewalternativelogin"));
	          altLogin.click();

	          driver.findElement(By.id("login-email")).sendKeys("abirami@pitchdeck.io");
	         
	          
	          WebElement submit = driver.findElement(By.id("login-continue"));
	          submit.click();

	          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	          WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-password")));
	          passwordInput.sendKeys(Paths.SEND_PASSWORD);

	          WebElement clickContinue = driver.findElement(By.id("login-continue"));
	          clickContinue.click();

	          String actualTitle = driver.getTitle();
	          softAssert.assertEquals(actualTitle, "Presentations.AI", "Page title is not as expected.");
	          softAssert.assertAll();

	          originalTab = driver.getWindowHandle();
	      }
	      @Test(alwaysRun= true)
	      public void addSlide() {
	    	  SoftAssert softAssert = new SoftAssert();
//	    	  Log=LogManager.getLogger();
	    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	          // Click on the second slide
	          WebElement addslide = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pdaddnewslide")));
	          addslide.click();
	          Log.info("Add slide working");
	          Reporter.log("click on Add slide");
	          softAssert.assertAll();
	      	}
  public void addSlidesection() {
	  //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

	  //WebDriverWait wait = new WebDriverWait(driver, 20);
	  WebElement element = driver.findElement(By.id("pdaddnewslide"));
element.click();
      System.out.println("Clicked on addSlide");
      Log.info(" Clicked on add new slide");
  }
  @Test
  public void BrowseTemplate() {
	  SoftAssert softAssert = new SoftAssert(); 
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
      Log=LogManager.getLogger(Settings.class);
      WebElement browsetemplate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.getXPath("BROWSE_TEMPLATE"))));
      browsetemplate.click();
      System.out.println("Clicked on browse template");
      Log.info("Clicked on browse template");
      Reporter.log("Clicked on browse template");
      assertTrue(isaddSlideClicked(), "Failed to click on add slide");
      softAssert.assertAll();
    
  	}  
      public boolean isaddSlideClicked() {
          try {
              WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
              wait.until(ExpectedConditions.presenceOfElementLocated(By.id("pdaddnewslide")));
              System.out.println("click on add image is successfull");
              Log.info("click on add image is successfull");
              Reporter.log("click on add image is successfull");
              return true;
          } catch (TimeoutException e) {
        	  Log.error("click on add image is failed");
        	  Reporter.log("click on add image is failed");
              return false;
          }
      }

 public void assertstack() {
          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
          WebElement stack = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.ASSERT_STACK)));
          if (stack.isDisplayed()) {
            	stack.click();
            	Log.info("stack is displayed.");
            } else {
                System.out.println("stack is not displayed.");
                Log.info("stack is not displayed.");
            }
          
      }
 public void Bookend() {
        	  WebElement bookend = driver.findElement(By.xpath(Xpath.BOOKEND));
        	  bookend.click();                                  
        	  Log.info("Clicked on Bookend");
        	  System.out.println("Clicked on Bookend");
        	  Reporter.log("Clicked on bookend asset");
          }
      
 public void ProductScreen() {
          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
          WebElement productScreen = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.PRODUCT_SCREEN)));
          productScreen.click();
          System.out.println("Clicked on ProductScreen");
          Log.info("Clicked on ProductScreen");
          Reporter.log("Clicked on productscreen asset");
      }
          
public void exploreStyle() {
          WebElement explorestyles = driver.findElement(By.xpath(Xpath.EXPLORESTYLESS));
          explorestyles.click();                                
          System.out.println("Clicked on exploreStyle");
          Log.info("Clicked on ExploreStyle");
          Reporter.log("Clicked on explore styles");
      }
      
public void variation() {
      WebElement variation = driver.findElement(By.id("pdslidevariation"));
      variation.click();
      System.out.println("Clicked on variation");
      Log.info("Clicked on variation");
      Reporter.log("Clicked on variation");
       }
      
public void applyStyle() {
     WebElement apply = driver.findElement(By.id("pdapplystle"));
     apply.click();
     System.out.println("applyStyle");
     Log.info("Clicked on ApplyStyle");
     Reporter.log("Clicked on apply style");
      }
     
public void Styleoptions() {
    //style
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
     WebElement style= wait.until(ExpectedConditions.elementToBeClickable(By.id("presentationstyle")));
     style.click();
}
public void FloaterSettings() {
   WebElement settings = driver.findElement(By.id("floaterSettings"));
   settings.click();
   System.out.println("FloaterSettings");
   Log.info("Clicked on Floatersettings");
   Reporter.log("Clicked on floater settings");
   }
   
public void Hyperlink() {
	   WebElement link = driver.findElement(By.id("floateraddlink"));
	   link.click();
	   System.out.println("Hyperlink");
	   Log.info("Clicked on Hyperlink");
	   Reporter.log("Clicked on Hyperlink");
   }
   
public void Sharebtn() {
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
   WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.id("pdtopmenushare")));
   button.click();
   System.out.println("Sharebtn");
   Log.info("Clicked on Sharebtn");
   Reporter.log("Clicked on Sharebtn");
   }
   
public void Moreoptions() {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
   WebElement options = wait.until(ExpectedConditions.elementToBeClickable(By.id("pdmainmenu")));
   options.click();
   Log.info("Clicked on more options");
	   }
 
public void  present() {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     WebElement present = wait.until(ExpectedConditions.elementToBeClickable(By.id("pdtopmenupresent")));
     present.click();
     Log.info("Clicked on present");
 }
public void  presentclose() {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement present = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.PRESENT_CLOSE)));
    present.click();
    Log.info("Clicked on present");
    Reporter.log("Clicked on present closebtn");
}
 
public void sendinvite() {
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
     WebElement invites = wait.until(ExpectedConditions.elementToBeClickable(By.id("sendinvite")));
     invites.click();
     Log.info("Clicked on sendinvite");
     Reporter.log("Clicked on sent invitebtn");
     
     WebElement close = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/button"));
     close.click();
}
 
public void TimeLine() {
    WebDriverWait hold = new WebDriverWait(driver, Duration.ofSeconds(100));
    WebElement time = hold.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.TIMELINE)));
    time.click();
    Log.info("Clicked on Timeline");
    Reporter.log("Clicked on timeline asset");
}

public void deletebtn() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    WebElement delSlide = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='deleteSlideButton']")));
    delSlide.click();
}
private boolean isSlideDeletionSuccessful() {
    try {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("[data-layoutstyle='imagelayout_ImageLeftLayout']")));
        System.out.println("Slide deleted successfully");
        return true;
    } catch (TimeoutException e) {
        return false;
    }
}

public void themepalette() {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
     WebElement theme = wait.until(ExpectedConditions.elementToBeClickable(By.id("pdshowminislideproperties")));
     theme.click();
     Log.info("Clicked on themepallete");
     Reporter.log("Clicked on theme palette");
}

public void presentBtn() {
	WebElement present = driver.findElement(By.id("pdtopmenupresent"));
	present.click();
	Log.info("Clicked on Presentbtn");
	 Reporter.log("Clicked on presentbtn");
}

public void  presentdb() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
   WebElement present = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-test-id='undefinedtopmenupresent']")));
   present.click();
   Log.info("Clicked on prseentdb");
   Reporter.log("Clicked on presntdb");
}

public void peopleslides() {        
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		WebElement people = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.PEOPLE_SLIDES)));
		people.click();
		Log.info("Clicked on people slide");
}

public void quoteshover() {
	WebElement cover = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[4]/div[2]"));
	Actions actions = new Actions(driver);
    actions.click(cover).perform();
}









public void  layout() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	     WebElement out = wait.until(ExpectedConditions.elementToBeClickable(By.id("pdslidelayout")));
	     out.click();
	     Log.info("Clicked on Layout");
		 }
		 
public void exportppt() {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement exportButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("exportpptx")));
		exportButton.click();
		Log.info("exportppt");
 }
public void exportcredits() {  
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	WebElement creditButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.EXPORT_CREDITS)));
	creditButton.click();
 }
public void exportcontinue() { 
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement exportcontinue = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.EXPORT_CONTINUE)));
		exportcontinue.click();
 }
public void customsorder() {   
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement order = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.CUSTOMS_ORDER)));
		order.click();
}
public void outlineeditor() {
    	SoftAssert softAssert = new SoftAssert();
    	//outline option
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement outline =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pdswitchtooutline")));
		outline.click();
		softAssert.assertTrue(isOutlineScreen(), "Failed to navigate outline screen");
    	softAssert.assertAll();
    }
private boolean isOutlineScreen() {
  try {				        	
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("root")));
        System.out.println("Navigate to Outline screen successfully");
        Reporter.log("Navigate to Outline screen successfully");
        return true;
    } catch (TimeoutException e) {
        return false;
    }				  
}
public void outlineeditorclipboard() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 WebElement outline = wait.until(ExpectedConditions.elementToBeClickable(By.id("pdswitchtooutline")));
	 outline.click();
	 Log.info("outlineeditor");          
}

public void clipboardtext() { 
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement text = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.clipboardtext)));
	text.click();
	text.clear();
	text.sendKeys("Automation testing");            
}
public void entersubtitleclip() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 WebElement subtitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.entersubtitleclip)));
	 subtitle.click();
	 subtitle.sendKeys("Selenium");
	 Log.info("outlineeditor");          
}
   
public void undo() {
	 SoftAssert softAssert = new SoftAssert();
	  		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement undo = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("topMenuUndo")));
		undo.click();	
}
public void speakernotes() {
	 WebElement speaker = driver.findElement(By.id("pdshowminispeakernotes"));
	 speaker.click();
	 Log.info("speakernotes");
}

public void backgroundslide() {
	WebElement back = driver.findElement(By.id("pdslidebackground"));
	back.click();
}

public void saveslideTemplate() {
	WebElement saveslide = driver.findElement(By.id("saveSlideButton"));
	saveslide.click();
	Log.info("saveslideTemplate");
}
public void  meetandedit() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
   WebElement present = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-test-id='undefinedmeetandedit']")));
   present.click();
   Log.info("Clicked on prseentdb");
}
public void profile() {
	 WebElement speaker = driver.findElement(By.id("profile"));
	 speaker.click();
	 Log.info("profile");
}

public void insertbutton() {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 WebElement element =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.insertbutton)));
      element.click();                                                               
        Log.info("Clicked on insert slide");        
}
    @Test
public void agenda() {
    	WebElement agenda = driver.findElement(By.xpath(Xpath.agenda));
    	Actions actions = new Actions(driver);
     actions.moveToElement(agenda).perform(); 
    }
    @Test
    public void usebtnagenda() {
    	SoftAssert softAssert = new SoftAssert();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.USEBTNSAGENDA)));
        element.click();
        
        softAssert.assertTrue(isagendaassetAdded(), "Failed to add image of the selected slide");
 		softAssert.assertAll();
}
private boolean isagendaassetAdded() {
   try {	
   	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
   	wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[data-layout='graphicLayoutTextLeftCenter']")));
   	System.out.println("Agenda added successfully ");
   	Reporter.log("Agenda added successfully");
   	return true;
   } catch (TimeoutException e) {
   	return false;
		}
}
 
    public void agendainsertbutton() {
   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
   	 WebElement element =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.agendainsertbutton)));
         element.click();                                                                 
           Log.info("Clicked on insert slide");  
           Reporter.log("Clicked on insert btn");
   }
    @Test
public void openNewTab(String url) {
        ((ChromeDriver) driver).executeScript("window.open()");
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(originalTab)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        driver.get(url);
    }
    public void agendadoc() {
 	   String elementText = "Agenda";
     By locator = By.xpath("//p[contains(text(),'" + elementText + "')]");
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
     element.click();             
 }
public void addpoint() {
        	WebElement add = driver.findElement(By.xpath(Xpath.ADD_POINT));
        	add.click();
}
public void sixthpoint() {
        	WebElement sixth = driver.findElement(By.xpath(Xpath.SIXTH_POINT));
        	sixth.click();
        	System.out.println("Clicked on addpt");
        	 Reporter.log("Points added succcessfully");
        }
public void dashboard() {
        	WebElement db = driver.findElement(By.xpath(Xpath.dashboard));
        	db.click();
        	System.out.println("Clicked on dashboard");
}
                                                 // VALIDATE CALENDAR//
public void calendardoc() {
	   String elementText = "ValidateCalendar";
  By locator = By.xpath("//p[contains(text(),'" + elementText + "')]");
  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
  element.click();             
}    	
public void testCalendar() {
	SoftAssert softAssert = new SoftAssert();
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
   WebElement calendarasset = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[5]/div[2]/button[1]"));
   calendarasset.click();
   
    WebElement choose = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div/div/div/div[2]/ul/li/div/div/div[2]")));
    choose.click();
    softAssert.assertTrue(iscalendarimageAdded(), "Failed to add calendarimg of the selected slide");
	softAssert.assertAll();
    System.out.println("Clicked on calendar");
}
   private boolean iscalendarimageAdded() {
   	   try {	
          	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
          	wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[data-layout='emptyGraphicLayout']")));
          	System.out.println("calendarimage added successfully ");
          	Reporter.log("calendarimage added successfully");
          	return true;
          } catch (TimeoutException e) {
          	return false;
     		}
     }
        
public void date() {
        	WebElement date = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[2]/div/div/div[3]/div/div[2]/div/table/tbody/tr/td/div/div/div/table/tbody/tr[3]/td[2]"));
        	date.click();
        	WebElement event = driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div/div[2]/div/div/div[1]/div"));
        	event.click();
        	event.sendKeys("Selenium");
        	System.out.println("Clicked on date");
        	 Reporter.log("Event added successfully");
}
        
public void savevent() {
    	WebElement name = driver.findElement(By.xpath(Xpath.savevent));
    	name.click();
    	System.out.println("Clicked on savevent");
}
    
public void settingscal() {
    	WebElement set = driver.findElement(By.id("calenderFloaterSettings"));
    	set.click();
    	System.out.println("Clicked on settingscal");
}
    
public void Showtitle() {
  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
  WebElement title = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.Showtitle)));
  title.click();
  System.out.println("Clicked on Showtitle");
}
  
public void Displayview() {
  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
  WebElement view = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.Displayview)));
  view.click();
  
  WebElement week = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.week)));
  week.click();

}

public void Closebtn() {
 // WebDriverWait waiting = new WebDriverWait(driver, Duration.ofSeconds(5));
 WebElement close = driver.findElement(By.xpath(Xpath.closebtn));
  close.click();
}                                                                                    

                                                    //REAL TIME//
public void realtime() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement options = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.realtime)));
    options.click();
    Log.info("Moreoptions");
    }
    @Test
    public void Sharbutton() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    WebElement share = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.Sharbutton)));
    share.click();
    Log.info("Sharbutton");
    }
    public void edit() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    WebElement edit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.editrealtime)));
    edit.click();
    Log.info("edit");                
    }
    public void upgradebtn() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement edit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/nav/div[2]/div[1]/div/div[2]/button[2]")));
        edit.click();
    }
    @Test
    public void Invitemembers() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    WebElement invite = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.Invitemembers)));
    invite.click();                                                                  
}
    @Test
    public void mail() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    WebElement mail = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.mail)));
    mail.click();
    mail.sendKeys("abirami@pitchdeck.io");
    mail.sendKeys(Keys.ENTER);
      Reporter.log("Mail sent successfully");
}
    //GRAPHICS//
   
    public void graphicsdoc() {
    		   String elementText = "Inserted Graphics";
    	  By locator = By.xpath("//p[contains(text(),'" + elementText + "')]");
    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	  WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
    	  element.click();             
    	}    	
    public void icons() {
   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
   WebElement icons = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.icons)));
   Actions action = new Actions(driver);
   action.moveToElement(icons).perform();
    }
    
    public void explorestyleicon() {
    	SoftAssert softAssert = new SoftAssert();
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
   WebElement use = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.explorestyleicon)));
   use.click();
    }
    public void iconasset() {
    	SoftAssert softAssert = new SoftAssert();
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
      WebElement use = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.iconasset)));
        use.click();
				 softAssert.assertTrue(isiconassetAdded(), "Failed to add image of the selected slide");
			 		softAssert.assertAll();
	  }
	    private boolean isiconassetAdded() {
	    	   try {	
	           	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	           	wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[data-layout='graphicLayoutTextTop']")));
	           	System.out.println("icon added successfully ");
	           	Reporter.log("icon added successfully");
	           	return true;
	           } catch (TimeoutException e) {
	           	return false;
	      		}
	      }
    
    public void EditText() {
    	WebElement text = driver.findElement(By.xpath(Xpath.EDIT_TEXT));
    	text.click();
    	text.clear();
    	text.sendKeys("Deck");
    	}
    
    public void apptheme() {
    	WebElement app = driver.findElement(By.xpath(Xpath.APP_THEME));
    	app.click();
    }
    public void appthemeclose() {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
         WebElement close = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.APPTHEME_CLOSE)));
    	 close.click();
    	    }
    
 public void agencymoods() {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
   WebElement agency = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li[3]/div[2]/div[2]/button")));
   agency.click();
   System.out.println("Clicked on agencymoods");
 }
 
 public void begin() {
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
 WebElement begin = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[4]/div/div[3]/div/div[2]/div/ul/li[2]/div/span[2]")));
 begin.click();
 System.out.println("Clicked on begin button");
}
 public void exit() {
 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
 WebElement exit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div[2]/div[3]/button")));
 exit.click();
 System.out.println("Clicked on exit button");
 
 }
 
 //OLD DOCS//

 public void olddoc() {
		   String elementText = "OldDocs";
	  By locator = By.xpath("//p[contains(text(),'" + elementText + "')]");
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
	  element.click();             
	}    	
 
 public void savePresentation() {
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     WebElement save = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-test-id='undefinedsavepresentation']")));
    // WebElement save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[4]/div/div[1]/div[1]/ul/li[3]/div/span[2]")));
     save.click();
     System.out.println("Clicked on savePresentation");
     Log.info("Save presentation");
 }

 public void publishSettings() {
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
     WebElement publish = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.publishSettings)));
     publish.click();
     System.out.println("Clicked on publishSettings");
     Log.info("Publish settings");
 }

 public void close() {
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
     WebElement close = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/button")));
     close.click();
     System.out.println("Clicked on close");
     Log.info("Close");
 }                               
		 public void usebtns() {
			 SoftAssert softAssert = new SoftAssert();
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
     WebElement close = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[1]/div[2]/button[2]")));
     close.click();
     softAssert.assertTrue(isstackassetAdded(), "Failed to add image of the selected slide");
		softAssert.assertAll();     
     System.out.println("Clicked on close");
     Log.info("Close");
 }                     
		
			    private boolean isstackassetAdded() {
			    	   try {	
			           	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			           	wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[data-layout='graphicLayoutTextTop']")));
			           	System.out.println("stack added successfully ");
			           	Reporter.log("stack added successfully");
			           	return true;
			           } catch (TimeoutException e) {
			           	return false;
			      		}
			      }
		 

 public void begins() {
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
     WebElement begin = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[4]/div/div[3]/div/div[2]/div/ul/li[2]/div/span[2]")));
     begin.click();
     System.out.println("Clicked on begins");
     Log.info("Begin");

     WebDriverWait waited = new WebDriverWait(driver, Duration.ofSeconds(120));
     WebElement exit = waited.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div[2]/div[3]/button")));
     exit.click();                                                                    
     Log.info("Exit button");
 }
 //SAVE VERSION//
 
	 public void saveversiondoc() {
		 	   String elementText = "Save version";
		     By locator = By.xpath("//p[contains(text(),'" + elementText + "')]");
		     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		     WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		     element.click();             
		 }
	 public void Saveversion() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 WebElement version = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-test-id='undefinedsavedocumentversion']")));
		 version.click();
		 System.out.println("Clicked on Saveversion");
		 Log.info("Saveversion");
		 }

		 public void Version1() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		 WebElement version1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div/div/div/div/div[2]/div/div/div[1]/div")));
		 version1.click();
		 version1.sendKeys("version1");
		 System.out.println("Clicked on Version1");
		 Log.info("Version1");
		 }

		 public void Saveversion1() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		 WebElement versi = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div/div/div/div/div[2]/div/div/div[2]/button[2]")));
		 versi.click();
		 System.out.println("Clicked on Saveversion1");
		 Log.info("Saveversion1");
		 }

		 public void Explorestyles() {
		     WebElement use = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[1]/div[2]/button[2]"));
		     Actions actions = new Actions(driver);
		    actions.moveToElement(use).perform();
		    use.click();
		    System.out.println("Clicked on Saveversion");
		    Log.info("Explorestyles");              
		 }
		 public void  insertslidesave() {
		 	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 WebElement moreopt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[2]/button[1]")));
		 moreopt.click();
		 System.out.println("Clicked on Saveversion");
		 }
		 

		  public void  Moreoptions1() {
		 	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 WebElement moreopt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[4]/div/div[1]/div[1]/div/button")));
		 moreopt.click();
		 System.out.println("Clicked on Saveversion");
		 Log.info("Moreoptions1");
		  }

		   public void Savedversion() {
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		  WebElement versions = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[4]/div/div[1]/div[1]/ul/li[4]/div/span[2]")));
		 versions.click();
		 System.out.println("Clicked on Saveversion");
		 Log.info("Clicked on Savedversion");
		   }

		   public void Versioning1() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		 WebElement version2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div/div/div/div/div[2]/div/div/div[1]/div")));
		 version2.click();
		 version2.sendKeys("version2");
		 System.out.println("Clicked on Saveversion");
		 Log.info(" Clicked on Versioning1");
		   }
		   
		 public void Savedversion2() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		 WebElement versions2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div/div/div/div/div[2]/div/div/div[2]/button[2]")));
		 versions2.click();
		 System.out.println("Clicked on Saveversion");
		 Log.info("Savedversion2");
		 }

		 public void  options() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		     WebElement moreoptions = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[4]/div/div[1]/div[1]/div/button")));
		     moreoptions.click();
		     System.out.println("Clicked on Saveversion");
		     Log.info("options");
		 }   

		 public void Viewbtn() {
		     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			 WebElement view = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-test-id='undefinedshowdocumentversions']")));
		     view.click();
		     System.out.println("Clicked on Saveversion");
		     Log.info("Viewbtn");
		 }
		 
		 //DIAGRAM PROPERTIES//
			 public void diagramdoc() {
					 	   String elementText = "Diagram properties";
					     By locator = By.xpath("//p[contains(text(),'" + elementText + "')]");
					     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
					     WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
					     element.click();    
					     Reporter.log("Open the diagram document");
					 }
			 
			 public void process() {
			    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			    	WebElement element = driver.findElement(By.xpath(Xpath.PROCESS));
			element.click();
			System.out.println("Clicked on process");
			  }
			   public void smallprocess() {
			    	WebElement process = driver.findElement(By.xpath(Xpath.SMALL_PROCESS));
			    	Actions action = new Actions(driver);
			        action.moveToElement(process).perform();
			        System.out.println("Clicked on smlprocess");
			        Log.info("smallprocess");
			    }
			   
			   public void explorestylesdiagram() {
				    WebElement diagram = driver.findElement(By.xpath(Xpath.explorestylesdiagram));
				    diagram.click();                  
			   }
				  public void diagramasset() {
					  SoftAssert softAssert = new SoftAssert();
							 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
							 WebElement diagram = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div/div/div/div[2]/ul/li[1]/div/div/div[2]")));
							 diagram.click();
							 softAssert.assertTrue(isdiagramassetAdded(), "Failed to add image of the selected slide");
						 		softAssert.assertAll();
				  }
				    private boolean isdiagramassetAdded() {
				    	   try {	
				           	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				           	wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[data-layout='graphicLayoutTextTop']")));
				           	System.out.println("diagram added successfully ");
				           	Reporter.log("diagram added successfully");
				           	return true;
				           } catch (TimeoutException e) {
				           	return false;
				      		}
				      }
				  
 public void insertdiagramslide() {     
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  WebElement chart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.INSERT_DIAGRAMSLIDE)));
	  chart.click();
			    System.out.println("Clicked on insertdiagramslide");
			    	
			    }
  public void addpts() {
			    WebElement add = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/ul/li[1]/div/div/div/button"));
			    	add.click();
			    	 Log.info("Clicked on point ");
			    	
			    	WebElement sixth = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/ul/li[1]/div/div/ul/li[4]"));
			    	sixth.click();
			    	 Log.info("sixth");
			    	 System.out.println("Clicked on addpts");
			    	 Reporter.log("Points added succcessfully");
			    }
			    
			    public void amazingtemp() {
			    	WebElement high = driver.findElement(By.xpath(Xpath.AMAZING_TEMP));
			    	high.click();
			    	System.out.println("Clicked on amazingtemp");
			    	 Log.info("Clicked on amazingtemp");
			    }
			    public void highlightdiagram() {
			    	WebElement highlight = driver.findElement(By.xpath(Xpath.HIGHLIGHT_DIAGRAM));
			    	highlight.click();
			        Log.info("highlight");
			    }
			    
			    public void edithgl() {
			    	WebElement edit = driver.findElement(By.xpath(Xpath.EDITHGL));
			    	edit.click();
			    	edit.clear();
			    	edit.sendKeys("Selenium");
			    	  Log.info("Clicked on edithgl");
			    }
			    @Test
			    public void addhl() {
			    	WebElement add = driver.findElement(By.xpath(Xpath.ADDHL));
			    	add.click();
			    	  Log.info("addhl");
			    }
			    public void amazingtemp1() {
			    	WebElement high = driver.findElement(By.xpath(Xpath.AMAZING_TEMP1));
			    	high.click();
			    	  Log.info("amazingtemp1");
			     }
			     public void moreopt() {
			    	 WebElement moreopt = driver.findElement(By.xpath(Xpath.MOREOPT));
			    	 moreopt.click();
			    	 Log.info("moreopt");
			    	 
			    	 WebElement emphaze = driver.findElement(By.xpath(Xpath.EMPHAZE));
			    	 emphaze.click();
			    	  Log.info("emphaze");
			    	  Reporter.log("Properties added");
			     }
			     public void amazingtemp2() {
			     	WebElement high = driver.findElement(By.xpath(Xpath.AMAZING_TEMP2));
			     	high.click();
			     	  Log.info("amazingtemp2");
			     	
			     	WebElement font = driver.findElement(By.xpath(Xpath.FONT));
			     	font.click();
			     	  Log.info("font");
			     	
			     	WebElement large = driver.findElement(By.xpath(Xpath.LARGE));
			     	large.click();
			     	  Log.info("large");
			      }
			     public void sectext() {
			    	 WebElement text = driver.findElement(By.xpath(Xpath.SECTEXT));
			    	 text.click();
			     }
			     public void sectextclose() {
			    	 WebElement close = driver.findElement(By.xpath(Xpath.SECTEXT_CLOSE));
			    	 close.click();
			    	  Log.info("sectext");
			    	  Reporter.log("Floater settings added");
			     }
			     public void notes() {
			    	 WebElement notes = driver.findElement(By.xpath(Xpath.NOTES));
			    	 notes.click();
			    	 notes.sendKeys("Welcome to deck");
			    	  Log.info("notes");
			    	 
			    	 WebElement close = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[3]/div/div/div[1]/button"));
			    	 close.click();
			    	  Log.info("close");
			     }
			     public void saveslide() {
			    	 WebElement save = driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div/div[2]/div/div/div[1]/div"));
			    	 save.click();
			    	 save.sendKeys("save version");
			    	  Log.info("saveslide");
			     }
			     public void savebtn() {
			    	 WebElement save = driver.findElement(By.xpath(Xpath.SAVEBTN));
			    	 save.click();
			    	  Log.info("savebtn");
			     }
			     public void cornelred() {
			    	 WebElement red = driver.findElement(By.xpath(Xpath.CORNEL_RED));
			    	 red.click();
			    	 
			    	  Log.info("cornelred");
			     }
			  
			     public void closed() {
			    	 WebElement close = driver.findElement(By.xpath(Xpath.CLOSED));
			    	 close.click();
			    	  Log.info("close");
			     }
			     public void backtodb() {                          
			    	 WebElement back = driver.findElement(By.xpath(Xpath.BACKTODB));
			    	 back.click();                                
			     }
			     public void backtodbquote() {     
			    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			    	 WebElement back = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[4]/div/div[1]/button")));
			    	 back.click();                                
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
			     }
//QUOTE SETUP//

 public void quotesdoc() {
	 	   String elementText = "ValidateQuote";
	     By locator = By.xpath("//p[contains(text(),'" + elementText + "')]");
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
	     element.click();   
	     Reporter.log("Quote doc opened successfully");
	 }
 public void selectquote() {
	 WebElement quote =driver.findElement(By.xpath(Xpath.SELECT_QUOTES));
	 Actions action = new Actions(driver);
     action.moveToElement(quote).perform(); 
 }  
		 public void explorestyleQuote() {
	 WebElement quote = driver.findElement(By.xpath(Xpath.explorestyleQuote));
	 quote.click();
 }             
		 public void retromood() {
			 WebElement quote = driver.findElement(By.xpath(Xpath.retromood));
			 quote.click();
		 }             
 
 public void quoteasset() {
	 SoftAssert softAssert = new SoftAssert();
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 WebElement text = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.quoteasset)));
	 text.click();
	 softAssert.assertTrue(isquoteimageAdded(), "Failed to add quoteimg of the selected slide");
		softAssert.assertAll();
System.out.println("Quoteimg added successfully");
Log.info("Quote asset");
}
 
    private boolean isquoteimageAdded() {
    	   try {	
           	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
           	wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[data-layout='graphicLayoutTextTop']")));
           	System.out.println("quoteimage added successfully ");
           	Reporter.log("quoteimage added successfully");
           	return true;
           } catch (TimeoutException e) {
           	return false;
      		}
      }
 
 public void insertslidequote() {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 WebElement text = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.insertslidequote)));
	 text.click();
 }
 public void explorequote() {
	 WebElement quote = driver.findElement(By.xpath(Xpath.explorequote));
	 quote.click();
 }
 public void varquote() {
	 SoftAssert softAssert = new SoftAssert();
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 WebElement quote = driver.findElement(By.xpath(Xpath.varquote));
	 quote.click();
	 softAssert.assertTrue(isquotevarimageAdded(), "Failed to add quoteimg of the selected slide");
		softAssert.assertAll();
System.out.println("Quoteimg added successfully");
Log.info("Quote asset");
}
 
    private boolean isquotevarimageAdded() {
    	   try {	
           	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
           	wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[data-layout='graphicLayoutTextTop']")));
           	System.out.println("quoteimage added successfully ");
           	Reporter.log("quoteimage added successfully");
           	return true;
           } catch (TimeoutException e) {
           	return false;
      		}
      }
 
 //CHARTS 
	 public void chartdoc() {
		 	   String elementText = "Inserting Charts";
		     By locator = By.xpath("//p[contains(text(),'" + elementText + "')]");
		     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		     WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		     element.click();             
		 }
	 public void chart() {
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement chart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.chart)));
	    chart.click();
	    Log.info("Chart");
	  }
	 public void exploreStyleTest() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	        WebElement explore = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.exploreStyleTest)));
	        Actions actions = new Actions(driver);
	        actions.moveToElement(explore).perform();
	        WebElement explored = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.explored)));
	        explored.click();
	        Assert.assertTrue(isExploredSuccessfully(), "ExploreStyle was not successful");
	    }
	    private boolean isExploredSuccessfully() {
	        return true; 
	    }
	    
	 public void Editbtn() {
		    try {
		        if (driver != null) {
		            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		            WebElement edit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.EDITBTN)));
		            edit.click();
		            Log.info("Edit btn clicked");
		        } else {
		            Log.error("WebDriver is null. Cannot perform action.");
		        }
		    } catch (Exception e) {
		        Log.error("Exception occurred while clicking Edit btn: " + e.getMessage());
		    }
		}
            
	 
	   public void insertslideCharts() {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			     WebElement edit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.insertslideCharts)));
			     edit.click();    
	   }
	   public void addRow() {
		    try {
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(88));
		        By addButtonLocator = By.xpath(Xpath.addRow);
		        WebElement row = wait.until(ExpectedConditions.elementToBeClickable(addButtonLocator));
		        row.click();
		        Log.info("Row added successfully");
		    } catch (Exception e) {
		        Log.error("Error while adding a row: " + e.getMessage());
		    }
		}

	   public void Savebtn() {
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		        WebElement saved = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.Savebtn)));
		        saved.click();                                                                  
		        Log.info("Save btn");
		        WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(30));
		      WebElement edited = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.edited)));
	          edited.click();
	          WebElement editing = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.editing)));
	        editing.click();
	          editing.clear();
	        editing.sendKeys("Deck");
	        Log.info("Editing");
	  	     }
	   
	   
		     public void Saving() {
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	   WebElement saving = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.Saving)));
		     saving.click();
		     Log.info("Saving");
	   
	}
		     
	   public void Deleterow() {
		  try {
			  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement delete = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.DELETE_ROW)));
	    delete.click();
	} catch (Exception e) {
	    e.printStackTrace();
	} finally {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		     WebElement rows = wait.until(ExpectedConditions.elementToBeClickable(By.id("inlineDiagramDeleteAssetBtn")));
		     rows.click();
		     Log.info("Rows");
	}
	}
	   @Test
		     public void  properties() {
		    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		     WebElement axis = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.AXIS)));
		     axis.click();
		     WebElement line = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.LINE)));
		     line.click();
		     Log.info("properties");
		     
		     //Category
		     WebElement category = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.CATEGORY)));
		     category.click();
		     Log.info("Category");
		     
		     WebElement baseline = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.BASELINE)));
		     baseline.click();
		     Log.info("Baseline");
		     Reporter.log("Quote properties added");
		    }
		     @Test
		       public void closebtn() {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		     WebElement closed = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.closebtn)));
		     closed.click();
		     Log.info("Close button");
		     }
		     @Test
		     public void styles() {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		     WebElement explorestyle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.STYLES)));
		     Actions actions = new Actions(driver);
		     actions.moveToElement(explorestyle).perform();
		     explorestyle.click();
		     Log.info("Styles");
		     }
		     
		     @Test
		     public void left() {
		    	 SoftAssert softAssert = new SoftAssert();
			   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		     WebElement left = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.LEFT)));
		     left.click();
		     softAssert.assertTrue(isleftimageAdded(), "Failed to add leftimg of the selected slide");
		 		softAssert.assertAll();
		     System.out.println("leftimg added successfully");
		     Log.info("left asset");
		   }
			    private boolean isleftimageAdded() {
			    	   try {	
			           	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			           	wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[data-layout='graphicLayoutTextLeftCenter']")));
			           	System.out.println("leftimage added successfully ");
			           	Reporter.log("leftimage added successfully");
			           	return true;
			           } catch (TimeoutException e) {
			           	return false;
			      		}
			      }
		     
	
		    @Test
		   public void BacktoDB() {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		     WebElement db = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.BacktoDB)));
		     db.click();
		     Log.info("Back to DB");
		     
		     WebDriverWait waited = new WebDriverWait(driver, Duration.ofSeconds(30));
		  WebElement finaldocs = waited.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.finaldocs)));
	     finaldocs.click();
	     Log.info("Final docs");
		     }
		   
		   //IMAGE GRID//
		    @Test
		   public void imagegriddoc() {
				 	   String elementText = "ImageGrid";
				     By locator = By.xpath("//p[contains(text(),'" + elementText + "')]");
				     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				     WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
				     element.click();      
				     Reporter.log("Selecting a imagegrid documents");
				 }
		    @Test
			 public void ImagesList() {
			        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			        WebElement image = driver.findElement(By.xpath(Xpath.ImagesList));
			        Actions actions = new Actions(driver);
			        actions.moveToElement(image).perform();
			    }
		    @Test
			    public void ExploreStyles() {
			        WebElement explore = driver.findElement(By.xpath(Xpath.ExploreStyles));
			        explore.click();
			        Log.info("Clicked on Explore Styles");
			    }
		    @Test
			   public void GridOfImages() {   
		    	SoftAssert softAssert = new SoftAssert();
			       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			       WebElement Grid = driver.findElement(By.xpath(Xpath.GRID_OF_IMAGES));
			       Grid.click();
			       softAssert.assertTrue(isimagegridAdded(), "Failed to add imagegrid of the selected slide");
			 		softAssert.assertAll();
			       Log.info("Clicked on Grid of Images");               
			   }
		    private boolean isimagegridAdded() {
		    	   try {	
		           	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		           	wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[data-layout='diagramUniqueLayout4']")));
		           	System.out.println("imagegrid added successfully ");
		           	Reporter.log("imagegrid added successfully");
		
		           	return true;
		           } catch (TimeoutException e) {
		           	return false;
		      		}
		      }
		    @Test
			   public void insertslidegrid() {
				   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				   WebElement change = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.INSERT_SLIDE_GRID)));
				   change.click();
			   }
    @Test
			   public void ParticularSlide() {
			       WebElement thirdslide = driver.findElement(By.xpath(Xpath.ParticularSlide));
			       thirdslide.click();
			       Log.info("Clicked on Particular slide");
			   }
    @Test
			   public void Addpoint() {
				   WebElement add = driver.findElement(By.xpath(Xpath.Addpoint));
				   add.click();
				   Log.info("Clicked on Add point");
				   
			   }
    @Test
			   public void seventhslide() {
				   WebElement seven = driver.findElement(By.xpath(Xpath.seventhslide));
				   seven.click();
			   }
			//   public void Exploresettings() {
//				   WebElement explore = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[2]/ul/li[1]/div/button"));
//				   explore.click();
			//   }
			//   public void variation() {
//				   WebElement variety = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div[2]/ul/li[4]/div/div/div[1]"));
//				   variety.click();
			//   }
			//   public void ChangeImage() {
//				   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
//				   WebElement change = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[3]/div/div/div[3]/div[2]/div/div/div[5]/div[1]/div[1]/div[3]/div[1]")));
//				   change.click();
			//   }
    @Test
			   public void SettingsProperty() {
				   WebElement glutter = driver.findElement(By.xpath(Xpath.glutter));
				   glutter.click();
				   
				   WebElement overlay = driver.findElement(By.xpath(Xpath.overlay));
				   overlay.click();
//				   
//				   WebElement secondary = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div/span[2]/div[2]/button"));
//				   secondary.click();
//				   
//				   WebElement primary = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div/span[2]/div[1]/button"));
//				   primary.click();
				   
				   WebElement none = driver.findElement(By.xpath(Xpath.none));
				   none.click();
				   
				   WebElement borderWhite = driver.findElement(By.xpath(Xpath.borderWhite));
				   borderWhite.click();
				   
				   WebElement animationonce = driver.findElement(By.xpath(Xpath.animationonce));
				   animationonce.click();
				   
				   WebElement atatime = driver.findElement(By.xpath(Xpath.atatime));
				   atatime.click();
				   
				   WebElement close = driver.findElement(By.xpath(Xpath.close));
				   close.click();
				   Log.info("Clicked on settings property");
				   Reporter.log("Properties added successfully");
						   
				   
			   }
    @Test
			   public void TextPosition() {
				   WebElement Text = driver.findElement(By.xpath(Xpath.Text));
				   Text.click();
				   
				   WebElement position = driver.findElement(By.xpath(Xpath.position));
				   position.click();
				   
				   WebElement middle = driver.findElement(By.xpath(Xpath.middle));
				   middle.click();
				   
				   WebElement Texted = driver.findElement(By.xpath(Xpath.Texted));
				   Texted.click();
				   
				   WebElement Highlight = driver.findElement(By.xpath(Xpath.Highlight));
				   Highlight.click();
				   
				   WebElement editText = driver.findElement(By.xpath(Xpath.editText));
				   editText.click();
				   editText.clear();
				   editText.sendKeys("Selenium");
				   Log.info("Clicked on Text Position");
				   Reporter.log("Text position added");
			   }
    @Test
			   public void highlight() {
			       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			       WebElement Addhighlight = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.Addhighlight)));
			       Actions actions = new Actions(driver);
			       actions.click(Addhighlight).perform();
			   }
    @Test
			   public void Emphazize() {
				   WebElement text = driver.findElement(By.xpath(Xpath.Emphazize));
				   text.click();
				   
				   WebElement moreopt = driver.findElement(By.xpath(Xpath.moreopt));
				   moreopt.click();
				   
				   WebElement emphaze = driver.findElement(By.xpath(Xpath.emphaze));
				   emphaze.click();
				   
				   WebElement secondtext = driver.findElement(By.xpath(Xpath.secondtext));
				   secondtext.click();
				   Reporter.log("Properties added successfully");
				    }
    @Test
			   public void URL() {
				   WebElement linkurl = driver.findElement(By.xpath(Xpath.linkurl));
				   linkurl.click();
				   linkurl.sendKeys("www.google.com");
				   Log.info("Clicked on URL");
				   
				   WebElement tickbtn = driver.findElement(By.xpath(Xpath.tickbtn));
				   Actions actions = new Actions(driver);
			       actions.click(tickbtn).perform();
			   }
    @Test
			   public void presentgrid() {
				   WebElement present = driver.findElement(By.xpath(Xpath.presentgrid));
				   present.click();
				   Log.info("Click on present button"); 
			   }
    public void presentt() {
    	
			   WebElement present = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div[2]/div[1]/div/div[1]/div/div/div[3]/div[2]/div/div/div[3]/div[1]/div[1]/div[2]/div[3]"));
			   present.click();
			   Log.info("Click on present button");  
    }
    @Test
			   public void exitgrid() {
				   WebElement exit = driver.findElement(By.xpath(Xpath.exitgrid));
				   exit.click();
				   Log.info("Exit button");
			   }
			//   public void secText() {
//				   WebElement text = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[3]/div/div/div[3]/div[2]/div/div/div[3]/div[1]/div[1]/div[2]/div[3]/div"));
//				   text.click();

			   
                                               //SECTION BREAK//
@Test
 public void sectiondoc() {
	 	   String elementText = "SectionBreak";
	     By locator = By.xpath("//p[contains(text(),'" + elementText + "')]");
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
	     element.click();             
	 }
@Test
 public void sectionasset() {
	 WebElement  breaks = driver.findElement(By.xpath(Xpath.sectionasset));
	 Actions actions = new Actions(driver);
     actions.click(breaks).perform();
 }
 @Test
 public void explorestylesection() {
	 WebElement quote = driver.findElement(By.xpath(Xpath.explorestylesection));
	 quote.click();             
 }
 public void sectionassets() {
	 SoftAssert softAssert = new SoftAssert();
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	 WebElement logo = driver.findElement(By.xpath(Xpath.sectionassets));
	 logo.click(); 

	 softAssert.assertTrue(issectionassetAdded(), "Failed to add image of the selected slide");
 		softAssert.assertAll();
}
 
	    private boolean issectionassetAdded() {
	    	   try {	
	           	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	           	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("assetParent0")));
	           	System.out.println("coverimage added successfully ");
	           	Reporter.log("coverimage added successfully");
	           	return true;
	           } catch (TimeoutException e) {
	           	return false;
	      		}
	      }
 
 public void sectionlogo() {
	 WebElement logo = driver.findElement(By.xpath(Xpath.sectionlogo));
	 logo.click();  

 WebElement close = driver.findElement(By.xpath(Xpath.closesection));
 close.click();               
 }
 public void sectionbackgrndasset() {
	 SoftAssert softAssert = new SoftAssert();
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	 WebElement logo = driver.findElement(By.xpath(Xpath.sectionbackgrndasset));
	 logo.click(); 
	 softAssert.assertTrue(issectionbackgroundassetAdded(), "Failed to add image of the selected slide");
		softAssert.assertAll();
}
 private boolean issectionbackgroundassetAdded() {
	   try {	
     	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("assetParent0")));
     	System.out.println("backgroundasset added successfully ");
     	Reporter.log("backgroundasset added successfully");
     	return true;
     } catch (TimeoutException e) {
     	return false;
		}

 }
 
 public void pdfdoc() {
	 	   String elementText = "DocsToPdf";
	     By locator = By.xpath("//p[contains(text(),'" + elementText + "')]");
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
	     element.click();             
 }
 
public void Export() {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	   WebElement export = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.export)));
       export.click();
       Reporter.log("Clicked on export");
}

public void Exporttopdf() {
WebDriverWait stop = new WebDriverWait(driver, Duration.ofSeconds(50));   
WebElement pdf = stop.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.pdf)));
pdf.click();
Reporter.log("Select exportopdf");
}

public void Exports() {
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
WebElement exports = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.exports)));
exports.click();
Reporter.log("Select exports");
}

public void Exporttoimage() {
 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
WebElement img = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.Exporttoimage)));
   img.click();
 
}
//STACK ASSET
@Test
 public void stackdoc() {
	   String elementText = "ImageStack";
	     By locator = By.xpath("//p[contains(text(),'" + elementText + "')]");
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
	     element.click();             
}
public void mobileasset() {
	WebElement mobile = driver.findElement(By.xpath(Xpath.MOBILEASSET));
	Actions actions = new Actions(driver);
    actions.moveToElement(mobile).perform();
}              
		public void insertStackslide() {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
	WebElement insert = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.INSERT_STACK_SLIDE)));
	   insert.click();
		}
public void editextstack() {
	WebElement stack = driver.findElement(By.xpath(Xpath.EDITEXT_STACK));
	stack.click();
	stack.clear();
	stack.sendKeys("Selenium");
}
public void explorestyleeditor() {
	WebElement explore = driver.findElement(By.id("explorestyle"));
	explore.click();
}
public void backgroundcolorstack() {
	SoftAssert softAssert = new SoftAssert();
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement stack = driver.findElement(By.xpath(Xpath.BACKGROUND_COLORSTACK));
	stack.click();
 softAssert.assertTrue(isbackgrounddiagramassetAdded(), "Failed to add image of the selected slide");
		 		softAssert.assertAll();
}
  private boolean isbackgrounddiagramassetAdded() {
  	   try {	
         	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         	wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[data-layout='graphicLayoutTextTop']")));
         	System.out.println("diagram added successfully ");
         	Reporter.log("diagram added successfully");
         	return true;
         } catch (TimeoutException e) {
         	return false;
    		}
    }

public void replaceimgstack() {
	WebElement stack = driver.findElement(By.xpath(Xpath.REPLACE_IMGSTACK));
	stack.click();
	
	WebElement edit = driver.findElement(By.xpath(Xpath.edit));
	edit.click();
	
	WebElement canva = driver.findElement(By.xpath(Xpath.canva));
	canva.click();
}

public void fittocanva() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    WebElement canva = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-test-id='undefinedimagecropfittocanvas']")));
	 canva.click();
}
	 public void tickbtn() {
	 WebElement tick = driver.findElement(By.xpath(Xpath.TICKBTN));
	 tick.click();
}
	 public void editoutlinetext() {
		 WebElement text = driver.findElement(By.xpath(Xpath.EDIT_OUTLINETEXT));
		 text.click();                                 
		 text.clear();
		 text.sendKeys("Welcome to presentation.ai");
	 }
	 public void editoutlinetextsection() {
		 WebElement text = driver.findElement(By.xpath(Xpath.editoutlinetextsection));
		 text.click();                                  
		 text.clear();
		 text.sendKeys("Welcome to presentation.ai");
	 }
	 public void updatebtnoutline() {
		 WebElement update = driver.findElement(By.xpath(Xpath.updatebtnoutline));
		 update.click();
	 }
	 public void clickorpress() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath.CLICK_OR_PRESS)));
         element.click();
	 }
	 public void closepresent() {
         
         WebElement close = driver.findElement(By.id("presentexit"));
         close.click();
	 }
	 public void clickorpresss() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath.clickorpresss)));
         element.click();
	 }
	  
	  public void settingsdash() {
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		  WebElement settings = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.settingsdash)));
		  settings.click();
	  }
public void membersandgroups() {
	WebElement groups = driver.findElement(By.xpath(Xpath.membersandgroups));
	groups.click();
	Reporter.log("Clicked on members and groups");
}

public void invmembersworkspace() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.invmembersworkspace)));
	button.click();
	Reporter.log("Clicked on invitemember workspace");
}
public void mailworkspace() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    WebElement mail = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.mailworkspace)));
    mail.click();
    mail.sendKeys("nayana@pitchdeck.io");
    mail.sendKeys(Keys.ENTER);
    Log.info("Email sent successfully");
    Reporter.log("Clicked on mail workspace");
}
public void backbtn() {
	WebElement back = driver.findElement(By.xpath(Xpath.backbtn));
	back.click();
	Reporter.log("Clicked on bacbtn");
}
public void status() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	WebElement status = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.status)));
	status.click();
}
	public void Nostatus() {
	    SoftAssert softAssert = new SoftAssert();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait for the presence of the element with the specified CSS selector
	    WebElement nostatus = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[data-id='nostatus']")));

	    // Click on the element
	    nostatus.click();

//	    // Check if the slide is set to no status
//	    softAssert.assertTrue(isNostatus(), "Failed to set selected slide as no status");
	    softAssert.assertAll();
	}

//	private boolean isNostatus() {
//	    try {
//	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//
//	        // Wait for the presence of the element with the specified link text
//	        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("https://azure-qc.pitchdeck.io/docs/assets/images/status/ic_no_status.svg")));
//	        System.out.println("Slide Set to no status successfully");
//	        return true;
//	    } catch (TimeoutException e) {
//	        System.out.println("Timed out waiting for slide to be set to no status");
//	        return false;
//	    }
//	}
public void plusfolder() {
	WebElement folder = driver.findElement(By.xpath(Xpath.plusfolder));
	folder.click();
	Reporter.log("Clicked on create folder");
}
public void folname() {
	WebElement name = driver.findElement(By.xpath(Xpath.folname));
	name.click();
	name.sendKeys("Workspace");
	Reporter.log("Clicked on folder name");
}
public void createfolder() {
	WebElement create = driver.findElement(By.id("pdcreatefolder"));
	create.click();
}
public void addmembersworkspace() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	WebElement add =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.addmembersworkspace)));
	add.click();
}

public void choosefolder() {
	WebElement folder = driver.findElement(By.xpath(Xpath.choosefolder));
	folder.click();
}
public void chooseworkspace() {             
	WebDriverWait select = new WebDriverWait(driver, Duration.ofMinutes(1));
	 WebElement elements = select.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-id='297476']")));
	 elements.click();       
}
public void addmembersspace() {             
	WebDriverWait select = new WebDriverWait(driver, Duration.ofMinutes(10));
	 WebElement elements = select.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.addmembersspace)));
	 elements.click();                                                                   
}
public void viewandedit() {   
WebDriverWait select = new WebDriverWait(driver, Duration.ofMinutes(1));
WebElement elements = select.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.viewandedit)));
elements.click();            
}
public void addmember() {   
WebDriverWait select = new WebDriverWait(driver, Duration.ofMinutes(1));
WebElement elements = select.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.addmember)));
elements.click();             
}

public void Aitemplate() {

WebDriverWait idea = new WebDriverWait(driver, Duration.ofMinutes(1));
 WebElement elements = idea.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-id='aitemplate']")));
 elements.click();
 
 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
 // WebElement click = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[2]/p[2]")));
WebElement select = driver.findElement(By.id("template"));
select.click();

WebElement boardmeeting =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div/div/div/div/div[2]/div[3]/div/div/div/div/div/div/div[2]/div/div/div[3]/div[1]")));
boardmeeting.click();

//Continue button
WebElement button = driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div/div[2]/div[3]/div[2]/button"));
button.click();
}
public void generatebtnai() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement generate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/button")));
	generate.click();
}
//public void moreopt() {
//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
//WebElement moreopt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div/ul/li[1]/div/div[4]/div[2]/div[1]/div/div/button")));
//moreopt.click();
//}

public void coverdoc() {
	 String elementText = "InsertingCovers";
     By locator = By.xpath("//p[contains(text(),'" + elementText + "')]");
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
     element.click();             
}
public void coverhover() {
	WebElement cover = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[1]/div[1]"));
	Actions actions = new Actions(driver);
    actions.click(cover).perform();
}


public void testCoverImgVar() {
	SoftAssert softAssert = new SoftAssert();
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
  WebElement use = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div/div/div/div[2]/ul/li[1]/div/div/div[2]")));
    use.click();
			 softAssert.assertTrue(iscoverassetAdded(), "Failed to add image of the selected slide");
		 		softAssert.assertAll();
  }
    private boolean iscoverassetAdded() {
    	   try {	
           	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
           	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("assetParent0")));
           	System.out.println("coverimage added successfully ");
           	Reporter.log("coverimage added successfully");
           	return true;
           } catch (TimeoutException e) {
           	return false;
      		}
      }


public void coverimglogo() { 
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
WebElement img = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[2]/button")));
img.click();

WebElement close = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[1]/button"));
close.click();
}
public void changeimgcover() {
	SoftAssert softAssert = new SoftAssert();
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
  WebElement use = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div[2]/ul/li[4]/div/div/div[2]")));
    use.click();
			 softAssert.assertTrue(iscoverimgassetAdded(), "Failed to add image of the selected slide");
		 		softAssert.assertAll();
  }
    private boolean iscoverimgassetAdded() {
    	   try {	
           	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
           	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("sgpresetImageNode")));
           	System.out.println("coverimage added successfully ");
           	Reporter.log("coverimage added successfully");
           	return true;
           } catch (TimeoutException e) {
           	return false;
      		}
      }


public void outlinetextcover() {
	WebElement text = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div/div[2]/div/div/div[1]/div[1]/div[1]/span"));
	text.click();
	text.clear();
	text.sendKeys("Cover page");
}
//Outline to deck//
public void outlinetodeck() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement deck = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-id='documenttodeck']")));
     deck.click();
}


@Test
public void edittextdash() {
	WebElement text = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div/div[1]"));
	text.click();
	text.clear();
	text.sendKeys("Natural disaster, any calamitous occurrence generated by the effects of natural, rather than human-driven, phenomena that produces great loss of human life or destruction of the natural environment, private property, or public infrastructure. A natural disaster may be caused by weather and climate events or by earthquakes, landslides, and other occurrences that originate at Earth’s surface or within the planet itself. No spot on Earth is immune from a natural disaster; however, certain types of disasters are often limited to or occur more frequently in specific geographic regions.");
}
public void outlinecontbtn() {
	WebElement text = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/div/button[2]"));
	text.click();
}
@Test
public void companyname() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement name = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div/div[3]/div/div/div/div/div/div[4]/div/div/div/span")));
name.click();
name.clear();
name.sendKeys("Presentations.ai");
WebElement companyname= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div/div[3]/div/div/div/div/div/div[4]/div/div/div[2]/div[1]")));
companyname.click();
}

public void authorname() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement authorname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[3]/div/div/div/div/div/div[5]/div/div/div/span")));
    authorname.click();
    authorname.clear();
    authorname.sendKeys("Abirami v");
}
public void disastertext() {
	WebElement text = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[1]/div/div/div[3]/div/div[1]/div/div/div/div[1]/div[1]/div[1]/div[2]/div[2]/div/div[3]/div/ul"));
	text.click();
	text.clear();
	text.sendKeys("Disaster management");
}
@Test
public void genpresentation() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement Genpresentation = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[3]/div/div/div/div/div/div[6]/button")));
    Genpresentation.click();
}
public void dropdowndb() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement Genpresentation = wait.until(ExpectedConditions.elementToBeClickable(By.id("topmenuPresentOptionsButton")));
    Genpresentation.click();
    Reporter.log("Clicked on dropdown menu db");
}

@Test
public void outlinebackgrnd() {
	WebElement outline = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div[2]/ul/li[3]/div/div/div[2]"));
	outline.click();
}
@Test
public void listasset() {
	WebElement list = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/nav/a[2]"));
	list.click();
}
public void numberedlist() {
	WebElement list = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[1]/div[1]"));
	Actions actions = new Actions(driver);         
	  actions.moveToElement(list).perform();
}
@Test
public void outlineaddrow() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     WebElement row = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div/div/div[2]/div[2]/div/button")));
      row.click();
}
@Test
public void insertoutline() {  
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       WebElement insert = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[2]/button[1]")));
      insert.click();      
      System.out.println("upgradebtn");
}    
@Test
public void bulletlist() {
	WebElement list = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[2]/div[1]"));
	Actions actions = new Actions(driver);
	  actions.moveToElement(list).perform();
}
@Test
public void usebtnbulletlist() {  
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
   WebElement insert = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[2]/div[2]/button[2]")));
  insert.click();  
  System.out.println("usebtnbulletlist");
}
public void chartasset() {
	WebElement list = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[1]/div[1]"));
	Actions actions = new Actions(driver);
	  actions.moveToElement(list).perform();           	
}
public void chartaddrow() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     WebElement row = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div/div/div[3]/div[2]/div/button")));
      row.click();  
      System.out.println("chartaddrow");
}


public void chartvar() {
	SoftAssert softAssert = new SoftAssert();
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
  WebElement use = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div/div/div/div[2]/ul/li[4]/div/div/div[2]")));
    use.click();
			 softAssert.assertTrue(ischartvarAdded(), "Failed to add image of the selected slide");
		 		softAssert.assertAll();
  }
    private boolean ischartvarAdded() {
    	   try {	
           	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
           	wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[data-layout='graphicLayoutTextTop']")));
           	System.out.println("chart added successfully ");
           	Reporter.log("chart added successfully");
           	return true;
           } catch (TimeoutException e) {
           	return false;
      		}
      }
















public void chartinsertslide() {  
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
   WebElement insert = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[2]/button[1]")));
  insert.click(); 
  System.out.println("chartinsertslide");
}

@Test
public void chartproperties() {
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
WebElement addslide = wait.until(ExpectedConditions.elementToBeClickable(By.id("changetablecontent")));
addslide.click(); 
System.out.println("chartproperties");
}
public void duplicateSlide() {
	//duplicate slide
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement dupslide =wait.until(ExpectedConditions.presenceOfElementLocated(By.id("duplicateSlideButton")));
	dupslide.click();
}
public void graphicsinsertslide() {  
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement insert = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[2]/button[1]")));
insert.click();
System.out.println("graphicsinsertslide");
}
public void moreoptgraphics() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.id("pdmainmenu")));
button.click();
System.out.println("moreoptgraphics");               

}
                                                            //CUSTOM ORDER//

public void customorder() {
	   String elementText = "CustomOrder";
 By locator = By.xpath("//p[contains(text(),'" + elementText + "')]");
 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
 element.click();             
}
public void Diagramdoc() {
	   String elementText = "Diagram properties";
By locator = By.xpath("//p[contains(text(),'" + elementText + "')]");
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
element.click();             
}
public void UseanAItemplate() {
WebDriverWait template = new WebDriverWait(driver, Duration.ofMinutes(1));
 WebElement elements = template.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-id='aitemplate']")));
 elements.click();
 
 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
  WebElement click = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[2]/p[2]")));
WebElement select = driver.findElement(By.id("template"));
select.click();

WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement boardmeeting = waits.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div/div/div/div/div[2]/div[3]/div/div/div/div/div/div/div[2]/div/div/div[3]/div[1]")));
boardmeeting.click();
}

public void aigeneratebutton() {
	WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement button = waits.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/button")));
button.click();                                 
}
public void continueaibtn() {
	WebElement button = driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div/div[2]/div[3]/div[2]/button"));
	button.click();
}
public void clickorpressai() {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
	 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div/div[2]")));
	  element.sendKeys(Keys.ENTER);
   // element.click();                                                                         
    
//    WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(30));
    WebElement close = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div[2]/div[3]/button")));
    close.click();
}
public void welcomepresentscreen() {
	// String elementText = "Click or press any key to see your work";
     WebElement elementToClick = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]"));
     elementToClick.click();
}
public void closeBrowser() {
	driver.close();
	driver.quit();      
	 Reporter.log("Test case passed");
}

public void linkoptionsdoc() {
	   String elementText = "Validate linkoptions";
       By locator = By.xpath("//p[contains(text(),'" + elementText + "')]");
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
       element.click();
       Reporter.log("open the document");
  }

public void amazingtemplink() {
	WebElement high = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[2]/div/div/div[3]/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div"));
	high.click();                                  
	System.out.println("Clicked on amazingtemp");
	  Log.info("Clicked on amazingtemp"); 
}
public void titletext() {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement title = wait.until(ExpectedConditions.elementToBeClickable(By.id("TITLE")));
    title.click();
    title.clear();
    title.sendKeys("Edit the text");    
}
public void titletextquote() {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  WebElement title = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[2]/div/div/div[3]/div[2]/div/div/div[2]/div[1]/div[1]/div[3]/div[3]/div")));
  title.click();
  title.clear();
  title.sendKeys("Edit the text");    

}

public void amazingtemppresent() {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement high =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div[2]/div[1]/div/div[2]/div/div/div[3]/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div")));
	high.click();                                  
	System.out.println("Clicked on amazingtemp");         
	  Log.info("Clicked on amazingtemp");
}

public void carouselasset() {
   	  SoftAssert softAssert =  new SoftAssert();
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
         // Click on carousel
         WebElement carousel = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/nav/a[9]")));
         carousel.click();
         System.out.println("click on Carousel");
         Log.info("click on Carousel");
        softAssert.assertAll();
     
}

public void carouselhover() {
	WebElement cover = driver.findElement(By.xpath(Xpath.CAROUSEL_HOVER));
	Actions actions = new Actions(driver);
    actions.click(cover).perform();
}

public void carousenext() {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  WebElement title = wait.until(ExpectedConditions.elementToBeClickable(By.id("imageStackNavNextBtn")));
  Actions actions = new Actions(driver);
  actions.doubleClick(title).build().perform();
}

public void Validatedisplayoutline() {
	   String elementText = "Validate display outline";
    By locator = By.xpath("//p[contains(text(),'" + elementText + "')]");
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
    element.click();             
}
public void outlinestory() {
	// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement asset =  driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/button[2]"));
	asset.click();      
}
public void outlinetitle() {
     WebElement title = driver.findElement(By.xpath(Xpath.OUTLINE_TITLE));
     title.click();
     title.sendKeys("Global warming is the long-term warming of the planet's overall temperature");           
}
public void addsubtitle() {
    WebElement apply = driver.findElement(By.id("addsubtitle"));
    apply.click();
    System.out.println("addsubtitle");
    Log.info("Clicked on addsubtitle");
}
public void addsubtitletext() {
    WebElement text = driver.findElement(By.xpath(Xpath.ADDSUBTITLE_TEXT));
    text.click();
    text.sendKeys("Rising sea levels will lead to even more coastal flooding on the Eastern Seaboard, especially in Florida, and in other areas such as the Gulf of Mexico.");
    System.out.println("addsubtitletext");
    Log.info("Clicked on addsubtitletext");                       
     }

public void outlinelabel() {
    WebElement apply = driver.findElement(By.id("addslidelabel"));
    apply.click();                         
    System.out.println("outlinelabel");
    Log.info("Clicked on outlinelabel");
}   

public void editlabel() {
WebElement label = driver.findElement(By.cssSelector("div[data-type='slidelabel']"));
label.click();
label.sendKeys("Trees");
}

public void addtable() {
    WebElement apply = driver.findElement(By.id("addtable"));
    apply.click();                         
    System.out.println("addtable");       
    Log.info("Clicked on addtable");
}
public void suggestslides() {
    WebElement text = driver.findElement(By.xpath(Xpath.SUGGEST_SLIDES));
    text.click();                                  
    System.out.println("suggestslides");     
    Log.info("Clicked on suggestslides");                       
     }
public void displayinsert() {
    WebElement text = driver.findElement(By.xpath(Xpath.DISPLAY_INSERT));
    text.click();                                  
    System.out.println("displayinsert");             
    Log.info("Clicked on displayinsert");                        
     }    
public void Explorestylenumber() {
    WebElement number = driver.findElement(By.xpath(Xpath.Explorestylenumber));
    number.click();
    System.out.println("displayinsert");    
}
public void numberassetvar() {
	SoftAssert softAssert = new SoftAssert();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    WebElement number = driver.findElement(By.xpath(Xpath.numberassetvar));
    number.click();
    
    softAssert.assertTrue(isnumberassetAdded(), "Failed to add image of the selected slide");
		softAssert.assertAll();
    System.out.println("Clicked on number asset"); 
}   
private boolean isnumberassetAdded() {
try {	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[data-layout='graphicLayoutTextLeftCenter']")));
	System.out.println("Agenda added successfully ");
	Reporter.log("Agenda added successfully");
	return true;
} catch (TimeoutException e) {
	return false;
	}
}

		public void charthover() {
	WebElement cover = driver.findElement(By.xpath(Xpath.charthover));
	Actions actions = new Actions(driver);
    actions.click(cover).perform();
}
		 public void Viewprofile() {
		   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		   WebElement view = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.Viewprofile)));
		   view.click();
		   Log.info("profile");
		   }
		 
		 public void basicinformation() {
		   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		     WebElement view = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.basicinformation)));
		     view.click();
		     Log.info("Clicked on basic information");    
		   }
		 public void basicname() {
		   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		   WebElement name = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.basicname)));
		   name.click();
		   name.clear();                                                 
		   name.sendKeys("Deck");               
		   Log.info("Clicked on basic name");
		   }
		 
		 public void companysname() {
		   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		     WebElement name = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.companysname)));
		     name.click();
		     name.clear();
		     name.sendKeys("PitchDeck");             
		     Reporter.log("Company name changed");
		   }
		 
		 public void domainname() {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		   WebElement name = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.domainname)));
		   name.click();
		   name.clear();
		   name.sendKeys("Creating presentation");               
		   Reporter.log("Domain name changed");
		   }   
		 
		 public void emailcontact() {
			   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			   WebElement name = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.emailcontact)));
			   name.click();
			   name.clear();
			   name.sendKeys("www.presentations.ai");             
			   Reporter.log("Email changed successfully");
			   }  
		 
		 public void phonenumber() {
				   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				   WebElement name = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.phonenumber)));
				   name.click();
				   name.clear(); 
				   name.sendKeys("12345678");    
				   Reporter.log("Changed phone number successfully");
				   }                        
		 
		 public void employees() {
					   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
					   WebElement name = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.employees)));
					   name.click();
					   name.clear();
					   name.sendKeys("800");             
					   Reporter.log("Number changed successfully");
					   }  
		 
		 public void foundedon() {
				     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
					 WebElement name = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.foundedon)));
					 name.click();
					 name.clear(); 
				     name.sendKeys("2020");
		 }
		   public void settings() {
		   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		   WebElement profile = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.profile)));
		   profile.click();
		   Log.info("settings");
		   }
		   
		   public void youraccountdetails() {
			   WebElement frstname = driver.findElement(By.xpath(Xpath.youraccountdetails));
			   frstname.click();
			   frstname.clear();
			   frstname.sendKeys("Abideck");
			   Log.info("youraccountdetails");
		   }
		   public void lastname() {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		   WebElement last = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.lastname)));
		   last.click();
		   last.clear();
		   last.sendKeys("v");
		   Log.info("lastname");
		   }

		   public void Designation() {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		   WebElement des = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.Designation)));
		   des.click();
		   des.clear();
		   des.sendKeys("Developer");
		   Log.info("Designation");
		   }

		   public void Role() {
		   	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		   WebElement role = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.Role)));
		   role.click();
		   Log.info("Role");
		   }

		   public void Language() {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		   WebElement lan = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.lan)));
		   lan.click();  
		   WebElement lanuage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.lanuage)));
		 
		   lan.click();
		   Log.info("Language");
		   }
		 public void OrgInfo() {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		   WebElement info = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.OrgInfor)));
		   info.click();
		   Log.info("OrgInfo");
		 }
		   
		public void Socialmedia() {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		   WebElement media = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.media)));
		   media.click();
		   Log.info("Socialmedia");
		   
		   WebElement twitter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.twitter)));
		   twitter.click();
		   twitter.sendKeys("www.twitter.com/tweet/info_employee");
		   Log.info("Setup");
		   
		   WebElement book = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.book)));
		   book.click();
		   book.sendKeys("www.facebook.com/Kg/info/Deck/");
		   Log.info("twitter");
		   Reporter.log("Entered facebook id");
		   WebElement instagram = driver.findElement(By.xpath(Xpath.instagram));
		   instagram.click();
		   instagram.sendKeys("presentations.ai");
		   Log.info("instagram");
		   Reporter.log("Entered instagram id");
		}
		//public void save() {
		//	
//		    // WebElement save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[2]/button")));
//		    // save.click();
		//}
		public void basicinfo() {
			WebElement info = driver.findElement(By.xpath(Xpath.info));
			info.click();
			WebElement name = driver.findElement(By.xpath(Xpath.name));
			name.click();
			name.clear();
			name.sendKeys("Deck");
			 Log.info("basicinfo");
			 Reporter.log("Entered basic info");
		}
		
		public void clipboarddoc() {
			   String elementText = "Clipboard copy paste";
		  By locator = By.xpath("//p[contains(text(),'" + elementText + "')]");
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		  element.click();             
		}    	
				public void  youraccount() {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		   WebElement account = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.youraccount)));
		   account.click();
		   Log.info("Clicked on prseentdb");
		   Reporter.log("Clicked on presntdb");
		}
				public void presentDropdown() {
				     //present dropdown
			    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				     WebElement dropdown= wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.presentDropdown)));
				     dropdown.click();
				    
			    }
				public void nextbtn() {
				  WebElement hover = driver.findElement(By.className("bottomMenu"));
				    Actions actions = new Actions(driver);
				    actions.moveToElement(hover).perform();
				   
				    int maxIterations = 2;
				      // Use meaningful locators for the navigation buttons
				      By nextButtonLocator = By.id("presentnext");
				                                      
//				      By prevButtonLocator = By.xpath("/html/body/div[1]/div/div/div/div/div/div/div[2]/div[4]/div/div/div/button[1]");
				      for (int i = 0; i < maxIterations; i++) {
				          // Forward navigation
				          navigateSlide(nextButtonLocator);
				          // Wait for some time
				          //sleep(5000);
				      }
//				      // Navigate back for 2 slides
//				      for (int i = 0; i < maxIterations; i++) {
//				          // Reverse navigation
//				          navigateSlide(prevButtonLocator);
//				          // Wait for some time
//				          sleep(5000);
//				      }
				     
				  }//method
		
				  private void navigateSlide(By buttonLocator) {
				      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				      // Find the button using the provided locator
				      WebElement navigationButton = wait.until(ExpectedConditions.elementToBeClickable(buttonLocator));
				      // Click the button
				      navigationButton.click();
				  }
		   
				 
				    public void presentfromBegining() {
				    	 
					  	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
					 
					    
					     //from beginning
					     WebElement frombeginning = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-test-id='undefinedpresentfromfirstslide']")));
					     frombeginning.click();
					    
					     WebElement hover = driver.findElement(By.className("bottomMenu"));
					      Actions actions = new Actions(driver);
					      actions.moveToElement(hover).perform();
					    
					      int maxIterations = 3;
					      int minIterations = 2;
					      // Use meaningful locators for the navigation buttons
					      By nextButtonLocator = By.id("presentnext");
					                                      
					      By prevButtonLocator = By.id("presentprevious");
					      for (int i = 0; i < maxIterations; i++) {
					          // Forward navigation
					          navigateSlides(nextButtonLocator);
					          // Wait for some time
					          sleep(5000);
					      }
					      // Navigate back for 2 slides
					      for (int i = 0; i < minIterations; i++) {
					          // Reverse navigation
					          navigateSlides(prevButtonLocator);
					          // Wait for some time
					          sleep(5000);
					      }
					  }
				    private void navigateSlides(By buttonLocator) {
					      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
					      // Find the button using the provided locator
					      WebElement navigationButton = wait.until(ExpectedConditions.elementToBeClickable(buttonLocator));
					      // Click the button
					      navigationButton.click();
					  }
				    private void sleep(int milliseconds) {
				          try {
				              Thread.sleep(milliseconds);
				          } catch (InterruptedException e) {
				              e.printStackTrace();
				          }
				      }
}