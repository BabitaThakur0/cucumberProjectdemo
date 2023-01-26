package steps;

import io.cucumber.java.After;
import utilitis.SeleniumDriver;

public class AfterAction {
	
	
	@After
	public static void tearDown() {
		SeleniumDriver.tearDown();
	}

}
