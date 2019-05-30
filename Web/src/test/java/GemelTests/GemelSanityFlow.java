package GemelTests;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import Utilities.Base;

public class GemelSanityFlow extends Base {

	@Test(priority = 0, description = "Test Gemel process end to end")
	public void LoginWithUser() throws InterruptedException, ParserConfigurationException, SAXException, IOException {
		//initReportTest("Test 2","Gemel sanity");
		introP.goToLoginPage();
		loginP.checkThatpageIsOpen();
		loginP.loginMethod("y@robinhoodpro.com", "0549778811");
		HomeP.openPasswordPage();
		logPassPage.enterPassword("130364");
		accountP.verifyPageIsOpen();
		comOp.verifyPageIsOpen(accountP.pageTitle, "פרופיל פנסיוני");
		accountP.clickOnKupatGemelCard();
		alternView.clickOnUpgradeBtn();
		upgradeInPage.goToThenexPage();
		genDetailsPage.goToTheEmployeerDeatailsPage();
		employeerDetailsPage.goToTheInvestmentTrackPage();
		InvestTrackPage.goToTheNextPage();
		BenePage.goToTheUploadIdPage();
		UploadIdP.continueWithoutID();
//		sigPage.clickOnTheSignatureArea();
	}
}
