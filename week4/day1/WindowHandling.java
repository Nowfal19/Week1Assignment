package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
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
		driver.get("https://www.irctc.co.in/");
			
		//6. click flight 
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.air.irctc.co.in']")).click();
		
		//7. Window handles 
		//String windowHandle = driver.getWindowHandle();
		Set<String> windowHandle = driver.getWindowHandles();
		List<String> listHandle = new ArrayList<String>(windowHandle);
		driver.switchTo().window(listHandle.get(1));
		String Window2 = driver.getTitle();
		System.out.println(Window2);
		String text = driver.findElement(By.xpath("(//label[@class='form-check-label'])[1]")).getText();
		System.out.println(text);
		driver.close();
		
		driver.switchTo().window(listHandle.get(0));
		String Window1 = driver.getTitle();
		System.out.println(Window1);
		driver.close();
		 		
	}

}
