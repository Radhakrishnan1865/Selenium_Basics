package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicit_Waits {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");

		WebElement ele= driver.findElement(By.xpath("//*[text()='Mobiles']"));

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ele));

		/*
		1. alertIsPresent()
		2. elementSelectionStateToBe()
		3. elementToBeClickable()
		4. elementToBeSelected()
		5. frameToBeAvaliableAndSwitchToIt()
		6. invisibilityOfTheElementLocated()
		7. invisibilityOfElementWithText()
		8. presenceOfAllElementsLocatedBy()
		9. presenceOfElementLocated()
		10. textToBePresentInElement()
		11. textToBePresentInElementLocated()
		12. textToBePresentInElementValue()
		13. titleIs()
		14. titleContains()
		15. visibilityOf()
		16. visibilityOfAllElements()
		17. visibilityOfAllElementsLocatedBy()
		18. visibilityOfElementLocated()
		*/
		System.out.println("Test excecute succesfully");

		driver.close();

	}

}
