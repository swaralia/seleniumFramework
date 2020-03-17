package Main_Modules;

import Keywords.Keyword;

public class Contact_us {
	public void click_Message_Button() {
		Keyword.clickOnElement("XPATH","div[@class='text_Text-sc-\t2ribu-0-div ed cxdp'");
	}
	public void type_Message() {
		Keyword.enterText("XPATH", "//", "we are happy");
	}

}
