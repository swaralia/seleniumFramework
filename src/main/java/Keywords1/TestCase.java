package Keywords1;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import FileUtility.properties_File;
import Keywords.Constants;
import Keywords.Keyword;
import junit.framework.Assert;

public class TestCase{
	@Test
	public void tc_keyword() throws InterruptedException, FileNotFoundException {
		Keyword.openBrowser("chrome");
		Keyword.openUrl("https://eagercrow.com/Home");
		Keyword.enterText("XPATH", properties_File.getProperty("email"), "swara");
		Keyword.getWebElement("XPATH","(//a[@class='color0-hov'])[2]").click();
		Keyword.clickOnElement("XPATH", properties_File.getProperty("home"));
		Keyword.clickOnElement("XPATH",  properties_File.getProperty("department"));
		Keyword.clickOnElement("XPATH", properties_File.getProperty("ProductList"));
		Keyword.getText("XPATH", "(//[@class='title text-center bg-text']");
		//Keyword.clickOnElement("XPATH","//a[@class='color0-hov selected']");
		WebElement element=Constants.driver.findElement(By.xpath("//img[@src=../../../assets/7.png"));	
		Keyword.mouseHoverOn(element);
		System.out.println("contact us");
		Keyword.closeAllBrowser();
		
		//Keyword.clickOnElement("XPATH", "//div[@class='text___Text-sc-1t2ribu-0-div eDCXdp']");
		}


@Test
public void  tc_invalidUnamePassword() throws FileNotFoundException
{
	Keyword.openBrowser("chrome");
	String expected="invalid uname and pass ";
	Keyword.openUrl("https://eagercrow.com/Home");
	Keyword.enterText("XPATH", properties_File.getProperty("uname"), "swaralia");
	Keyword.enterText("XPATH", properties_File.getProperty("pass"), "swara@123");
	Keyword.clickOnElement("XPATH", properties_File.getProperty("sign in"));
	String actual=Keyword.getText("XPATH","//div@id=erroMsg");
	Assert.assertEquals(actual, expected);
	
}

@Test
public void  tc_validUnamePassword() throws FileNotFoundException
{
	Keyword.openBrowser("chrome");
	Keyword.openUrl("https://eagercrow.com/Home");
	Keyword.enterText("XPATH", properties_File.getProperty("uname"), "swaralia");
	Keyword.enterText("XPATH", properties_File.getProperty("pass"), "swara@123");
	Keyword.clickOnElement("XPATH", properties_File.getProperty("sign in"));

}

}


