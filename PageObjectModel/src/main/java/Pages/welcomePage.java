package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class welcomePage extends ProjectSpecificMethod {
	public welcomePage (RemoteWebDriver receivedDriver) {
		this.driver=receivedDriver;
	}
public welcomePage clickGlobalSvgIcon () {
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	return this; 
}
public welcomePage clickViewAllButton() {
	driver.findElement(By.xpath("//button[text()='View All']")).click();
    return this;
}
public welcomePage typeContentSearchbox() {
	driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("content");
    return this;
}
public salesPage clickSales() {
	driver.findElement(By.xpath("(//p[@class='slds-truncate']/mark)[3]")).sendKeys("content");
    return new salesPage(driver);
}
	}


