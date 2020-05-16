package git22;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.google.common.io.Files;
@Listeners({TestFailListener.class})
public class jenkins {
	public static WebDriver driver;

 
  @Test(description = "百度搜索")
  public void f() throws Exception  {
	  Date date = new Date();
		
		SimpleDateFormat formater= new SimpleDateFormat("yyyyMMdd_hhmmss");
	

		String time=formater.format(date.getTime());
		
		System.out.println(time);
		String name="test"+time+".png";
	 String path1= System.getProperty("user.dir")+"\\file\\chromedriver80.exe";
	 String path2= System.getProperty("user.dir")+"\\file\\";
	// System.out.println(path1);
	// System.out.println(path2);
	  System.setProperty("webdriver.chrome.driver", path1);
	  driver= new ChromeDriver();
	  try {
	  driver.get("https://www.baidu.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("wd")).sendKeys("test");
		driver.findElement(By.id("su1")).click();
		
			Thread.sleep(2000);
		} catch (Exception |Error e) {
			// TODO Auto-generated catch block
			TakesScreenshot tss=(TakesScreenshot)driver;
			File image=tss.getScreenshotAs(OutputType.FILE);
			File copyfile = new File (path2+name);
			Files.copy(image, copyfile);
			Reporter.log("<a href="+path2 +name +"  target=_blank>失败截图</a>", true);  
			Reporter.log("<img src="+path2 +name+"  style=width:30px;height:30px img/>", true);
			Assert.fail(e.getMessage());
		}
		
		
		
		
				
		
  }
}
