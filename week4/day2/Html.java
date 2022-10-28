package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Html {
	public static void main(String[] args) {

		// Initial Setup
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// 1. Launch the URL 
		driver.get("https://html.com/tags/table/");
		
		//2. Get the count of number of rows
		List<WebElement> numberofRows = driver.findElements(By.xpath("//div[@class='related-pages']//tr"));
		int rowCount = numberofRows.size();
		System.out.println("Number of Rows: "+ rowCount);
		
		//3. Get the count of number of columns
		List<WebElement> numberofColumns = driver.findElements(By.xpath("//div[@class='related-pages']//th"));
		int columnCount = numberofColumns.size();
		System.out.println("Number of Columns: "+ columnCount);
	}
}
