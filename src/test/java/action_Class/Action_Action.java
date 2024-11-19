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
		// 1.Drag and Drop
		action.dragAndDrop(ele1, ele2).perform();
		
		// 2.Right click
		action.contextClick().perform();
		
		// 3.Double click
		action.doubleClick().perform();
		
		// 4.Release
		action.clickAndHold(ele1).moveToElement(ele2).release().perform();
		
		// 5.Click
		action.click(ele1).perform();
		
		
		
		
		action.keyDown(Keys.CONTROL)
		.click(ele1)
		.click(ele2)
		.build()
		.perform();
	}
	
}
