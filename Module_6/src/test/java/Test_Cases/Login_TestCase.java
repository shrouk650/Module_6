package Test_Cases;

import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;

import PageBase.Login_page;

public class Login_TestCase extends TestBase {
	@Test
	public void invalid_username() {
		Login_page login = new Login_page(driver);
		login.usernema_Text().sendKeys("username");
		login.password_Text().sendKeys("password");
		login.Login_button().click();
		System.out.println(login.flash_message().getText());
		assertTrue(login.flash_message().getText().contains("Your username is invalid"));
	}

	@Test
	public void valid_username() {
		Login_page login = new Login_page(driver);
		login.usernema_Text().clear();
		login.usernema_Text().sendKeys("tosmith");
		login.password_Text().clear();
		login.password_Text().sendKeys("SuperSecretPassword!");
		login.password_Text().submit();
		System.out.println(login.flash_message().getText());
		assertTrue(login.flash_message().getText().contains("You logged into a secure area"));

	}
}
