package PageObject;

import static org.testng.Assert.fail;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.xml.sax.SAXException;



import Utilities.Base;

public class SignaturePage extends Base {
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),\"הבא\")]")
	public WebElement nextBtn;
	
	@FindBy(how = How.XPATH, using = "//div[@class='container']//signature-pad//canvas")
	public WebElement signatureArea;
	
	public void clickOnTheSignatureArea() throws ParserConfigurationException, SAXException, IOException {
		
		try {
			comOp.waitUntilElementIsVisible(signatureArea);
			signatureArea.click();
			//test.log(LogStatus.PASS,"Signature area is clicked");
			comOp.waitUntilElementIsVisible(nextBtn);
			nextBtn.click();
			//test.log(LogStatus.PASS,"Next button is clicked in the Signature Page");
		}
		catch(Exception er) {
		//	test.log(LogStatus.FAIL,"Fail to continue without ID"+ er.getMessage() + test.addScreenCapture(takeScreenShoot()));
			fail();
		}
	}

}
