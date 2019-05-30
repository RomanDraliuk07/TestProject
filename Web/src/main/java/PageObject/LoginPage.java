package PageObject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.xml.sax.SAXException;

import com.relevantcodes.extentreports.LogStatus;

import Utilities.Base;

public class LoginPage extends Base{
	
	public WebDriver driver;
	
	@FindBy(how = How.ID, using = "lestKnowTitle")
	public WebElement pageTitle;
	@FindBy(how = How.XPATH, using = "//input[@type='email']")
	public WebElement emailInput;
	@FindBy(how = How.XPATH, using = "//input[@type='tel']")
	public WebElement phoneNumberInput;
	@FindBy(how = How.ID, using = "robinButtonCompContainer")
	public WebElement enterBtn;
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'העבר אותי להרשמה')]")
	public WebElement backToRegisterLink;

	@FindBy(how = How.ID, using = "robinMessageCompMessage")
	public WebElement errorMessage;

	@FindBy(how = How.ID, using = "//div[contains(text(),'יש למלא את כל השדות כדי להמשיך')]")
	public WebElement noDetailsError;
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public void checkThatpageIsOpen() throws ParserConfigurationException, SAXException, IOException {
		try {
			comOp.waitUntilElementIsVisible(loginP.pageTitle);
		    assertEquals(pageTitle.getText(),"נרשמת בעבר?");
		    test.log(LogStatus.PASS,"Page title is correct");
		}
		catch(Exception er) {
			System.out.println("Title is not correct" + er);
			test.log(LogStatus.FAIL,"Page title is not correct" + test.addScreenCapture(takeScreenShoot()));
		}
	}
	
	public void loginMethod(String emailAdd, String phoneNumber) throws InterruptedException, ParserConfigurationException, SAXException, IOException {
		try {
		comOp.waitUntilElementIsVisible(pageTitle);
		emailInput.sendKeys(emailAdd);
		test.log(LogStatus.PASS,"Email address is entered");
		phoneNumberInput.sendKeys(phoneNumber);
		test.log(LogStatus.PASS,"Phone number is entered");
		comOp.javaScriptExecute(enterBtn);
		test.log(LogStatus.PASS,"Click on Login button");
		}catch(Exception er) {
			System.out.println("Not able to login : " + er);
			fail();
			test.log(LogStatus.FAIL,"Unable to login" + test.addScreenCapture(takeScreenShoot()));
		}
	}
	public void loginMethodwithoutEmail(String phoneNumber) throws InterruptedException, ParserConfigurationException, SAXException, IOException {
		comOp.waitUntilElementIsVisible(pageTitle);
		test.log(LogStatus.PASS,"Email address is entered");
		phoneNumberInput.sendKeys(phoneNumber);
		test.log(LogStatus.PASS,"Phone number is entered");
		comOp.javaScriptExecute(enterBtn);
		test.log(LogStatus.PASS,"Click on Login button");
	}
	public void loginMethodwithoutPhone(String email) throws InterruptedException, ParserConfigurationException, SAXException, IOException {
		comOp.waitUntilElementIsVisible(pageTitle);
		test.log(LogStatus.PASS,"Email address is entered");
		phoneNumberInput.sendKeys(email);
		test.log(LogStatus.PASS,"Phone number is entered");
		comOp.javaScriptExecute(enterBtn);
		test.log(LogStatus.PASS,"Click on Login button");
	}
	public void loginEmptyFields() throws ParserConfigurationException, SAXException, IOException {
		comOp.waitUntilElementIsVisible(pageTitle);
		comOp.javaScriptExecute(enterBtn);
	}
	
	public void enterEmailAndPhoneNumber() {
	//wait = new WebDriverWait(driver,10);
		try {
			comOp.waitUntilElementIsVisible(pageTitle);
			emailInput.sendKeys("y@robinhoodpro.com");
			phoneNumberInput.click();
			phoneNumberInput.sendKeys("0549778811");
			enterBtn.click();
			
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By) errorMessage));
		}catch(Exception er) {
			System.out.println("Values not entered : " + er);
		}
	}

	
	public void loginWithOnlyEmail() {
		try {
			comOp.waitUntilElementIsVisible(pageTitle);
			emailInput.clear();
			emailInput.sendKeys("ya@robinhoodpro.com");
			phoneNumberInput.click();
			enterBtn.click();
		//	wait.until(ExpectedConditions.invisibilityOfAllElements(errorMessage));
			assertEquals(errorMessage.getText(),"מספר הטלפון לא נכון");
		}catch(Exception er) {
			System.out.println("Values not entered : " + er);
		}
	}
	public void loginWithOnlyPhone() {
		try {
		
		emailInput.clear();
		phoneNumberInput.click();
		phoneNumberInput.sendKeys("0549778821");
		enterBtn.click();
		assertEquals(errorMessage.getText(),"האימייל לא תקין");
		}catch(Exception er) {
			System.out.println("Values not entered : " + er);
		}
	}
	public void goToRegScreen() {
		try {
			comOp.waitUntilElementIsVisible(pageTitle);
			comOp.javaScriptExecute(backToRegisterLink);
		}catch(Exception err) {
			System.out.println(err);
		}
	}
}
