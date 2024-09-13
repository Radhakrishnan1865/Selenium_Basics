package notifications;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Disabled_notification_Chrome {

	
	    public static void main(String[] args) {
	    	//ChromeOptions o = new ChromeOptions();

	        //set browser options
	    	//o.addArguments("--disable-notifications");
	        WebDriverManager.chromedriver().setup();
	        // pass browser option to webdriver
	        WebDriver driver = new ChromeDriver();
	        //implicit wait
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        //URL launch
	        driver.get("http://wordpressdemo.webkul.com/wordpress-latest-tweets/");
	    }
}
