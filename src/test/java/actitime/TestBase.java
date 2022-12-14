package actitime;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import actitime.dataprovider.PropertyFileReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	WebDriver driver;
	PropertyFileReader propertyFileReader = new PropertyFileReader();

	@BeforeTest
	public void setUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get(propertyFileReader.get("app.url"));
		Thread.sleep(15000);

	}

	@AfterTest
	public void afterAll() {
		driver.quit();
	}
}
