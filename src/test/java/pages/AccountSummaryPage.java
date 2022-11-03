package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummaryPage extends BasePage {

    @FindBy(css = "#onlineBankingMenu")
    public WebElement onlineBanking;

    @FindBy(css = "#account_summary_link")
    public WebElement accountSummary;



    @FindBy(xpath = "//h2[@class='board-header']")
    public List<WebElement> accountTypes;
    //List olarak alirsan ayni locatora bagli kactane web element varsa hepsini alir

    @FindBy(xpath = "//div[@class='offset2 span8']/div[3]//th")
    public List<WebElement> accountTypesTables;




    public void accountSummaryLink(){

        Driver.get().get("http://zero.webappsecurity.com/bank/account-summary.html");
    }

}
