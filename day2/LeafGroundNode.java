package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundNode {
	public static void main(String[] args) throws InterruptedException {
		
	// 1. Setting up the Driver
	WebDriverManager.chromedriver().setup();
	
	// 2. Open a Chrome Browser
	ChromeDriver driver = new ChromeDriver();
	
	// 3. Load URL to test
	driver.get("https://www.leafground.com/button.xhtml;jsessionid=node01uwse2e3mjhu41g6ob84cjmhcy363172.node0");
	
	// 4. Maximize the browser
	driver.manage().window().maximize();

	// 5. Add implict wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    //6. Click and confirm 
	driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']"));
	
	//7. Conform if button disabled
	//driver.findElement(By.xpath(null))
	
	//8.Position of Submit button
	WebElement getposition = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]"));
	//getposition.click();
	Point location = getposition.getLocation();
	System.out.println(location);

	//9. Save the color
	WebElement colorButton = driver.findElement(By.className("//span[text()='Save']"));
	//colorButton.click();
	String color = colorButton.getCssValue("backgroundColor");
	System.out.println(color);
	
	//10. Height and Width
	WebElement SizeButton = driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
	int height = SizeButton.getSize().getHeight();
	int width = SizeButton.getSize().getWidth();
	
	//11.
	
	
	
	
	
}
}