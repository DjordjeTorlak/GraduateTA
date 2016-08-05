package test1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterClass;

public class test1 {
	
	private static WebDriver driver;
	private String URL;
	
  @Test
  public void TestGoogle() 
  {
	  driver.get(URL);
	  driver.manage().window().maximize();
	  Sleeper.sleepTightInSeconds(10);
  }
  
  @BeforeClass
  public void setUp() 
  {
	  driver=new FirefoxDriver();
	  URL = "http://www.google.com";
  }

  @AfterClass
  public void tearDown() 
  {
	  driver.close();
  }

}
