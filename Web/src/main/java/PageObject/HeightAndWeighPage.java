package PageObject;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Utilities.Base;

public class HeightAndWeighPage extends Base {

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'הזן גובה')]")
	public WebElement heigthDropDowm;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'הזן משקל')]")
	public WebElement weightDropDown;

	@FindBy(how = How.XPATH, using = "//div[@class='finish']")
	public WebElement finishDropDownBtn;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),\"הבא\")]")
	public WebElement nextBtn;
	
	
	
	public void selectHeightAndWeight() {
		try {
			heigthDropDowm.click();
			finishDropDownBtn.click();
			Thread.sleep(500);
			weightDropDown.click();
			finishDropDownBtn.click();
			comOp.waitUntilElementIsVisible(nextBtn);
			comOp.javaScriptExecute(nextBtn);
			
		}catch (Exception er) {
			System.out.println("******"+er.getMessage()+"**********");
			fail("Failed to select HeightAndWeigh");
			
		}
	}

}
