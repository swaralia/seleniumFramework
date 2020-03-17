package Keywords;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Keyword {
public static void openBrowser(String browserName) {
		switch(browserName) 
		{
		case "chrome":
		WebDriverManager.chromedriver().setup();
		Constants.driver=new ChromeDriver();
		break;
		
		case "Firefox":
		WebDriverManager.firefoxdriver().setup();;
		Constants.driver=new FirefoxDriver();
		
		break;
		
		case "IE":
		WebDriverManager.chromedriver().setup();
		Constants.driver =new InternetExplorerDriver();
		break;
		default:
		System.out.println("invalid browser name");
	
		}
	}
	
	public static void openUrl(String urlName)
	{
		Constants.driver.get(urlName);
		
	}
	public static WebElement getWebElement(String locatorType,String locatorValue) {
		
	WebElement element=null;
		switch(locatorType) {
		case "XPATH":
			element=Constants.driver.findElement(By.xpath(locatorValue));
			break;
			
		case "CSS":
			element=Constants.driver.findElement(By.cssSelector(locatorValue));
			break;
			
		case "ID":
			element=Constants.driver.findElement(By.id(locatorValue));
			break;
			
		case "NAME":
			element=Constants.driver.findElement(By.name(locatorValue));
			break;
			
		case "CLASS":
			element=Constants.driver.findElement(By.className(locatorValue));
			break;
			
		case "PARTIAL LINK TEXT":
			element=Constants.driver.findElement(By.partialLinkText(locatorValue));
			break;
			
			default:
				System.out.println("Invalid Locator");
				break;
			
			}
	return element;
	
	}
public static void clickOnElement(String locatorType,String locatorValue ) {
	getWebElement(locatorType,locatorValue).click();
	
}
public static void enterText(String locatorType,String locatorValue,String textToEnter) {
	
	getWebElement(locatorType,locatorValue).sendKeys(textToEnter);
}
public static String getText(String locatorType,String locatorValue) {
	
	getWebElement(locatorType,locatorValue).getText();
	return null;
}
/*public static String[] getText(String locatorType,String locatorValue) {
	
	getWebElement(locatorType,locatorValue).getText();
	return null;
}*/

	
public static void maximizeBrowser() {
	Constants.driver.manage().window().maximize();
	
}
public static void closeBrowser() {
	Constants.driver.close();
}
public static void closeAllBrowser() {
	Constants.driver.quit();
	
}
public static void mouseHoverOn(WebElement element) {
	Actions action=new Actions(Constants.driver);
	action.moveToElement(element).build().perform();
}

public static void acceptAlert() {
	 Alert alert = Constants.driver.switchTo().alert();
	 
	 alert.accept();
	 
  }
public static void rejecttAlert() {
	 Alert alert = Constants.driver.switchTo().alert();	
	 alert.dismiss();
}
public static void typeTextIntoAlert() {
	 Alert alert = Constants.driver.switchTo().alert();	
	 alert.sendKeys("swara");
}
public getProductPrice()


}

	




