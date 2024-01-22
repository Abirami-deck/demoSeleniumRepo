import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

@Test

public class Settings {
    private WebDriver driver;
    private String originalTab;
    private static final Logger Log = LogManager.getLogger(Settings.class);
    public Settings(WebDriver driver) {
        this.driver = driver;
    }

  @Test
  public void addSlide() {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
      WebElement addslide = wait.until(ExpectedConditions.elementToBeClickable(By.id("pdaddnewslide")));
      addslide.click();
      System.out.println("addSlide");
      Log.info(" Clicked on add new slide");
  }
  public void addSlidesection() {
	  //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

	  //WebDriverWait wait = new WebDriverWait(driver, 20);
	  WebElement element = driver.findElement(By.id("pdaddnewslide"));
element.click();
      System.out.println("Clicked on addSlide");
      Log.info(" Clicked on add new slide");
  }
  public void assertBrowseTemplate() {
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
      WebElement browsetemplate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[3]/button[1]")));
      browsetemplate.click();
      System.out.println("Clicked on assertBrowseTemplate");
      Log.info("Clicked on Browse Template");
  }

 public void assertstack() {
          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
          WebElement stack = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/nav/a[4]")));
          stack.click();
          System.out.println("click on stack");
          Log.info("Clicked on stack");
      }
 public void Bookend() {
        	  WebElement bookend = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/nav/a[1]"));
        	  bookend.click();                                  
        	  Log.info("Clicked on Bookend");
        	  System.out.println("Clicked on Bookend");
          }
      
 public void ProductScreen() {
          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
          WebElement productScreen = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/nav/a[10]")));
          productScreen.click();
          System.out.println("Clicked on ProductScreen");
          Log.info("Clicked on ProductScreen");
      }
          
public void exploreStyle() {
          WebElement explorestyles = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[3]/div[2]/button[1]"));
          explorestyles.click();                                
          System.out.println("Clicked on exploreStyle");
          Log.info("Clicked on ExploreStyle");
      }
      
public void variation() {
      WebElement variation = driver.findElement(By.id("pdslidevariation"));
      variation.click();
      System.out.println("Clicked on variation");
      Log.info("Clicked on variation");
       }
      
public void applyStyle() {
     WebElement apply = driver.findElement(By.id("pdapplystle"));
     apply.click();
     System.out.println("applyStyle");
     Log.info("Clicked on ApplyStyle");
      }
     
public void styleoption() {
    	 WebElement option = driver.findElement(By.id("presentationstyle"));
    	 option.click();
    	 System.out.println("styleoption");
    	 Log.info("Clicked on style option");
     }
     
public void FloaterSettings() {
   WebElement settings = driver.findElement(By.id("floaterSettings"));
   settings.click();
   System.out.println("FloaterSettings");
   Log.info("Clicked on Floatersettings");
   }
   
public void Hyperlink() {
	   WebElement link = driver.findElement(By.id("floateraddlink"));
	   link.click();
	   System.out.println("Hyperlink");
	   Log.info("Clicked on Hyperlink");
   }
   
public void Sharebtn() {
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
   WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.id("pdtopmenushare")));
   button.click();
   System.out.println("Sharebtn");
   Log.info("Clicked on Sharebtn");
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
    WebElement present = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div[2]/button")));
    present.click();
    Log.info("Clicked on present");
}
 
public void sendinvite() {
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
     WebElement invites = wait.until(ExpectedConditions.elementToBeClickable(By.id("sendinvite")));
     invites.click();
     Log.info("Clicked on sendinvite");
     
     WebElement close = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/button"));
     close.click();
}
 
public void TimeLine() {
    WebDriverWait hold = new WebDriverWait(driver, Duration.ofSeconds(100));
    WebElement time = hold.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/nav/a[5]")));
    time.click();
    Log.info("Clicked on Timeline");
}

public void detelebtn() { 
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
    WebElement delete = wait.until(ExpectedConditions.elementToBeClickable(By.id("deleteSlideButton")));
   delete.click();
   Log.info("Clicked on deletebtn");
}

public void themepalette() {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
     WebElement theme = wait.until(ExpectedConditions.elementToBeClickable(By.id("pdshowminislideproperties")));
     theme.click();
     Log.info("Clicked on themepallete");
}

public void presentBtn() {
	WebElement present = driver.findElement(By.id("pdtopmenupresent"));
	present.click();
	Log.info("Clicked on Presentbtn");
}

