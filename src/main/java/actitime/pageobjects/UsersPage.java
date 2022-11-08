package actitime.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
WebDriver driver;
	
	public UsersPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="container_users")
	WebElement container_users;
	
	
	@FindBy(xpath="//table[@class='userNameContainer']/tbody/tr/td[@xpath='1']")
	WebElement userNameContainer;
	
	

}
