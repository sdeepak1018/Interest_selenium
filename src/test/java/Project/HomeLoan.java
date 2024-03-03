package Project;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeLoan {
	
	WebDriver driver;
	Hometest ht;
	Scanner sc = new Scanner(System.in);
	
	@BeforeClass
	void setup() throws InterruptedException
	{
//		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://emicalculator.net/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
	}
	
	@Test(priority=1)
	void Home_Loan()
	{
		ht = new Hometest(driver);
		ht.HomeClick();
	}
	@Test(priority=2)
	void HomeLoan_Data()
	{
		ht.Loan_Amount();
		ht.Loan_Interest();
		ht.Loan_Tenure();
	}
	
	
}
