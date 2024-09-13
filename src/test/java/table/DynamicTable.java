package table;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicTable {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.tradebulls.in/share-market-live/overview");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement>rows= driver.findElements
		(By.xpath("//*[@class='share-market_market-table__content__gxoDb share-market_inner-shadow__Mv7lc ']//tbody//tr"));
		
		int rowcount= rows.size();
		
		List<WebElement>cells= driver.findElements
		(By.xpath("//*[@class='share-market_market-table__content__gxoDb share-market_inner-shadow__Mv7lc ']//thead//th"));

		int cellcount=cells.size();
		
		List<WebElement>changeValues= driver.findElements
		(By.xpath("//*[@class='share-market_market-table__content__gxoDb share-market_inner-shadow__Mv7lc ']//tbody//td[3]"));
		
		List<Double> change= new ArrayList<Double>();
		for (WebElement webElement : changeValues) {
			
		String s=webElement.getText().replace("%", "");
		change.add(Double.parseDouble(s));
		}
		
		System.out.println("Change List "+ change);
		
		double minimumValue= Collections.min(change);
		System.out.println("Minimum Value of this table "+ minimumValue+"%");
		
		driver.close();
		/*
		TakesScreenshot scshot= (TakesScreenshot) driver;
		File sourcefile= scshot.getScreenshotAs(OutputType.FILE);
		
		File desfile=new File("/* Radhakrishnan");
		FileUtils.copyFile(sourcefile, desfile);
		*/
		
	}

}
