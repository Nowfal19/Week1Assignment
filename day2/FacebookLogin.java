package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {

		// 1. Setting up the Driver
		WebDriverManager.chromedriver().setup();

		// 2. Open a Chrome Browser
		ChromeDriver driver = new ChromeDriver();

		// 3. Load URL to test
		driver.get("https://en-gb.facebook.com/");

		// 4. Maximize the browser
		driver.manage().window().maximize();

		// 5. Add implict wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// 6. Create an account
		WebElement ElementCreateaccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		ElementCreateaccount.click();

		// 7. Enter the FirstName
		driver.findElement(By.name("firstname")).sendKeys("Devi");

		// 8. Enter the LastName
		driver.findElement(By.name("lastname")).sendKeys("Prasad");

		// 9. Enter the Mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("9877609885");

		// 10. Enter the Password
		driver.findElement(By.name("reg_passwd__")).sendKeys("Devi456y");

		// Thread.sleep(3000);
		// 11.Handling the dropdown
		WebElement elementDay = driver.findElement(By.id("day"));
		Select dd = new Select(elementDay);
		dd.selectByVisibleText("11");

		WebElement eleMonth = driver.findElement(By.id("month"));
		Select dd1 = new Select(eleMonth);
		dd1.selectByVisibleText("Jan");

		WebElement eleyear = driver.findElement(By.id("year"));
		Select dd2 = new Select(eleyear);
		dd2.selectByVisibleText("2000");

		// 12.Select Radio Button
		driver.findElement(By.xpath("(//label[@class='_58mt'])[1]")).click();
	}

}
