package file_Upload_Download;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Download {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[text()='Download']")).click();
		
		File file=new File("C:\\Users\\KaruppuSamy\\Downloads");
		
		//sampleFile.jpeg
	File[] totalFiles=file.listFiles();
	
	for (File file2 : totalFiles) {
		
		if(file2.getName().equals("samplefile")) {
			
			System.out.println("File is downloaded");
			break;
		}
	}

	//driver.close();
	}

}
