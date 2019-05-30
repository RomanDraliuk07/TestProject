package PageObject;

import static org.testng.Assert.fail;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.xml.sax.SAXException;

import Utilities.Base;

public class GeneralDetailsPage extends Base {

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'איפה אתה גר')]")
	public WebElement pageTitle;

	@FindBy(how = How.XPATH, using = "//robin-input[@id='input1']//input[@class='input-class active']")
	public WebElement cityInput;

	@FindBy(how = How.XPATH, using = "//robin-input[@id='input2']//input[@class='input-class active']")
	public WebElement streetInput;

	@FindBy(how = How.XPATH, using = "//robin-input[@id='input3']//input[@class='input-class active']")
	public WebElement houseNumber;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),\"הבא\")]")
	public WebElement nextBtn;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'אחד מהשדות חסרים או לא נכונים')]")
	public WebElement errorMessage;

	public void goToTheEmployeerDeatailsPage() throws ParserConfigurationException, SAXException, IOException {
		try {
			comOp.waitUntilElementIsVisible(nextBtn);
			nextBtn.click();
			// test.log(LogStatus.PASS,"Next button is clicked in general details page");

		} catch (Exception er) {
			// test.log(LogStatus.FAIL,"Next button is not clicked in general details page"+
			// er.getMessage() + test.addScreenCapture(takeScreenShoot()));
			fail();
		}
	}

	public void clearCityField() {

		try {
			comOp.doubleClickAction(cityInput);
			cityInput.sendKeys(Keys.BACK_SPACE);
			nextBtn.click();
			comOp.waitUntilElementIsVisible(errorMessage);

		} catch (Exception er) {

			fail("Error => " + er.getMessage());
		}
	}

	public void clearStreetField() {

		try {
			comOp.doubleClickAction(streetInput);
			streetInput.sendKeys(Keys.BACK_SPACE);
			nextBtn.click();
			comOp.waitUntilElementIsVisible(errorMessage);

		} catch (Exception er) {

			fail("Error => " + er.getMessage());
		}
	}

	public void clearNumberField() {

		try {
			comOp.doubleClickAction(houseNumber);
			houseNumber.sendKeys(Keys.BACK_SPACE);
			nextBtn.click();
			comOp.waitUntilElementIsVisible(errorMessage);

		} catch (Exception er) {

			fail("Error => " + er.getMessage());
		}
	}
	
	public void clearAllField() {

		try {
			comOp.doubleClickAction(streetInput);
			streetInput.sendKeys(Keys.BACK_SPACE);
			comOp.doubleClickAction(houseNumber);
			houseNumber.sendKeys(Keys.BACK_SPACE);
			comOp.doubleClickAction(houseNumber);
			houseNumber.sendKeys(Keys.BACK_SPACE);
			nextBtn.click();
			comOp.waitUntilElementIsVisible(errorMessage);

		} catch (Exception er) {

			fail("Error => " + er.getMessage());
		}
	}
}
