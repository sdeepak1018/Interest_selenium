package Project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CarLoan {
	
	WebDriver driver;
	testLogin lp;
	
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
	void testLogo()
	{
		lp=new testLogin(driver);
		Assert.assertEquals(lp.checkHeading(), "EMI Calculator for Home Loan, Car Loan & Personal Loan in India");
	}
	
	@Test(priority=2)
	void Car_Loan()
	{
		lp.CarClick();
		lp.Loan_Amount();
		lp.Loan_Interest();
		lp.Loan_Tenure();
	}
	@Test(priority=3)
	void EMI_Calculation()
	{
		String EMI=lp.Loan_EMI();
		System.out.println(EMI);
		// Remove commas from the string
		EMI = EMI.replace(",", "");

		// Convert the modified string into an integer
		int intValue = Integer.parseInt(EMI);

		System.out.println("The Loan EMI "+intValue);
		
		// Calculation for finding the monthly Principle amount and Interest amount
		
		double e, principle_amount;
		double rate_of_interest;
		int tenture_in_month;
		
		principle_amount = 1500000;
		
		rate_of_interest = (9.5/12)/100;
		
		tenture_in_month = 12;
		
		e = principle_amount * rate_of_interest;
		
		Math.pow(2, 3);
		
		e = e * Math.pow(1+rate_of_interest, tenture_in_month);
		
		e = e/(Math.pow(1+rate_of_interest, tenture_in_month)-1);
		
		System.out.println("Monthly EMI to be paid"+e);
		
		double Month_Interest =  e*(rate_of_interest);
		
		System.out.println("Monthly interest to be paid "+Month_Interest);
		
		double Month_principle = e - Month_Interest ;
		
		System.out.println("Monthly interest to be paid "+Month_principle);
		
		
	}
	
	

}
