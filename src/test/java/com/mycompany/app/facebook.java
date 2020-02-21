package TestNG;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class facebook {
	 WebDriver driver;
	@BeforeMethod
	public void launch() throws MalformedURLException {
		  //System.setProperty("webdriver.gecko.driver", "/Users/kannan/Downloads/geckodriver.exe");
		  //driver = new FirefoxDriver();
		  //DesiredCapabilities dc = DesiredCapabilities.firefox();
		  FirefoxOptions dc = new FirefoxOptions();
                  //RemoteWebDriver driver;
		  driver = new RemoteWebDriver (new URL("http://172.31.28.55:4444/wd/hub"),dc);
		  driver.get("http://www.facebook.com");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
  @Test
  public void facebook1() throws InterruptedException {
	  
	  driver.findElement(By.name("email")).sendKeys("ravi@gmail.com");
      Thread.sleep(100);
      driver.findElement(By.name("pass")).sendKeys("Password");
      Thread.sleep(100);

      driver.findElement(By.id("loginbutton")).click();
      Thread.sleep(600);	 	  	  
  }
  @Test
  public void facebook0() throws InterruptedException {
	  
	  driver.findElement(By.name("email")).sendKeys("ravi@gmail.com");
      Thread.sleep(100);
      driver.findElement(By.name("pass")).sendKeys("Password");
      Thread.sleep(100);

      driver.findElement(By.id("loginbutton")).click();
      Thread.sleep(600);	 	  	  
  }
  @Test
  public void facebook2() throws InterruptedException {
	  
	  driver.findElement(By.name("email")).sendKeys("ravi@gmail.com");
      Thread.sleep(100);
      driver.findElement(By.name("pass")).sendKeys("Password");
      Thread.sleep(100);

      driver.findElement(By.id("loginbutton")).click();
      Thread.sleep(600);	 	  	  
  }
  @Test
  public void facebook3() throws InterruptedException {
	  
	  driver.findElement(By.name("email")).sendKeys("ravi@gmail.com");
      Thread.sleep(100);
      driver.findElement(By.name("pass")).sendKeys("Password");
      Thread.sleep(100);

      driver.findElement(By.id("loginbutton")).click();
      Thread.sleep(600);	 	  	  
  }
  @Test
  public void facebook4() throws InterruptedException {
	  
	  driver.findElement(By.name("email")).sendKeys("ravi@gmail.com");
      Thread.sleep(100);
      driver.findElement(By.name("pass")).sendKeys("Password");
      Thread.sleep(100);

      driver.findElement(By.id("loginbutton")).click();
      Thread.sleep(600);	 	  	  
  }
 
   @AfterMethod
    public void logout() {
	    driver.quit();
   }
}

