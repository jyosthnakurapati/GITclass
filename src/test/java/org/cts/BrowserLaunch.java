package org.cts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utility.BaseClass;

public class BrowserLaunch extends BaseClass{
		
		public static void main(String[] args) {
		launchchrome();
		WinMax();
		loadUrl("https://www.facebook.com");
		printTitle();
		printCurrentUrl();
		
		
		WebElement txtUser = driver.findElement(By.id("email"));
	    String v = getData(5 ,4);
		fill(txtUser, v);
	    rightclick(txtUser);
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		fill(txtpass, getData(1, 2));
		
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnclick(btnLogin);
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		private static String getData(int i, int j) {
			// TODO Auto-generated method stub
			return null;
		}
}