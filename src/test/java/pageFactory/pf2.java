package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pf2 {
	WebDriver driver;
	
	public pf2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h3[contains(text(),'Cardiology')]") WebElement p2;
	
	public void cardi_mod() {
		p2.click();
	}

}
