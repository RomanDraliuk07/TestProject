package PageObject;

import static org.testng.Assert.fail;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.xml.sax.SAXException;



import Utilities.Base;

public class AccountPage extends Base{
	
	@FindBy(how = How.XPATH, using ="//div[@id='robinNavbarCompText']")
	public WebElement pageTitle;
	
	@FindBy(how = How.ID, using ="pensionSummaryTotalAmount")
	public WebElement ammount;
	
	
	@FindBy(how = How.XPATH, using ="//*[contains(text(),'השתלמות')]")
	public WebElement hishtalmutCard;
	
	@FindBy(how = How.XPATH, using ="//*[contains(text(),'קופות גמל')]")
	public WebElement kupatGemelCard;
	
	
	@FindBy(how = How.XPATH, using ="//*[contains(text(),'פנסיה')]")
	public WebElement pensionCard;
	
	@FindBy(how = How.ID, using ="4")
	public WebElement hishtalmutProdutcs;
	
	
	@FindBy(how = How.ID, using ="2")
	public WebElement pensionProdutcs;
	
	/////////////// bottom nav bar ///////////////////
	
	//bottom-navbar[@class='ng-tns-c28-30 ng-star-inserted']//div[3]
	@FindBy(how = How.XPATH, using ="//bottom-navbar[@class='ng-tns-c28-30 ng-star-inserted']//div[3]")
	public WebElement insuranceBtn;
	
	@FindBy(how = How.XPATH,using ="//div[@class='text ng-star-inserted active-text']")
	public WebElement pensionBtn;
	@FindBy(how = How.XPATH, using ="//div[@id='bottomNavbarRobinCoin']")
	public WebElement coinsBtn;
	
	@FindBy(how = How.XPATH, using ="//div[contains(text(),'מאתר מוצרים פיננסים')]")
	public WebElement title;
	
	
	
	
	
	
	public void verifyPageIsOpen() throws ParserConfigurationException, SAXException, IOException {
		try {
		comOp.waitUntilElementIsVisible(ammount);
	//	test.log(LogStatus.PASS,"Account page is open and amout is visible");
		}
		catch(Exception er) {
			System.out.println(er.getMessage());
			//test.log(LogStatus.FAIL,"Account page is not open and amout is not visible" + test.addScreenCapture(takeScreenShoot()));
			fail();
		}
		
	}
	
	
	
	
	public void locatingProductsPage() {
		String titleP = "מאתר מוצרים פיננסים";
		try {
			comOp.waitUntilElementIsVisible(title);
			comOp.verifyPageIsOpen(title,titleP);
			
		}catch(Exception er) {
			System.out.println(er.getMessage());
			//test.log(LogStatus.FAIL,"Account page is not open and amout is not visible" + test.addScreenCapture(takeScreenShoot()));
			fail("Text is not correct");
		}
	}
	
	public void clickOnHishtalmutCard() throws ParserConfigurationException, SAXException, IOException {
		List<WebElement> allCards = driver.findElements(By.id("4"));
		try {
			comOp.waitUntilElementIsVisible(hishtalmutCard);
			comOp.javaScriptExecute(hishtalmutCard);
		//	test.log(LogStatus.PASS,"Hishtalmut card is clicked");
			//hishtalmutCard.click();
			Thread.sleep(1000);
			allCards.get(2).click();
		//	test.log(LogStatus.PASS,"Product in the hishtalmut is clicked");
			Thread.sleep(1000);
		}catch(Exception er) {
			System.out.println(er.getMessage());
		//	test.log(LogStatus.FAIL,"Product in the hishtalmut is not clicked" + test.addScreenCapture(takeScreenShoot()));
			fail();
			
		}
	}
	
	public void clickOnHishtalmutCardIndipendantProduct() throws ParserConfigurationException, SAXException, IOException {
		List<WebElement> allCards = driver.findElements(By.id("4"));
		try {
			comOp.waitUntilElementIsVisible(hishtalmutCard);
			comOp.javaScriptExecute(hishtalmutCard);
		//	test.log(LogStatus.PASS,"Hishtalmut card is clicked");
			//hishtalmutCard.click();
			Thread.sleep(1000);
			allCards.get(0).click();
		//	test.log(LogStatus.PASS,"Product in the hishtalmut is clicked");
			Thread.sleep(1000);
		}catch(Exception er) {
			System.out.println(er.getMessage());
		//	test.log(LogStatus.FAIL,"Product in the hishtalmut is not clicked" + test.addScreenCapture(takeScreenShoot()));
			fail();
			
		}
	}
	
	public void clickOnKupatGemelCard() throws ParserConfigurationException, SAXException, IOException {
		List<WebElement> allCards = driver.findElements(By.id("3"));
		try {
			comOp.waitUntilElementIsVisible(kupatGemelCard);
			comOp.javaScriptExecute(kupatGemelCard);
			//test.log(LogStatus.PASS,"Gemel card is clicked");
			//hishtalmutCard.click();
			Thread.sleep(1000);
			allCards.get(1).click();
			//test.log(LogStatus.PASS,"Product in the gemel is clicked");
			Thread.sleep(1000);
		}catch(Exception er) {
			System.out.println(er.getMessage());
			//test.log(LogStatus.FAIL,"Product in the gemel is not clicked" + test.addScreenCapture(takeScreenShoot()));
			fail();
			
		}
	}
	
	public void clickOnPensionCard()
	{
		List<WebElement> allCards = driver.findElements(By.id("2"));
		try {
			comOp.waitUntilElementIsVisible(pensionCard);
			comOp.javaScriptExecute(pensionCard);
			
			Thread.sleep(1000);
			allCards.get(0).click();
			Thread.sleep(1000);
		}catch(Exception er) {
			System.out.println(er.getMessage());
			//test.log(LogStatus.FAIL,"Product in the gemel is not clicked" + test.addScreenCapture(takeScreenShoot()));
			fail("///////////////////////////////////////////"+er.getMessage());
		}
	}
	
	
		public void goToInsuranceTab() {
		try {
		//	comOp.waitUntilElementIsVisible(insuranceBtn);
			
			comOp.javaScriptExecute(insuranceBtn);
		}catch(Exception er) {
			System.out.println("*************************" + er.getMessage() + " ");
			//test.log(LogStatus.FAIL,"Product in the gemel is not clicked" + test.addScreenCapture(takeScreenShoot()));
			fail();
		}
	}

}
