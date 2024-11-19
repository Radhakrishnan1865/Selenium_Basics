package frames;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.switchTo().frame("string id");
		driver.switchTo().frame("string name");
		driver.switchTo().frame("web element");
		driver.switchTo().frame("index");
		
		driver.switchTo().parentFrame(); // switching immediate parent frame
		
		driver.switchTo().defaultContent(); // switching to the main frame
	}
}
