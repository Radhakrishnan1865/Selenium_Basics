package javaScriptExcecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_Scroll {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");

		Dimension size= driver.manage().window().getSize();
		System.out.println(size);
		int height= size.getHeight();
		int width= size.getWidth();

		System.out.println(height);
		System.out.println(width);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,700)");
		
		for(int i=0; i<2; i++) {
			
			js.executeScript("window.scrollBy(0,700)");
			Thread.sleep(2000);
		}
		
		for(int j=0; j<2; j++) {
			
			js.executeScript("window.scrollBy(0,-700)");
			Thread.sleep(2000);
		}

		WebElement w= driver.findElement(By.xpath("//a[text()='Facebook']"));
		js.executeScript("arguments[0].scrollIntoView(true)",w);
		w.click();

	}
}
