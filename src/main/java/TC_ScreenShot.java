import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
@Test
public class TC_ScreenShot {
	public void TakeScreenshot() throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://eagercrow.com/Home");
	AShot ash=new AShot();
	BufferedImage image=ash.shootingStrategy(ShootingStrategies.viewportPasting(3000)).takeScreenshot(driver).getImage();
	ImageIO.write(image, "JPG", new File("usingashot1.jpg"));
	driver.close();

}
}

