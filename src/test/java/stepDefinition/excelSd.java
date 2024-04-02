package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageFactory.excel;
 
public class excelSd{
	WebDriver driver;
	@Test(dataProvider="testdata")
	public void testExcel(String names) {
		driver	 = new ChromeDriver();
		driver.get("https://www.apollo247.com/specialties/neurology?source=Top_Specialty_Listing");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//p[text()='Consult']")).click();
//		JavascriptExecutor javascriptExecutor  = (JavascriptExecutor) driver;
//		javascriptExecutor.executeScript("window.scrollBy(0,800)");
//		driver.findElement(By.xpath("//h3[text()='Neurology']")).click();
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div/div[1]/div[2]/div[2]/div[3]/div/div[3]/div/input"));
		ele.click();
		ele.sendKeys(names);
	}
	@DataProvider(name = "testdata")
	public Object getData() {
		excel utils = new excel("C:\\Users\\PENTANUS\\Documents\\testData.xlsx");
		int rows = utils.getRowCount(0);
		Object[][] enterName = new Object[rows][1];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < 1; j++) {
				enterName[i][j] = utils.getdata(0, i + 1, j);
				System.out.println(enterName[i][j]);
			}
		}
		return enterName;
	}
}
