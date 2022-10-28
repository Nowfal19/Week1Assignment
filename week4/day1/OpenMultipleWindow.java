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

public class OpenMultipleWindow {
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
	
    // 6. Find the Number of tabs opened
	driver.findElement(By.xpath("//button[@name='j_idt88:j_idt91']")).click();

	//7. Find Number of windows opened
	Set<String> SetHandles = driver.getWindowHandles();
	
	List<String> Listhandle = new ArrayList<String>(SetHandles);
	Listhandle.size();
	System.out.println(Listhandle);
	
//	for (String eachWindow : Listhandle) {
//		System.out.println(eachWindow);
//	}
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.quit();
	
}
}
