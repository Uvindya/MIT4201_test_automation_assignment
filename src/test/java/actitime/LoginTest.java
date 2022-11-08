package actitime;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import actitime.dataprovider.ExcelDataProvider;
import actitime.pageobjects.LoginPage;
import actitime.pageobjects.SubmitTimeTrackPage;

public class LoginTest extends TestBase {

	@Test(dataProvider = "excelDataProviderCorrectUser")
	public void testLoginAndLogout(String username, String password) throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginAction(username, password);
		Thread.sleep(5000);

		Assert.assertEquals(driver.getCurrentUrl(), "https://demo.actitime.com/user/submit_tt.do");

		SubmitTimeTrackPage homePage = new SubmitTimeTrackPage(driver);
		homePage.logOutAction();

		Assert.assertEquals(driver.getCurrentUrl(), "https://demo.actitime.com/login.do");

	}

	@Test(dataProvider = "excelDataProviderInCorrectUser")
	public void testLoginWrongUser(String username, String password) throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginAction(username, password);
		Thread.sleep(5000);

		Assert.assertEquals(loginPage.getLoginError(), "Username or Password is invalid. Please try again.");
	}

	@DataProvider(name = "excelDataProviderCorrectUser")
	public Object[][] getCorrectUserData() throws IOException {
		return new ExcelDataProvider().getData("user_data_correct.xlsx");

	}

	@DataProvider(name = "excelDataProviderInCorrectUser")
	public Object[][] getInCorrectUserData() throws IOException {
		return new ExcelDataProvider().getData("user_data_incorrect.xlsx");

	}

}
