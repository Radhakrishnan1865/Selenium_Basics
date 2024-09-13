package file_Upload_Download;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Upload_SendKeys {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/FileUpload.html");

		driver.manage().window().maximize();
		
		String Filepath= "C:\\Users\\KaruppuSamy\\New folder\\Abc.txt";
		driver.findElement(By.id("input-4")).sendKeys(Filepath);
		
		System.out.println("File uploaded succesfully");
		
		driver.close();
		}

}
