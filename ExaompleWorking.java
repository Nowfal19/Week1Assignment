package week6.day2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class ExaompleWorking {

	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable Notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.get("https://www.google.co.in/");
//		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("Amazon \n");
//		Thread.sleep(5000);
//		List<WebElement> list =driver.findElements(By.xpath("//div[@class='wM6W7d']"));
//		
//		for (WebElement eachlist : list) {
//			System.out.println(eachlist.getText());
//			list.get(2);

		// Scroll to some position
		// JavascriptExecutor executor = (JavascriptExecutor) driver;
//			executor.executeScript("window.Scroll(0,450)","");
//			Thread.sleep(5000);
//			executor.executeScript("window.Scroll(0,-450)","");
//			
//			//Go to Bottom of the page
//			executor.executeScript("window.scroll(0,document.body.scrollHeight)","");
//			Thread.sleep(5000);
//			executor.executeScript("window.Scroll(0,0)","");
//			
//			//Go to a specific element position
//			executor.executeScript("arguments[0].scrollIntoView(true);","");
//			Robot robot = new Robot();
//			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//			robot.keyRelease(KeyEvent.VK_PAGE_UP);

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("document.getElementsByName('q')[0].value='Amazon'", "");
		executor.executeScript("arguments[0].value='Riya'", searchBox);
		
		driver.switchTo().activeElement();
		Robot robot =new Robot();
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_Y);
		robot.keyRelease(KeyEvent.VK_Y);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
	
		
		
		
		
		
		
		
		
		
		
	}
}
