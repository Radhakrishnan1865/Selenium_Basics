package refresh;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Refresh_WebPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.investing.com/");
	
		//using get method
		Thread.sleep(5000);
		driver.get(driver.getCurrentUrl());
		
		System.out.println("Get method succesfully");
		
		//using navigate refresh method
		
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		System.out.println("Navigate method succesfully");
		
		//using sendkeys method
		Thread.sleep(5000);
		driver.findElement(By.tagName("body")).sendKeys("F5");
		
		System.out.println("Sendkeys method succesfully");
		
		//using javascript Executer
		Thread.sleep(5000);
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("location.reload()");
		
		System.out.println("JvascriptExecuter method succesfully");
		
		Thread.sleep(5000);
		
		
		driver.close();

	}

}
