package sanity;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Keywords.Constants;
import Keywords.Keyword;
import page.ProductListPage;

public class ProductListTests {
	@Test
	public void tc_01() {
		Keyword.openBrowser("Chrome");
		ProductListPage productList=PageFactory.initElements(Constants.driver, ProductListPage.class);
		productList.movetoProductListMenu();
		
	}
}
