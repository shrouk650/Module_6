package PageBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_page {
	
		WebDriver driver;

		public Login_page(WebDriver driver) {
			this.driver = driver;
		}

		public WebElement usernema_Text() {
			return (driver.findElement(By.id("username")));
		}

		public WebElement password_Text() {
			return (driver.findElement(By.id("password")));
		}

		public WebElement Login_button() {
			return (driver.findElement(By.cssSelector("button[type=\"submit\"]")));
		}

		public WebElement flash_message() {
			return (driver.findElement(By.id("flash")));
		}
	}


