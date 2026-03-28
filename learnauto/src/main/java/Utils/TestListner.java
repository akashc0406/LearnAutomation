package Utils;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

import com.Base.BaseClass;

public class TestListner extends BaseClass implements ITestListener{
	@Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
    	WebDriver driver = ((BaseClass) result.getInstance()).driver;
        System.out.println("Test Failed: " + result.getName());

        // Screenshot capture
        ScreenshotUtils.captureScreenshot(driver, result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped: " + result.getName());

}
}
