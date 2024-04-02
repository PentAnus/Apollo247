package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pf7 {
WebDriver driver;
	
	public pf7(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Dr. Arijit Das']") WebElement p7;
	
//	@FindBy(xpath="//*[@id=\"mainContainerCT\"]/div/div[1]/div[2]/div[2]/div[6]/div/div[4]/div/div[1]/div[1]/div[2]/p[1]/a") WebElement p7;
	
	public void ent_doc() {
		p7.click();
	}
}
