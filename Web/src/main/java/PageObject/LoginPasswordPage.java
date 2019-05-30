package PageObject;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



import Utilities.Base;

public class LoginPasswordPage extends Base{
	
	@FindBy(how = How.XPATH, using = "//input[@id='robinPasscodeCompInp1']")
	public WebElement passInput;
	@FindBy(how = How.ID, using = "robinButtonCompContainer")
	public WebElement enterBtn;
	

	public void enterPassword(String value) {
		try {
			comOp.waitUntilElementIsVisible(passInput);
			Thread.sleep(2000);
			passInput.click();
			passInput.sendKeys(value);
		//test.log(LogStatus.PASS,"Password is entered");
			comOp.waitUntilElementIsVisible(enterBtn);
			//enterBtn.click();
			Thread.sleep(2000);
			comOp.javaScriptExecute(enterBtn);
			//test.log(LogStatus.PASS,"Click on go to enter button in the password page");
			
		}catch(Exception er) {
			
			System.out.println(er.getMessage());
			//test.log(LogStatus.FAIL,"Enter password faild");
			fail();
		}
	}

}
