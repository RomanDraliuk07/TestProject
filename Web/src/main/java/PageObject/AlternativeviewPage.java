package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



import Utilities.Base;

public class AlternativeviewPage extends Base{
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),\"שדרג לתוכנית משתלמת יותר\")]")
	public WebElement upgradeBtn;

	
	public void clickOnUpgradeBtn() {
		try {
			comOp.waitUntilElementIsVisible(upgradeBtn);
			upgradeBtn.click();
		//	test.log(LogStatus.PASS,"Upgrade button is clicked");
			Thread.sleep(1000);
		}
		catch(Exception er) {
			System.out.println(er.getMessage());
			//test.log(LogStatus.FAIL,"Unabale to click on the button" );
		}
	}
}
