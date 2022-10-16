package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {

		// 1. Setting up the Driver
		WebDriverManager.chromedriver().setup();

		// 2. Open a Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		
		// 3. Load URL to test
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// 4. Maximize the browser
		driver.manage().window().maximize();

		// 5. Add implict wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//6. Enter Username and password 
		WebElement elementUsername = driver.findElement(By.xpath("//input[@id = 'username']"));
		elementUsername.sendKeys("Demosalesmanager");
				
		WebElement elementpassword = driver.findElement(By.xpath("//input[@id = 'password']"));
		elementpassword.sendKeys("crmsfa");
				
		//7. Login
		WebElement elementlogin = driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']"));		
		elementlogin.click();
				
		//8. Link
		WebElement elementlink = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));		
		elementlink.click();
		
		//9. Click on leads 
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();	
		
		//10. click on phone 
		driver.findElement(By.xpath("//span[@id='ext-gen891']")).click();
		
		//11. Enter the Phone Number 
		driver.findElement(By.xpath("//input[@id='ext-gen270']")).sendKeys("9176921919");
		
		//12. Find Leads
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		
		//13. Capture lead ID of first resulting lead 
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		
		//14. click delete 
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		
		//15. Verify the message 
		WebElement Verify = driver.findElement(By.id("ext-gen437"));
		Verify.getAttribute("div");
		
		
		
		
		//16. Close the browser 
		//driver.close();
		
		
	}

}
