package actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubmitTimeTrackPage {
	WebDriver driver;

	public SubmitTimeTrackPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@id='logoutLink']")
	WebElement logoutLink;
	
	@FindBy(xpath = "//a[contains(text(),'View Time-Track')]")
	WebElement viewTimeTrackLink;
	
	@FindBy(id="container_reports")
	WebElement reportTab;
	
	public void logOutAction() {
		logoutLink.click();
	}
	
	public void clickViewTimeTrackLink() {
		viewTimeTrackLink.click();
	}
	
	public void clickReportTab() {
		reportTab.click();
	}


}

