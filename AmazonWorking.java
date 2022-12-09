package week6.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonWorking {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeOptions ch =new ChromeOptions();
	ch.addArguments("--disable-notifications");
	ChromeDriver driver = new ChromeDriver(ch);
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.amazon.in/");
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple watch"+Keys.ENTER);
	
	List<WebElement> watchList = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	for (WebElement eachWatch : watchList) {
		System.out.println(eachWatch.getText());
	}
	
	driver.close();
}	
}
