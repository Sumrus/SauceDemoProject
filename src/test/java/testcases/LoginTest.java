package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Pages.LoginPage;

public class LoginTest extends BaseClass {
	
	@Test
	public void LoginFailureTest () {
		
		LoginPage login = new LoginPage();
		
		login.LoginFunction("sumit.rusia3@gmail.com", "@854Sumrus");
		
		WebElement ErrorMsg = driver.findElement (By.xpath("//*[@data-test='error']"));
		
		String ActualMsg = ErrorMsg.getText();
		String ExpMsg = "Epic sadface: Username and password do not match any user in this service";

		AssertJUnit.assertEquals(ActualMsg, ExpMsg);
	}
	
	@Test
	public void SuccessfulLogin () {
		
		LoginPage login = new LoginPage();
		login.LoginFunction("standard_user", "secret_sauce");
	}

}
