package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selection {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
		
		//WebElement text= driver.findElement(By.xpath("//*[text()='Amazon Prime']"));
		//text.isDisplayed();
		
		// WebElement element=driver.findElement(By.xpath("//*[@id='apb-browse-refinements-checkbox_0']//following-sibling::i"));
		 
		// element.isEnabled();
		//*[@for='apb-browse-refinements-checkbox_0']
		//*[@id='apb-browse-refinements-checkbox_0']//following-sibling::i
		//*[@for='apb-browse-refinements-checkbox_0']/parent::*
		//*[@id='apb-browse-refinements-checkbox_0']
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 
		 js.executeScript("document.getElementByxpath(//*[@id='apb-browse-refinements-checkbox_0']//following-sibling::i.click();");
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.
	
		// Thread.sleep(3000);
		// element.click();
	
		
	}
}
