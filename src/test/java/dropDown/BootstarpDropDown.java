package dropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstarpDropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("menu1")).click();
		
		List<WebElement>bdropdown=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li"));
		int count =bdropdown.size();
		System.out.println(count);
		for (WebElement bdd : bdropdown) {
			
			if(bdd.getText().equals("JavaScript")) {
				bdd.click();
				break;
			}
		}

	}

}
