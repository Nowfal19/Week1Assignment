package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittogarh {
	public static void main(String[] args) {

		// Initial Setup
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// 1. Launch the URL https://www.chittorgarh.com/
		driver.get("https://www.chittorgarh.com/");

		// 2. Click on stock market
		driver.findElement(By.xpath("//a[@title='Stock Market']")).click();

		// 3. Click on NSE bulk Deals
		driver.findElement(By.xpath("(//a[@href='/newportal/stock-nse-bulk-deals.asp'])[1]")).click();

		// 4. Get all the Security names

		List<WebElement> listofNames = driver
				.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//td[3]"));
		List<String> List = new ArrayList<String>();
		System.out.println("Total size of list: " + listofNames.size());

		for (WebElement each : listofNames) {
			String securityNamesinList = each.getText();
			// System.out.println(securityNamesinList);
			List.add(securityNamesinList);
		}
		System.out.println(List);
		Set<String> set = new LinkedHashSet<String>(List);
		System.out.println(set.size());

		// 5. Ensure whether there are duplicate Security names
		if (List == set) {
			System.out.println("Duplicates not found");
		} else {
			System.out.println("Duplicates found ");
		}

	}
}
