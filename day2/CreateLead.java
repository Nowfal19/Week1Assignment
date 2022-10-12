package week.day2;
import org.apache.commons.math3.geometry.spherical.twod.Edge;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {
		
		//Setup the browser
		WebDriverManager.chromedriver().setup();
		
		//WebDriverManager.edgedriver().setup();
		
		//OPen a chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//1. Load URL to test 
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//2. Enter Username and password 
		WebElement elementUsername = driver.findElement(By.xpath("//input[@id = 'username']"));
		elementUsername.sendKeys("Demosalesmanager");
		
		WebElement elementpassword = driver.findElement(By.xpath("//input[@id = 'password']"));
		elementpassword.sendKeys("crmsfa");
		
		//3. Login
		WebElement elementlogin = driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']"));		
		elementlogin.click();
		
		//4. Link
		WebElement elementlink = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));		
		elementlink.click();
		
		//5. Lead button	
		WebElement elementlead = driver.findElement(By.linkText("Leads"));
		elementlead.click();
		
		//6. Create Lead
		WebElement elementcreatelead = driver.findElement(By.linkText("Create Lead"));
		elementcreatelead.click();
		
		//7. Company Name
		WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("TCS");
		
		//8. First Name
		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("Nowfal");
		
		//9. Last Name
		WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("Ahamed");
		
		//10. First Name (Local)
		WebElement firstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNameLocal.sendKeys("Noufz");
	
		//11. Department feild
		WebElement departmentName = driver.findElement(By.id("createLeadForm_departmentName"));
		departmentName.sendKeys("Testing");
		
		//12. Description of field
		WebElement description = driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("Automation testing using selenium");
		
		//13. Email Address
		WebElement primaryEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		primaryEmail.sendKeys("nowfal.ahamed1@gmail.com");
		
		//14. Create Button
		WebElement elementSubmit = driver.findElement(By.className("smallSubmit"));
		elementSubmit.click();
		
		//15. Title of Webpage
		System.out.println("This is the Title of Webpage: " + driver.getTitle());
		
		//driver.close();
			
		
	}

}