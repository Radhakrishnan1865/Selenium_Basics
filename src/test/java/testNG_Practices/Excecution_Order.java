package testNG_Practices;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyExtendReport.class)
public class Excecution_Order {

    @Test
	public void method01() {

		System.out.println("Test method one");
	}
    @BeforeTest
	public void method02() {

		System.out.println("Before test method");
	}
    @AfterTest
	public void method03() {

		System.out.println("After test method");
	}
    @BeforeClass
	public void method04() {

		System.out.println("Before class");
	}
    @AfterSuite
	public void method05() {

		System.out.println("After suite");
	}
    @AfterClass
	public void method06() {

		System.out.println("After class");
	}
    @BeforeSuite
	public void method07() {

		System.out.println("Before suite");
	}
    @AfterMethod
	public void method08() {

		System.out.println("After method");
	}
    @BeforeMethod
	public void method09() {

		System.out.println("Before method");
	}
    @Test
	public void method10() {

		System.out.println("Test method two");
		
		
	}
    
}
