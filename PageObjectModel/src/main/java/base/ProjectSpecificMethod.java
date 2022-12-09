package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcelData;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
public class ProjectSpecificMethod {
	public RemoteWebDriver driver;
	public String excelfilename;
	
	@Parameters({"url", "browserName"})
	
	@BeforeMethod
	public void bm(String url, String browserName) {
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("Please select from Chrome/Edge/Firefox");
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		System.out.println(driver);
		}
	
	@AfterMethod
	public void am() {
		//driver.close();
	}
	
	@DataProvider(name="testData")
	public String [][] sendData() throws IOException{
		String[][] data = ReadExcelData.getData(excelfilename);
		return data;
	} 

	
}
