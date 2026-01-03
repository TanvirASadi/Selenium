package selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement chkbxSundayElement = driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[4]/div[1]"));
		boolean elementSelected = chkbxSundayElement.isSelected();
		System.out.println(elementSelected);
		
		if(elementSelected==false) {
			chkbxSundayElement.click();
		}	
		
		Thread.sleep(1000);
		driver.quit();
		
	}

}
