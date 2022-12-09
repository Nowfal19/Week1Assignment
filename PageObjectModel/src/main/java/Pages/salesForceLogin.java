package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class salesForceLogin extends ProjectSpecificMethod {
public salesForceLogin (RemoteWebDriver receivedDriver) {
	this.driver=receivedDriver;
}
public salesForceLogin enterUserName(String userName) {
	System.out.println("Driver from Login Page "+ driver);
	driver.findElement(By.id("username")).sendKeys(userName);
	return this;
}
public salesForceLogin enterPassword(String password) {
	driver.findElement(By.id("password")).sendKeys(password);
	return this;
}
public welcomePage clickLoginButton() {
	driver.findElement(By.id("Login")).click();
	return new welcomePage(driver);
	
}

	}

