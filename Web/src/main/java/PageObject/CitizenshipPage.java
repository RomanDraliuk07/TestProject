package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Utilities.Base;

public class CitizenshipPage extends Base {

	public WebDriver driver;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'האם אתה אזרח ארה\"ב ?')]")
	public WebElement firstQuestionText;
	//robin-boolean-question[@id='booleanQ1']//div[@class='answer ng-star-inserted'][contains(text(),'לא')]
	@FindBy(how = How.XPATH, using = "//robin-boolean-question[@id='booleanQ1']//div[@class='answer ng-star-inserted'][contains(text(),'לא')]")
	public WebElement firtQuestionNo;
	
	@FindBy(how = How.XPATH, using = "//robin-boolean-question[@id='booleanQ1']//div[@class='answer ng-star-inserted'][contains(text(),'כן')]")
	public WebElement firtQuestionYes;
	
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'האם את/ה תושב/ת ארה\"ב לצרכי מס?')]")
	public WebElement secondQuestionText;
	
	@FindBy(how = How.XPATH, using = "//robin-boolean-question[@id='booleanQ2']//div[@class='answer ng-star-inserted'][contains(text(),'לא')]")
	public WebElement secondQuestionNo;
	
	@FindBy(how = How.XPATH, using = "//robin-boolean-question[@id='booleanQ2']//div[@class='answer ng-star-inserted'][contains(text(),'כן')]")
	public WebElement secondQuestionYes;
	
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'האם את/ה תושב/ת ארה\"ב לצרכי מס?')]")
	public WebElement thirdQuestionText;
	
	@FindBy(how = How.XPATH, using = "//robin-boolean-question[@id='booleanQ3']//div[@class='answer ng-star-inserted'][contains(text(),'לא')]")
	public WebElement thirdQuestionNo;
	
	@FindBy(how = How.XPATH, using = "//robin-boolean-question[@id='booleanQ3']//div[@class='answer ng-star-inserted'][contains(text(),'כן')]")
	public WebElement thirdQuestionYes;
	@FindBy(how = How.XPATH, using = "//*[contains(text(),\"הבא\")]")
	public WebElement nextBtn;

	public CitizenshipPage(WebDriver driver) {
		this.driver= driver;
	}
	
	
	public void sellectAllNo() {
		try {
			comOp.waitUntilElementIsVisible(firtQuestionNo);
			firtQuestionNo.click();
			secondQuestionNo.click();
			thirdQuestionNo.click();
			nextBtn.click();
		}catch(Exception er) {
			System.out.println("*******************" + er.getMessage());
		}
	}
}
