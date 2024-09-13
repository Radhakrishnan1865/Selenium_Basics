package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Xpath_Practice {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//a[normalize-space()='Best Sellers']")).click();
		driver.findElement(By.xpath("//div[@id='B0D17XMJKQ']")).click();
		driver.findElement(By.xpath("//img[@alt='Light Pink']")).click();
		
		 WebElement select=driver.findElement(By.xpath("//*[@id='quantity']"));
		 
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		 	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By) select));
		 select.click();
		
		 Select s=new Select(select);
		 s.selectByValue("3");
		 
		 driver.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();
		//ul[@role='radiogroup']
		//div[@id='d0951469-10f8-439b-8bec-06c68d41a14b']//a[@class='a-link-normal'][normalize-space()='See all offers']

	}

}
