package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.Base.BaseClass;
import Pages.LoginPage;
import Utils.TestListner;

@Listeners(TestListner.class)
public class LoginTest extends BaseClass {
	
	
	@Test
	public void loginSuccessfullyWithValidCredentials() {
		LoginPage lg = new LoginPage(driver);
		lg.login("q303", "Plasma@123");
		System.out.println("Test");
		Assert.fail();
	}

}
