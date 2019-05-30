package HishtalmutTest;

import org.testng.TestNG;

import GemelTests.GemelSanityFlow;

public class testRunner {

	static TestNG testNg;
	public static void main(String[] args) {
	
	testNg = new TestNG();
	testNg.setTestClasses(new Class[] {sanityFlow.class,GemelSanityFlow.class});
	testNg.run();

	}

}
