package table;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_Dynamic_Element {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://practice.expandtesting.com/dynamic-table");
		
		
		List<WebElement>rows=driver.findElements(By.xpath("//*[@class='table table-striped']//tr"));
		System.out.println(rows.size());
		for(int i=1;i<rows.size();i=i+2) {
			
		WebElement value=driver.findElement(By.xpath("//*[@class='table table-striped']//tr["+i+"]//following-sibling::*[contains(text(),'%')]"));
	String Text=value.getText();
		
		System.out.println(Text);
		
		
		}
	}
}
