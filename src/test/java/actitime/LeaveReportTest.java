package actitime;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import actitime.pageobjects.LeaveResultsPage;
import actitime.pageobjects.LoginPage;
import actitime.pageobjects.ReportPage;
import actitime.pageobjects.SubmitTimeTrackPage;

public class LeaveReportTest extends TestBase {

	@BeforeClass
	public void setBeforeMethod() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginAction(propertyFileReader.get("app.username"), propertyFileReader.get("app.password"));
		Thread.sleep(5000);

		SubmitTimeTrackPage submitTimeTrackPage = new SubmitTimeTrackPage(driver);
		submitTimeTrackPage.clickReportTab();
		Thread.sleep(35000);

	}

	@Test
	public void testLeaveReport() throws InterruptedException {

		ReportPage reportPage = new ReportPage(driver);
		reportPage.clickNewReportButton();
		Thread.sleep(5000);

		reportPage.clickLeaveBalanceMenuItem();
		Thread.sleep(5000);

		reportPage.clickConfigureReport();
		Thread.sleep(5000);

		reportPage.clickGenerateReport();
		Thread.sleep(15000);

		LeaveResultsPage leaveResultsPage = new LeaveResultsPage(driver);

		Assert.assertEquals(leaveResultsPage.getPageTitle(), "Leave Time & Balances Report");

	}

}
