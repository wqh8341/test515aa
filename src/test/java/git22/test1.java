package git22;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test1 {
	private WebDriver driver;


	  @BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
		 System.setProperty("webdriver.gecko.driver", "D:\\wqh\\eclipse\\git22\\src\\test\\resources\\geckodriver66.exe");
		
	    driver = new FirefoxDriver();
	
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testUntitledTestCase() throws Exception {
	    driver.get("https://www.baidu.com/");
	    Thread.sleep(2000);
	    List<WebElement> elements= driver.findElements(By.tagName("input"));
	    System.out.println(elements);
	    WebElement elem= elements.get(7);
	    elem.sendKeys("testng");
	    driver.findElement(By.id("su")).click();
	    
	    
	  //  driver.findElement(By.className("s_ipt")).clear();
	  //  driver.findElement(By.className("s_ipt")).sendKeys("1");
	   // driver.findElement(By.id("su")).click();
	//    WebElement elemet= driver.findElement(By.cssSelector("input[type='submit'][class='bg s_btn']"));
	   // elemet.click();
	    
	  //  driver.findElement(By.cssSelector("input[type='submit'][class='bg s_btn']")).click();
	  //  Thread.sleep(2000);
	  //  driver.quit();
	    
	  }

	
}
