package testLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseLayer.BaseCLass;
import utilityaLayer.HandleDropDown;

public class FacebookRegisterTest extends BaseCLass {
	
	@BeforeClass
	public void setup() {
		
		BaseCLass.intialization();
	}
	
	@Test
	
	public  void validateRegisterFunctionality() {
		
		driver.findElement(By.name("firstname")).sendKeys("Hemant");
		driver.findElement(By.name("lastname")).sendKeys("Khedkar");
		
		WebElement day=driver.findElement(By.name("birthday_day"));
		
		HandleDropDown.selectByVisibleText(day, "15");
		
		WebElement month=driver.findElement(By.name("birthday_month"));
		HandleDropDown.selectByVisibleText(month, "Mar");
		
		WebElement year=driver.findElement(By.name("birthday_year"));
		HandleDropDown.selectByVisibleText(year, "1992");
		
	}

	
}
