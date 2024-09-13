package window_Handling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {

	public static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	String Parent=driver.getWindowHandle();
	System.out.println(Parent);
		driver.findElement(By.xpath("//*[@id='newWindowBtn']")).click();
		
	Set<String> windows=	driver.getWindowHandles();
	
	for(String win:windows) {
		
		if(!Parent.equals(win)) {
			
			//System.out.println(win);
			driver.switchTo().window(win);
			
		}
		
		}
	driver.manage().window().maximize();
	
	//String Name=driver.findElement(By.xpath("//*[@alt='HYR']")).getText();
	String title=driver.getTitle();
	System.out.println("Child window Tittle "+title);
	
	driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Radhakrishnan");
	driver.findElement(By.id("lastName")).sendKeys("A");
	
	driver.findElement(By.xpath("//*[@id='malerb']")).click();
	
	driver.findElement(By.xpath("//*[@id='englishchbx']")).click();
	
	driver.findElement(By.id("email")).sendKeys("radhakrishnanof1995@gmail.com");
	driver.findElement(By.id("password")).sendKeys("7708328588");
	
	driver.findElement(By.xpath("//*[text()='Register']")).click();
	
	System.out.println("Registration successfully");
	
	driver.findElement(By.id("navigateHome")).click();
	
	driver.findElement(By.id("dismiss-button")).click();
	//driver.close();
	//Thread.sleep(3000);
	//driver.switchTo().window(Parent);
	
	//driver.findElement(By.xpath("//*[@id='newTabBtn']")).click();
	
	}
}
