package xpath;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKart {

	public static void main(String[] args){

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		// element
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement ele=	driver.findElement(By.xpath("//*[text()='Beauty, Food, Toys & more']"));
		Wait<WebDriver> fw=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(ElementClickInterceptedException.class);

		//visible, cli
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.re
		ele.click();

		WebElement ele1= driver.findElement(By.xpath("//*[contains(text(),'Coffee Powder')]"));
		Wait<WebDriver> fw1=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(StaleElementReferenceException.class);


		ele1.click();
		driver.findElement(By.xpath("//div[@data-id='CFEFYW77E8H9ZRAT']")).click();

		String ParentWindow= driver.getWindowHandle();
		ParentWindow.toString();
		System.out.println(ParentWindow);

		Set<String> windows= driver.getWindowHandles();
		int windowSize=	windows.size();
		System.out.println(windowSize);

		String s= windows.toString();
		System.out.println(s);


		for (String string : windows) {
			
			if(!ParentWindow.equalsIgnoreCase(string)) {
				driver.switchTo().window(string);
			}
		}

		System.out.println("Test Excecute Sucessfully");

	}

}
