import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Keywords.Constants;
import Keywords.Keyword;
@Test
public class Imp_Menus {
	public void Home() {
		Constants.driver.findElement(By.xpath("//a[text()='Home'])[1]")).click();
	}
	
	public void Department() {
		Constants.driver.findElement(By.linkText("Departments")).click();
		Constants.driver.findElement(By.xpath("(//a[@class='color0-hov'])[2]"));
		
	}
	
	public void ProductList() {
		WebElement pl=Constants.driver.findElement(By.xpath("//a[text()='Product List'])[3]"));
		Keyword.mouseHoverOn(pl);
		
	}
	
	public void contact_Us() {
		Constants.driver.findElement(By.xpath("(//a[@class='color0-hov'])[3]"));
		
	}
	
	

}
