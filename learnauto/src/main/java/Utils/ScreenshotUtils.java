package Utils;

import java.io.File;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtils {
	public static void captureScreenshot(WebDriver driver, String testName) {

        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);
            System.out.println("Local Folder is" + src);

            File dest = new File(System.getProperty("user.dir") 
                    + "/screenshots/" + testName + ".png");

            FileUtils.copyFile(src, dest);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Screenshot not Captured");
        }
    }

}
