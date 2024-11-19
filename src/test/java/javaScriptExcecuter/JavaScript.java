package javaScriptExcecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		 WebElement element=driver.findElement(By.xpath("  "));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Methods of JavaScript
			js.executeScript ( "JavaSript code" ,element);

		//Drow a Border
			js.executeScript("arguements[0].style.border='3px solid red'",element);

		//Change Color
			js.executeScript("arguements[0].style.backroundColor ='color' ", element);

		//Generate Alert
			js.executeScript("alert('"+ "alertmessage" +"')");

		//Click Element
			js.executeScript("arguements[0].click();", element);

		//Refresh Browser
			js.executeScript("location.reload();");
				//or
			js.executeScript("history.go(0);");

		//Navigate Back or Forward
			js.executeScript("history.go(-1);");
			js.executeScript("history.go(+1);");

		//Pass any value in text box
			js.executeScript("arguments[0].setAttribute('value','input txt')" , element);

		//Retrive any text
			js.executeScript("return arguments[0].getAttribute('value')", element);

		//Get Title
			js.executeScript("return document.title;").toString();

		//Get page Inner Text
			js.executeScript("return document.documentElement.innerText;").toString();

		//Scroll page
			//To scroll down
			js.executeScript("window.scrollBy(0,500)");
					//or
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

			//To scroll up
			js.executeScript("window.scrollBy(0,-500)");

			//When element is visible
			js.executeScript("arguments[0].scrollIntoView(true);", element);

			js.executeScript("arguments[0].scrollIntoView(false);");

	}

}
