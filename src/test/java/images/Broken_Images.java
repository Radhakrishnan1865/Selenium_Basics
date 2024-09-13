package images;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken_Images {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/broken");
		
		WebElement brokenimage= driver.findElement(By.xpath("//*[@src='/images/Toolsqa_1.jpg']"));
		
		if(brokenimage.getAttribute("naturalWidth").equals(0)) {
			
			System.out.println("Image is broken");
		}
		else
			System.out.println("Image is not broken");
		
		
		//driver.close();

	}

}
