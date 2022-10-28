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

public class SalesForce {
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
	driver.get("https://login.salesforce.com/");
	
    // 6. Username 
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ramkumar.ramaiah@testleaf.com");
	
	//7. Password
	driver.findElement(By.xpath("(//input[contains(@class,'input r4')])[2]")).sendKeys("Password#123");

	//8.Login
	driver.findElement(By.xpath("//div[@id='pwcaps']/following-sibling::input")).click();
	
	//9. click on the learn more option in the Mobile publisher  
	driver.findElement(By.xpath("//div[@data-aura-rendered-by='2312:0']/button")).click();
	
	//10. Switch to the next window using Windowhandles.
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> listHandle = new ArrayList<String>(windowHandles);
	String firstwindow = listHandle.get(1);
	driver.switchTo().window(firstwindow);
	
	//11. click on the confirm button in the redirecting page  
	driver.findElement(By.xpath("//button[text()='Confirm']")).click();
	//driver.switchTo().alert().accept();
		
	//12. Get the title
	String title = driver.getTitle();
	System.out.println("Title of opened webpage: "+title );
	
	//13. Get back to the parent window
	driver.switchTo().window(listHandle.get(0));
	//driver.switchTo().defaultContent();
	
	//14. close the browser
    //driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	Thread.sleep(8000);
//	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}

