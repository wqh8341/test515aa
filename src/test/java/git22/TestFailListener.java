package git22;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import io.qameta.allure.Attachment;

public class TestFailListener extends TestListenerAdapter {

	@Override
    public void onTestFailure(ITestResult result) {
        takePhoto();
    }

    @Attachment(value = "失败截图如下",type = "image/png")
    public byte[]  takePhoto(){
    	
        byte[] screenshotAs = ((TakesScreenshot)jenkins.driver).getScreenshotAs(OutputType.BYTES);
        return screenshotAs;
    }

}
