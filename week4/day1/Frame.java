package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {
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
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		//6.Frame
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert input = driver.switchTo().alert();
		input.sendKeys("Nowfal");
		input.accept();
		
		//7.Text
		String text = driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		System.out.println(text);
		
		//8. Main dom
		driver.switchTo().defaultContent();
			
	}

}