public void  presentdb() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
   WebElement present = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-test-id='undefinedtopmenupresent']")));
   present.click();
   Log.info("Clicked on prseentdb");
}

public void peopleslides() {        
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		WebElement people = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/nav/a[3]")));
		people.click();
		Log.info("Clicked on people slide");
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
	WebElement creditButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" /html/body/div[2]/div[2]/div/div/div[3]/div[2]/div/div/div[2]/div")));
	creditButton.click();
 }
public void exportcontinue() { 
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement exportcontinue = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[4]/div/button")));
		exportcontinue.click();
 }
public void customsorder() {   
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement order = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[3]")));
		order.click();
	 
 }
 
public void outlineeditor() {
	 WebElement outline = driver.findElement(By.id("pdswitchtooutline"));
	 outline.click();
	 Log.info("outlineeditor");
 }
 
public void undo() {
	WebElement delete = driver.findElement(By.id("topMenuUndo"));
	delete.click();    
	Log.info("undo");
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
	 WebElement element =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[3]/div[2]/button[1]")));
      element.click();                                                               
        Log.info("Clicked on insert slide");        
}
    @Test
public void agenda() {
    	WebElement agenda = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[7]/div[1]"));
    	Actions actions = new Actions(driver);
     actions.moveToElement(agenda).perform();
    }
    @Test
public void usebtn() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[1]/div[2]/button[2]")));
       element.click();    
    }
    public void usebtnagenda() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[7]/div[2]/button[2]")));
       element.click();  
    }
    public void agendainsertbutton() {
   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
   	 WebElement element =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[2]/button[1]")));
         element.click();                                                                 
           Log.info("Clicked on insert slide");        
   }
    
public void setUp() {
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abirami\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
          Log.info("Chromedriver setup is complete");
          driver = new ChromeDriver();
          driver.get("https://azure-qc.pitchdeck.io/docs/login");
          driver.manage().window().maximize();
      }
    
public void loginToApplication() {
        //SoftAssert softAssert = new SoftAssert();
        WebElement altLogin = driver.findElement(By.id("login-viewalternativelogin"));
        altLogin.click();

        driver.findElement(By.id("login-email")).sendKeys("abirami@pitchdeck.io");
        WebElement submit = driver.findElement(By.id("login-continue"));
        submit.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
       
        afterlogin();
}

public void afterlogin() {
  	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-password")));
        passwordInput.sendKeys("@D3ckr0cks");
        WebElement clickContinue = driver.findElement(By.id("login-continue"));
        clickContinue.click();
        // Store the handle of the original tab
        originalTab = driver.getWindowHandle();
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
public void addpt() {
        	WebElement add = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/ul/li[1]/div/div/div/button"));
        	add.click();
        	WebElement sixth = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/ul/li[1]/div/div/ul/li[5]"));
        	sixth.click();
        	System.out.println("Clicked on addpt");
        }
public void dashboard() {
        	WebElement db = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[4]/div/div[1]/div[1]/ul/li[1]/div/span[2]"));
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
public void calendar() {
          WebElement scrollbtn = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[5]/div[2]/button[1]"));
         scrollbtn.click();
          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
          WebElement choose = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div/div/div/div[2]/ul/li/div/div/div[2]")));
          choose.click();
          System.out.println("Clicked on calendar");
}
        
public void date() {
        	WebElement date = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[2]/div/div/div[3]/div/div[2]/div/table/tbody/tr/td/div/div/div/table/tbody/tr[3]/td[2]"));
        	date.click();
        	WebElement event = driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div/div[2]/div/div/div[1]/div"));
        	event.click();
        	event.sendKeys("Selenium");
        	System.out.println("Clicked on date");
}
        
public void savevent() {
    	WebElement name = driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div/div[2]/div/div/div[2]/button[2]"));
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
  WebElement title = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div/span/div[1]/button")));
  title.click();
  System.out.println("Clicked on Showtitle");
}
  
public void Displayview() {
  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
  WebElement view = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div/span/div[2]/div/div/button")));
  view.click();
  
  WebElement week = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div/span/div[2]/div/ul/li[2]/div/span")));
  week.click();
  week.clear();
}

public void Closebtn() {
  WebDriverWait waiting = new WebDriverWait(driver, Duration.ofSeconds(5));
 WebElement close = waiting.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[1]/button")));
  close.click();
}

                                                    //REAL TIME//
public void realtime() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement options = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div/ul/li/div/div[4]/div[2]/div[1]/div/div/button")));
    options.click();
    Log.info("Moreoptions");
    }
    @Test
    public void Sharbutton() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    WebElement share = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div/ul/li[1]/div/div[4]/div[2]/div[1]/div/ul/li[4]")));
    share.click();
    Log.info("Sharbutton");
    }
    public void edit() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    WebElement edit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div/div/nav/div[2]/a")));
    edit.click();
    Log.info("edit");
    }
    @Test
    public void Invitemembers() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    WebElement invite = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/div[3]/div/div[1]/div[1]/button")));
    invite.click();                                                                  
    Log.info("Invitemembers");
}
    @Test
    public void mail() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    WebElement mail = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/div[3]/div/div[3]/div[3]/div/span")));
    mail.click();
    mail.sendKeys("abirami@pitchdeck.io");
    mail.sendKeys(Keys.ENTER);
    Log.info("Email sent successfully");
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
   WebElement icons = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[1]/div[1]")));
   Actions action = new Actions(driver);
   action.moveToElement(icons).perform();
   WebElement use = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[1]/div[2]/button[2]")));
   use.click();
   }    
