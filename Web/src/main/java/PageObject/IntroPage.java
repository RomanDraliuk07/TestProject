package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.relevantcodes.extentreports.LogStatus;

import Utilities.Base;


public class IntroPage extends Base
{
	public WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'הבא')]")
	public WebElement nextBtn;
	
	@FindBy(how = How.XPATH, using = "//div[@class='sub-button']")
	public WebElement goToLoginBtn;
	
	public IntroPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void goToLoginPage() {
		try {
			
			comOp.verifyElementExists(goToLoginBtn);
			goToLoginBtn.click();
			test.log(LogStatus.PASS, "Button go to login page is clicked");
			
		}catch(Exception er) {
			System.out.println(er);
			test.log(LogStatus.FAIL,"Go to login button is not clicked");
		}
	}
	
	
}
