package stepDefinitions;

import org.openqa.selenium.WebDriver;

import CommonFunctions.commonFunctions;
import cucumber.api.java.en.When;

public class LoginValidation {
	WebDriver driver;
	@When("^Open Browser$")
	public void open_Browser() throws Throwable {
		 driver = commonFunctions.startBrowser("chrome");
	   
	}

	@When("^Open Application$")
	public void open_Application() throws Throwable {
	 commonFunctions.openApplication(driver);  
	}

	@When("^Wait for Username$")
	public void wait_for_Username() throws Throwable {
	  commonFunctions.waitForElement(driver, "id", "username", "10");  
	}

	@When("^Enter Username$")
	public void enter_Username() throws Throwable {
	commonFunctions.typeAction(driver, "name", "username", "admin");    
	}

	@When("^Wait for Password$")
	public void wait_for_Password() throws Throwable {
	  commonFunctions.waitForElement(driver, "id", "password", "20"); 
	}

	@When("^Enter Password$")
	public void enter_Password() throws Throwable {
	  commonFunctions.typeAction(driver, "id", "password", "master");  
	}

	@When("^Wait For Password$")
	public void wait_For_Password() throws Throwable {
	 commonFunctions.clickAction(driver, "id", "password");  
	}

	@When("^Click On Login$")
	public void click_On_Login() throws Throwable {
	 commonFunctions.clickAction(driver, "id", "btnsubmit");  
	}

	@When("^Wait For Logout$")
	public void wait_For_Logout() throws Throwable {
	   commonFunctions.waitForElement(driver, "id", "logout", "20");
	}

	@When("^Click On Logout$")
	public void click_On_Logout() throws Throwable {
	 commonFunctions.clickAction(driver, "id", "logout");   
	}

	@When("^Wait for OK$")
	public void wait_for_OK() throws Throwable {
	 commonFunctions.waitForElement(driver, "xpath", "//button[contains(text(),'OK!')]", "10");  
	}

	@When("^Click On OK$")
	public void click_On_OK() throws Throwable {
	commonFunctions.clickAction(driver, "xpath", "//button[contains(text(),'OK!')]");   
	}

	@When("^Close Browser$")
	public void close_Browser() throws Throwable {
	 commonFunctions.closeBrowser(driver);  
	}


}
