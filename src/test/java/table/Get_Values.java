package table;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_Values {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://practice.expandtesting.com/dynamic-table");
		
		List<WebElement> heading=driver.findElements(By.xpath("//table[@class='table table-striped']//th"));
		
		int namecolumnindex=0;
		for(int i=0;i<heading.size();i++) {
			
			WebElement element=heading.get(i);
			String text=element.getText();
			if(text.equals("Name")) {
				
				namecolumnindex++;
				break;
			}
	}
		if(namecolumnindex==0) {
			System.out.println("Name column does not found");
			return;
		}
		List<WebElement> rows=driver.findElements(By.xpath("//table[@class='table table-striped']//tbody//tr"));
		
		for(WebElement row:rows) {
			
			int j=0;
			WebElement cell=row.findElement(By.xpath("//table[@class='table table-striped']//tbody//tr["+j+++"//td["+namecolumnindex+"]"));
		String AllNames=cell.getText();
			System.out.println(AllNames);
		}

}
}