//       public void particularSlide() {
//    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//    	WebElement slide = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[2]/div/div/div[3]/div[2]/div/div/div[2]/div[1]/div[1]/div[4]/div[3]/div"));
//    	slide.click();
//    }

    public void EditText() {
    	WebElement text = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[2]/div/div/div[3]/div[2]/div/div/div[2]/div[1]/div[1]/div[4]/div[3]/div"));
    	text.click();
    	text.clear();
    	text.sendKeys("Deck");
    	}
    
    public void apptheme() {
    	WebElement app = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[3]/div/div/div[2]/div[2]/div/div/div[2]/ul/li[1]/div[1]"));
    	app.click();
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
    	    WebElement close = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[3]/div/div/div[1]/button")));
    	    close.click();
    	    }
    
    
 public void agencymoods() {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
   WebElement agency = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li[1]/div[2]/div[2]/button")));
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
     WebElement publish = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/div[3]/div/div/div[3]/button")));
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
					 }
			 
			 public void process() {
			    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			    	WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/nav/a[11]"));
			element.click();
			System.out.println("Clicked on process");
			  }
			   public void smlprocess() {
			    	WebElement process = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[1]/div[1]"));
			    	Actions action = new Actions(driver);
			        action.moveToElement(process).perform();
			        System.out.println("Clicked on smlprocess");
			        Log.info("smlprocess");
			    }
			    public void usebttndiagram() {
			    WebElement use = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[1]/div[2]/button[2]"));
			    use.click();
			    System.out.println("Clicked on usebttndiagram");
			    Log.info("Clicked on diagram");
			    }
			    
			    public void insertdiagramslide() {     
			    		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			    WebElement chart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" /html/body/div[2]/div[2]/div/div/div[1]/div[2]/button[1]")));
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
			    }
			    
			    public void amazingtemp() {
			    	WebElement high = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[2]/div/div/div[3]/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div"));
			    	high.click();
			    	System.out.println("Clicked on amazingtemp");
			    	  Log.info("Clicked on amazingtemp");
			    	
			    	WebElement highlight = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[4]/div/ul/li[2]/div/button/span"));
			    	highlight.click();
			    	  Log.info("highlight");
			    }
			    
			    public void edithgl() {
			    	WebElement edit = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[4]/div/ul/li[2]/div/div/textarea"));
			    	edit.click();
			    	edit.clear();
			    	edit.sendKeys("Selenium");
			    	  Log.info("Clicked on edithgl");
			    }
			    @Test
			    public void addhl() {
			    	WebElement add = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[4]/div/ul/li[2]/div/div/div/button[2]"));
			    	add.click();
			    	  Log.info("addhl");
			    }
			    public void amazingtemp1() {
			    	WebElement high = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[2]/div/div/div[3]/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div"));
			    	high.click();
			    	  Log.info("amazingtemp1");
			     }
			     public void moreopt() {
			    	 WebElement moreopt = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[4]/div/ul/li[4]/div/button"));
			    	 moreopt.click();
			    	 Log.info("moreopt");
			    	 
			    	 WebElement emphaze = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[4]/div/ul/li[4]/div/div/div/span"));
			    	 emphaze.click();
			    	  Log.info("emphaze");
			     }
			     public void amazingtemp2() {
			     	WebElement high = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[2]/div/div/div[3]/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div"));
			     	high.click();
			     	  Log.info("amazingtemp2");
			     	
			     	WebElement font = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[4]/div/ul/li[1]/div/div/button"));
			     	font.click();
			     	  Log.info("font");
			     	
			     	WebElement large = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[4]/div/ul/li[1]/div/ul/li[5]"));
			     	large.click();
			     	  Log.info("large");
			      }
			     public void sectext() {
			    	 WebElement text = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div/span[2]/div/button"));
			    	 text.click();
			    	 WebElement close = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[1]/button"));
			    	 close.click();
			    	  Log.info("sectext");
			     }
			     public void notes() {
			    	 WebElement notes = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[3]/div/div/div[2]/div/textarea"));
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
			    	 WebElement save = driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div/div[2]/div/div/div[2]/button[2]"));
			    	 save.click();
			    	  Log.info("savebtn");
			     }
			     public void cornelred() {
			    	 WebElement red = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[3]/div/div/div[2]/div[2]/div/div/div[2]/ul/li[2]/div[1]"));
			    	 red.click();
			    	  Log.info("cornelred");
			     }
			     public void closed() {
			    	 WebElement close = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[3]/div/div/div[1]/button"));
			    	 close.click();
			    	  Log.info("close");
			     }
			     public void backtodb() {
			    	 WebElement back = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[4]/div/div[1]/button"));
			    	 back.click();                                  
			     }

