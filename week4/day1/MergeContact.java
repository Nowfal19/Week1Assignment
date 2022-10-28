package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {
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
	driver.get("http://leaftaps.com/opentaps/control/login");

	//6. Type Username
	driver.findElement(By.xpath("(//input[@class='inputLogin'])[1]")).sendKeys("demosalesmanager");
	
	//7. Type Password
	driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
	
	//8. Click Login
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	
	//9. Click Link
	driver.findElement(By.xpath("//div[@for='crmsfa']//a[1]")).click();
	
	//10. Click on Contacts
	driver.findElement(By.xpath("(//div[@class='x-panel-header']//a)[3]")).click();
	
	//11. Click Merge contacts
	driver.findElement(By.xpath("//a[@href='/crmsfa/control/mergeContactsForm']")).click();
	
	//12. From contact
	driver.findElement(By.xpath("//input[@name='ComboBox_partyIdFrom']")).sendKeys("9008567866");
	
	//13. To contact
	driver.findElement(By.xpath("//input[@name='ComboBox_partyIdTo']")).sendKeys("9008567866");
	
	//14. Merge 
	driver.findElement(By.linkText("Merge")).click();
	
	//15.Alert
	Alert alert = driver.switchTo().alert();
	alert.accept();
	
	//16. Verify the title of the page 
	String title = driver.getTitle();
	System.out.println(title);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}
