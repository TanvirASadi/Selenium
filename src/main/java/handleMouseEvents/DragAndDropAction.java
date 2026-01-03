package handleMouseEvents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement bankValuElement = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement bankElement = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement bankPlaceholerElement = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		WebElement bankValuePlaceholerElement = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		
		
		WebElement crediValueElement = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement creditElement = driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement creditValuePlaceholderElement = driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		WebElement creditPlaceholderElement = driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		actions.dragAndDrop(bankElement, bankPlaceholerElement).perform();
		Thread.sleep(2000);
		actions.dragAndDrop(bankValuElement, bankValuePlaceholerElement).perform();
		Thread.sleep(2000);
		
		actions.dragAndDrop(creditElement, creditPlaceholderElement).perform();
		Thread.sleep(2000);
		actions.dragAndDrop(crediValueElement, creditValuePlaceholderElement).perform();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
