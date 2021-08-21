package Week2.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement webEleCreateNewAccount = driver.findElement(By.linkText("Create New Account"));
		webEleCreateNewAccount.click();
		driver.findElement(By.name("firstname")).sendKeys("Manoj");
		driver.findElement(By.name("lastname")).sendKeys("Surya");
		driver.findElement(By.name("reg_email__")).sendKeys("manojsuryavenkatesan5@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("manojsuryavenkatesan5@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Abcd1@2");
		WebElement webEle1 = driver.findElement(By.id("day"));
		Select drpDwn = new Select(webEle1);
		drpDwn.selectByIndex(9);
		WebElement webEle2 = driver.findElement(By.id("month"));
		Select drpDwn1= new Select(webEle2);
		drpDwn1.selectByValue("12");
		WebElement webEle3 = driver.findElement(By.id("year"));
		Select drpDwn2 = new Select(webEle3);
		drpDwn2.selectByVisibleText("1998");
		driver.findElement(By.name("sex")).click();
		
		
		

	}

}
