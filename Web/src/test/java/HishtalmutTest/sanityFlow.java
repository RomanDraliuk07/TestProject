package HishtalmutTest;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import Utilities.Base;

public class sanityFlow extends Base {

	
	@Test(priority = 0, description = "Login Test")
	public void TC1() throws InterruptedException, ParserConfigurationException, SAXException, IOException {
		
		introP.goToLoginPage();
		loginP.checkThatpageIsOpen();
		loginP.loginMethod("y@robinhoodpro.com", "0549778811");
		HomeP.openPasswordPage();
		logPassPage.enterPassword("130364");
		accountP.verifyPageIsOpen();
		comOp.verifyPageIsOpen(accountP.pageTitle, "פרופיל פנסיוני");
		accountP.clickOnHishtalmutCard();
		alternView.clickOnUpgradeBtn();
		upgradeInPage.goToThenexPage();
		genDetailsPage.goToTheEmployeerDeatailsPage();
		employeerDetailsPage.goToTheInvestmentTrackPage();
		InvestTrackPage.goToTheNextPage();
		BenePage.goToTheUploadIdPage();
		UploadIdP.continueWithoutID();
//		sigPage.clickOnTheSignatureArea();
	}
	
	@Test(priority = 1, description = "Login Test Independetnt product")
	public void TC2() throws InterruptedException, ParserConfigurationException, SAXException, IOException {
		//initReportTest("Test 1","Login test");
		introP.goToLoginPage();
		loginP.checkThatpageIsOpen();
		loginP.loginMethod("y@robinhoodpro.com", "0549778811");
		HomeP.openPasswordPage();
		logPassPage.enterPassword("130364");
		accountP.verifyPageIsOpen();
		comOp.verifyPageIsOpen(accountP.pageTitle, "פרופיל פנסיוני");
		accountP.clickOnHishtalmutCardIndipendantProduct();
		alternView.clickOnUpgradeBtn();
		upgradeInPage.goToThenexPage();
		genDetailsPage.goToTheEmployeerDeatailsPage();
		citizenP.sellectAllNo();
		uploadIndipendentP.continueWithoutID();
		employeerDetailsPage.goToTheInvestmentTrackPage();
		InvestTrackPage.goToTheNextPage();
		BenePage.goToTheUploadIdPage();
		UploadIdP.continueWithoutID();
//		sigPage.clickOnTheSignatureArea();
	}

	
}
