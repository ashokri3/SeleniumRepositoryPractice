package Resource;

import Pages.leavestatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class leavestepdefintions
{
    leavestatus ls;
    @When("click on leave")
    public void click_on_leave()
    {
    ls=new leavestatus(Hook.driver);
    ls.leave();
    }
    @When("click on myleave")
    public void click_on_myleave()
    {
     ls.Myleave();
    }
    @When("selecting fromdate and todate")
    public void selecting_fromdate_and_todate()
    {
    ls.fromdate();
    ls.todate();
    ls.clearvalue();
    }
    @When("selecting leavestatusdropdown and itsvalue")
    public void selecting_leavestatusdropdown_and_itsvalue()
    {
    ls.Leavestatusdropdown();
    ls.Pendingapproval();
    }
    @When("selecting leavetypedropdown and itsvalue")
    public void selecting_leavetypedropdown_and_itsvalue()
    {
     ls.Leavetypedropdown();
     ls.usapproval();
    }
    @Then("click on search button")
    public void click_on_search_button()
    {
    ls.search();
    }


}
