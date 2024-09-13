package screenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotsDemo {

	public static void main(String[] args) throws IOException {
		
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		TakesScreenshot screenshot= (TakesScreenshot) driver;
		File source= screenshot.getScreenshotAs(OutputType.FILE);
		
		File desg= new File("E:\\New folder\\Amazon.png");
		FileUtils.copyFile(source, desg);
		
		
		System.out.println("Screenshot take successfully");
		
		
		WebElement puthar= driver.findElement(By.xpath("//*[@alt='ascension Polyresin Sitting Buddha Idol Statue Showpiece for Home & Office Decoration Buddha Statue for Living Spaces...']"));
		

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@alt='ascension Polyresin Sitting Buddha Idol Statue Showpiece for Home & Office Decoration Buddha Statue for Living Spaces...']")));
		TakesScreenshot ts=(TakesScreenshot)puthar;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File des= new File("E:\\New folder\\Amazon.png");
		FileUtils.copyFile(src, des);
		
		System.out.println("Take image screenshot successfully");
	}

}
