package table;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
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

public class Dynamic_Table {

	public static void main(String[] args){
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.investing.com/");
		
		driver.manage().window().maximize();
	List<WebElement>rows = driver.findElements(By.xpath("//div[@class='order-1 sm:order-3']//tbody//tr"));
	int NoOfrows= rows.size();
		
	System.out.println("No of row count "+ NoOfrows);
	
	List<WebElement>cells= driver.findElements(By.xpath("//div[@class='order-1 sm:order-3']//table//thead//th"));
	int NoOFcells=cells.size();
	
	
	System.out.println("No of cell count "+ NoOFcells);
	
String lowPercentage=driver.findElement(By.xpath("//*[text()='Small Cap 2000']/following::td[5]")).getText();
	
	System.out.println(lowPercentage);
	
List<WebElement>Allper=	driver.findElements(By.xpath("//div[@class='order-1 sm:order-3']//tbody//td[6]"));
	
	List<Double> allvalues= new ArrayList<Double>();
	
	for (WebElement element : Allper) {
		
	String Values=element.getText().replace("%", "");

	
	allvalues.add(Double.parseDouble(Values));
	}
	
	System.out.println("All change values "+allvalues);
	
	double smallValue= Collections.min(allvalues);
	System.out.println("Smallest value in table "+ smallValue+"%");
		for(int i=1; i<=NoOfrows;i++) {
			
		String Name=driver.findElement(By.xpath("//div[@class='order-1 sm:order-3']//tbody//tr["+i+"]//td[1]")).getText();
		String change = driver.findElement(By.xpath("//div[@class='order-1 sm:order-3']//tbody//tr["+i+"]//td[6]")).getText();
			
		System.out.println(Name + " "+ change);
		}

		// screen Shot
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File desi= new File("C:\\Users\\KaruppuSamy\\eclipse-workspace\\SeleniumLearning\\ScreenShots\\image.png");
		
		try {
			FileUtils.copyFile(src, desi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Take ScreenShot Successfully");
		//driver.close();
		
	}

}
