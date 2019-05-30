package PageObject;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Utilities.Base;

public class PensionGeneralDetailsPage extends Base {

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'כתובת מגורים')]")
	public WebElement pageTitle;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='עיר']")
	public WebElement cityInput;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='רחוב']")
	public WebElement streetInput;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='מספר']")
	public WebElement houseNumber;

	@FindBy(how = How.XPATH, using = "//span[@class='arrow']")
	public WebElement dropDownBtn;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='עיסוק']")
	public WebElement םccupationInput;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'רווק')]")
	public WebElement singelOption;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),\"הבא\")]")
	public WebElement nextBtn;
	
	public void selectFamelyStatus() {

		try {
			dropDownBtn.click();
			singelOption.click();
			nextBtn.click();

		} catch (Exception er) {
			System.out.println(er.getMessage() + "/n " + er.getCause());
			fail("Failed to select family status");
		}
	}

}
