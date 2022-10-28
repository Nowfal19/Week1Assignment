package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window {
	public static void main(String[] args) {
		
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
	
	//6. Get title for present window
	String titlePresent = driver.getTitle();
	System.out.println(titlePresent);

    // 7. click and confirm new window open 
	driver.findElement(By.xpath("//span[text()='Open']")).click();

	//8. Get title for New window
	String titleNew = driver.getTitle();
	System.out.println(titleNew);
	
	
	
	
	
	
	
	
	
	
	
	

}
}
