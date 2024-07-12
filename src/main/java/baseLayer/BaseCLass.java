package baseLayer;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseCLass {

	public static WebDriver driver;
	
	public  static void intialization() {
		
		//upcasting 
		driver=new ChromeDriver();
		
		//window maximize 
		driver.manage().window().maximize();
		
		//wait to load the webelements 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
		//Open Current Facebook registration page  
		driver.get("https://www.facebook.com/reg");
		
		
	}
}
