package actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	WebElement username;

	@FindBy(className = "pwdfield")
	WebElement pwdfield;

	@FindBy(id = "keepLoggedInCheckBox")
	WebElement keepLoggedInCheckBox;

	@FindBy(id = "loginButton")
	WebElement loginButton;
	
	@FindBy(className = "errormsg")
	WebElement errormsg;

	public void loginAction(String user, String password) {
		username.sendKeys(user);
		pwdfield.sendKeys(password);
		keepLoggedInCheckBox.click();
		loginButton.click();
	}
	
	public String getLoginError() {
		return errormsg.getText();
	}

}
