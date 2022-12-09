package week6.day2;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testNG.testNGExercise.ProjectSpecificsMetod;

public class Lead extends ProjectSpecificsMetod {
	@Test (dataProvider = "InputData")
	public void runcreateLead(String username, String password, String cname, String fname, String lname) {
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://leaftaps.com/opentaps/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.name("submitButton")).click();
		//driver.close();
	}
		@DataProvider(name="InputData")
		public String[][] sendData() {
			String[][] data = new String[2][5];
			
			data[0][0] = "DemoSalesManager";
			data[0][1] = "crmsfa";
			data[0][2] = "TestLeaf";
			data[0][3] = "Hari";
			data[0][4] = "R";
			
			data[1][0] = "DemoSalesManager";
			data[1][1] = "crmsfa";
			data[1][2] = "TestLeaf";
			data[1][3] = "Maari";
			data[1][4] = "S";
			
			return data();
		}
		private String[][] data() {
			// TODO Auto-generated method stub
			return null;
		}	
}






