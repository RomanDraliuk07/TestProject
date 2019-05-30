package PageObject;

import static org.testng.Assert.fail;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.xml.sax.SAXException;



import Utilities.Base;

public class EmployeerDetailsPage extends Base{
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),\"הבא\")]")
	public WebElement nextBtn;
	
	public void goToTheInvestmentTrackPage() throws ParserConfigurationException, SAXException, IOException {
		try {
			comOp.waitUntilElementIsVisible(nextBtn);
			nextBtn.click();
			//test.log(LogStatus.PASS,"Next button is clicked in the Employeer details page");
		}
		catch(Exception er) {
		//	test.log(LogStatus.FAIL,"Next button is not clicked in Employeer details page"+ er.getMessage() + test.addScreenCapture(takeScreenShoot()));
			fail();
		}
	}

}
