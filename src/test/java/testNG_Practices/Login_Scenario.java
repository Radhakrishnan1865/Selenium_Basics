package testNG_Practices;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Scenario {

	@BeforeTest
	public void SignUp() {

		System.out.println("This is a signup fuction");
	}

	@BeforeClass
	public void Login() {

		System.out.println("This is a Login fuction");
	}
	@Test(priority=1)
	public void Resource() {

		System.out.println("This is a Resource fuction");
	}
	@Test(priority=2)
	public void Update_Resource() {

		System.out.println("This is a Update Resource fuction");
	}
	@AfterClass
	public void Logout() {

		System.out.println("This is a Logout fuction");
	}
}
