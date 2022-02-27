package StepDefinations;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@RunWith(Cucumber.class)
public class Typinglogin01 {

    @Given("^I am on typing application login page$")
    public void i_am_on_typing_application_login_page() throws Throwable {
    	System.out.println("i opened the browser and Hit the URL");
        
    }

    @When("^I enter my \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_my_something_and_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println("i Have entertred below user name and password");
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    }

  

    @And("^Click on login button$")
    public void click_on_login_button() throws Throwable {
    	System.out.println("i Clicked on login button");
       
    }
    
    @Then("^I shoud  be able to login into application succesfully as \"([^\"]*)\"$")
    public void i_shoud_be_able_to_login_into_application_succesfully_as_something(String strArg1) throws Throwable {
       System.out.println("i am in app as"+ strArg1);
    }

}

