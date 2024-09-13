package action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Action_Action {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		WebElement ele1= driver.findElement(By.xpath(""));
		WebElement ele2= driver.findElement(By.xpath(""));
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL)
		.click(ele1)
		.click(ele2)
		.build()
		.perform();
	}
	
}
