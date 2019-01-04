package stepDefinitions;

import java.util.List;

import org.junit.runner.RunWith;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition1 {

	    @Given("^user is on landing page$")
	    public void user_is_on_landing_page() throws Throwable {
	    	System.out.println("user is on landing page");
	    	/*WebDriver driver = new FirefoxDriver();
	    	DesiredCapabilities dp = new DesiredCapabilities();
	    	dp.setCapability(capabilityName, value);
	    	driver.get("https://www.google.co.in");*/
	    }

	    @When("^user login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_login_into_application_with_username_and_password(String username, String password) throws Throwable {
	        System.out.println("Specific user and pwd: " + username+" and :"+ password);
	    }
	    
	    @When("^user login into application with username and password$")
	    public void user_login_into_application_with_1username_and_password() throws Throwable {
	    	System.out.println("user login into application with username and password");
	    }

	    @Then("^Home Page is displayed$")
	    public void home_page_is_displayed() throws Throwable {
	    	System.out.println("Home Page is displayed");
	    }

	    @And("^Links are displayed \"([^\"]*)\"$")
	    public void links_are_displayed_confition(String isDisplayed) throws Throwable {
	    	System.out.println("Links are displayed: "+ isDisplayed);
	    }
	    
	    @And("^Links are displayed$")
	    public void links_are_displayed() throws Throwable {
	    	System.out.println("All Links are displayed ");
	    }
	    
	    @When("^user login into application with following details$")
	    public void user_login_into_application_with_following_details(DataTable dt) throws Throwable{
	    	
	    	System.out.println("Inside multivalue function");
	    	System.out.println(dt.toString());
	    	System.out.println(dt.getGherkinRows().size());
	    	List<List<String>> lis = dt.raw();
	    	System.out.println(lis.get(0));
	    	System.out.println(lis.get(0).get(1));
	    	System.out.println(lis.get(1).get(1));
	    	
	    	
	    }
	    
	    @When("^User login into application with (.+) and (.+)$")
	    public void user_login_into_application_with_user_and_password(String arg1, String arg2) throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	        System.out.println("username: "+ arg1+ " password: "+arg2);
	    }
	    
	    @Given("^Open Browser$")
	    public void open_Browser() throws Throwable {
	    	System.out.println("Open Browser");
	    }

	    @When("^Browser is opened$")
	    public void browser_is_opened() throws Throwable {
	    	System.out.println("Browser is opened");
	    }

	    @Then("^Go to Landing Page$")
	    public void go_to_Landing_Page() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	System.out.println("Go to Landing Page");
	    }
	}

