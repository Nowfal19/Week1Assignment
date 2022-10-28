package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {
	public static void main(String[] args) throws InterruptedException {

		// 1.setup the path
		WebDriverManager.chromedriver().setup();

		// 2.disable notifications
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);

		// 3.Maximize the browser
		driver.manage().window().maximize();

		// 4. Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// 5. Load URL
		driver.get("https://www.nykaa.com/");

		// 6. Mouse Hover search
		WebElement Search = driver.findElement(By.xpath("//input[@placeholder='Search on Nykaa']"));
		Search.click();
		Search.sendKeys("L'Oreal Paris" + Keys.ENTER);

		// 7. Get Title
		String title = driver.getTitle();
		System.out.println(title);

		// 8. Sort by top rated
		driver.findElement(By.xpath("//button[@class=' css-n0ptfk']")).click();

		// 9. Customer top rated
		driver.findElement(By.xpath("//span[text()='customer top rated']/following::div")).click();

		// 10. Category
		driver.findElement(By.xpath("//div[@class='css-w2222k']//div")).click(); // category
		driver.findElement(By.xpath("(//div[@class=' css-b5p5ep'])[1]")).click(); // Hair
		driver.findElement(By.xpath("(//div[@class=' css-b5p5ep']//span)[2]")).click(); // Hair care
		driver.findElement(By.xpath("(//label[@class='control control-checkbox']//div)[2]")).click(); // Shampoo
		driver.findElement(By.xpath("//span[text()='Concern']/following::*[@class='arrow-icon'][1]")).click(); // Concern
		driver.findElement(By.xpath(
				"//label[@for='checkbox_Color Protection_10764']//following::div[@class='control-indicator checkbox ']"))
				.click();

		// 11.Click on L'Oreal Paris Colour Protect Shampoo
		driver.findElement(By.xpath("//button[text()='Preview Size']")).click();

		// 12. GO to the new window and select size as 175ml
		driver.findElement(By.xpath("//label[@class='active control css-9bkcvr']//div")).click(); // 175ml
		driver.findElement(By.xpath("//button[contains(text(),'View Details')]")).click(); // View Details
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> ListHandle = new ArrayList<String>(windowHandles);
		driver.switchTo().window(ListHandle.get(1));

		// 13. Print the MRP of the product
		WebElement Mrp = driver.findElement(By.xpath("(//span[@class='css-1jczs19'])[1]"));
		System.out.println("Ordered Rupees: " + Mrp.getText());

		// 14. Click on ADD to BAG
		driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();

		// 15. Go to Shopping Bag
		driver.findElement(By.xpath("//button[@class='css-g4vs13']")).click();

		// 16. Print the Grand Total amount customIframeCart
		driver.switchTo().frame(0);
		WebElement GrandTotal = driver.findElement(By.xpath("(//div[@class='css-11m81vr e1d9ugpt3'])[3]"));
		System.out.println("Amount shows in cart: " + GrandTotal.getText());

		// 17. Click Proceed driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("//span[@class=' css-11uq07x e171rb9k3']")).click();

		// 18. Click on Continue as Guest
		driver.findElement(By.xpath("//button[@class='btn full big']")).click();

		// 19. Check if this grand total is the same in step 14
		if (GrandTotal.equals(Mrp)) {
			System.out.println("The Grand total is same as MRP");
		} else {
			System.out.println("The Grand total is not same as MRP");
		}
		// 20. Close all windows
		driver.quit();


	}
}
