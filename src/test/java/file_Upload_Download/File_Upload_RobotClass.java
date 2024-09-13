package file_Upload_Download;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Upload_RobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		
		String Filepath= "C:\\Users\\KaruppuSamy\\New folder\\Abc.txt";
		driver.findElement(By.xpath("//*[@class='col-md-12']//span[text()='Browse …']")).click();
		
		
		Robot robot=new Robot();
		
		StringSelection selection=new StringSelection(Filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		System.out.println("File uploaded succesfully");
		
		//driver.close();

	}

}
