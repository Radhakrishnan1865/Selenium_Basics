package links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken_Links {

	static 	String Links;
	static int Glink=0;
	static int BrokenLink=0;
	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> totallinks =driver.findElements(By.tagName("a"));

	int linksize=totallinks.size();
		for (WebElement webElement : totallinks) {

			
			Links=webElement.getAttribute("href");
			String Name= webElement.getText();


			//System.out.println(Links);
			//System.out.println(Name);
		}

		URL url=new URL(Links);
		HttpURLConnection connection=(HttpURLConnection)

				url.openConnection();
				//connection.setRequestMethod("GET");
		connection.setConnectTimeout(1000);
		connection.connect();

		int responsecode= connection.getResponseCode();
		if(responsecode>=400) {

			//System.out.println("Link is broken");
			//System.out.println(Links);
			BrokenLink++;
		}
		else
			//System.out.println("Link is Not broken");
		//System.out.println(Links);
		Glink++;
		
		System.out.println(BrokenLink);
		
		System.out.println("----------------------");
		
		System.out.println(Glink);
		
		driver.close();
	}

}
