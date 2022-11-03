package stepdefinitions;

import pages.AccountSummaryPage;
import utilities.BrowserUtils;
import utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AccountSumStepDefs {

    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();

    @When("the user is on the {string} page")
    public void the_user_is_on_the_page(String expectedPage) {

        accountSummaryPage.accountSummaryLink();
        if (!expectedPage.equals("Account Summary")) {
            accountSummaryPage.navigateToTab(expectedPage);
        }
    }

    @When("the user is on the account summary page")
    public void the_user_is_on_the_account_summary_page() {

    accountSummaryPage.accountSummaryLink();
    }


    @Then("the user should be able to see {string} as title")
    public void the_user_should_be_able_to_see_as_title(String expectedTitle) {
       String actualTitle= Driver.get().getTitle();
       Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Then("Account summary page should have the following titles")
    public void account_summary_page_should_have_the_following_titles(List<String>expectedAccountTypes) {
      List<WebElement>tempTypes=new AccountSummaryPage().accountTypes;
      List<String>actualAccountTypes=BrowserUtils.getElementsText(tempTypes);
      Assert.assertEquals(expectedAccountTypes,actualAccountTypes);

    }
    @Then("the user should be able to see")
    public void the_user_should_be_able_to_see(List<String>expectedColumnNames) {
       List<String>actualColumnNames=BrowserUtils.getElementsText(new AccountSummaryPage().accountTypesTables);
       Assert.assertEquals(expectedColumnNames,actualColumnNames);
    }

}
