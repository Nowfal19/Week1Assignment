package week.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	public static void main(String[] args) {

		// Setup the browser
		WebDriverManager.chromedriver().setup();

		// WebDriverManager.edgedriver().setup();

		// OPen a chrome browser
		ChromeDriver driver = new ChromeDriver();

		// 1. Load URL to test
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Maximize the browser
		driver.manage().window().maximize();

		// 2. Find an element
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");

		WebElement elementpassword = driver.findElement(By.id("password"));
		elementpassword.sendKeys("crmsfa");

		// 3. Login
		WebElement elementlogin = driver.findElement(By.className("decorativeSubmit"));
		elementlogin.click();

		// 4. Link
		WebElement elementlink = driver.findElement(By.linkText("CRM/SFA"));
		elementlink.click();

		// 5. Lead button
		WebElement elementlead = driver.findElement(By.linkText("Leads"));
		elementlead.click();

		// 6. Create Lead
		WebElement elementcreatelead = driver.findElement(By.linkText("Create Lead"));
		elementcreatelead.click();

		// 7. Company Name
		WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("TCS");

		// 8. First Name
		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("Nowfal");

		// 9. Last Name
		WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("Ahamed");

		// 10. First Name (Local)
		WebElement firstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNameLocal.sendKeys("Noufz");

		// 11. Department feild
		WebElement departmentName = driver.findElement(By.id("createLeadForm_departmentName"));
		departmentName.sendKeys("Testing");

		// 12. Description of field
		WebElement description = driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("Automation testing using selenium");

		// 13. Email Address
		WebElement primaryEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		primaryEmail.sendKeys("nowfal.ahamed1@gmail.com");

		// 14. Create Button
		WebElement elementSubmit = driver.findElement(By.name("submitButton"));
		elementSubmit.click();

		// 15. Edit Button
		WebElement elementEditButton = driver.findElement(By.className("subMenuButton"));
		elementEditButton.click();

		// 16. Clear the description
		driver.findElement(By.id("createLeadForm_description")).clear();

		// 17. Fill ImportantNote Field
		WebElement elementImportantNote = driver.findElement(By.name("importantNote"));
		elementImportantNote.sendKeys("Selenium webDriver");
				
        //18. Update Button
		WebElement elementUpdate = driver.findElement(By.className("smallSubmit"));
		elementUpdate.click();

		// 19. Title of Webpage
		System.out.println("This is the Title of Webpage: " + driver.getTitle());

		// driver.close();

	}

}