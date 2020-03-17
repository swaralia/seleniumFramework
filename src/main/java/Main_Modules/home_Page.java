package Main_Modules;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Keywords.Constants;
import Keywords.Keyword;

public class home_Page {
	@Test
	public void TC_02_Verify_menuItems() {
		String[]expMenuItems= {"HOME","DEPARTMENT","PRODUCTLIST","CONTACTUS"};
		Keyword.openBrowser("chrome");
		Keyword.openUrl("https://eagercrow.com/Home");
		List<WebElement> subitems=(List<WebElement>) Constants.driver.findElement(By.xpath("xpath of menu items bar"));
		ArrayList<String>ActualTexts=new ArrayList<String>();
		Iterator itr=subitems.iterator();
		while(itr.hasNext()){
			ActualTexts.add((String) itr.next().);
			String Text=ActualTexts.
			
}
		@Test
		public void Sign_In_Email() {
			Constants.driver.findElement(By.xpath("//input[@type='email']")).sendKeys("priyankadighe2224@gmail.com");
			Constants.driver.findElement(By.xpath("//button[@type='submit']")).click();
			Constants.driver.findElement(By.xpath("//input[@name='password']")).sendKeys("priyanka");
			Constants.driver.findElement(By.xpath("//button[@type='submit']")).click(); 
			
			
		}
	}
