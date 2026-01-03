package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class KeyboardActions {
	
	public static void main(String[] args) throws InterruptedException {
		
		//setup
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		// core
		driver.findElement(By.xpath("//*[@id=\"inputText1\"]")).sendKeys("Welcome to automation!");
		
		Actions actions = new Actions(driver);
		
		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		actions.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		// teardown
		Thread.sleep(2000);
		driver.quit();
		
	}

}
