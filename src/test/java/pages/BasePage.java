package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public abstract class BasePage {

    public BasePage(){

        PageFactory.initElements(Driver.get(),this);
    }
    public void navigateToTab(String tab){
        String path = "//a[contains(text(),'" + tab + "')]";
        WebElement temp = Driver.get().findElement(By.xpath(path));
        temp.click();
    }
}
