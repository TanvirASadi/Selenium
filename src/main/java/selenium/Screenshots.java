package selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// Taking screenshots of entire page
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("C:\\Users\\tanvi\\Desktop\\myeclipseprojects\\MyProject\\screenshots\\entirePage.png");
		FileUtils.copyFile(src, trg);
		
		// Taking scresnshot of a specific region
		WebElement element = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[3]"));
		File src1 = element.getScreenshotAs(OutputType.FILE);
		File trg1 = new File("C:\\Users\\tanvi\\Desktop\\myeclipseprojects\\MyProject\\screenshots\\grid.png");
		FileUtils.copyFile(src1, trg1);		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
