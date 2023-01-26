package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.AmazonHomeLocators;
import utilitis.SeleniumDriver;

public class AmazonHome {
	
	AmazonHomeLocators homePage = null;
	
	public AmazonHome() {
		
		this.homePage = new AmazonHomeLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), homePage);
	}
	
	public void ValidateTitle() {
	
		System.out.println("====="+homePage.Amazontitle.getText());
	}


}
