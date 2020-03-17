package Main_Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Keywords.Constants;
import Keywords.Keyword;

public class Department {
	public static void BedCot() throws InterruptedException  {
		Thread.sleep(3000);
	
		WebElement bc=Constants.driver.findElement(By.xpath("//img[@src='https://firebasestorage.googleapis.com/v0/b/shpping-project.appspot.com/o/Rohit_icon_compress%2Fbed.png?alt=media&token=4bf158d0-0309-47fe-a5bd-238498514ae4'][2]"));
		Keyword.mouseHoverOn(bc);
		Keyword.clickOnElement("XPATH","(//img[@src='https://firebasestorage.googleapis.com/v0/b/shpping-project.appspot.com/o/Rohit_icon_compress%2Fbed.png?alt=media&token=4bf158d0-0309-47fe-a5bd-238498514ae4'][2])");
	 
		
	}
	public void CupBoard() {
		WebElement Cb=Constants.driver.findElement(By.xpath("//img[@src='https://firebasestorage.googleapis.com/v0/b/shpping-project.appspot.com/o/Rohit_icon_compress%2Fcupboard.png?alt=media&token=c8da8cd0-ca73-4432-b789-c126384964f1'][2]"));
		Keyword.mouseHoverOn(Cb);
		
		
	}
	public void Chair() {
		WebElement Chair=Constants.driver.findElement(By.xpath("//img[@src='https://firebasestorage.googleapis.com/v0/b/shpping-project.appspot.com/o/Rohit_icon_compress%2Fchair.png?alt=media&token=3cf8627c-590b-4cf1-9707-9905c23526b0'][2]"));
		Keyword.mouseHoverOn(Chair);
		
		
	}
	public void BeanBag() {
		WebElement Bb=Constants.driver.findElement(By.xpath("//img[@src='https://firebasestorage.googleapis.com/v0/b/shpping-project.appspot.com/o/Rohit_icon_compress%2Fbeanbags.png?alt=media&token=1452f6b4-063f-4be2-898c-421e612fd453'][2]"));
		Keyword.mouseHoverOn(Bb);
		
		
	}
	public void WhiteBoard() {
		WebElement Wb=Constants.driver.findElement(By.xpath("//img[@src='https://firebasestorage.googleapis.com/v0/b/shpping-project.appspot.com/o/Rohit_icon_compress%2Fwhiteboard.png?alt=media&token=59aab436-240e-499d-aca4-6924cb264ae8'][2]"));
		Keyword.mouseHoverOn(Wb);
		
		
	}
	public void LaptopTable() {
		WebElement Lt=Constants.driver.findElement(By.xpath("//img[@src='https://firebasestorage.googleapis.com/v0/b/shpping-project.appspot.com/o/Rohit_icon_compress%2Fwhiteboard.png?alt=media&token=59aab436-240e-499d-aca4-6924cb264ae8'][2]"));
		Keyword.mouseHoverOn(Lt);
		
		
	
}
}



