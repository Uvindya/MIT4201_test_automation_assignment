package actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeaveResultsPage {
	WebDriver driver;

	public LeaveResultsPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[contains(@class,'pagetitle')]")
	WebElement pageTitle;

	public String getPageTitle() {
		return pageTitle.getText();
	}
}
