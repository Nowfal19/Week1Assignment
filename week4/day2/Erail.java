package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {
	public static void main(String[] args) {

		// 1.setup the path
		WebDriverManager.chromedriver().setup();

		// 2.disable notifications
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);

		// 3.Maximize the browser
		driver.manage().window().maximize();

		// 4. Implicitily wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// 5. Load URL
		driver.get("https://erail.in/");

		// 6. fill from and to
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("ms" + Keys.TAB);

		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("mdu" + Keys.TAB);

		driver.findElement(By.xpath("//label[@for='chkSelectDateOnly']/following-sibling::input")).click();

		// 7. WebTable
		List<WebElement> tablerows = driver.findElements(
				By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr"));
		System.out.println(tablerows.size());

		List<String> allTrainNames = new ArrayList<String>();
		System.out.println("Train"+ allTrainNames.size());
		Set<String> removedDupTrainname = new LinkedHashSet<String>();

		for (String eachTrainName : removedDupTrainname) {
			if (!removedDupTrainname.add(eachTrainName)) {
				System.out.println(eachTrainName);
			}
		}
	}
}
