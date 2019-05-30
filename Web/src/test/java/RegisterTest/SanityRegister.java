package RegisterTest;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import Utilities.Base;

public class SanityRegister extends Base{
	
	@Test(priority = 0)
	public void goToRegisterPage() throws ParserConfigurationException, SAXException, IOException {
		introP.goToLoginPage();
		loginP.goToRegScreen();
		comOp.verifyValueExists(regPage.pageTitle, "בואו נכיר");
		regPage.registerWithExsistUser("רומן", "דרליוק", "0547598804", "roman@mail.com");
	}
	

}
