package Week2.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// download and set the path
		WebDriverManager.chromedriver().setup();
		// launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		// load url
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		// maximize
		driver.manage().window().maximize();
		// Add Implicit Wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// fill ALl The Text Boxes
		driver.findElement(By.name("UserFirstName")).sendKeys("Manoj");
		driver.findElement(By.name("UserLastName")).sendKeys("Surya");
		driver.findElement(By.name("UserEmail")).sendKeys("manojsuryavenkatesan5@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
		driver.findElement(By.name("UserPhone")).sendKeys("9791214368");
		
		
		
		WebElement employee = driver.findElement(By.name("CompanyEmployees"));
		Select numofemployee = new Select(employee);
		numofemployee.selectByVisibleText("1 - 15 employees");
		 
		WebElement selectcountry = driver.findElement(By.name("CompanyCountry"));
		Select Location = new Select(selectcountry);
		Location.selectByIndex(20);
		
	 	WebElement jobtitle = driver.findElement(By.name("UserTitle"));
		Select position = new Select(jobtitle);
		position.selectByValue("Student / Personal Interest");
		
		
	}

}
