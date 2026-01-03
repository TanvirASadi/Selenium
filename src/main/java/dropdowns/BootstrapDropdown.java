package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/button")).click();
		List<WebElement> myList = driver.findElements(By.xpath("//label[@class='checkbox']"));
		
		for(WebElement currentElement:myList) {
			if(!(currentElement.isSelected())) {
				if(currentElement.getText().equalsIgnoreCase("Java")) {
					currentElement.click();
				}
			}
		}
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
