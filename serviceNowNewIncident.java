package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;
import testNG.testNGExercise.ProjectSpecificsMetod;

public class serviceNowNewIncident {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("https://dev131096.service-now.com/navpage.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// 2. Login with valid credentials (refer the document to create the instance)
		
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("B/1cpn-E6PeE");
		driver.findElement(By.id("sysverb_login")).click();
		Thread.sleep(8000);
		
		
		
		// 3. Click All and enter Incident in filter navigator and press enter //div[contains(text(),'All')]   
		
		Shadow shadow = new Shadow(driver);
		Thread.sleep(8000);
		//shadow.setImplicitWait(20);
		WebElement all = shadow.findElementByXPath("//div[@class='sn-polaris-navigation polaris-header-menu']/div");
		all.click();
		Actions builder = new Actions(driver);

		WebElement filter = shadow.findElementByXPath("//input[@id='filter']");
		driver.executeScript("arguments[0].click();", filter);
		filter.sendKeys("incident"); 	
		Thread.sleep(4000);
		filter.sendKeys(Keys.ENTER); 

		// 4. Click on Create new option and fill the manadatory fields INC0010002
		Thread.sleep(8000);
		WebElement frame = shadow.findElementByXPath("(//iframe[@title='Main Content']");
		builder.moveToElement(frame).click().perform();
		WebElement New = driver.findElement(By.className("selected_action action_context btn btn-primary"));
		New.click();
		driver.findElement(By.xpath("(//button[@data-ref='incident.closed_at']//span)[3]")).click();
		WebElement closeDate = driver
				.findElement(By.xpath("(//input[contains(@class,'form-control text-align-right-ltr')])[2]"));
		
		builder.doubleClick(closeDate);
		driver.findElement(By.xpath("(//input[@data-ref='incident.short_description'])[2]")).sendKeys("Self service");
		driver.findElement(By.xpath("//div[@gsft_has_scroll='false']")).click();
		
		// 5. Verify the newly created incident   
		// ( copy the incident number and paste it in search field and enter then verify
		// the instance number created or not)

	}
}
