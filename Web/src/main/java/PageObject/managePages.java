package PageObject;

import org.openqa.selenium.support.PageFactory;

import Utilities.Base;
import Utilities.CommonOps;


public class managePages extends Base {

	public static void init() {
		introP = PageFactory.initElements(driver, IntroPage.class);
		comOp = PageFactory.initElements(driver, CommonOps.class);
		loginP = PageFactory.initElements(driver, LoginPage.class);
		HomeP = PageFactory.initElements(driver, HomePage.class);
		logPassPage = PageFactory.initElements(driver, LoginPasswordPage.class);
		regPage = PageFactory.initElements(driver, RegisterPage.class);
		accountP = PageFactory.initElements(driver, AccountPage.class);
		alternView = PageFactory.initElements(driver, AlternativeviewPage.class);
		upgradeInPage = PageFactory.initElements(driver, UpgradeInfoPage.class);
		genDetailsPage = PageFactory.initElements(driver, GeneralDetailsPage.class);
		employeerDetailsPage = PageFactory.initElements(driver, EmployeerDetailsPage.class);
		InvestTrackPage = PageFactory.initElements(driver, InvestmentTrackPage.class);
		BenePage = PageFactory.initElements(driver, BeneficiariesPage.class);
		UploadIdP = PageFactory.initElements(driver, UploadIDPage.class);
		sigPage = PageFactory.initElements(driver, SignaturePage.class);
		pensionGenerDet = PageFactory.initElements(driver, PensionGeneralDetailsPage.class);
		heightWeightP = PageFactory.initElements(driver, HeightAndWeighPage.class);
		childrenP = PageFactory.initElements(driver, ChildrenPage.class);
		citizenP = PageFactory.initElements(driver, CitizenshipPage.class);
		uploadIndipendentP = PageFactory.initElements(driver, UploadIndipendentID.class);
		
		newBene = PageFactory.initElements(driver, AddNewBeneficiariesPage.class);
		
		 
		 

	}

}
