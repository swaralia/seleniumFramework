package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Keywords.Constants;
import Keywords.Keyword;
@FindBy(how=How.XPATH,using="")
public class ProductListPage {
	private WebElement productListMenu;
	//this.productListMenu=productListMenu;

public void setProductListMenu() {
	this.productListMenu=productListMenu;
}
public ProductListPage movetoProductListMenu (){
	//productListMenu=Constants.driver.findElement(By.xpath(""));
	Keyword.mouseHoverOn(productListMenu);
	return new ProductListPage();
	}
public String getTextOfProductListMenu() {
	return productListMenu.getText();
}
	
	
	

}
