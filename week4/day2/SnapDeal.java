package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {
	public static void main(String[] args) throws IOException, InterruptedException {

		// Initial Setup
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// 1.Launch
		driver.get("https://www.snapdeal.com/");

		// 2. Go to Mens Fashion
		driver.findElement(By.xpath("(//span[@class='catText'])[1]")).click();

		// 3. Go to Sports Shoes
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();

		// 4. Get the count of the sports shoes
		WebElement CountofShoes = driver
				.findElement(By.xpath("//div[text()='Sports Shoes for Men']/following-sibling::div"));
		System.out.println("The Number of Sport shoes is: " + CountofShoes.getText());

		// 5. Click Training shoes
		driver.findElement(By.xpath("(//div[text()='Training Shoes'])[1]")).click();

		// 6. Sort by Low to High
		driver.findElement(By.xpath("//div[text()[normalize-space()='Popularity']]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-sorttype='plrty']/following-sibling::li[1]")).click();

		// 7. Check if the items displayed are sorted correctly
		// Capture the values to List
		List<WebElement> beforeSorting = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		System.out.println(beforeSorting.size());

//		for (WebElement p : beforeSorting) {
//			Thread.sleep(2000);
//			String price = (p.getAttribute("data-price"));
//			System.out.println(price);
//		}

		// 8.Select the price range (900-1200)
		WebElement startRange = driver.findElement(By.xpath("//div[@class='price-text-box']//input[1]"));
		startRange.clear();
		startRange.sendKeys("900");
		WebElement endRange = driver.findElement(By.xpath("(//div[@class='price-text-box']//input)[2]"));
		endRange.clear();
		endRange.sendKeys("1200");
		driver.findElement(By.xpath("//div[contains(@class,'price-go-arrow btn')]")).click();

		// 9.Filter with color Navy (err)
		// driver.findElement(By.xpath("//input[@id='Color_s-Blue']/following-sibling::label[1]")).click();
		// driver.findElement(By.xpath("//input[@value='Navy']/following-sibling::label[1]")).click();

		// 10 verify the all applied filters

		// 11. Mouse Hover on first resulting Training shoes
		WebElement eleclick = driver.findElement(By.xpath("//p[@title='Force 10 By Liberty Yellow Sports Shoes']"));
		Actions builder = new Actions(driver);

		// 12. click QuickView button
		// mouse hover
		builder.moveToElement(eleclick).perform();
		// element.click();
		driver.findElement(By.xpath("//div[@class='clearfix row-disc']/div")).click();

		// 13. Print the cost and the discount percentage
		String text = driver.findElement(By.xpath("(//span[@class='lfloat product-price'])[1]")).getText();
		System.out.println("The Cost of the product: " + text);
		String text1 = driver.findElement(By.xpath("(//div[@class='product-price pdp-e-i-PAY-l clearfix']/span)[2]"))
				.getText();
		System.out.println("The Discount of the product: " + text1);

		// 14. Take the snapshot of the shoes.
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		File sourceFile = screenShot.getScreenshotAs(OutputType.FILE);
		File destinationfile = new File("D:\\sample.png");
		FileHandler.copy(sourceFile, destinationfile);
		System.out.println("Screenshot captured");

		// 15. Close the current window
		//driver.close();
		
		// 16. Close the main window
		driver.switchTo().defaultContent();
	}
}
