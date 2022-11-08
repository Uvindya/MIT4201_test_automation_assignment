package actitime;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import actitime.pageobjects.LoginPage;
import actitime.pageobjects.SubmitTimeTrackPage;
import actitime.pageobjects.ViewTimeTrackPage;

public class ViewTimeTrackTest extends TestBase {

	@BeforeClass
	public void setBeforeMethod() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginAction("admin", "manager");
		Thread.sleep(5000);

		SubmitTimeTrackPage submitTimeTrackPage = new SubmitTimeTrackPage(driver);
		submitTimeTrackPage.clickViewTimeTrackLink();
		Thread.sleep(35000);

	}

	@Test
	public void testApproveFilter() throws InterruptedException {

		ViewTimeTrackPage viewTimeTrackPage = new ViewTimeTrackPage(driver);
		viewTimeTrackPage.clickFilters();
		Thread.sleep(5000);

		if (!viewTimeTrackPage.isApprovedCheckBoxSelected()) {
			viewTimeTrackPage.clickApproveCheckBox();
		}

		if (viewTimeTrackPage.isReadyForApproveCheckBoxSelected()) {
			viewTimeTrackPage.clickReadyForApproveCheckBox();
		}

		if (viewTimeTrackPage.isRejectedCheckBoxSelected()) {
			viewTimeTrackPage.clickRejectCheckBox();
		}

		Thread.sleep(5000);

		viewTimeTrackPage.clickApplyButton();
		Thread.sleep(5000);

	}

	@Test
	public void testReadyForApproveFilter() throws InterruptedException {

		ViewTimeTrackPage viewTimeTrackPage = new ViewTimeTrackPage(driver);
		viewTimeTrackPage.clickFilters();
		Thread.sleep(5000);

		if (viewTimeTrackPage.isApprovedCheckBoxSelected()) {
			viewTimeTrackPage.clickApproveCheckBox();
		}

		if (!viewTimeTrackPage.isReadyForApproveCheckBoxSelected()) {
			viewTimeTrackPage.clickReadyForApproveCheckBox();
		}

		if (viewTimeTrackPage.isRejectedCheckBoxSelected()) {
			viewTimeTrackPage.clickRejectCheckBox();
		}

		Thread.sleep(5000);

		viewTimeTrackPage.clickApplyButton();
		Thread.sleep(5000);

	}

}
