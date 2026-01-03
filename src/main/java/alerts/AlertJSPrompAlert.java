package alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJSPrompAlert {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Hello world!");
		alert.accept();
	//	alert.dismiss();
		String messageString = driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
		
		System.out.println(messageString);
		Thread.sleep(2000);
		driver.quit();
		
	}

}
