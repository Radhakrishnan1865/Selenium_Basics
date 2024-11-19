package dropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggestDropdown {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("Ravanan");
		
		List<WebElement>list = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		int lsize=list.size();
		System.out.println(lsize);
		
		for(WebElement sizelist:list) {
			
		String text=sizelist.getText();
			/*
			if(sizelist.getText().contains(" hd wallpaper")) {
				
				sizelist.click();
			} */
		System.out.println(text);
		}

	}

}
