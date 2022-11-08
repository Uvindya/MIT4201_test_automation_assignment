package actitime;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import actitime.pageobjects.LoginPage;
import actitime.pageobjects.OverTimeResultsPage;
import actitime.pageobjects.ReportPage;
import actitime.pageobjects.SubmitTimeTrackPage;

public class AttendenceReportTest extends TestBase {

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
	public void testAttendenceReport() throws InterruptedException {

		ReportPage reportPage = new ReportPage(driver);
		reportPage.clickAttendanceReportLink();
		Thread.sleep(15000);

		OverTimeResultsPage overTimeResultsPage = new OverTimeResultsPage(driver);

		Assert.assertEquals(overTimeResultsPage.getPageTitle(), "Time Balance & Overtime Report");

	}

}