//QUOTE SETUP//

 public void quotesdoc() {
	 	   String elementText = "ValidateQuote";
	     By locator = By.xpath("//p[contains(text(),'" + elementText + "')]");
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
	     element.click();             
	 }
 public void selectquote() {
	 WebElement quote =driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[4]/div[1]"));
	 Actions action = new Actions(driver);
     action.moveToElement(quote).perform();
 }  
		 public void usebtnQuote() {
	 WebElement quote = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[4]/div[2]/button[2]"));
	 quote.click();
 }
 
 public void textquote() {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 WebElement text = wait.until(ExpectedConditions.elementToBeClickable(By.id("sgTitleNode")));
	 text.click();
	 text.clear();
	 text.sendKeys("Selenium");
 }
 public void explorequote() {
	 WebElement quote = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[2]/ul/li[1]/div/button"));
	 quote.click();
 }
 public void varquote() {
	 WebElement quote = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div[2]/ul/li[2]/div"));
	 quote.click();
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
	    WebElement chart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/nav/a[7]")));
	    chart.click();
	    Log.info("Chart");
	  }
	 public void ExploreStyle() { 
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement explore = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[1]/div[1]")));
	    Actions actions = new Actions(driver);
	    actions.moveToElement(explore).perform();
	    WebElement explored = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[1]/div[2]/button[2]")));
	    explored.click();
	    Log.info("ExploreStyle");
	}
	   
	   public void Editbtn() {
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		     WebElement edit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/ul/li[1]/button")));
		     edit.click();                         
		     Log.info("Edit btn");
	   }
	   
	   public void insertslideCharts() {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			     WebElement edit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[2]/button[1]")));
			     edit.click();    
	   }
	   public void Addrow() {
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(88));
		     WebElement row = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div/div[3]/div[2]/div/button")));
		     row.click();                                                                  
		     Log.info("add row");
		     }
		     
		     public void Savebtn() {
		     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		     WebElement saved = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[1]/button")));
		     saved.click();
		     Log.info("Save btn");
		     
		      WebElement edited = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/ul/li[1]/button")));
	          edited.click();
	          WebElement editing = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div/div[3]/div[2]/div/table/tbody/tr[8]/td[1]/div")));
	        editing.click();
	          editing.clear();
	        editing.sendKeys("Deck");
	        Log.info("Editing");
	  	     }
	   
		     public void Saving() {
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	   WebElement saving = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[1]/button")));
		     saving.click();
		     Log.info("Saving");
	   
	}
		     
	   public void Deleterow() {
		  try {
			  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement delete = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[2]/div/div/div[3]/div[2]/div/div[1]/div[1]/div/div/div[8]/div[2]/div/div[1]/div/div[2]/div")));
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
		     public void  properties() {
		    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		     WebElement axis = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div[1]/button")));
		     axis.click();
		     WebElement line = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/button")));
		     line.click();
		     Log.info("properties");
		     
		     //Category
		     WebElement category = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/nav/div[2]/a")));
		     category.click();
		     Log.info("Category");
		     
		     WebElement baseline = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/button")));
		     baseline.click();
		     Log.info("Baseline");
		    }
		     
		       public void closebtn() {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		     WebElement closed = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[1]/button")));
		     closed.click();
		     Log.info("Close button");
		     }
		     
		     public void styles() {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		     WebElement explorestyle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[2]/ul/li[1]/div/button")));
		     Actions actions = new Actions(driver);
		     actions.moveToElement(explorestyle).perform();
		     explorestyle.click();
		     Log.info("Styles");
		     }
		     @Test
		     public void left() {
			   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		     WebElement left = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div[2]/ul/li[2]/div/div/div[2]")));
		     left.click();
		     Log.info("left asset");
		   }
		    
		   public void BacktoDB() {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		     WebElement db = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[4]/div/div[1]/div[1]/ul/li[1]/div/span[2]")));
		     db.click();
		     Log.info("Back to DB");
		     
		     WebDriverWait waited = new WebDriverWait(driver, Duration.ofSeconds(30));
		  WebElement finaldocs = waited.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div/ul/li[1]/div/div[1]/div[3]/div/p[1]")));
	     finaldocs.click();
	     Log.info("Final docs");
		     }
		   
		   //IMAGE GRID//
		   public void imagegriddoc() {
				 	   String elementText = "ImageGrid";
				     By locator = By.xpath("//p[contains(text(),'" + elementText + "')]");
				     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				     WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
				     element.click();             
				 }
			 public void ImagesList() {
			        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			        WebElement image = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[2]/div[1]"));
			        Actions actions = new Actions(driver);
			        actions.moveToElement(image).perform();
			    }
			    public void ExploreStyles() {
			        WebElement explore = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[2]/div[2]/button[1]"));
			        explore.click();
			        Log.info("Clicked on Explore Styles");
			    }
			   public void GridOfImages() {
			       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			       WebElement Grid = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div/div/div/div[2]/ul/li[4]"));
			       Grid.click();
			       Log.info("Clicked on Grid of Images");               
			   }
			   public void insertslidegrid() {
				   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				   WebElement change = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[2]/button[1]")));
				   change.click();
			   }

			   public void ParticularSlide() {
			       WebElement thirdslide = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[6]/div/div[1]/div/div[3]/div/div/div[2]/div[2]/div[2]"));
			       thirdslide.click();
			       Log.info("Clicked on Particular slide");
			   }
			   public void Addpoint() {
				   WebElement add = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/ul/li[1]/div/div/div/button"));
				   add.click();
				   Log.info("Clicked on Add point");
			   }
			   public void seventhslide() {
				   WebElement seven = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/ul/li[1]/div/div/ul/li[4]"));
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
			   public void SettingsProperty() {
				   WebElement glutter = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div/span[1]/span[1]/span[1]/div/button"));
				   glutter.click();
				   
				   WebElement overlay = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div/span[1]/span[1]/span[2]/div/button"));
				   overlay.click();
//				   
//				   WebElement secondary = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div/span[2]/div[2]/button"));
//				   secondary.click();
//				   
//				   WebElement primary = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div/span[2]/div[1]/button"));
//				   primary.click();
				   
				   WebElement none = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div/span[1]/span[1]/span[3]/div/div/div/button"));
				   none.click();
				   
				   WebElement borderWhite = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div/span[1]/span[1]/span[3]/div/div/ul/li[2]"));
				   borderWhite.click();
				   
				   WebElement animationonce = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div/span[2]/span/div/div/div/button"));
				   animationonce.click();
				   
				   WebElement atatime = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div/span[2]/span/div/div/ul/li[3]/div/span"));
				   atatime.click();
				   
				   WebElement close = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[1]/button"));
				   close.click();
				   Log.info("Clicked on settings property");
						   
				   
			   }
			   public void TextPosition() {
				   WebElement Text = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[3]/div/div/div[3]/div[2]/div/div/div[3]/div[1]/div[1]/div[2]/div[3]/div"));
				   Text.click();
				   
				   WebElement position = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[4]/div/ul/li[4]/div/button"));
				   position.click();
				   
				   WebElement middle = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[4]/div/ul/li[4]/div/div/div/div/div/ul/li[5]"));
				   middle.click();
				   
				   WebElement Texted = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[3]/div/div/div[3]/div[2]/div/div/div[3]/div[1]/div[1]/div[2]/div[3]/div"));
				   Texted.click();
				   
				   WebElement Highlight = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[4]/div/ul/li[2]/div/button"));
				   Highlight.click();
				   
				   WebElement editText = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[4]/div/ul/li[2]/div/div/textarea"));
				   editText.click();
				   editText.clear();
				   editText.sendKeys("Selenium");
				   Log.info("Clicked on Text Position");
			   }
			   public void highlight() {
			       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			       WebElement Addhighlight = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[4]/div/ul/li[2]/div/div/div/button[2]")));

			       // Use Actions for complex interactions
			       Actions actions = new Actions(driver);
			       actions.click(Addhighlight).perform();
			   }
			   public void Emphazize() {
				   WebElement text = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[3]/div/div/div[3]/div[2]/div/div/div[3]/div[1]/div[1]/div[2]/div[3]/div"));
				   text.click();
				   
				   WebElement moreopt = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[4]/div/ul/li[5]/div/button"));
				   moreopt.click();
				   
				   WebElement emphaze = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[4]/div/ul/li[5]/div/div/div"));
				   emphaze.click();
				   
				   WebElement secondtext = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[3]/div/div/div[3]/div[2]/div/div/div[3]/div[1]/div[1]/div[2]/div[3]/div"));
				   secondtext.click();
				    }
			   public void URL() {
				   WebElement linkurl = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[4]/div/ul/li[3]/div/div/div/div/ul/li[2]/div"));
				   linkurl.click();
				   linkurl.sendKeys("www.google.com");
				   Log.info("Clicked on URL");
				   
				   WebElement tickbtn = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[4]/div/ul/li[3]/div/div/div/div/ul/li[3]/button"));
				   Actions actions = new Actions(driver);
			       actions.click(tickbtn).perform();
			   }
			   public void presentgrid() {
				   WebElement present = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[4]/div/div[3]/div/div[2]/button"));
				   present.click();
				   Log.info("Click on present button");
			   }
			   public void exitgrid() {
				   WebElement exit = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div[2]/button"));
				   exit.click();
				   Log.info("Exit button");
			   }
			//   public void secText() {
//				   WebElement text = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[3]/div/div/div[3]/div[2]/div/div/div[3]/div[1]/div[1]/div[2]/div[3]/div"));
//				   text.click();

			   
                                               //SECTION BREAK//

 public void sectiondoc() {
	 	   String elementText = "SectionBreak";
	     By locator = By.xpath("//p[contains(text(),'" + elementText + "')]");
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
	     element.click();             
	 }
 public void sectionasset() {
	 WebElement  breaks = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[2]/div[1]"));
	 Actions actions = new Actions(driver);
     actions.click(breaks).perform();
 }
 
 public void usebtnsection() {
	 WebElement quote = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[2]/div[2]/button[2]"));
	 quote.click();           
 }
 public void sectionlogo() {
	 WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[1]/button"));
	 logo.click();  

 WebElement close = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[1]/button"));
 close.click();
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
	   WebElement export = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div/div/nav/div[3]/a")));
       export.click();
}

public void Exporttopdf() {
WebDriverWait stop = new WebDriverWait(driver, Duration.ofSeconds(50));   
WebElement pdf = stop.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/div[3]/div/div/div[2]/div[1]/div/img")));
pdf.click();
}

public void Exports() {
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
WebElement exports = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div/div/nav/div[3]/a")));
exports.click();
}

public void Exporttoimage() {
 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
WebElement img = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/div[3]/div/div/div[2]/div[2]")));
   img.click();
 
}
//STACK ASSET
 public void stackdoc() {
	   String elementText = "ImageStack";
	     By locator = By.xpath("//p[contains(text(),'" + elementText + "')]");
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
	     element.click();             
}
public void mobileasset() {
	WebElement mobile = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[1]/div[1]"));
	Actions actions = new Actions(driver);
    actions.moveToElement(mobile).perform();
}              
		public void insertStackslide() {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
	WebElement insert = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[2]/button[1]")));
	   insert.click();
		}
public void editextstack() {
	WebElement stack = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[2]/div/div/div[3]/div[2]/div/div/div[2]/div[1]/div[1]/div[3]/div[2]/div"));
	stack.click();
	stack.clear();
	stack.sendKeys("Selenium");
}
public void explorestyleeditor() {
	WebElement explore = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[2]/ul/li[1]/div/button"));
	explore.click();
}
public void backgroundcolorstack() {
	WebElement stack = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div[2]/ul/li[2]/div/div"));
	stack.click();
}
public void replaceimgstack() {
	WebElement stack = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/ul/li[2]/div/div/div[3]/div[2]/div/div/div[8]/div/div[2]/div"));
	stack.click();
	
	WebElement edit = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div/div[4]/div/ul/li[2]/button"));
	edit.click();
	
	WebElement canva = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div[2]/div[4]/div[1]/div[3]/div/button"));
	canva.click();
}

public void fittocanva() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    WebElement canva = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-test-id='undefinedimagecropfittocanvas']")));
	 canva.click();
}
	 public void tickbtn() {
	 WebElement tick = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div[2]/div[4]/div[2]/button"));
	 tick.click();
}
	 public void editoutlinetext() {
		 WebElement text = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div/div[2]/div/div/div[1]/div[1]/div[2]/div/ul/li[1]/div/div/div/span"));
		 text.click();
		 text.clear();
		 text.sendKeys("Welcome to presentation.ai");
	 }
	 public void updatebtnoutline() {
		 WebElement update = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div/div[1]/div[2]/button"));
		 update.click();
	 }
	 public void clickorpress() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div/div[2]")));
         element.click();
         
         WebElement close = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div[2]/button"));
         close.click();
	 }
	
	  
	  public void settingsdash() {
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		  WebElement settings = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[4]")));
		  settings.click();
	  }
