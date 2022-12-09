package week6.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowWorking {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable Notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/window.xhtml");
		
		//click and conform new window open 
		
//		WebElement newWindow = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]"));
//		newWindow.click();
//		Set<String> windowHandles = driver.getWindowHandles();
//		List<String> list = new ArrayList<String>(windowHandles);
//		String firstWindow = list.get(1);
//		String secondWindow = list.get(2);
//		driver.switchTo().window(secondWindow);
		
		//Close all window except primary
		
//		WebElement newWindow = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]"));
//		newWindow.click();
//		Set<String> windowHandles = driver.getWindowHandles();
//		//List<String> list = new ArrayList<String>(windowHandles);
//		//String w1 = list.get(1);
//		for (String each : windowHandles) {
//			driver.switchTo().window(each);
//			driver.close();
//		}
//		driver.switchTo().defaultContent();
		
		//Find the number of window opened
		int window = 0;
		WebElement newWindow = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]"));
		newWindow.click();
		Set<String> windowHandles = driver.getWindowHandles();
		//List<String> list = new ArrayList<String>(windowHandles);
		//String w1 = list.get(1);
		for (String each : windowHandles) {
			driver.switchTo().window(each);
			
			System.out.println(driver.getWindowHandles().size());
			driver.close();
		}
		
	}

}
