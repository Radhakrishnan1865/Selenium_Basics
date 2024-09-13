package practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	
	File target= new File("C:\\Users\\KaruppuSamy\\eclipse-workspace\\SeleniumLearning\\ScreenShots\\photo.png");
	try {
		FileUtils.copyFile(src, target);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	Alert alert=driver.switchTo().alert();
	alert.accept();
	
	
	}
}
}
