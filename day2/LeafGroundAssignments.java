package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignments {
	public static void main(String[] args) throws InterruptedException {
		
	// 1. Setting up the Driver
	WebDriverManager.chromedriver().setup();
	
	// 2. Open a Chrome Browser
	ChromeDriver driver = new ChromeDriver();
	
	// 3. Load URL to test
	driver.get("https://www.leafground.com/input.xhtml");
	
	// 4. Maximize the browser
	driver.manage().window().maximize();

	// 5. Add implict wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	//6. Type your name
	driver.findElement(By.id("j_idt88:name")).sendKeys("Nowfal");
	
	//7. Append
	driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).sendKeys(" City");
	
	//8. Check Disabled
	WebElement Disabledbox = driver.findElement(By.xpath("(//div[@class='col-12'])[3]"));
	boolean enabled = Disabledbox.isEnabled();
	System.out.println(enabled);
	
	//9. Clear
	driver.findElement(By.id("j_idt88:j_idt95")).clear();
	
	//10. Retrieve the typed text
	WebElement Retrieve = driver.findElement(By.xpath("//input[@value='My learning is superb so far.']"));
	String text = Retrieve.getAttribute("value");
	System.out.println(text);
	
	//11. Type your email
	driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("leaftest@gmail.com"+Keys.TAB);
	
	//12. About yourself
	driver.findElement(By.xpath("//textarea[@id='j_idt88:j_idt101']")).sendKeys("I am Nowfal, Automation tester with selenium software");
	
	//13. Enter and confirm message
	driver.findElement(By.xpath("//div[contains(@class,'col-12 mb-2')]//input[1]")).sendKeys("confirm error message");
	
	//14. Click and conform the position
	driver.findElement(By.id("j_idt106:float-input")).click();
	
	Thread.sleep(6000);
	driver.close();
	
	//Load URL to test
	driver.get("https://www.leafground.com/button.xhtml;jsessionid=node01uwse2e3mjhu41g6ob84cjmhcy363172.node0");
	
	
	
	
	
	
	
	
	
	
	
}
}