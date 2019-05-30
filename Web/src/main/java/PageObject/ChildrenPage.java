package PageObject;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Utilities.Base;

public class ChildrenPage extends Base{
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='answer ng-star-inserted'][contains(text(),'כן')]")
	public WebElement yesBtn;
	
	@FindBy(how = How.XPATH, using = "//div[@class='answer ng-star-inserted'][contains(text(),'לא')]")
	public WebElement noBtn;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),\"הבא\")]")
	public WebElement nextBtn;
	
	
	public void withoutChildren() {
		try {
			comOp.waitUntilElementIsVisible(noBtn);
			noBtn.click();
			nextBtn.click();
		}catch(Exception er) {
			System.out.println(er.getMessage() + "/n " + er.getCause());
			fail("Failed to select answer");
		}
	}
}
