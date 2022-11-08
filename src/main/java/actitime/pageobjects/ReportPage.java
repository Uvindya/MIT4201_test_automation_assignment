package actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportPage {
	WebDriver driver;

	public ReportPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='type-title' and contains(text(),'Leave hours by Users')]")
	WebElement leaveHours;

	@FindBy(xpath = "//em[@unselectable='on' and @xpath='2']")
	WebElement unSelectable;

	@FindBy(xpath = "//div[contains(@class,'balancesButton reportButton')]")
	WebElement leaveTimeBalanceMenuItem;

	@FindBy(xpath = "//span[contains(text(),'New Report')]")
	WebElement newReport;

	@FindBy(xpath = "//div[contains(@class,'balancesButton reportButton')]")
	WebElement balancesButton;

	@FindBy(xpath = "//div[contains(text(),'Configure Report Parameters')]")
	WebElement configureReportParameters;

	@FindBy(xpath = "//td[contains(@class,'middle-left-cell contents customRightPart')]")
	WebElement dateDropdown;

	@FindBy(xpath = "//span[@id='applyReportConfiguration']")
	WebElement applyReportConfiguration;
	
	@FindBy(xpath = "//div[contains(text(),'Scheduled vs. Worked Hours+Overtime')]")
	WebElement attendanceReportLink;
	
	public void clickNewReportButton() {
		newReport.click();
	}
	
	public void clickLeaveBalanceMenuItem() {
		leaveTimeBalanceMenuItem.click();
	}
	
	public void clickAttendanceReportLink() {
		attendanceReportLink.click();
	}
	
	public void clickConfigureReport() {
		configureReportParameters.click();
	}
	
	public void clickGenerateReport() {
		applyReportConfiguration.click();
	}
}
