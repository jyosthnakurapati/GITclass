package org.junitconcept;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.utilities.LoginPojo;
import org.utility.BaseClass;

public class JunitBrowserLaunch extends BaseClass {
	
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
	
	//Valid Username and invalid password
	@Test
	public void tc1() throws IOException, InterruptedException{
	LoginPojo l = new LoginPojo();
	fill(l.getTxtUser(), getData(0,0));
	fill(l.getTxtPass(), getData(0,1));
	btnclick(l.getBtnLogin());
	Thread.sleep(2000);
	}
	
	//invaid username and valid password
	@Test
	public void tc2() throws IOException, InterruptedException{
	LoginPojo l = new LoginPojo();
	fill(l.getTxtUser(), getData(1,0));
	fill(l.getTxtPass(), getData(1,1));
	btnclick(l.getBtnLogin());
	Thread.sleep(2000);
	}
	
	private String getData(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
	//valid username and valid password
	@Test
	public void tc3() throws IOException, InterruptedException{
	LoginPojo l = new LoginPojo();
	fill(l.getTxtUser(), getData(2,0));
	fill(l.getTxtPass(), getData(2,1));
	btnclick(l.getBtnLogin());
	Thread.sleep(2000);
	}



}
