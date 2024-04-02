package stepDefinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.pf1;
import pageFactory.pf2;
import pageFactory.pf3;
import pageFactory.pf4;
import pageFactory.pf5;
import pageFactory.pf6;
import pageFactory.pf7;
import pageFactory.pf8;

public class apollo {
	
	WebDriver driver;
	
	@Given("I am on home page")
	public void i_am_on_home_page() {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();
		String url="https://www.apollo247.com";
		driver.get(url);
	}

	@When("I clicked on consult module")
	public void i_clicked_on_consult_module() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//p[text()='Consult']")).click();
		pf1 cm=new pf1(driver);
		cm.consult();
	}

	@When("Navigated to consult page")
	public void navigated_to_consult_page() {
	    
	}

	@When("Clicked on the cardiology specialist")
	public void clicked_on_the_cardiology_specialist() throws InterruptedException {
		
		JavascriptExecutor javascriptExecutor  = (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("window.scrollBy(0,700)");
		
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//h3[contains(text(),'Cardiology')]")).click();
		pf2 cs=new pf2(driver);
		cs.cardi_mod();
	}

	@Then("Heart speacialists details is shown")
	public void heart_speacialists_details_is_shown() {
	    
	}

	@Given("Available doctors are shown")
	public void available_doctors_are_shown() {
	    
	}

	@When("The online and offline consulting is given")
	public void the_online_and_offline_consulting_is_given() {
	    
	}
	
	@When("Switch off the checkbox for visit doctor")
	public void switch_off_the_checkbox_for_visit_doctor() throws InterruptedException {
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
//		visit=driver.findElement(By.xpath("//input[@name='inperson']")).click();
		pf3 oc=new pf3(driver);
		oc.online();
		
	}

	@When("Click on a profile with Trpti Deb")
	public void click_on_a_profile_with_trpti_deb() throws InterruptedException {
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[contains(text(),'Dr. Tripti Deb')]")).click();
		pf3 doC=new pf3(driver);
		doC.doc();
	}

	@When("Click on digital consult")
	public void click_on_digital_consult() throws InterruptedException {
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Book Digital Consult')]")).click();
		pf3 digC=new pf3(driver);
		digC.onl_con();
	}

	@Then("Appointment schedule is shown")
	public void appointment_schedule_is_shown() {
	    
	}
	
	@When("Clicked on the dermotology specialist")
	public void clicked_on_the_dermotology_specialist() throws InterruptedException {
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
//	    driver.findElement(By.xpath("//h3[text()='Dermatology']")).click();
		pf4 ds=new pf4(driver);
		ds.derm();
	}

	@Then("skin speacialists details is shown")
	public void skin_speacialists_details_is_shown() {
	    
	}
	@When("Click on a profile with Dr. Bhavya Swarnkar")
	public void click_on_a_profile_with_dr_bhavya_swarnkar() throws InterruptedException {
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()='Dr. Girish Panth']")).click();
		pf5 docD=new pf5(driver);
		docD.derm_doc();
	}
	
//	@When("Clicked on the ENT specialist")
//	public void clicked_on_the_ent_specialist() throws InterruptedException {
////		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		Thread.sleep(2000);
////	    driver.findElement(By.xpath("//h3[text()='ENT']")).click();
//		pf6 dent=new pf6(driver);
//		dent.ent();
//	}
	
//	@When("Click on a profile with Dr. Arijit Das")
//	public void click_on_a_profile_with_dr_arijit_das() throws InterruptedException {
////		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		Thread.sleep(2000);
//		pf7 docEnt=new pf7(driver);
//		docEnt.ent_doc();
//	}

	@When("clicked on Neurology module")
	public void clicked_on_neurology_module() throws InterruptedException {
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
		pf8 neuro=new pf8(driver);
	    neuro.neuMod();
	}

	@When("doctors list is shown")
	public void doctors_list_is_shown() {
	    
	}

	@When("enter the doctor name {string} and enter")
	public void enter_the_doctor_name_and_enter(String string) throws InterruptedException {
		Thread.sleep(2000);
//		WebElement search=driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div/div[1]/div[2]/div[2]/div[3]/div/div[3]/div/input"));
//		search.click();
//		search.sendKeys("avinshgpta");
		pf8 docName=new pf8(driver);
	    docName.name(string);
	}

	@Then("it shows doctor not available")
	public void it_shows_doctor_not_available() throws InterruptedException {
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
	   pf8 mes=new pf8(driver);
	   mes.Msg();
	}

}
