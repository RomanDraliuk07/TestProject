package PageObject;

import static org.testng.Assert.fail;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.xml.sax.SAXException;

import Utilities.Base;

public class UploadIndipendentID extends Base {

	@FindBy(how = How.XPATH, using = "//*[contains(text(),\"הבא\")]")
	public WebElement nextBtn;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class=\"no-id\"]")
	public WebElement dontHaveIDBtn;
	
	@FindBy(how = How.ID, using = "robinButtonCompSpan")
	public WebElement continueWithoutId;
	
	
	
	
	//span[contains(text(),'להוסיף צילום תעודת זהות עכשיו')]
	
	
	public void continueWithoutID() throws ParserConfigurationException, SAXException, IOException {
		List<WebElement> btn = driver.findElements(By.id("robinButtonCompSpan"));
		try {
			comOp.waitUntilElementIsVisible(dontHaveIDBtn);
			dontHaveIDBtn.click();
		//	test.log(LogStatus.PASS,"Click on the i dont have id button");
			comOp.waitUntilElementIsVisible(continueWithoutId);
			//continueWithoutId.click();
			btn.get(8).click();
		//	test.log(LogStatus.PASS,"Click on the Continue without ID button");
			Thread.sleep(1000);
			
		}
		catch(Exception er) {
		//	test.log(LogStatus.FAIL,"Fail to continue without ID"+ er.getMessage() + test.addScreenCapture(takeScreenShoot()));
			fail();
		}
	}
}
