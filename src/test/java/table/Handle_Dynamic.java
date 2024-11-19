package table;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Dynamic {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://practice.expandtesting.com/dynamic-table");
		
		WebElement table = driver.findElement(By.xpath("//table")); 
		List<WebElement> headers = table.findElements(By.xpath(".//thead/tr/th")); // Assuming headers are in <thead>

        // Find the index of the "Name" column dynamically
        int nameColumnIndex = -1;
        for (int i = 0; i < headers.size(); i++) {
            if (headers.get(i).getText().equalsIgnoreCase("Name")) {
                nameColumnIndex = i + 1; // Index in XPath is 1-based
                break;
            }
        }

        if (nameColumnIndex == -1) {
            System.out.println("Name column not found!");
            return;
        }

        // Get all rows of the table body
        List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr")); // Assuming rows are in <tbody>

        System.out.println("Names in the table:");
        // Iterate through rows and get the value from the "Name" column
        for (WebElement row : rows) {
            WebElement nameCell = row.findElement(By.xpath(".//td[" + nameColumnIndex + "]"));
            System.out.println(nameCell.getText());
        }

	}

}
