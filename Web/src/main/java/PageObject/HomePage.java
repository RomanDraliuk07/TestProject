package PageObject;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import Utilities.Base;

public class HomePage extends Base {
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='robinRoundedBtnCircle']")
	public WebElement enterBtn;
	
	@FindBy(how = How.ID, using = "robinModalComponentAni")
	public WebElement popUp;
	
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'לא נשלחה בקשה לאיסוף נתונים')]")
	public WebElement popUpTitle;
	
	
	
	public void openPasswordPage() {
		try {
			
			comOp.waitUntilElementIsVisible(enterBtn);
			comOp.javaScriptExecute(enterBtn);
		//	test.log(LogStatus.PASS,"Click to open password page");
			
		}catch(Exception er) {
			er.getMessage();
			fail();
		//	test.log(LogStatus.FAIL,"Unable to click on the password page");
		}
	}
	
	public void checkPopUpText() {
		try {
			comOp.waitUntilElementIsVisible(popUpTitle);
		}catch(Exception er) {
			er.getMessage();
			fail();
		//	test.log(LogStatus.FAIL,"Unable to click on the password page");
		}
	}
}
