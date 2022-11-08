package actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewTimeTrackPage {
	WebDriver driver;

	public ViewTimeTrackPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'View Time-Track')]")
	WebElement timeTrack;

	@FindBy(xpath = "//div[contains(text(),'Filters')]")
	WebElement filters;

	@FindBy(xpath = "//input[@id='viewTTStatusCheckboxId_0']")
	WebElement approvedCheckboxId;
	
	@FindBy(xpath = "//input[@id='viewTTStatusCheckboxId_1']")
	WebElement readyForApproveCheckboxId;
	
	@FindBy(xpath = "//input[@id='viewTTStatusCheckboxId_2']")
	WebElement rejectCheckboxId;
	
	
	@FindBy(id = "applyFilterEdit")
	WebElement applyButton;
	
	public void clickFilters() {
		filters.click();
	}
	
	public void clickApproveCheckBox() {
		approvedCheckboxId.click();
	}
	
	public void clickReadyForApproveCheckBox() {
		readyForApproveCheckboxId.click();
	}
	
	public void clickRejectCheckBox() {
		rejectCheckboxId.click();
	}
	
	public boolean isApprovedCheckBoxSelected() {
		return approvedCheckboxId.isSelected();
	}
	
	public boolean isReadyForApproveCheckBoxSelected() {
		return readyForApproveCheckboxId.isSelected();
	}
	
	public boolean isRejectedCheckBoxSelected() {
		return rejectCheckboxId.isSelected();
	}
	
	public void clickApplyButton() {
		applyButton.click();
	}

}
