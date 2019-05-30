package Pension;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import Utilities.Base;

public class PensionSanity extends Base {
	
	@Test(priority = 0, description = "Pension process without beneficiaries")
	public void LoginWithUser() throws InterruptedException, ParserConfigurationException, SAXException, IOException {
		
		introP.goToLoginPage();
		loginP.checkThatpageIsOpen();
		loginP.loginMethod("andrey.basov1980@gmail.com", "0545320897");
		HomeP.openPasswordPage();
		logPassPage.enterPassword("111111");
		accountP.verifyPageIsOpen();
		comOp.verifyPageIsOpen(accountP.pageTitle, "פרופיל פנסיוני");
		accountP.clickOnPensionCard();
		alternView.clickOnUpgradeBtn();
		upgradeInPage.goToThenexPage();
		pensionGenerDet.selectFamelyStatus();
		heightWeightP.selectHeightAndWeight();
		InvestTrackPage.goToTheNextPage();
		childrenP.withoutChildren();
		BenePage.withoutBenificiarise();
		UploadIdP.continueWithoutID();
//		sigPage.clickOnTheSignatureArea();

	}

}
