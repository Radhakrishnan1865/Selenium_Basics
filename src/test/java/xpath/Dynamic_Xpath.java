package xpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic_Xpath {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/search?q=redmi&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		
	List<WebElement> nameandprice=	
	driver.findElements(By.xpath("//div[@class='yKfJKb row']//div[@class='KzDlHZ'] | //div[@class='Nx9bqj _4b5DiR']"));

	for(WebElement element:nameandprice) {
		
		String text=element.getText();
		System.out.println(text);
		
	}
	}

}
