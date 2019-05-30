package Risk;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import Utilities.Base;

public class RiskSanity extends Base{
	
	@Test(priority = 0, description = "Test Risk process end to end")
	public void LoginWithUser() throws InterruptedException, ParserConfigurationException, SAXException, IOException {
		//initReportTest("Test 2","Gemel sanity");
		introP.goToLoginPage();
		loginP.checkThatpageIsOpen();
		loginP.loginMethod("andrey.basov1980@gmail.com", "0545320897");
		HomeP.openPasswordPage();
		logPassPage.enterPassword("111111");
		accountP.verifyPageIsOpen();
		comOp.verifyPageIsOpen(accountP.pageTitle, "פרופיל פנסיוני");
		accountP.goToInsuranceTab();
	
	}
	
	
	
	

}
