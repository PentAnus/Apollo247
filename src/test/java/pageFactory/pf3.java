package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pf3 {
	WebDriver driver;
	
	public pf3(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='inperson']") WebElement p31;
	@FindBy(xpath="//a[contains(text(),'Dr. Tripti Deb')]") WebElement p32;
	@FindBy(xpath="//button[contains(text(),'Book Digital Consult')]") WebElement p33;
	
	public void online() {
		p31.click();
	}
	public void doc() {
		p32.click();
	}
	public void onl_con() {
		p33.click();
	}

}
