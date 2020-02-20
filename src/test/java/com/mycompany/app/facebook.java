package TestNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.MalformedURLException;

public class facebook {
	 WebDriver driver;
	@BeforeMethod
	public void launch() throws MalformedURLException {
		
		  DesiredCapabilities cap=DesiredCapabilities.FIREFOX();
		  driver=new RemoteWebDriver(new URL("http://172.31.41.66:4444/wd/hub"), cap);
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

