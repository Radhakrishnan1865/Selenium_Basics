package cookies;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Cookies {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();

		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//Adding a Cookie
		Cookie cookie = new Cookie("my_cookie", "cookie_value");
		driver.manage().addCookie(cookie);

		//Getting all cookies
		Set<Cookie> getcookies=driver.manage().getCookies();

		for(Cookie cookies:getcookies) {

			String Name= cookies.getName();
			String value=cookies.getValue();

			System.out.println(Name +" : " + value);
		}
		//Get a cookie by name
		Cookie cookie1 = driver.manage().getCookieNamed("my_cookie");
		cookie1.getName();

		//Delete a specific cookie
		driver.manage().deleteCookieNamed("my_cookie");

		// Delete all cookies
		driver.manage().deleteAllCookies();
	}
}
