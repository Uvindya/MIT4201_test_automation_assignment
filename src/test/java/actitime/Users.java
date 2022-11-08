package actitime;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class Users {
	public void Users() throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.className("pwdfield")).sendKeys("manager");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(60000);
		
		//driver.findElement(By.xpath("//div[@id='container_users']")).click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(60));
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("///table[@class='userNameContainer']/tbody/tr/td[@xpath='1']")));
		//driver.findElement(By.xpath("//table[@class='userNameContainer']/tbody/tr/td[@xpath='1']")).click();
		

}
}
