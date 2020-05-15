package git22;

import java.io.File;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class jenkins {
  @Test
  public void f() throws Exception {
	 String path1= System.getProperty("user.dir")+"\\file\\chromedriver80.exe";
	 String path2= System.getProperty("user.dir")+"\\file\\";
	 System.out.println(path1);
	 System.out.println(path2);
	  System.setProperty("webdriver.chrome.driver", path1);
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.baidu.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Date date = new Date();
		
		SimpleDateFormat formater= new SimpleDateFormat("yyyyMMdd_hhmmss");
	

		String time=formater.format(date.getTime());
		
		System.out.println(time);
		String name="test"+time+".png";
		TakesScreenshot tss=(TakesScreenshot)driver;
		File image=tss.getScreenshotAs(OutputType.FILE);
		File copyfile = new File (path2+name);
		Files.copy(image, copyfile);
		
		
				
		
  }
}
