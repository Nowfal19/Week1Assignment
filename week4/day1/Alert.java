package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
	public static void main(String[] args) {
		
	// 1.setup the path
	WebDriverManager.chromedriver().setup();

	// 2.disable notifications
	ChromeOptions ch = new ChromeOptions();
	ch.addArguments("--disable-notifications");
	ChromeDriver driver = new ChromeDriver(ch);

	// 3.Maximize the browser
	driver.manage().window().maximize();

	// 4. Implicitily wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	// 5. Load URL
	driver.get("http://testleaf.herokuapp.com/pages/Alert.html ");

	//6. Prompt Bax 
	WebElement findElement = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
	findElement.click();
	org.openqa.selenium.Alert alert = driver.switchTo().alert();
	alert.sendKeys("TestLeaf");
	alert.accept();
	

}
}
