/*package Utilities;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.xml.sax.SAXException;

public class Listeneres implements ITestListener {

	Base b = new Base();
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub

		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		try {
			b.takeScreenShoot(result.getName());
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

}
*/