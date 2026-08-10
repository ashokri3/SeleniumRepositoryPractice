package Resource;

import Pages.Dashboard;
import Pages.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class pimstepdefintions
{
Dashboard d;
//@Given("I am on OrangeHRM Login Page")
//    public void i_am_on_orange_hrm_login_page()
//    {
//        l=new Login(Hook.driver);
//        d=new Dashboard(Hook.driver);
//    }
//
//    @When("you enter username {string} and Password {string}")
//    public void you_enter_username_and_password(String username, String password)
//    {
//        l.enterusername(username);
//        l.enterpassword(password);
//
//    }
//
//    @When("User login successfully with valid credentials")
//    public void user_login_successfully_with_valid_credentials()
//    {
//     l.clicksubmit();
//    }
    @When("click on pim")
    public void click_on_pim() {
        d=new Dashboard(Hook.driver);
        d.pim();
    }
    @When("click on emplist")
    public void click_on_emplist() {
        d.emplist();
        d.clickadd();
    }
    @When("click on add button and enter firstname and lastname")
    public void click_on_add_button_and_enter_firstname_and_lastname() {
        d.firstname();
        d.lastname();
    }
    @When("click on save button")
    public void click_on_save_button() {
        d.savebutton();
    }
    @When("click on report and record report")
    public void click_on_report_and_record_report()
    {
        d.report();
        d.recordreport();

    }
    @Then("view list of report details")
    public void view_list_of_report_details() {
        d.listelement();

    }
}
