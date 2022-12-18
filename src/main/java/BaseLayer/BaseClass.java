package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;

	public static void initialition() {
	   System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\hp\\\\\\\\Desktop\\\\\\\\New folder\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
       driver = new ChromeDriver();
       
       driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       //driver.get("https://msbte.org.in/");
       driver.get("https://www.facebook.com/reg");
	}

}
