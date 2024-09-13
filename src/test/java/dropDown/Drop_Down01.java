package dropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_Down01 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement element=	driver.findElement(By.xpath("//*[@id='withOptGroup']"));
		element.click();
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(ElementClickInterceptedException.class);
		
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	//	wait.until(ExpectedConditions.elementToBeClickable(element));
		// drop down 01

	driver.findElement(By.xpath("//*[text()='Group 1, option 1']")).click();
	
	//drop down 02
	
	driver.findElement(By.xpath("//*[text()='Select Title']")).click();
	driver.findElement(By.xpath("//*[text()='Mr.']")).click();
	
	// drop down 03
	WebElement drop= driver.findElement(By.id("oldSelectMenu"));
	
	Select select=new Select(drop);
	
	select.selectByVisibleText("White");
	List<WebElement> option= select.getOptions();
	
	for (WebElement webElement : option) {
		
	//String text=webElement.getText();
	String value= webElement.getAttribute("value");
	
	//System.out.println(text);
	
	System.out.println(value);
	
	
	}
		
		driver.close();

	}
}

