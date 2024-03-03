package Project;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hometest {
	
public WebDriver driver;
	
	//Constructor
	Hometest(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
//	WebElement Locators+identification
	
	@FindBy(id="home-loan")
	WebElement Home_menu;
	
	@FindBy(id="loanamount")
	WebElement LoanAmount;
	
	@FindBy(id="loaninterest")
	WebElement LoanInterest;
	
	@FindBy(id="loanterm")
	WebElement LoanTenure;
	
	@FindBy(xpath="//*[@id=\"emicalculatorinnerform\"]/div[7]/div/div/div/div/div/label[1]")
	WebElement LoanBtn;
	
	
	
	
	
// Action Methods
	
	public void HomeClick()
	{
		Home_menu.click();
	}
	public void Loan_Amount()
	{
		LoanAmount.sendKeys(Keys.CONTROL + "a");
		LoanAmount.sendKeys("400000");
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
		LoanBtn.click();
		
	}
	
	

}
