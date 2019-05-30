package LoginTest;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import Utilities.Base;

public class LoginErrorHandalingTests extends Base{
	
	@Test(priority = 0, description = "Login with incorrect email address")
	public void TC1() throws InterruptedException, ParserConfigurationException, SAXException, IOException {
		introP.goToLoginPage();
		loginP.checkThatpageIsOpen();
		loginP.loginMethod("y@robinhoodproa.com", "0549778811");
		Assert.assertEquals(loginP.errorMessage.getText(),"אחד או שניים מהפרטים שהזנת שגויים");
	}
	
	@Test(priority = 1, description = "Login with incorrect phone number")
	public void TC2() throws InterruptedException, ParserConfigurationException, SAXException, IOException {
		introP.goToLoginPage();
		loginP.checkThatpageIsOpen();
		loginP.loginMethod("y@robinhoodpro.com", "0549778821");
		Assert.assertEquals(loginP.errorMessage.getText(),"אחד או שניים מהפרטים שהזנת שגויים");
	}
	
	@Test(priority = 2, description = "Login without email address")
	public void TC3() throws InterruptedException, ParserConfigurationException, SAXException, IOException {
		introP.goToLoginPage();
		loginP.checkThatpageIsOpen();
		loginP.loginMethodwithoutEmail("0549778821");
		Assert.assertEquals(loginP.errorMessage.getText(),"יש למלא את כל השדות כדי להמשיך");
	}
	
	@Test(priority = 03, description = "Login without phone number")
	public void TC4() throws InterruptedException, ParserConfigurationException, SAXException, IOException {
		introP.goToLoginPage();
		loginP.checkThatpageIsOpen();
		loginP.loginMethodwithoutPhone("y@robinhoodpro.com");
		Assert.assertEquals(loginP.errorMessage.getText(),"יש למלא את כל השדות כדי להמשיך");
	}
	
	@Test(priority = 4, description = "Login without email address and phone number")
	public void TC5() throws InterruptedException, ParserConfigurationException, SAXException, IOException {
		introP.goToLoginPage();
		loginP.checkThatpageIsOpen();
		loginP.loginEmptyFields();
		Assert.assertEquals(loginP.errorMessage.getText(),"יש למלא את כל השדות כדי להמשיך");
	}
	

}
