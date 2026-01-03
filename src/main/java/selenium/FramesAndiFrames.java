package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAndiFrames {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//*[@id=\"id1\"]/div/input")).sendKeys("11111");
		driver.switchTo().defaultContent();
		
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//*[@id=\"id3\"]/div/input")).sendKeys("33333");
		
		WebElement iframe = driver.findElement(By.xpath("/html/body/center/iframe"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//*[@id=\"i5\"]/div[3]/div")).click();
		driver.switchTo().defaultContent();
		
		WebElement frame4 = driver.findElement(By.xpath("/html/frameset/frameset/frame[3]"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.xpath("//*[@id=\"id4\"]/div/input")).sendKeys("44444");
	
		Thread.sleep(3000);
		driver.quit();
	}

}
