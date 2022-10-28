package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {
	public static void main(String[] args) {

		// Initial Setup
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// 1. Launch the URL 
		driver.get("https://leafground.com/drag.xhtml;jsessionid=node092tzjoj3mq393l8qlrlk0mcs397332.node0");
		
		//2. Click and Drag
		WebElement xLocation = driver.findElement(By.xpath("//div[@id='form:conpnl']//div[1]"));
		Actions builder =new Actions(driver);
        builder.clickAndHold(xLocation).moveByOffset(300,20).release().perform();
        
        //3. Drap and drop   
        WebElement source = driver.findElement(By.xpath("//div[@id='form:drag_content']"));
        WebElement Target = driver.findElement(By.xpath("//p[@class='ui-widget-header']"));
        builder.dragAndDrop(source, Target).perform();
        
        //4. Changing column 
        WebElement x = driver.findElement(By.xpath("(//span[text()='Category'])[1]"));
        WebElement y = driver.findElement(By.xpath("(//span[text()='Quantity'])[1]"));
        Point location = x.getLocation();
        System.out.println(location);
        builder.dragAndDrop(x, y).perform();
        
        //5. Change rows   
//        List<WebElement> list = driver.findElements(By.xpath("//tbody[@id='form:j_idt111_data']//tr"));
//        list.size();
        WebElement item4 = driver.findElement(By.xpath("//tbody[@id='form:j_idt111_data']//tr[4]"));
        WebElement item1 = driver.findElement(By.xpath("//tbody[@id='form:j_idt111_data']//tr[2]"));
        
        Point location4 = item4.getLocation();
        int x1 = location4.getX();
        int y1 = location4.getY();
        System.out.println(location4);
        
        //builder.dragAndDropBy(item1, x1, y1).release(item1).perform();
        
        builder.clickAndHold(item1).moveByOffset(x1, y1).release().perform();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}
}
