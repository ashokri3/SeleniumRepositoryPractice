package Resource;

import Pages.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMstep
{
    Login l;
    @Given("I am on OrangeHRM Login Page")
    public void i_am_on_orange_hrm_login_page()
    {
     l=new Login(Hook.driver);
    }
    @When("you enter username {string} and Password {string}")
    public void you_enter_username_and_password(String username, String password)
    {
        l.enterusername(username);
        l.enterpassword(password);
        l.clicksubmit();
    }
    @Then("User login successfully with valid credentials")
    public void user_login_successfully_with_valid_credentials()
    {
     l.equals();
    }
}

