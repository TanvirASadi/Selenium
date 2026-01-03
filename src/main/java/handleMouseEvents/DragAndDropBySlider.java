package handleMouseEvents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBySlider {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/#google_vignette");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement startingElement = driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		//System.out.println(startingElement.getLocation());
		WebElement endingElement = driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
		System.out.println(endingElement.getLocation());
		
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(startingElement, 300, 0).perform();
		//System.out.println(startingElement.getLocation());
		actions.dragAndDropBy(endingElement, -200, 0).perform();
		System.out.println(endingElement.getLocation());

		Thread.sleep(3000);
		driver.quit();
	}

}
