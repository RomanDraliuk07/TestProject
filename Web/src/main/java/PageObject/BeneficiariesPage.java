package PageObject;

import static org.testng.Assert.fail;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.xml.sax.SAXException;



import Utilities.Base;

public class BeneficiariesPage extends Base {

	@FindBy(how = How.XPATH, using = "//div[@class='text'][contains(text(),'הוספת מוטב')]")
	public WebElement addNewBtn;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'השתמש ביורשיי החוקיים')]")
	public WebElement useMyOwn;

	
	
	
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),\"הבא\")]")
	public WebElement nextBtn;
	
	public void goToTheUploadIdPage() throws ParserConfigurationException, SAXException, IOException {
		try {
			comOp.waitUntilElementIsVisible(nextBtn);
			nextBtn.click();
		//	test.log(LogStatus.PASS,"Next button is clicked in the Beneficiaries page");
		}
		catch(Exception er) {
		//	test.log(LogStatus.FAIL,"Next button is not clicked in the Beneficiaries page"+ er.getMessage() + test.addScreenCapture(takeScreenShoot()));
			fail();
		}
	}
	
	public void withoutBenificiarise() {
		try {
			comOp.waitUntilElementIsVisible(nextBtn);
			nextBtn.click();
			comOp.waitUntilElementIsVisible(useMyOwn);
			comOp.javaScriptExecute(useMyOwn);
			
		//	test.log(LogStatus.PASS,"Next button is clicked in the Beneficiaries page");
		}
		catch(Exception er) {
		//	test.log(LogStatus.FAIL,"Next button is not clicked in the Beneficiaries page"+ er.getMessage() + test.addScreenCapture(takeScreenShoot()));
			fail();
		}
	}
	public void addNewBneficiaries() {
		try {
			addNewBtn.click();
		}catch(Exception er) {
			fail("Error : ==> "  + er);
		}
	}
}
