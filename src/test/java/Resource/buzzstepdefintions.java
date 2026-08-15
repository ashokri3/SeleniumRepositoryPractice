package Resource;

import Pages.buzz;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class buzzstepdefintions
{
buzz b;
    // Click configuration dropdown
    // Select Event value
    @When("i click on buzz button")
    public void i_click_on_buzz_button()
    {
    b=new buzz(Hook.driver);
    b.clickclaim();
    }

    @And("we click configuration dropdown and select event value")
    public void we_click_configuration_dropdown_and_select_event_value()
    {
    b.configurationevents();
    }
    @And("click on add button")
    public void click_on_add_button()
    {
     b.adding();
    }

    @And("enter details of eventname,description")
    public void enter_details_of_eventname_description()
    {
    b.Description();
    b.Eventvalue();
    }

    @Then("Click on Save button")
    public void click_on_save_button()
    {
    b.saving();
    }
}
