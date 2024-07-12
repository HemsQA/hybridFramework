package utilityaLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import baseLayer.BaseCLass;

public class HandleDropDown extends BaseCLass{
	
	public static void selectByVisibleText(WebElement wb, String value) {
		
		Select sel=new Select(wb);
		sel.selectByVisibleText(value);
		
	}

}
