package HishtalmutTest;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import Utilities.Base;

public class GeneralDeatilPageErrorHandaling extends Base {
	
	@Test(priority = 0, description = "General Details Page try to continue witout City Name")
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
		genDetailsPage.clearCityField();
		comOp.verifyPageIsOpen(genDetailsPage.errorMessage, "אחד מהשדות חסרים או לא נכונים");
	}
	@Test(priority = 1, description = "General Details Page try to continue witout City Name")
	public void TC2() throws InterruptedException, ParserConfigurationException, SAXException, IOException {
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
		genDetailsPage.clearStreetField();
		comOp.verifyPageIsOpen(genDetailsPage.errorMessage, "אחד מהשדות חסרים או לא נכונים");
	}
	@Test(priority = 2, description = "General Details Page try to continue witout House Number")
	public void TC3() throws InterruptedException, ParserConfigurationException, SAXException, IOException {
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
		genDetailsPage.clearNumberField();
		comOp.verifyPageIsOpen(genDetailsPage.errorMessage, "אחד מהשדות חסרים או לא נכונים");
	}
	@Test(priority = 3, description = "General Details Page try to continue when all fields are clear")
	public void TC4() throws InterruptedException, ParserConfigurationException, SAXException, IOException {
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
		genDetailsPage.clearAllField();
		comOp.verifyPageIsOpen(genDetailsPage.errorMessage, "אחד מהשדות חסרים או לא נכונים");
	}


	
	
	

}
