package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pf8 {
WebDriver driver;
	
	public pf8(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h3[text()='Neurology']") WebElement p81;
	@FindBy(xpath="//*[@id=\"mainContainerCT\"]/div/div[1]/div[2]/div[2]/div[3]/div/div[3]/div/input") WebElement p82;
	@FindBy(xpath="//p[text()='Sorry, No Doctors Found']") WebElement p83;
	
	public void neuMod() {
		p81.click();
	}
	public void name(String str) {
		p82.sendKeys(str);
//		p82.sendKeys(Keys.ENTER);
	}
	public void Msg() {
		String msg=p83.getText();
		System.out.println("TEXT is: "+msg);
	}

}
