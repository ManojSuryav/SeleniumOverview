package Week2.Day1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CeateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	
	driver.findElement(By.linkText("Leads")).click();
	
	
	driver.findElement(By.linkText("Create Lead")).click();
	
	
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");;
    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Manoj");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Surya");
	driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("245");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("");
	driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("A");
	driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("10/12/98");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Manoj");
	driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Hello sir");
	driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Hello test leaf");
	driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("500000");
	driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("555");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("This is Testleaf");
	driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Learn test");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Softwaretest");
	driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("500");
	driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("TL");
	
	
	WebElement drpdwn1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select sourceDropDown1 = new Select(drpdwn1);
	sourceDropDown1.selectByVisibleText("Direct Mail");
	
	
	
    WebElement drop2= driver.findElement(By.id("createLeadForm_currencyUomId"));
	Select drpdwn2 = new Select(drop2);
	drpdwn2.selectByVisibleText("INR - Indian Rupee");
	
    WebElement drop3 = driver.findElement(By.id("createLeadForm_industryEnumId"));
	Select drpdwn3 = new Select(drop3);
	drpdwn3.selectByValue("IND_SOFTWARE");
	
	 WebElement drop4 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drpdwn4 = new Select(drop4);
		drpdwn4.selectByVisibleText("Partnership");
		
		WebElement drop5 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drpdwn5 = new Select(drop5);
		drpdwn5.selectByIndex(3);
		driver.findElement(By.name("submitButton")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String title1 = "View Lead | opentaps CRM";
		String title2 = driver.getTitle();
		if (title1.equals(title2)) {
			System.out.println("CORRECT TITLE");
		}
		else {
			System.out.println("WRONG TITLE");
		}
		
		
		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
			System.out.println("FirstNmae:"+firstName);
		
	
	
	}
}

