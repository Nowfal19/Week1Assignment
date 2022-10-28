package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CloseAllWindowExcept {
	public static void main(String[] args) throws InterruptedException {
		
	// 1.setup the path
	WebDriverManager.chromedriver().setup();

	// 2.disable notifications
	ChromeOptions ch = new ChromeOptions();
	ch.addArguments("--disable-notifications");
	ChromeDriver driver = new ChromeDriver(ch);
	
	// 3.Maximize the browser
    driver.manage().window().maximize();	

	// 4. Implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	// 5. Load URL
	driver.get("https://leafground.com/window.xhtml ");
	
    // 6. Find the Number of tabs opened
	driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
	
	//7. Old Window
	String oldWindowHandle = driver.getWindowHandle();
	
	//8. To close the sub tab
	Set<String> windowHandles = driver.getWindowHandles();
	for (String allWindow : windowHandles) {
		if(!allWindow.equals(oldWindowHandle)) {
			driver.switchTo().window(allWindow);
			Thread.sleep(5000);
			driver.close();
		}
	}
	
	Thread.sleep(5000);
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}

