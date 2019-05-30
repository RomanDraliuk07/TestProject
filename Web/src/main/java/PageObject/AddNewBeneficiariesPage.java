package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Utilities.Base;

public class AddNewBeneficiariesPage extends Base{

	
	
	@FindBy(how = How.XPATH, using = "//input[@class='input-class active']")
	public WebElement nameInput;
	
	
	@FindBy(how = How.XPATH, using = "//robin-input[@class='ng-untouched ng-pristine ng-invalid']//input[@class='input-class']")
	public WebElement lastNameInput;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='container-add ng-star-inserted']//div[@id='robinButtonCompContainer']")
	public WebElement addBtn;
	
	
	public void addNewBeneficiaries(String name, String lastName) {
		try {
			//comOp.waitUntilElementIsVisible(nameInput);
			comOp.javaScriptExecute(nameInput);
			nameInput.sendKeys(name);
			lastNameInput.sendKeys(lastName);
			addBtn.click();
		}catch(Exception er) {
			System.out.println("===>" + er);
		}
	}
}
