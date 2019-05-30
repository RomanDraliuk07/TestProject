package Utilities;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.Base;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.xml.sax.SAXException;

//import com.relevantcodes.extentreports.LogStatus;

public class CommonOps extends Base {
	
	Actions actions = new Actions(driver);
	
	public void verifyElementExists(WebElement elem) throws ParserConfigurationException, SAXException, IOException {

		try {
			elem.isDisplayed();
		} catch (Exception er) {
		//	test.log(LogStatus.FAIL,"Fail to continue without ID"+ er.getMessage() + test.addScreenCapture(takeScreenShoot()));
			fail();
		}
	}

	public void verifyValueExists(WebElement elem, String expectedValue) throws ParserConfigurationException, SAXException, IOException {
		try {
			String actual = elem.getText();
			assertEquals(expectedValue, actual);
		} catch (Exception er) {
			//test.log(LogStatus.FAIL,"Fail to continue without ID"+ er.getMessage() + test.addScreenCapture(takeScreenShoot()));
			fail();
		} catch (AssertionError err) {
			//test.log(LogStatus.FAIL,"Fail to continue without ID"+ err.getMessage() + test.addScreenCapture(takeScreenShoot()));
			fail(err.getMessage());

		}

	}

	public void verifyPageIsOpen(WebElement element, String expected) throws ParserConfigurationException, SAXException, IOException {

		try {
			String actual = element.getText();
			Assert.assertEquals(actual, expected);
		} catch (Exception er) {
			//test.log(LogStatus.FAIL,"Fail to continue without ID"+ er.getMessage() + test.addScreenCapture(takeScreenShoot()));
			fail();
		}
	}

	public void SelectFromDropDown(WebElement elem) throws ParserConfigurationException, SAXException, IOException {
		try {
		Select myValue = new Select(elem);
		}
		catch (Exception er) {
			//test.log(LogStatus.FAIL,"Fail to continue without ID"+ er.getMessage() + test.addScreenCapture(takeScreenShoot()));
			fail();
		}

	}

	public void waitUntilElementIsVisible(WebElement elem) throws ParserConfigurationException, SAXException, IOException {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(elem));
		}
		catch (Exception er) {
			//test.log(LogStatus.FAIL,"Fail to continue without ID"+ er.getMessage() + test.addScreenCapture(takeScreenShoot()));
			fail();
		}

	}

	public void waitUntilElementIsClickAble() throws ParserConfigurationException, SAXException, IOException {
		try {
		driver.manage().timeouts().implicitlyWait(30 ,TimeUnit.SECONDS);
		}
		catch (Exception er) {
			//test.log(LogStatus.FAIL,"Fail to continue without ID"+ er.getMessage() + test.addScreenCapture(takeScreenShoot()));
			fail();
		}

	}

	public void javaScriptExecute(WebElement elem) throws ParserConfigurationException, SAXException, IOException {
		try {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elem);
		}
		catch (Exception er) {
			//test.log(LogStatus.FAIL,"Fail to continue without ID"+ er.getMessage() + test.addScreenCapture(takeScreenShoot()));
			fail();
		}
	}
	 public void doubleClickAction(WebElement element) {
		 try {
			 actions.doubleClick(element).perform();
		 }catch(Exception er) {
			 
		 }
	 }

}
