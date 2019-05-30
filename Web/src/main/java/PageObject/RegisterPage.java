package PageObject;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Utilities.Base;

public class RegisterPage extends Base {
	
	
	@FindBy(how = How.ID ,using = "lestKnowTitle")
	public WebElement pageTitle;
	
	@FindBy(how = How.XPATH ,using = "//robin-input[@id='firstName']//input[@type='text']")
	public WebElement firstName;
	@FindBy(how = How.XPATH ,using = "//robin-input[@id='lastName']//input[@type='text']")
	public WebElement lastName;
	@FindBy(how = How.XPATH ,using = "//input[@type='email']")
	public WebElement emailAdd;
	@FindBy(how = How.XPATH ,using = "//input[@type='tel']")
	public WebElement phoneNumber;
	
	@FindBy(how = How.XPATH ,using = "//div[@id='lestKnowButtonContainer']//div[@id='robinButtonCompContainer']")
	public WebElement registerBtn;
	
	@FindBy(how = How.XPATH ,using = "//*[contains(text(),'כניסה לרשומים')]")
	public WebElement goToLoginBtn;
	
	@FindBy(how = How.XPATH ,using = "//robin-modal[@id='register']//img[@id='robinModalComponentImg']")
	public WebElement closePopUpBtn;
	
	public RegisterPage(WebDriver driver) {
		Base.driver = driver;
	}
	
	
	public void registerWithExsistUser(String fName,String lName, String phone,String emailA) {
		try {
			
		//comOp.waitUntilElementIsVisible(pageTitle);
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		emailAdd.sendKeys(emailA);
		phoneNumber.sendKeys(phone);
		registerBtn.click();
		comOp.waitUntilElementIsVisible(closePopUpBtn);
		closePopUpBtn.click();
		
		}catch(Exception er) {
			System.out.println("Error " + er);
			fail();
		}
		
	}
}
