package PageObject;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



import Utilities.Base;

public class UpgradeInfoPage extends Base{

	@FindBy(how = How.XPATH, using = "//*[contains(text(),\"הבא\")]")
	public WebElement nextBtn;

	
	public void goToThenexPage() {
		try {
			
			comOp.waitUntilElementIsVisible(nextBtn);
			comOp.javaScriptExecute(nextBtn);
			//nextBtn.click();
		//	test.log(LogStatus.PASS,"Next button is not clicked");
			
		}catch(Exception er) {
			System.out.println(er.getMessage());
			//test.log(LogStatus.FAIL,"Button is not clicked");
			fail();
		}
	}
}
