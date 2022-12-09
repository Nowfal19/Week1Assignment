package cases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.salesForceLogin;
import base.ProjectSpecificMethod;

public class createLeadTest extends ProjectSpecificMethod {
	@BeforeTest
	public void setData() {
		excelfilename = "sf001";
	}

	@Test(dataProvider = "testData")
	public void runCreateLead(String Username, String Password) {
		System.out.println("This driver from @Test " + driver);
		salesForceLogin pg = new salesForceLogin(driver);
		pg.enterUserName(Username).enterPassword(Password).clickLoginButton().clickGlobalSvgIcon().
		clickViewAllButton().typeContentSearchbox().clickSales();
	}
}
