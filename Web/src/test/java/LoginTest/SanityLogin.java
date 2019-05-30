package LoginTest;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import Utilities.Base;

public class SanityLogin extends Base {

		@Test(priority = 0, description = "Sanity Login Test with Yossi")
		public void TC1() throws InterruptedException, ParserConfigurationException, SAXException, IOException {
			initReportTest("Test 1","Test yossi");
			introP.goToLoginPage();
			loginP.checkThatpageIsOpen();
			loginP.loginMethod("y@robinhoodpro.com", "0549778811");
			HomeP.openPasswordPage();
			logPassPage.enterPassword("130364");
			accountP.verifyPageIsOpen();
			comOp.verifyPageIsOpen(accountP.pageTitle, "פרופיל פנסיוני");
		}
		@Test(priority = 1, description = "Sanity Login Test with Deddi")
		public void Tc2() throws InterruptedException, ParserConfigurationException, SAXException, IOException {
			initReportTest("Test 2","Test Deddi");
			introP.goToLoginPage();
			loginP.checkThatpageIsOpen();
			loginP.loginMethod("dedi55@gmail.com", "0542152388");
			HomeP.openPasswordPage();
			logPassPage.enterPassword("555555");
			accountP.verifyPageIsOpen();
			comOp.verifyPageIsOpen(accountP.pageTitle, "פרופיל פנסיוני");
		}
		@Test(priority = 2, description = "Sanity Login Test with Andrey")
		public void TC3() throws InterruptedException, ParserConfigurationException, SAXException, IOException {
			initReportTest("Test 3","Test Andrey");
			introP.goToLoginPage();
			loginP.checkThatpageIsOpen();
			loginP.loginMethod("andrey.basov1980@gmail.com", "0545320897");
			HomeP.openPasswordPage();
			logPassPage.enterPassword("111111");
			accountP.verifyPageIsOpen();
			comOp.verifyPageIsOpen(accountP.pageTitle, "פרופיל פנסיוני");
		}
	/*	@Test(priority = 3, description = "Sanity Login Test with Roman ")
		public void TC4() throws InterruptedException, ParserConfigurationException, SAXException, IOException {
			introP.goToLoginPage();
			loginP.checkThatpageIsOpen();
			loginP.loginMethod("roman@mail.com", "0547598804");
			comOp.verifyPageIsOpen(accountP.title, "מאתר מוצרים פיננסים");
			
		}	*/
	/*	@Test(priority = 4, description = "Sanity Login Test with Roman user didnt pass Reach confirmation")
		public void TC5() throws InterruptedException, ParserConfigurationException, SAXException, IOException {
			introP.goToLoginPage();
			loginP.checkThatpageIsOpen();
			loginP.loginMethod("roman@mail.com", "0547598804");
			HomeP.checkPopUpText();
			comOp.verifyValueExists(HomeP.popUpTitle, "לא נשלחה בקשה לאיסוף נתונים");
						
		}	*/
		
		
}

