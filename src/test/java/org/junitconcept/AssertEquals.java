package org.junitconcept;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.utilities.LoginPojo;
import org.utility.BaseClass;

public class AssertEquals extends BaseClass {
	@BeforeClass
	public static void browserLaunch() {
		launchchrome();
		WinMax();
		loadUrl("https://www.facebook.com");
		
	}
	@AfterClass
	public static void browserClose() {
		closeBrowser();
		}
		
	
	@Before
	public void startTime() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@After
	public void endTime() {
		Date d = new Date();
		System.out.println(d);
	}
	public void tc1() throws IOException, InterruptedException{
		
		String expect = "Log in to Facebook";
		
	LoginPojo l = new LoginPojo();
	fill(l.getTxtUser(), getData(0,0));
	fill(l.getTxtPass(), getData(0,1));
	btnclick(l.getBtnLogin());
	Thread.sleep(2000);
	
	String act = driver.getTitle();
	Assert.assertEquals("verify the title", expect);
	System.out.println("Test 1 is Passed");

}
	
	private String getData(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
	private static void closeBrowser() {
		// TODO Auto-generated method stub
		
	}
}