public void membersandgroups() {
	WebElement groups = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[1]/div[2]/a[9]"));
	groups.click();
}
public void invmembersworkspace() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div[2]/div/div/div[1]/div[1]/button[1]")));
	button.click();
}
public void mailworkspace() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    WebElement mail = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/div[3]/div/div[2]/div[4]/div/span")));
    mail.click();
    mail.sendKeys("nayana@pitchdeck.io");
    mail.sendKeys(Keys.ENTER);
    Log.info("Email sent successfully");
}
public void backbtn() {
	WebElement back = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[1]/button"));
	back.click();
}
public void status() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	WebElement status = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div/ul/li[1]/div/div[4]/div[1]/div/div/div/button")));
	status.click();
	
	WebElement todo = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div/ul/li[1]/div/div[4]/div[1]/div/div/ul/li[3]"));
	todo.click();

}
public void plusfolder() {
	WebElement folder = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[7]/div[1]/button"));
	folder.click();
}
public void folname() {
	WebElement name = driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div/div[2]/div/div[2]/div[1]/div"));
	name.click();
	name.sendKeys("Workspace");
}
public void createfolder() {
	WebElement create = driver.findElement(By.id("pdcreatefolder"));
	create.click();
}
public void addmembersworkspace() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	WebElement add =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div/div/div/div/div[2]/div/div[3]/button[2]")));
	add.click();
}

