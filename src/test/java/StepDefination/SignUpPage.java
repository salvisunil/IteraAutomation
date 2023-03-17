package StepDefination;

import Loactors.Locators;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.By;

public class SignUpPage extends PageObject {

//    @Steps
//    Locators locators;
    Locators locators = new Locators();
    public void clickSignUp(){
        $(By.xpath(locators.linkclick)).click();
    }
    public void fillInRegistration(){
        $(By.xpath(locators.firstname)).sendKeys("alex");
        $(By.xpath(locators.surname)).sendKeys("akon");
        $(By.xpath(locators.e_post)).sendKeys("surat");
        $(By.xpath(locators.Mobile)).sendKeys("1234567890");
        $(By.xpath(locators.username)).sendKeys("alaxakon");
        $(By.xpath(locators.password)).sendKeys("123@123");
        $(By.xpath(locators.confirmPass)).sendKeys("123@123");
    }
    public void submitClick(){
        $(By.xpath(locators.submit)).submit();
    }
    public void SuccessMessage(){
        $(By.xpath(locators.Successful));

    }
}
