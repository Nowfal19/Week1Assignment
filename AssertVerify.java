package week6.day2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertVerify {

//@Test
//public void assertTest() {
//	// Hard Assertion
//	System.out.println("Before Assertion");
//	Assert.fail();
//	System.out.println("After Assertion");
//
//	@Test
//	public void assertTest1() {
//		// Soft Assertion
//		SoftAssert assert1 = new SoftAssert();
//		System.out.println("Before Assertion");
//		assert1.fail();
//		System.out.println("After Assertion");
	
@Test(timeOut=2000)
public void parentsPermission() throws InterruptedException {
	Thread.sleep(3000);
	System.out.println("Permission Given");
}

@Test(dependsOnMethods="ParentsPermission",alwaysRun=true)
public void loveMarraige() {
	System.out.println("Marraige Happened");
}

}
