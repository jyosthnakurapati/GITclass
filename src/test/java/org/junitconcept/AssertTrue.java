package org.junitconcept;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.utilities.LoginPojo;
import org.utility.BaseClass;


public class AssertTrue extends BaseClass {
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
	
	private static void closeBrowser() {
		// TODO Auto-generated method stub
		
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
	@Test
	public void tc3() throws IOException, InterruptedException{
	LoginPojo l = new LoginPojo();
	fill(l.getTxtUser(), getData(2,0));
	fill(l.getTxtPass(), getData(2,1));
	btnclick(l.getBtnLogin());
	Thread.sleep(2000);
	
	String Current = driver.getCurrentUrl();
	Assert.assertTrue("Vreify the current url of incorrect page", Current.contains("privacy"));
	System.out.println("TEST 2 IS PASSED");
	}
	private String getData(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