public void choosefolder() {
	WebElement folder = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[7]/div[2]/a[2]"));
	folder.click();
}
public void chooseworkspace() {             
	WebDriverWait select = new WebDriverWait(driver, Duration.ofMinutes(1));
	 WebElement elements = select.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-id='297476']")));
	 elements.click();       
}
public void addmembersspace() {             
	WebDriverWait select = new WebDriverWait(driver, Duration.ofMinutes(10));
	 WebElement elements = select.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/div/div[1]/div[2]/button[1]")));
	 elements.click();                                                                   
}
public void viewandedit() {   
WebDriverWait select = new WebDriverWait(driver, Duration.ofMinutes(1));
WebElement elements = select.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div/div/div/div/div[2]/div/div[2]/div[1]/div[2]/div[2]/button")));
elements.click();            
}
public void addmember() {   
WebDriverWait select = new WebDriverWait(driver, Duration.ofMinutes(1));
WebElement elements = select.until(ExpectedConditions.elementToBeClickable(By.xpath(" /html/body/div[5]/div/div/div/div/div[2]/div/div[3]/button")));
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
public void coverimgvar() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement img = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div/div/div/div[2]/ul/li[2]/div/div")));
	img.click();
}
public void coverimglogo() { 
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
WebElement img = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[2]/button")));
img.click();

WebElement close = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div[1]/button"));
close.click();
}
public void changeimgcover() {
	WebElement change = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div[2]/ul/li[4]/div/div/div[2]"));
	change.click();
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
@Test
public void duplicateslide() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement deleteslide = wait.until(ExpectedConditions.elementToBeClickable(By.id("duplicateSlideButton")));
		deleteslide.click();
		System.out.println(" Clicked duplicateslide");
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
}
public void linkoptionsdoc() {
	   String elementText = "Validate linkoptions";
       By locator = By.xpath("//p[contains(text(),'" + elementText + "')]");
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
       element.click();
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
      
public void amazingtemppresent() {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement high =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div[2]/div[1]/div/div[2]/div/div/div[3]/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div")));
	high.click();                                  
	System.out.println("Clicked on amazingtemp");         
	  Log.info("Clicked on amazingtemp");
}
public void carouselasset() {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement asset =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/nav/a[9]")));
	asset.click();                                  
	System.out.println("Clicked on amazingtemp");
}
public void carouselhover() {
	WebElement cover = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[1]/div[1]"));
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
     WebElement title = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div[2]"));
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
    WebElement text = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div[2]"));
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
    WebElement text = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[2]/button[1]"));
    text.click();
    System.out.println("suggestslides");     
    Log.info("Clicked on suggestslides");                       
     }
public void displayinsert() {
    WebElement text = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[2]/button[1]"));
    text.click();
    System.out.println("displayinsert");             
    Log.info("Clicked on displayinsert");                        
     }    
public void Explorestylenumber() {
    WebElement number = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[1]/div[2]/button[1]"));
    number.click();
    System.out.println("displayinsert");    
}
public void numberassetvar() {
    WebElement number = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div/div/div/div[2]/ul/li[3]/div"));
    number.click();
    System.out.println("Clicked on number asset"); 
}   
		public void charthover() {
	WebElement cover = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/ul/li[1]/div[1]"));
	Actions actions = new Actions(driver);
    actions.click(cover).perform();
}
		 public void Viewprofile() {
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
		   
		   public void youraccountdetails() {
			   WebElement frstname = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div[2]/div/div/div/div/div/div/div/div/div[2]/div[2]/div[1]/div"));
			   frstname.click();
			   frstname.clear();
			   frstname.sendKeys("Abideck");
			   Log.info("youraccountdetails");
		   }
		   public void lastname() {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		   WebElement last = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div/div/div/div/div/div/div/div[2]/div[2]/div[2]/div")));
		   last.click();
		   last.clear();
		   last.sendKeys("v");
		   Log.info("lastname");
		   }

		   public void Designation() {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		   WebElement des = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div/div/div/div/div/div/div/div[2]/div[3]/div/div")));
		   des.click();
		   des.clear();
		   des.sendKeys("Trainee");
		   Log.info("Designation");
		   }

		   public void Role() {
		   	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		   WebElement role = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div/div/div/div/div/div/div/div[2]/div[4]/div/div/div/button")));
		   role.click();
		   Log.info("Role");
		   }

		   public void Language() {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		   WebElement lan = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div/div/div/div/div/div/div/div[2]/div[5]/div/div/div/div/span")));
		   lan.click();
		   lan.clear();
		   lan.sendKeys("English");
		   Log.info("Language");
		   }
		 public void OrgInfo() {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		   WebElement info = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/a[7]")));
		   info.click();
		   Log.info("OrgInfo");
		 }
		   
		public void Socialmedia() {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		   WebElement media = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div[3]/div/div/nav/div[10]/a")));
		   media.click();
		   Log.info("Socialmedia");
		   
		   WebElement twitter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div[4]/div/div[1]/div/div/input")));
		   twitter.click();
		   twitter.sendKeys("www.twitter.com/tweet/info_employee");
		   Log.info("Setup");
		   
		   WebElement book = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div[4]/div/div[2]/div/div/input")));
		   book.click();
		   book.sendKeys("www.facebook.com/Kg/info/Deck/");
		   Log.info("twitter");
		   
		   WebElement instagram = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div[4]/div/div[4]/div/div/input"));
		   instagram.click();
		   instagram.sendKeys("presentations.ai");
		   Log.info("instagram");
		}
		//public void save() {
		//	
//		    // WebElement save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[2]/button")));
//		    // save.click();
		//}
		public void basicinfo() {
			WebElement info = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div[3]/div/div/nav/div[1]/a"));
			info.click();
			WebElement name = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div[4]/div/div[1]/div/div/input"));
			name.click();
			name.clear();
			name.sendKeys("Deck");
			 Log.info("basicinfo");
		}
		   
		   
		
}