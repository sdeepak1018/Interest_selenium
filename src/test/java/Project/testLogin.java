package Project;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testLogin {
	
public WebDriver driver;
	
	//Constructor
	testLogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
//	WebElement Locators+identification
	
	@FindBy(tagName="h1")
	WebElement 	Heading_check;
	
	@FindBy(id="car-loan")
	WebElement car_menu;
	
	@FindBy(id="loanamount")
	WebElement LoanAmount;
	
	@FindBy(id="loaninterest")
	WebElement LoanInterest;
	
	@FindBy(id="loanterm")
	WebElement LoanTenure;
	
	@FindBy(xpath="//*[@id=\"emiamount\"]/p/span")
	WebElement LoanEMI;

	
	
// Action Methods
	
	public String checkHeading()
	{
		String heading=Heading_check.getText();
		return heading;
	}
	
	public void CarClick()
	{
		car_menu.click();
	}
	public void Loan_Amount()
	{
		LoanAmount.sendKeys(Keys.CONTROL + "a");
		LoanAmount.sendKeys("1500000");
	}
	public void Loan_Interest()
	{
		LoanInterest.sendKeys(Keys.CONTROL + "a");
		LoanInterest.sendKeys("9.5");
	}
	
	public void Loan_Tenure()
	{
		LoanTenure.sendKeys(Keys.CONTROL + "a");
		LoanTenure.sendKeys("1");
	}
	
	public String Loan_EMI()
	{
		String EMI = LoanEMI.getText();
		return EMI;
		
	}

}
