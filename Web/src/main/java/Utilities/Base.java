package Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import PageObject.HeightAndWeighPage;
import PageObject.managePages;

public class Base implements ITestListener {

	public static WebDriver driver;

	public static ExtentReports extent;
	public static ExtentTest test;
	
	

	public static String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss")
			.format(Calendar.getInstance().getTime());
	public static WebDriverWait wait;

	public static PageObject.IntroPage introP;
	public static CommonOps comOp;
	public static PageObject.LoginPage loginP;
	public static PageObject.HomePage HomeP;
	public static PageObject.LoginPasswordPage logPassPage;
	public static PageObject.RegisterPage regPage;
	public static PageObject.AccountPage accountP;
	public static PageObject.AlternativeviewPage alternView;
	public static PageObject.UpgradeInfoPage upgradeInPage;
	public static PageObject.GeneralDetailsPage genDetailsPage;
	public static PageObject.EmployeerDetailsPage employeerDetailsPage;
	public static PageObject.InvestmentTrackPage InvestTrackPage;
	public static PageObject.BeneficiariesPage BenePage;
	public static PageObject.UploadIDPage UploadIdP;
	public static PageObject.SignaturePage sigPage;
	public static PageObject.PensionGeneralDetailsPage pensionGenerDet;
	public static HeightAndWeighPage heightWeightP;
	public static PageObject.ChildrenPage childrenP;
	public static PageObject.CitizenshipPage citizenP;
	public static PageObject.UploadIndipendentID uploadIndipendentP;
	public static PageObject.AddNewBeneficiariesPage newBene; 

	public static String dorotDevUrl = "https://rh-dorot-dev-app.azurewebsites.net?agentcoupon=wJy0Cha5Nd";
	public static String robinDevUrl = "https://rh-dev-app.azurewebsites.net/";

	// Function that read from XML file
	public static String getData(String nodeName) throws ParserConfigurationException, SAXException, IOException {

		File fXmlFile = new File("C://Automation/Example.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();
		return doc.getElementsByTagName(nodeName).item(0).getTextContent();

	}

	// Define which browser will be open according to XML file
	public static WebDriver initBrowser(String browserType)
			throws ParserConfigurationException, SAXException, IOException {
		// Browser check define which browser will open
		if (browserType.toLowerCase() == "firefox") {
			driver = initFireFoxDriver();
		}
		if (browserType.toLowerCase() == "chrome") {
			driver = intiChromeDriver();
		}

		// driver.manage().window().maximize();
		driver.navigate().to(robinDevUrl);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;

	}

	public static WebDriver initFireFoxDriver() throws ParserConfigurationException, SAXException, IOException {
		System.setProperty("webdriver.geko.driver", getData("fireFoxDriverPath"));
		driver = new FirefoxDriver();
		return driver;

	}

	public static WebDriver intiChromeDriver() throws ParserConfigurationException, SAXException, IOException {
		System.setProperty("webdriver.chrome.driver", getData("chromeDriverPath"));
		driver = new ChromeDriver();
		return driver;
	}



	public static int getRandomNumber() {
		Random rand = new Random();
		return rand.nextInt(999999) + 1000;
	}


	//String FileName = repotLocation + "extentrepot.html";
	
	//Create Extent report object;
	public static void InstanceReport() throws ParserConfigurationException, SAXException, IOException {
	
	extent = new ExtentReports(getData("ReportFilePath") + getData("ReportFileName"),true);

	}
	
	public static void initReportTest(String testName, String testDescription) {
		try {
		test = extent.startTest(testName,testDescription);
		}
		catch(Exception er)
		{
			System.out.println("=====>" + er.getMessage());
		}
	}
	public static void finalizeReportTest() {
		extent.endTest(test);
	}
	
	public static void finalizeExtentReportTest() {
		try {
		extent.flush();
		extent.close();
		}
		catch(Exception er)
		{
			System.out.println("=====>" + er.getMessage());
		}
	}
	
	public static String takeScreenShoot() throws ParserConfigurationException, SAXException, IOException
	{
		String screenPath = getData("ReportFilePath") + "screen.png";
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File(screenPath));
		return screenPath;
		
	}

	
	@BeforeMethod
	public void setup() throws ParserConfigurationException, SAXException, IOException {
		
		initBrowser("chrome");
		managePages.init();
		InstanceReport();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 60);
	}

	@AfterMethod
	public void tearDown() {

		
		driver.close();
		finalizeReportTest();
		

	}

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}



	/*
	 * @AfterMethod public void afterMethod(ITestResult testResult) {
	 * if(testResult.getStatus() == ITestResult.FAILURE) {
	 * System.out.println("Failed: " + testResult.getName()); }
	 * if(testResult.getStatus() == ITestResult.SUCCESS) {
	 * System.out.println("Successful: " + testResult.getName()); } }
	 * 
	 */

	@AfterClass
	 public static void doAfter() throws Exception {

	finalizeExtentReportTest();
	}

}
