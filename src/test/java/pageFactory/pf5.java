package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pf5 {
	WebDriver driver;
	
	public pf5(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Dr. Bhavya Swarnkar']") WebElement p5;
	
	public void derm_doc() {
		p5.click();
	}

}
